package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fs1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hs1 Y;
    public final /* synthetic */ b41 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs1(hs1 hs1Var, b41 b41Var, Continuation continuation) {
        super(2, continuation);
        this.Y = hs1Var;
        this.Z = b41Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fs1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fs1(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            w71 w71Var = new w71(this.Z);
            this.X = 1;
            if (kldVar.a(w71Var, this) == tx3Var) {
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
