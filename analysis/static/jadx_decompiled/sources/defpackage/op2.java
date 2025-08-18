package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class op2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((op2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new op2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        k92 k92Var;
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2Var = this.Y;
            e52 e52Var = (e52) rq2Var.Y0.a.getValue();
            if (e52Var != null && (k92Var = e52Var.b) != null && (str = k92Var.I) != null) {
                c97 c97Var = (c97) rq2Var.J0.getValue();
                this.X = 1;
                if (c97Var.a(str, this) == tx3Var) {
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
