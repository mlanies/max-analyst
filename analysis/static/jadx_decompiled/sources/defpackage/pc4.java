package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public class pc4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public pc4(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public jqe a(uj3 uj3Var) {
        return null;
    }

    public final q33 b() {
        return (q33) this.b.getValue();
    }

    public jqe c(uj3 uj3Var) {
        return uj3Var.n() == ((hyc) b()).t() ? new eqe(dpc.F) : (uj3Var.t() && uj3Var.v()) ? new eqe(jpc.O2) : (!uj3Var.t() || uj3Var.v()) ? new iqe(((w7b) ((y7b) this.c.getValue()).a.getValue()).b(uj3Var)) : new eqe(jpc.p);
    }

    public boolean d(uj3 uj3Var) {
        return true;
    }

    public boolean e(uj3 uj3Var) {
        return true;
    }

    public kn8 f(uj3 uj3Var) {
        r7b r7bVarB = ((u7b) this.a.getValue()).b(uj3Var.n());
        String strQ = uj3Var.q(((hyc) b()).q(), kk0.c);
        boolean z = uj3Var.n() == ((hyc) b()).t();
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return new kn8(jN, strD, bre.b(uj3Var.g()), c(uj3Var), strQ != null ? Uri.parse(strQ) : null, uj3Var.m(), uj3Var.u(), z, false, d(uj3Var), e(uj3Var), r7bVarB.b, a(uj3Var));
    }
}
