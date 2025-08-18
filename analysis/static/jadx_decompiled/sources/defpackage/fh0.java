package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fh0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jh0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(jh0 jh0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jh0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fh0(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ds3 ds3Var = (ds3) this.Y.b.getValue();
            this.X = 1;
            obj = ds3Var.d();
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return Boolean.valueOf(((Number) obj).intValue() == 0);
    }
}
