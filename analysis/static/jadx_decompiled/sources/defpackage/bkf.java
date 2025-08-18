package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class bkf {
    public final yjf a;
    public volatile long b = -1;

    public bkf(yjf yjfVar) {
        this.a = yjfVar;
    }

    @uae
    public final void onEvent(af9 af9Var) {
        Object next;
        l20 l20Var;
        if (af9Var.a != this.b) {
            return;
        }
        this.a.l().f(this);
        e52 e52VarZ = this.a.m().z(this.a.X);
        if (e52VarZ == null) {
            this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "chat deleted", null)));
            return;
        }
        cu8 cu8VarJ = this.a.p().j(e52VarZ.a, this.a.Y);
        if (cu8VarJ == null || cu8VarJ.v0 == vx8.DELETED) {
            this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "message deleted", null)));
            return;
        }
        if (cu8VarJ.z0 == null) {
            this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "attaches not found", null)));
        }
        long j = this.a.o;
        k8g k8gVar = cu8VarJ.z0;
        if (k8gVar == null) {
            l20Var = null;
        } else {
            Iterator it = ((List) k8gVar.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((l20) next).d.a == j) {
                        break;
                    }
                }
            }
            l20Var = (l20) next;
        }
        if (l20Var == null) {
            this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "video deleted", null)));
            return;
        }
        k20 k20Var = l20Var.d;
        yjf yjfVar = this.a;
        yjf yjfVar2 = new yjf(yjfVar.a, yjfVar.o, yjfVar.X, yjfVar.Y, cu8VarJ.b, yjfVar.s0, yjfVar.t0, yjfVar.u0, k20Var.m, true);
        pl plVar = this.a.c;
        mle mleVar = (mle) (plVar != null ? plVar : null).P.getValue();
        mleVar.getClass();
        ((tle) mleVar).b(yjfVar2, yjfVar2, false);
    }

    @uae
    public final void onEvent(ze9 ze9Var) {
        if (ze9Var.a != this.b) {
            return;
        }
        this.a.l().f(this);
        this.a.l().c(new oi0(this.a.a, ze9Var.b));
    }
}
