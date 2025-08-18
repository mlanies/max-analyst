package defpackage;

/* loaded from: classes.dex */
public final class p0a extends qy9 implements msc {
    public final Object a;

    public p0a(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.kde
    public final Object get() {
        return this.a;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        p1a p1aVar = new p1a(f2aVar, this.a);
        f2aVar.c(p1aVar);
        p1aVar.run();
    }
}
