package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;

@Deprecated
/* loaded from: classes2.dex */
public class BasicPoolEntry extends AbstractPoolEntry {
    private final BasicPoolEntryRef reference;

    public BasicPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute, ReferenceQueue<Object> referenceQueue) {
        super(clientConnectionOperator, httpRoute);
        if (httpRoute == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
        this.reference = new BasicPoolEntryRef(this, referenceQueue);
    }

    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    public final HttpRoute getPlannedRoute() {
        return this.route;
    }

    public final BasicPoolEntryRef getWeakRef() {
        return this.reference;
    }
}
