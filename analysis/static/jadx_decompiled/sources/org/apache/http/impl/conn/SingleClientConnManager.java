package org.apache.http.impl.conn;

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
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected boolean alwaysShutDown;
    protected ClientConnectionOperator connOperator;
    protected long connectionExpiresTime;
    protected volatile boolean isShutDown;
    protected long lastReleaseTime;
    private final Log log = LogFactory.getLog(getClass());
    protected ConnAdapter managedConn;
    protected SchemeRegistry schemeRegistry;
    protected PoolEntry uniquePoolEntry;

    public class ConnAdapter extends AbstractPooledConnAdapter {
        public ConnAdapter(PoolEntry poolEntry, HttpRoute httpRoute) {
            super(SingleClientConnManager.this, poolEntry);
            markReusable();
            poolEntry.route = httpRoute;
        }
    }

    public class PoolEntry extends AbstractPoolEntry {
        public PoolEntry() {
            super(SingleClientConnManager.this.connOperator, null);
        }

        public void close() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        public void shutdown() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        if (schemeRegistry == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.uniquePoolEntry = new PoolEntry();
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    public final void assertStillUp() throws IllegalStateException {
        if (this.isShutDown) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() throws IllegalStateException {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) throws IllegalStateException {
        assertStillUp();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
            if (this.lastReleaseTime <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.uniquePoolEntry.close();
                } catch (IOException e) {
                    this.log.debug("Problem closing idle connection.", e);
                }
            }
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) throws IllegalStateException, SocketException {
        boolean z;
        if (httpRoute == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        assertStillUp();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Get connection for route " + httpRoute);
        }
        if (this.managedConn != null) {
            revokeConnection();
        }
        closeExpiredConnections();
        boolean z2 = true;
        boolean z3 = false;
        if (this.uniquePoolEntry.connection.isOpen()) {
            RouteTracker routeTracker = this.uniquePoolEntry.tracker;
            z3 = routeTracker == null || !routeTracker.toRoute().equals(httpRoute);
            z = false;
        } else {
            z = true;
        }
        if (z3) {
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException e) {
                this.log.debug("Problem shutting down connection.", e);
            }
        } else {
            z2 = z;
        }
        if (z2) {
            this.uniquePoolEntry = new PoolEntry();
        }
        try {
            Socket socket = this.uniquePoolEntry.connection.getSocket();
            if (socket != null) {
                TrafficStats.tagSocket(socket);
            }
        } catch (IOException e2) {
            this.log.debug("Problem tagging socket.", e2);
        }
        ConnAdapter connAdapter = new ConnAdapter(this.uniquePoolEntry, httpRoute);
        this.managedConn = connAdapter;
        return connAdapter;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r10 > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r8.connectionExpiresTime = r12.toMillis(r10) + r8.lastReleaseTime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r8.connectionExpiresTime = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r10 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r9, long r10, java.util.concurrent.TimeUnit r12) throws java.lang.IllegalStateException {
        /*
            r8 = this;
            r8.assertStillUp()
            boolean r0 = r9 instanceof org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter
            if (r0 == 0) goto Lce
            org.apache.commons.logging.Log r0 = r8.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L22
            org.apache.commons.logging.Log r0 = r8.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Releasing connection "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L22:
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r9 = (org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter) r9
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.poolEntry
            if (r0 != 0) goto L29
            return
        L29:
            org.apache.http.conn.ClientConnectionManager r0 = r9.getManager()
            if (r0 == 0) goto L3a
            if (r0 != r8) goto L32
            goto L3a
        L32:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        L3a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r5 = r8.uniquePoolEntry     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            org.apache.http.conn.OperatedClientConnection r5 = r5.connection     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            java.net.Socket r5 = r5.getSocket()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r5 == 0) goto L54
            android.net.TrafficStats.untagSocket(r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            goto L54
        L50:
            r5 = move-exception
            goto Lb2
        L52:
            r5 = move-exception
            goto L92
        L54:
            boolean r5 = r9.isOpen()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r5 == 0) goto L76
            boolean r5 = r8.alwaysShutDown     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r5 != 0) goto L64
            boolean r5 = r9.isMarkedReusable()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r5 != 0) goto L76
        L64:
            org.apache.commons.logging.Log r5 = r8.log     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            boolean r5 = r5.isDebugEnabled()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            if (r5 == 0) goto L73
            org.apache.commons.logging.Log r5 = r8.log     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            java.lang.String r6 = "Released connection open but not reusable."
            r5.debug(r6)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
        L73:
            r9.shutdown()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
        L76:
            r9.detach()
            r8.managedConn = r4
            long r4 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r4
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L8f
        L85:
            long r9 = r12.toMillis(r10)
            long r11 = r8.lastReleaseTime
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9
            goto Lb1
        L8f:
            r8.connectionExpiresTime = r0
            goto Lb1
        L92:
            org.apache.commons.logging.Log r6 = r8.log     // Catch: java.lang.Throwable -> L50
            boolean r6 = r6.isDebugEnabled()     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto La1
            org.apache.commons.logging.Log r6 = r8.log     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "Exception shutting down released connection."
            r6.debug(r7, r5)     // Catch: java.lang.Throwable -> L50
        La1:
            r9.detach()
            r8.managedConn = r4
            long r4 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r4
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L8f
            goto L85
        Lb1:
            return
        Lb2:
            r9.detach()
            r8.managedConn = r4
            long r6 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r6
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto Lcb
            long r9 = r12.toMillis(r10)
            long r11 = r8.lastReleaseTime
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9
            goto Lcd
        Lcb:
            r8.connectionExpiresTime = r0
        Lcd:
            throw r5
        Lce:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection class mismatch, connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.SingleClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return SingleClientConnManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    public void revokeConnection() {
        if (this.managedConn == null) {
            return;
        }
        this.log.warn(MISUSE_MESSAGE);
        this.managedConn.detach();
        try {
            this.uniquePoolEntry.shutdown();
        } catch (IOException e) {
            this.log.debug("Problem while shutting down connection.", e);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.isShutDown = true;
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter != null) {
            connAdapter.detach();
        }
        try {
            try {
                PoolEntry poolEntry = this.uniquePoolEntry;
                if (poolEntry != null) {
                    poolEntry.shutdown();
                }
            } catch (IOException e) {
                this.log.debug("Problem while shutting down manager.", e);
            }
        } finally {
            this.uniquePoolEntry = null;
        }
    }
}
