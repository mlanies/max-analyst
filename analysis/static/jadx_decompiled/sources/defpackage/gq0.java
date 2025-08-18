package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class gq0 extends ol implements lme {
    public final long X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq0(long j, long j2, int i) {
        super(j);
        this.o = i;
        this.X = j2;
    }

    private final void u(pke pkeVar) {
    }

    private final void v(pke pkeVar) {
    }

    private final void w(gle gleVar) {
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        switch (this.o) {
            case 0:
                hq0 hq0Var = (hq0) gleVar;
                wm3 wm3Var = hq0Var.o;
                if (wm3Var != null) {
                    el3 el3VarN = n();
                    long j = wm3Var.a;
                    uj3 uj3VarI = el3VarN.i(j, false);
                    if ((uj3VarI != null ? uj3VarI.a.c.k : null) == ol3.a) {
                        n().u(Collections.singletonList(wm3Var));
                    } else {
                        n().v(Collections.singletonList(wm3Var));
                    }
                    p82 p82VarM = m();
                    long j2 = this.X;
                    e52 e52VarF = p82VarM.F(j2);
                    l().c(new i62(this.a, e52VarF.a, hq0Var.c, Collections.singletonMap(Long.valueOf(j2), wm3Var)));
                    qzd qzdVar = hq0Var.X;
                    if (qzdVar != null) {
                        el3 el3VarN2 = n();
                        el3VarN2.getClass();
                        el3VarN2.c(j, new v02(16, qzdVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        int i = this.o;
    }

    @Override // defpackage.ol
    public final dle i() {
        long j = this.X;
        switch (this.o) {
            case 0:
                au auVar = new au(sla.b2, 9);
                auVar.i(j, "botId");
                return auVar;
            default:
                if (j == 0) {
                    return new tq2(0L, 26, (byte) 0);
                }
                e52 e52VarC = m().C(j);
                if (e52VarC != null) {
                    k92 k92Var = e52VarC.b;
                    if (k92Var.a != 0 || m().P(e52VarC)) {
                        return new tq2(k92Var.a, 26, (byte) 0);
                    }
                }
                hm9.p("gq0", "createRequest: No chat or serverId == 0. return null", null);
                return null;
        }
    }
}
