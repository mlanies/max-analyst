package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x03 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qp4 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x03(qp4 qp4Var, Continuation continuation) {
        super(2, continuation);
        this.Z = qp4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x03) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        x03 x03Var = new x03(this.Z, continuation);
        x03Var.Y = obj;
        return x03Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            gq9 gq9VarY = ((pl8) this.Z.Y).y();
            this.X = 1;
            if (on5Var.a(gq9VarY, this) == tx3Var) {
                return tx3Var;
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
