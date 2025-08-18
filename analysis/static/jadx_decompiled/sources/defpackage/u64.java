package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class u64 implements km7, u98 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u64(Object obj, boolean z, int i) {
        this.c = obj;
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        qr6Var.s0(((w98) this.c).c, i, this.a, this.b);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((gd) obj).z0((fd) this.c, this.a, this.b);
    }
}
