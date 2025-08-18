package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rn5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c66 Z;
    public final /* synthetic */ on5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn5(c66 c66Var, on5 on5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = c66Var;
        this.s0 = on5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rn5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rn5 rn5Var = new rn5(this.Z, this.s0, continuation);
        rn5Var.Y = obj;
        return rn5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            this.X = 1;
            if (this.Z.invoke(sx3Var, this.s0, this) == tx3Var) {
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
