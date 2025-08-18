package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xz0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ yz0 Y;
    public final /* synthetic */ xs Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz0(yz0 yz0Var, xs xsVar, Continuation continuation) {
        super(2, continuation);
        this.Y = yz0Var;
        this.Z = xsVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xz0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xz0(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            so1 so1Var = this.Y.b;
            this.X = 1;
            if (so1Var.d(this.Z, this) == tx3Var) {
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
