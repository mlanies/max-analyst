package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class hv implements Runnable {
    public final /* synthetic */ iv X;
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;

    public hv(iv ivVar, List list, List list2, int i, Runnable runnable) {
        this.X = ivVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.c.execute(new h76((Object) this, (Object) lz7.e(new gv(this)), false, 2));
    }
}
