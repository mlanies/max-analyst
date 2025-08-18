package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class n1d {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e = tu0.r(3, new hbc(14));

    public n1d(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final ida a() {
        return (ida) this.a.getValue();
    }

    public final void b(kl7 kl7Var, uj3 uj3Var, e52 e52Var) {
        xib xibVar;
        qyc qycVar = (qyc) ((y7d) this.d.getValue());
        qycVar.getClass();
        if (qycVar.n(PmsKey.f28debugprofileinfo, false) || ((t33) ((q33) this.c.getValue())).g.getBoolean("app.debug.profile.info.enabled", false)) {
            if (uj3Var == null) {
                uj3Var = e52Var != null ? e52Var.l() : null;
            }
            if (uj3Var != null) {
                xibVar = new xib(uj3Var.n());
            } else if (e52Var == null) {
                return;
            } else {
                xibVar = new xib(e52Var.b.a);
            }
            kl7Var.add(xibVar);
        }
    }
}
