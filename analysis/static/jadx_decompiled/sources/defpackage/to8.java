package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class to8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ bp8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to8(Object obj, Continuation continuation, bp8 bp8Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = bp8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((to8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new to8(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        bp8 bp8Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((Number) this.Y).longValue();
            ds3 ds3Var = (ds3) bp8Var.t0.getValue();
            this.X = 1;
            obj = ds3Var.b(jLongValue, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        uj3 uj3Var = (uj3) obj;
        if (uj3Var != null) {
            return ((pc4) bp8Var.w0.getValue()).f(uj3Var);
        }
        return null;
    }
}
