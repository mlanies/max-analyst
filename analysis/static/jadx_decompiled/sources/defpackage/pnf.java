package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes2.dex */
public abstract class pnf {
    public final ContextScope a;

    public pnf() {
        hde hdeVarA = f46.a();
        jd4 jd4Var = ql4.a;
        this.a = j1e.a(hdeVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
    }

    public static vxd n(pnf pnfVar, lx3 lx3Var, vx3 vx3Var, a66 a66Var, int i) {
        if ((i & 1) != 0) {
            lx3Var = hz4.a;
        }
        if ((i & 2) != 0) {
            vx3Var = vx3.a;
        }
        return j47.S(pnfVar.a, lx3Var, vx3Var, a66Var);
    }

    public static void o(s35 s35Var, Object obj) {
        s35Var.b.g(obj);
    }

    public void p() {
    }
}
