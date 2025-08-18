package defpackage;

/* loaded from: classes.dex */
public final class k28 extends f28 {
    public final d38 a;

    public k28(d38 d38Var) {
        this.a = d38Var;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        j28 j28Var = new j28(0, b38Var);
        b38Var.c(j28Var);
        try {
            this.a.d(j28Var);
        } catch (Throwable th) {
            c37.B(th);
            j28Var.onError(th);
        }
    }
}
