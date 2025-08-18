package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vp1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wp1 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(wp1 wp1Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wp1Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vp1 vp1Var = (vp1) n((oa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vp1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vp1 vp1Var = new vp1(this.Y, this.Z, continuation);
        vp1Var.X = obj;
        return vp1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        Object tp1Var;
        rp1 rp1Var;
        od2.a0(obj);
        oa oaVar = (oa) this.X;
        wp1 wp1Var = this.Y;
        q0e q0eVar = wp1Var.c;
        do {
            value = q0eVar.getValue();
            tp1Var = (up1) value;
            Map map = oaVar.a;
            if (!map.isEmpty() || !(!oaVar.b.isEmpty())) {
                if (map.isEmpty()) {
                    tp1Var = new sp1(oaVar.c);
                } else {
                    int size = map.size();
                    je7 je7Var = this.Z;
                    if (size == 1) {
                        gg1 gg1Var = (gg1) ((Map.Entry) x53.f0(map.entrySet())).getKey();
                        bo1 bo1Var = (bo1) ((Map.Entry) x53.f0(map.entrySet())).getValue();
                        tp1Var = new tp1(gg1Var, new iqe(wp1.r(wp1Var, bo1Var.getName())), ((bn1) je7Var.getValue()).a(new eqe(b8a.S1)), oag.a(bo1Var.j(), new Long(bo1Var.d())), bo1Var.q(), oaVar.c);
                    } else {
                        if (map.size() == 2) {
                            List listV0 = x53.v0(map.values());
                            rp1Var = new rp1(new gqe(b8a.R1, ys.m0(new Object[]{wp1.r(wp1Var, ((bo1) x53.g0(listV0)).getName()), wp1.r(wp1Var, ((bo1) x53.p0(listV0)).getName())})), ((bn1) je7Var.getValue()).a(new eqe(b8a.T1)), wp1.q(wp1Var, listV0), oaVar.c);
                        } else {
                            List listV02 = x53.v0(map.values());
                            rp1Var = new rp1(new gqe(b8a.Q1, ys.m0(new Object[]{wp1.r(wp1Var, ((bo1) x53.g0(listV02)).getName()), String.valueOf(listV02.size() - 1)})), ((bn1) je7Var.getValue()).a(new eqe(b8a.T1)), wp1.q(wp1Var, listV02), oaVar.c);
                        }
                        tp1Var = rp1Var;
                    }
                }
            }
        } while (!q0eVar.c(value, tp1Var));
        return e5f.a;
    }
}
