package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cf5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ g0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf5(g0 g0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = g0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cf5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cf5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            g0 g0Var = this.Y;
            this.X = 1;
            sy1 sy1Var = new sy1(1, v3c.u(this));
            sy1Var.n();
            sy1Var.d(new af5(g0Var, 0));
            g0Var.m(new bf5(0, sy1Var), new cs(2));
            obj = sy1Var.m();
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
