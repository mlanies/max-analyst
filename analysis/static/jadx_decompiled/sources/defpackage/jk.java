package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jk extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bkb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(bkb bkbVar, Continuation continuation) {
        super(2, continuation);
        this.Z = bkbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jk) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jk jkVar = new jk(this.Z, continuation);
        jkVar.Y = obj;
        return jkVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            this.Y = sx3Var;
            bkb bkbVar = this.Z;
            this.X = 1;
            sy1 sy1Var = new sy1(1, v3c.u(this));
            sy1Var.n();
            ((cx7) bkbVar.b).mo20dispatch(sx3Var.getCoroutineContext(), new re(2, sy1Var));
            if (sy1Var.m() == tx3Var) {
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
