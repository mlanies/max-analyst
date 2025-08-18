package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bo8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ do8 Y;
    public final /* synthetic */ ps3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo8(do8 do8Var, ps3 ps3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = do8Var;
        this.Z = ps3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bo8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bo8(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            wn8 wn8Var = new wn8(x53.D0(this.Z.b));
            this.X = 1;
            if (kldVar.a(wn8Var, this) == tx3Var) {
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
