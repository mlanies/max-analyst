package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fo5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ iab Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo5(mn5 mn5Var, iab iabVar, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5Var;
        this.Z = iabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fo5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fo5(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5Var = new tn5(this.Z, 1);
            this.X = 1;
            if (this.Y.d(tn5Var, this) == tx3Var) {
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
