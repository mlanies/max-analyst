package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tl0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ yl0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(Object obj, Continuation continuation, yl0 yl0Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = yl0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tl0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tl0(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((Number) this.Y).longValue();
            ds3 ds3Var = (ds3) this.Z.e.getValue();
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
        return obj;
    }
}
