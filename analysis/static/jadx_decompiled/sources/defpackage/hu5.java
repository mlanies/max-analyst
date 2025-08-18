package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu5(nu5 nu5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hu5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        nu5 nu5Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ta2 ta2Var = nu5Var.X;
            this.X = 1;
            if (((zb2) ta2Var).c(nu5Var.b, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        pnf.o(nu5Var.x0, new nt5(false));
        return e5f.a;
    }
}
