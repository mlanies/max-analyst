package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class tya {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public tya(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final pxa a(uj3 uj3Var, boolean z) {
        jqe eqeVar;
        int i = ((u7b) this.c.getValue()).b(uj3Var.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        je7 je7Var = this.a;
        String strQ = uj3Var.q(((hyc) ((q33) je7Var.getValue())).q(), kk0.c);
        if (uj3Var.t()) {
            eqeVar = new eqe(jpc.p);
        } else {
            CharSequence charSequenceB = ((w7b) this.b.getValue()).b(uj3Var);
            eqeVar = charSequenceB.length() == 0 ? new eqe(r8a.G) : new iqe(charSequenceB);
        }
        jqe jqeVar = eqeVar;
        long jT = z ? ((hyc) ((q33) je7Var.getValue())).t() ^ uj3Var.n() : uj3Var.n();
        long jN = uj3Var.n();
        long jN2 = uj3Var.n();
        String strD = uj3Var.d();
        if (strD != null) {
            return new pxa(jN, jN2, strD, jqeVar, strQ != null ? Uri.parse(strQ) : null, z2, uj3Var.u(), new gza(jT, fza.b), uj3Var.m(), true);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
