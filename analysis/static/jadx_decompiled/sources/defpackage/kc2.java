package defpackage;

import java.util.HashSet;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class kc2 extends ol implements lme {
    public final List X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc2(int i, long j, List list) {
        super(j);
        this.o = i;
        this.X = list;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        switch (this.o) {
            case 0:
                lc2 lc2Var = (lc2) gleVar;
                try {
                    q().m(lc2Var);
                } catch (TamErrorException unused) {
                    String name = kc2.class.getName();
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.s0, name, "fail to get missed contacts for CHAT_INFO", null);
                    }
                }
                m().c0(lc2Var.c);
                av0 av0VarL = l();
                long j = this.a;
                List list = this.X;
                mc2 mc2Var = new mc2(j);
                new HashSet(list);
                av0VarL.c(mc2Var);
                break;
            default:
                k().h(((sbd) gleVar).c, k().e());
                l().c(new tbd(this.a));
                break;
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pkeVar));
                break;
            default:
                l().c(new oi0(this.a, pkeVar));
                break;
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        switch (this.o) {
            case 0:
                au auVar = new au((sla) null, 21);
                auVar.g("chatIds", this.X);
                return auVar;
            default:
                gs9 gs9Var = new gs9((sla) null, 8);
                List list = this.X;
                if (list != null && !list.isEmpty()) {
                    gs9Var.g("pushTokens", list);
                }
                return gs9Var;
        }
    }
}
