package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class hf9 extends ol implements lme {
    public final String X;
    public final int Y;
    public final long Z;
    public final long o;
    public final String s0;

    public hf9(String str, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Y = 100;
        this.Z = j3;
        this.s0 = hf9.class.getName();
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        if9 if9Var = (if9) gleVar;
        l().c(new jl2(this.a, this.X, if9Var.c, if9Var.o, if9Var.X));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        e52 e52VarC = m().C(this.o);
        if (e52VarC != null) {
            k92 k92Var = e52VarC.b;
            if (k92Var.a != 0 || m().P(e52VarC)) {
                tq2 tq2Var = new tq2((sla) null, 25);
                tq2Var.i(k92Var.a, ApiProtocol.PARAM_CHAT_ID);
                tq2Var.p("query", this.X);
                tq2Var.e(this.Y, NewHtcHomeBadger.COUNT);
                long j = this.Z;
                if (j != 0) {
                    tq2Var.i(j, "marker");
                }
                return tq2Var;
            }
        }
        hm9.p(this.s0, "createRequest: No chat or serverId == 0. return null", null);
        return null;
    }
}
