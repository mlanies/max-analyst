package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl3(jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yl3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3Var = this.Y;
            ((f5a) jm3Var.t.getValue()).g(true);
            cx7 cx7VarC = ((w9a) jm3Var.q()).c();
            xl3 xl3Var = new xl3(jm3Var, null);
            this.X = 1;
            if (j47.t0(cx7VarC, xl3Var, this) == tx3Var) {
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
