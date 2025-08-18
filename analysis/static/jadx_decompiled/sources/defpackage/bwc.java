package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class bwc {
    public final a4c b;
    public final o9g c;
    public e24 d;
    public final gqa e;
    public vag g;
    public volatile Set h;
    public final vte i;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile boolean f = false;

    public bwc(a4c a4cVar, o9g o9gVar, Future future, gqa gqaVar, vte vteVar) {
        this.b = a4cVar;
        this.c = o9gVar;
        this.e = gqaVar;
        this.i = vteVar;
    }
}
