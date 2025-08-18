package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class k32 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l32 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k32(l32 l32Var, Continuation continuation) {
        super(2, continuation);
        this.Z = l32Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k32) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k32 k32Var = new k32(this.Z, continuation);
        k32Var.Y = obj;
        return k32Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar = (iab) this.Y;
            this.X = 1;
            if (this.Z.j(iabVar, this) == tx3Var) {
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
