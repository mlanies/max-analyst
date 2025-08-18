package defpackage;

/* loaded from: classes.dex */
public final class ce0 implements iy1 {
    public final be0[] a;

    public ce0(be0[] be0VarArr) {
        this.a = be0VarArr;
    }

    public final void a() {
        for (be0 be0Var : this.a) {
            cm4 cm4Var = be0Var.c;
            if (cm4Var == null) {
                cm4Var = null;
            }
            cm4Var.dispose();
        }
    }

    @Override // defpackage.iy1
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
