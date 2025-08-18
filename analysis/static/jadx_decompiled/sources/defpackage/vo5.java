package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vo5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo5(mn5 mn5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vo5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vo5 vo5Var = new vo5(this.Z, continuation);
        vo5Var.Y = obj;
        return vo5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5Var = new tn5((iab) this.Y, 2);
            this.X = 1;
            if (this.Z.d(tn5Var, this) == tx3Var) {
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
