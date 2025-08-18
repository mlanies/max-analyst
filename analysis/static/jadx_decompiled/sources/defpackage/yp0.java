package defpackage;

/* loaded from: classes2.dex */
public final class yp0 extends dl {
    public final boolean b;

    public yp0(String str, boolean z) {
        super(str);
        this.b = z;
    }

    @Override // defpackage.dl
    public final void d(kb7 kb7Var) {
        kb7Var.g0(this.a);
        ((t1) kb7Var).a(String.valueOf(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
