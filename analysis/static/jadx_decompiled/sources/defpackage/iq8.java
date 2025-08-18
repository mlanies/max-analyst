package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iq8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jq8 Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq8(jq8 jq8Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = jq8Var;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iq8) n((on8) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        iq8 iq8Var = new iq8(this.Y, this.Z, continuation);
        iq8Var.X = obj;
        return iq8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        on8 on8Var = (on8) this.X;
        bc7[] bc7VarArr = jq8.K0;
        jq8 jq8Var = this.Y;
        e52 e52VarT = jq8Var.t();
        e5f e5fVar = e5f.a;
        if (e52VarT == null) {
            return e5fVar;
        }
        if (tpa.f(on8Var, mn8.a)) {
            vxd vxdVarN = pnf.n(jq8Var, ((w9a) jq8Var.Z).a(), null, new gq8(jq8Var, e52VarT, null), 2);
            jq8Var.C0.o1(jq8Var, jq8.K0[1], vxdVarN);
        } else {
            if (!tpa.f(on8Var, nn8.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!this.Z) {
                return e5fVar;
            }
            vxd vxdVarN2 = pnf.n(jq8Var, ((w9a) jq8Var.Z).a(), null, new hq8(jq8Var, e52VarT, null), 2);
            jq8Var.D0.o1(jq8Var, jq8.K0[2], vxdVarN2);
        }
        return e5fVar;
    }
}
