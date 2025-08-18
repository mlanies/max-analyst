package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c31 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ l31 Y;
    public final /* synthetic */ e52 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(l31 l31Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = l31Var;
        this.Z = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c31) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c31(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xb9 xb9Var = (xb9) this.Y.i.getValue();
            this.X = 1;
            if (xb9Var.o(this.Z, this) == tx3Var) {
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
