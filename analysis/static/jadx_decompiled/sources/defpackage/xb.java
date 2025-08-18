package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bc Z;
    public final /* synthetic */ je7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(bc bcVar, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = bcVar;
        this.s0 = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xb) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xb xbVar = new xb(this.Z, this.s0, continuation);
        xbVar.Y = obj;
        return xbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = (String) this.Y;
            bc bcVar = this.Z;
            if (str == null || str.length() == 0) {
                kld kldVar = bcVar.Y;
                nz4 nz4Var = nz4.a;
                this.X = 1;
                if (kldVar.a(nz4Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                nx3 nx3VarA = ((w9a) ((kke) this.s0.getValue())).a();
                vx3 vx3Var = vx3.b;
                wb wbVar = new wb(bcVar, str, null);
                bc7[] bc7VarArr = bc.t0;
                vxd vxdVarS = j47.S(bcVar.a, nx3VarA, vx3Var, wbVar);
                bcVar.X.o1(bcVar, bc.t0[0], vxdVarS);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
