package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu2(pu2 pu2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eu2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.Y.u0.set(true);
            this.Y.w0.clear();
            this.Y.a.h.clear();
            pu2 pu2Var = this.Y;
            pu2Var.a.j = pu2Var;
            pu2 pu2Var2 = this.Y;
            this.X = 1;
            if (pu2Var2.d(this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.Y.v0.set(false);
        return e5f.a;
    }
}
