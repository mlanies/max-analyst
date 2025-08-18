package defpackage;

/* loaded from: classes.dex */
public final class hx5 implements yp {
    public final /* synthetic */ lec a;
    public final /* synthetic */ iab b;

    public hx5(lec lecVar, iab iabVar) {
        this.a = lecVar;
        this.b = iabVar;
    }

    @Override // defpackage.yp
    public final void a() {
        j47.s0(this.b, Boolean.FALSE);
    }

    @Override // defpackage.yp
    public final void c() {
        this.a.a = System.currentTimeMillis();
        j47.s0(this.b, Boolean.TRUE);
    }
}
