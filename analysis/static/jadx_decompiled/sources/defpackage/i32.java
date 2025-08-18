package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i32 implements r29 {
    public static List b(jqe jqeVar, eqe eqeVar, e52 e52Var) {
        String strG = e52Var.g(kk0.b, jk0.a);
        e52Var.l0();
        return Collections.singletonList(new v92(jqeVar, eqeVar, strG, e52Var.x0, e52Var.f(), (List) null, 96));
    }

    @Override // defpackage.r29
    public final List a(e52 e52Var) {
        return (e52Var == null || !e52Var.I()) ? nz4.a : e52Var.b0() ? b(new eqe(oda.J0), new eqe(oda.I0), e52Var) : e52Var.Z() ? b(new iqe(e52Var.q()), new eqe(oda.K0), e52Var) : b(new iqe(e52Var.q()), new eqe(oda.L0), e52Var);
    }
}
