package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yq9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ar9 Y;
    public final /* synthetic */ gi9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq9(ar9 ar9Var, gi9 gi9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ar9Var;
        this.Z = gi9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yq9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yq9(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (this.Y.c(this.Z, this) == tx3Var) {
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
