package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xac extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xac(cbc cbcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cbcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xac) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xac(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (j47.x(200L, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        bc7[] bc7VarArr = cbc.G0;
        cbc cbcVar = this.Y;
        vxd vxdVarS = j47.S(cbcVar.a, ((w9a) ((kke) cbcVar.X.getValue())).b(), vx3.b, new zac(cbcVar, null));
        cbcVar.F0.o1(cbcVar, cbc.G0[1], vxdVarS);
        return e5f.a;
    }
}
