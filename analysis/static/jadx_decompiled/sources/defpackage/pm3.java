package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pm3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm3(tm3 tm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = tm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pm3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pm3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            lm3 lm3Var = lm3.a;
            this.X = 1;
            if (kldVar.a(lm3Var, this) == tx3Var) {
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
