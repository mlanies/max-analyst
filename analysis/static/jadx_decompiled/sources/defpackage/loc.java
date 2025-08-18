package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class loc {
    public final String a;
    public final a4c b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public loc(a4c a4cVar) {
        if (a4cVar == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = "RtcCommands";
        this.b = a4cVar;
    }
}
