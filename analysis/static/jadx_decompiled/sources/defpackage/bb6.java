package defpackage;

/* loaded from: classes.dex */
public final class bb6 implements t0e {
    public final qaf a;
    public final qne b;

    public bb6(qaf qafVar, qne qneVar) {
        this.a = qafVar;
        this.b = qneVar;
    }

    @Override // defpackage.t0e
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.t0e
    public final boolean b(hb0 hb0Var) {
        if (hb0Var.b != 4 || this.a.a(hb0Var)) {
            return false;
        }
        String str = hb0Var.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.b(new ua0(hb0Var.e, str, hb0Var.f));
        return true;
    }
}
