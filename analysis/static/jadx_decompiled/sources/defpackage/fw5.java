package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw5(iw5 iw5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fw5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        at5 at5Var;
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            iw5 iw5Var = this.Y;
            w9f w9fVar = iw5Var.t0;
            if (w9fVar != null && (at5Var = w9fVar.a) != null && (str = at5Var.a) != null) {
                ta2 ta2Var = iw5Var.b;
                this.X = 1;
                if (((zb2) ta2Var).c(str, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
