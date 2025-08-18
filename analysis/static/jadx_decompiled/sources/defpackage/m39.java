package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m39 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m39(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((m39) n((y69) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m39 m39Var = new m39(this.Z, continuation);
        m39Var.Y = obj;
        return m39Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        Object objT02;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            y69 y69Var = (y69) this.Y;
            boolean z = y69Var instanceof w69;
            n59 n59Var = this.Z;
            if (z) {
                w69 w69Var = (w69) y69Var;
                this.X = 1;
                if (!n59Var.w1.remove(w69Var.b, e5fVar) || (objT02 = j47.t0(((w9a) n59Var.Y).c(), new u39(n59Var, w69Var, null), this)) != tx3Var) {
                    objT02 = e5fVar;
                }
                if (objT02 == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (!(y69Var instanceof x69)) {
                    throw new NoWhenBranchMatchedException();
                }
                x69 x69Var = (x69) y69Var;
                this.X = 2;
                if (!n59Var.w1.remove(x69Var.b, e5fVar) || (objT0 = j47.t0(((w9a) n59Var.Y).c(), new v39(n59Var, x69Var, null), this)) != tx3Var) {
                    objT0 = e5fVar;
                }
                if (objT0 == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
