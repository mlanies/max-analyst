package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ha2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ ka2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha2(t03 t03Var, Continuation continuation, ka2 ka2Var) {
        super(2, continuation);
        this.Z = t03Var;
        this.s0 = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ha2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ha2 ha2Var = new ha2((t03) this.Z, continuation, this.s0);
        ha2Var.Y = obj;
        return ha2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, this.s0, 2);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3Var) {
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
