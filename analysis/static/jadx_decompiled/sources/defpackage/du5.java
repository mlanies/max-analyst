package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class du5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ nu5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du5(Object obj, Continuation continuation, nu5 nu5Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = nu5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((du5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new du5(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((Number) this.Y).longValue();
            bc7[] bc7VarArr = nu5.D0;
            iy2 iy2Var = (iy2) this.Z.Z.getValue();
            this.X = 1;
            obj = ((jz2) iy2Var).k(jLongValue, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (e52Var != null) {
            return new Long(e52Var.a);
        }
        return null;
    }
}
