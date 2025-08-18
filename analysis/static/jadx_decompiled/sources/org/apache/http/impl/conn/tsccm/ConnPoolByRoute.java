package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public class ConnPoolByRoute extends AbstractConnPool {
    private final ConnPerRoute connPerRoute;
    protected Queue<BasicPoolEntry> freeConnections;
    private final Log log = LogFactory.getLog(getClass());
    protected final int maxTotalConnections;
    protected final ClientConnectionOperator operator;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected Queue<WaitingThread> waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        if (clientConnectionOperator == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        this.operator = clientConnectionOperator;
        this.freeConnections = createFreeConnQueue();
        this.waitingThreads = createWaitingThreadQueue();
        this.routeToPool = createRouteToPoolMap();
        this.maxTotalConnections = ConnManagerParams.getMaxTotalConnections(httpParams);
        this.connPerRoute = ConnManagerParams.getMaxConnectionsPerRoute(httpParams);
    }

    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.refQueue);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.issuedConnections.add(basicPoolEntry.getWeakRef());
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry.getConnection());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
            this.idleConnHandler.remove(basicPoolEntry.getConnection());
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public void deleteLeastUsedEntry() {
        try {
            this.poolLock.lock();
            BasicPoolEntry basicPoolEntryRemove = this.freeConnections.remove();
            if (basicPoolEntryRemove != null) {
                deleteEntry(basicPoolEntryRemove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete.");
            }
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Freeing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                closeConnection(basicPoolEntry.getConnection());
                return;
            }
            this.issuedConnections.remove(basicPoolEntry.getWeakRef());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (z) {
                routePool.freeEntry(basicPoolEntry);
                this.freeConnections.add(basicPoolEntry);
                this.idleConnHandler.add(basicPoolEntry.getConnection(), j, timeUnit);
            } else {
                routePool.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(routePool);
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            return routePool != null ? routePool.getEntryCount() : 0;
        } finally {
            this.poolLock.unlock();
        }
    }

    public BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) throws ConnectionPoolTimeoutException, InterruptedException {
        BasicPoolEntry freeEntry = null;
        Date date = j > 0 ? new Date(timeUnit.toMillis(j) + System.currentTimeMillis()) : null;
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            WaitingThread waitingThreadNewWaitingThread = null;
            while (freeEntry == null) {
                if (this.isShutDown) {
                    throw new IllegalStateException("Connection pool shut down.");
                }
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Total connections kept alive: " + this.freeConnections.size());
                    this.log.debug("Total issued connections: " + this.issuedConnections.size());
                    this.log.debug("Total allocated connection: " + this.numConnections + " out of " + this.maxTotalConnections);
                }
                freeEntry = getFreeEntry(routePool, obj);
                if (freeEntry == null) {
                    boolean z = routePool.getCapacity() > 0;
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                    }
                    if (z && this.numConnections < this.maxTotalConnections) {
                        freeEntry = createEntry(routePool, this.operator);
                    } else if (!z || this.freeConnections.isEmpty()) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                        }
                        if (waitingThreadNewWaitingThread == null) {
                            waitingThreadNewWaitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                            waitingThreadAborter.setWaitingThread(waitingThreadNewWaitingThread);
                        }
                        try {
                            routePool.queueThread(waitingThreadNewWaitingThread);
                            this.waitingThreads.add(waitingThreadNewWaitingThread);
                            if (!waitingThreadNewWaitingThread.await(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                                throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                            }
                        } finally {
                            routePool.removeThread(waitingThreadNewWaitingThread);
                            this.waitingThreads.remove(waitingThreadNewWaitingThread);
                        }
                    } else {
                        deleteLeastUsedEntry();
                        freeEntry = createEntry(routePool, this.operator);
                    }
                }
            }
            return freeEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        BasicPoolEntry basicPoolEntryAllocEntry = null;
        boolean z = false;
        while (!z) {
            try {
                basicPoolEntryAllocEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntryAllocEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntryAllocEntry);
                    if (this.idleConnHandler.remove(basicPoolEntryAllocEntry.getConnection())) {
                        this.issuedConnections.add(basicPoolEntryAllocEntry.getWeakRef());
                    } else {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntryAllocEntry.getConnection());
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    }
                } else if (this.log.isDebugEnabled()) {
                    this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z = true;
            } catch (Throwable th) {
                this.poolLock.unlock();
                throw th;
            }
        }
        this.poolLock.unlock();
        return basicPoolEntryAllocEntry;
    }

    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPoolNewRouteSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPoolNewRouteSpecificPool == null && z) {
                routeSpecificPoolNewRouteSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPoolNewRouteSpecificPool);
            }
            return routeSpecificPoolNewRouteSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute.getMaxForRoute(httpRoute));
    }

    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0017, B:11:0x0034, B:23:0x006b, B:12:0x0039, B:14:0x0041, B:16:0x0049, B:17:0x0050, B:18:0x0059, B:20:0x0061), top: B:28:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Notifying thread waiting on pool ["
            java.util.concurrent.locks.Lock r1 = r3.poolLock
            r1.lock()
            if (r4 == 0) goto L39
            boolean r1 = r4.hasThread()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L39
            org.apache.commons.logging.Log r1 = r3.log     // Catch: java.lang.Throwable -> L32
            boolean r1 = r1.isDebugEnabled()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L34
            org.apache.commons.logging.Log r1 = r3.log     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            org.apache.http.conn.routing.HttpRoute r0 = r4.getRoute()     // Catch: java.lang.Throwable -> L32
            r2.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "]"
            r2.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L32
            r1.debug(r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r4 = move-exception
            goto L74
        L34:
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = r4.nextThread()     // Catch: java.lang.Throwable -> L32
            goto L69
        L39:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch: java.lang.Throwable -> L32
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r4 != 0) goto L59
            org.apache.commons.logging.Log r4 = r3.log     // Catch: java.lang.Throwable -> L32
            boolean r4 = r4.isDebugEnabled()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L50
            org.apache.commons.logging.Log r4 = r3.log     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r4.debug(r0)     // Catch: java.lang.Throwable -> L32
        L50:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r4.remove()     // Catch: java.lang.Throwable -> L32
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = (org.apache.http.impl.conn.tsccm.WaitingThread) r4     // Catch: java.lang.Throwable -> L32
            goto L69
        L59:
            org.apache.commons.logging.Log r4 = r3.log     // Catch: java.lang.Throwable -> L32
            boolean r4 = r4.isDebugEnabled()     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L68
            org.apache.commons.logging.Log r4 = r3.log     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r4.debug(r0)     // Catch: java.lang.Throwable -> L32
        L68:
            r4 = 0
        L69:
            if (r4 == 0) goto L6e
            r4.wakeup()     // Catch: java.lang.Throwable -> L32
        L6e:
            java.util.concurrent.locks.Lock r3 = r3.poolLock
            r3.unlock()
            return
        L74:
            java.util.concurrent.locks.Lock r3 = r3.poolLock
            r3.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public PoolEntryRequest requestPoolEntry(final HttpRoute httpRoute, final Object obj) {
        final WaitingThreadAborter waitingThreadAborter = new WaitingThreadAborter();
        return new PoolEntryRequest() { // from class: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.1
            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            @Override // org.apache.http.impl.conn.tsccm.PoolEntryRequest
            public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
            }
        };
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            super.shutdown();
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next.getConnection());
            }
            Iterator<WaitingThread> it2 = this.waitingThreads.iterator();
            while (it2.hasNext()) {
                WaitingThread next2 = it2.next();
                it2.remove();
                next2.wakeup();
            }
            this.routeToPool.clear();
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }
}
