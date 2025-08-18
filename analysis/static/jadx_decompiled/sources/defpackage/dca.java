package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dca extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eca Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dca(eca ecaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = ecaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dca dcaVar = new dca(this.Z, continuation);
        dcaVar.Y = obj;
        return dcaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            eca ecaVar = this.Z;
            yf4[] yf4VarArr = {j47.h(sx3Var, ((w9a) ((kke) ecaVar.a.getValue())).a(), new bca(ecaVar, null), 2), j47.h(sx3Var, ((w9a) ((kke) ecaVar.a.getValue())).a(), new cca(ecaVar, null), 2)};
            this.X = 1;
            obj = new de0(yf4VarArr).a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
