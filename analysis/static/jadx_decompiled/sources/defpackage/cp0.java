package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cp0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ep0 Y;
    public final /* synthetic */ kn3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(ep0 ep0Var, kn3 kn3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ep0Var;
        this.Z = kn3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cp0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cp0(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.b;
            xo0 xo0Var = new xo0(this.Z);
            this.X = 1;
            if (kldVar.a(xo0Var, this) == tx3Var) {
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
