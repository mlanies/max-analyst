package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bc2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cc2 Y;
    public final /* synthetic */ dc2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc2(cc2 cc2Var, dc2 dc2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cc2Var;
        this.Z = dc2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bc2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bc2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xb9 xb9VarQ = this.Y.q();
            int i2 = ft4.o;
            long jR = z7.R(2, kt4.SECONDS);
            this.X = 1;
            if (xb9VarQ.l(this.Z, jR, this) == tx3Var) {
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
