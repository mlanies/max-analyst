package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class r92 implements r29 {
    public final y7g a;

    public r92(y7g y7gVar) {
        this.a = y7gVar;
    }

    @Override // defpackage.r29
    public final List a(e52 e52Var) {
        CharSequence charSequence;
        od0 od0Var;
        jk0 jk0Var = jk0.a;
        kk0 kk0Var = kk0.b;
        if (e52Var == null || !e52Var.K()) {
            if (e52Var == null || !e52Var.J()) {
                return nz4.a;
            }
            iqe iqeVar = new iqe(e52Var.q());
            eqe eqeVar = new eqe(oda.P0);
            String strG = e52Var.g(kk0Var, jk0Var);
            e52Var.l0();
            return Collections.singletonList(new v92(iqeVar, eqeVar, strG, e52Var.x0, e52Var.f(), y53.M(new eqe(oda.M0), new eqe(oda.N0), new eqe(oda.O0)), 32));
        }
        eqe eqeVar2 = new eqe(oda.S);
        iqe iqeVar2 = jqe.a;
        String strG2 = e52Var.g(kk0Var, jk0Var);
        if (e52Var.K()) {
            charSequence = null;
        } else {
            e52Var.l0();
            charSequence = e52Var.x0;
        }
        long jF = e52Var.f();
        y7g y7gVar = this.a;
        if (e52Var.K()) {
            od0Var = (od0) ((je7) y7gVar.c).getValue();
        } else {
            y7gVar.getClass();
            od0Var = null;
        }
        return Collections.singletonList(new v92(eqeVar2, iqeVar2, strG2, charSequence, jF, od0Var, y53.M(new eqe(oda.P), new eqe(oda.Q), new eqe(oda.R))));
    }
}
