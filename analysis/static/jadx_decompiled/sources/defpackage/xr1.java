package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xr1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cs1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr1(cs1 cs1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cs1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xr1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            n51 n51Var = n51.a;
            this.X = 1;
            if (kldVar.a(n51Var, this) == tx3Var) {
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
