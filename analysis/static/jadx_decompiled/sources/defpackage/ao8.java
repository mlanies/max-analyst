package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ao8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ do8 Y;
    public final /* synthetic */ yn8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao8(do8 do8Var, yn8 yn8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = do8Var;
        this.Z = yn8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ao8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ao8(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            this.X = 1;
            if (kldVar.a(this.Z, this) == tx3Var) {
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
