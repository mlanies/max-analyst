package org.apache.http.impl.conn.tsccm;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected ClientConnectionOperator connOperator;
    protected final AbstractConnPool connectionPool;
    private final Log log = LogFactory.getLog(getClass());
    protected SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        if (httpParams == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.connectionPool = createConnectionPool(httpParams);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.connectionPool.closeExpiredConnections();
        this.connectionPool.deleteClosedConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        this.connectionPool.closeIdleConnections(j, timeUnit);
        this.connectionPool.deleteClosedConnections();
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public AbstractConnPool createConnectionPool(HttpParams httpParams) throws IllegalStateException {
        ConnPoolByRoute connPoolByRoute = new ConnPoolByRoute(this.connOperator, httpParams);
        connPoolByRoute.enableConnectionGC();
        return connPoolByRoute;
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return ((ConnPoolByRoute) this.connectionPool).getConnectionsInPool(httpRoute);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        BasicPoolEntry basicPoolEntry;
        boolean zIsMarkedReusable;
        if (!(managedClientConnection instanceof BasicPooledConnAdapter)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager.");
        }
        BasicPooledConnAdapter basicPooledConnAdapter = (BasicPooledConnAdapter) managedClientConnection;
        if (basicPooledConnAdapter.getPoolEntry() != null && basicPooledConnAdapter.getManager() != this) {
            throw new IllegalArgumentException("Connection not obtained from this manager.");
        }
        try {
            try {
                Socket socket = ((BasicPoolEntry) basicPooledConnAdapter.getPoolEntry()).getConnection().getSocket();
                if (socket != null) {
                    TrafficStats.untagSocket(socket);
                }
                if (basicPooledConnAdapter.isOpen() && !basicPooledConnAdapter.isMarkedReusable()) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Released connection open but not marked reusable.");
                    }
                    basicPooledConnAdapter.shutdown();
                }
                basicPoolEntry = (BasicPoolEntry) basicPooledConnAdapter.getPoolEntry();
                zIsMarkedReusable = basicPooledConnAdapter.isMarkedReusable();
                basicPooledConnAdapter.detach();
                if (basicPoolEntry == null) {
                    return;
                }
            } catch (IOException e) {
                if (this.log.isDebugEnabled()) {
                    this.log.debug("Exception shutting down released connection.", e);
                }
                basicPoolEntry = (BasicPoolEntry) basicPooledConnAdapter.getPoolEntry();
                zIsMarkedReusable = basicPooledConnAdapter.isMarkedReusable();
                basicPooledConnAdapter.detach();
                if (basicPoolEntry == null) {
                    return;
                }
            }
            this.connectionPool.freeEntry(basicPoolEntry, zIsMarkedReusable, j, timeUnit);
        } catch (Throwable th) {
            BasicPoolEntry basicPoolEntry2 = (BasicPoolEntry) basicPooledConnAdapter.getPoolEntry();
            boolean zIsMarkedReusable2 = basicPooledConnAdapter.isMarkedReusable();
            basicPooledConnAdapter.detach();
            if (basicPoolEntry2 != null) {
                this.connectionPool.freeEntry(basicPoolEntry2, zIsMarkedReusable2, j, timeUnit);
            }
            throw th;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        final PoolEntryRequest poolEntryRequestRequestPoolEntry = this.connectionPool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                poolEntryRequestRequestPoolEntry.abortRequest();
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws SocketException, InterruptedException, ConnectionPoolTimeoutException {
                if (httpRoute == null) {
                    throw new IllegalArgumentException("Route may not be null.");
                }
                if (ThreadSafeClientConnManager.this.log.isDebugEnabled()) {
                    ThreadSafeClientConnManager.this.log.debug("ThreadSafeClientConnManager.getConnection: " + httpRoute + ", timeout = " + j);
                }
                BasicPoolEntry poolEntry = poolEntryRequestRequestPoolEntry.getPoolEntry(j, timeUnit);
                try {
                    Socket socket = poolEntry.getConnection().getSocket();
                    if (socket != null) {
                        TrafficStats.tagSocket(socket);
                    }
                } catch (IOException e) {
                    ThreadSafeClientConnManager.this.log.debug("Problem tagging socket.", e);
                }
                return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, poolEntry);
            }
        };
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.connectionPool.shutdown();
    }

    public int getConnectionsInPool() {
        int i;
        synchronized (this.connectionPool) {
            i = this.connectionPool.numConnections;
        }
        return i;
    }
}
