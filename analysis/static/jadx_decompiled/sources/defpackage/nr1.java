package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nr1 extends ffe implements a66 {
    public wr1 X;
    public int Y;
    public final /* synthetic */ wr1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(wr1 wr1Var, Continuation continuation) {
        super(2, continuation);
        this.Z = wr1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nr1(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        wr1 wr1Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = wr1.K;
            wr1 wr1Var2 = this.Z;
            xk1 xk1Var = new xk1(((cra) wr1Var2.t()).w0, 8);
            this.X = wr1Var2;
            this.Y = 1;
            Object objC = od2.C(xk1Var, this);
            if (objC == tx3Var) {
                return tx3Var;
            }
            obj = objC;
            wr1Var = wr1Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wr1Var = this.X;
            od2.a0(obj);
        }
        wr1Var.F = obj != null;
        return e5f.a;
    }
}
