package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class go5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ mn5 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go5(gh7 gh7Var, fg7 fg7Var, mn5 mn5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7Var;
        this.s0 = fg7Var;
        this.t0 = mn5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((go5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        go5 go5Var = new go5(this.Z, this.s0, this.t0, continuation);
        go5Var.Y = obj;
        return go5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        iab iabVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar2 = (iab) this.Y;
            fo5 fo5Var = new fo5(this.t0, iabVar2, null);
            this.Y = iabVar2;
            this.X = 1;
            if (kq0.B(this.Z, this.s0, fo5Var, this) == tx3Var) {
                return tx3Var;
            }
            iabVar = iabVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iabVar = (iab) this.Y;
            od2.a0(obj);
        }
        ((fab) iabVar).i(null);
        return e5f.a;
    }
}
