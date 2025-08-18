package defpackage;

/* loaded from: classes2.dex */
public final class l37 extends dl {
    public final long b;

    public l37(String str, long j) {
        super(str);
        this.b = j;
    }

    @Override // defpackage.dl
    public final void d(kb7 kb7Var) {
        kb7Var.g0(this.a);
        ((t1) kb7Var).a(Long.toString(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
