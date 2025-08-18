package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes2.dex */
public final class tdf extends ol implements lme {
    public final int X;
    public final boolean Y;
    public final String Z;
    public final long o;

    public tdf(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = 100;
        this.Y = z;
        this.Z = tdf.class.getName();
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        udf udfVar = (udf) gleVar;
        jc7 jc7Var = new jc7();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (r71 r71Var : udfVar.c) {
            e52 e52VarZ = m().z(r71Var.a);
            fs8 fs8Var = r71Var.b;
            if (j2 == j || fs8Var.b < j2) {
                j2 = fs8Var.b;
            }
            if (j3 == 0 || fs8Var.b > j3) {
                j3 = fs8Var.b;
            }
            if (e52VarZ != null) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((k24) ((c34) plVar.Q.getValue())).c.e(e52VarZ.a, ((p7b) r()).a.t(), fs8Var);
            } else {
                jc7Var.a(Long.valueOf(r71Var.a), Long.valueOf(fs8Var.a));
            }
            j = 0;
        }
        String strG = nu0.G(Long.valueOf(j2));
        String strG2 = nu0.G(Long.valueOf(j3));
        int iB = jc7Var.b();
        StringBuilder sbK = k7d.k("onSuccess: startTime: ", strG, " endTime: ", strG2, " missedMessages: ");
        sbK.append(iB);
        hm9.n(this.Z, sbK.toString());
        l().c(new vdf(this.a, j2, j3, udfVar.o, udfVar.X, udfVar.Y, jc7Var));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        gs9 gs9Var = new gs9((sla) null, 14);
        long j = this.o;
        if (j > 0) {
            gs9Var.i(j, "marker");
        }
        gs9Var.e(this.X, NewHtcHomeBadger.COUNT);
        gs9Var.d("forward", this.Y);
        return gs9Var;
    }
}
