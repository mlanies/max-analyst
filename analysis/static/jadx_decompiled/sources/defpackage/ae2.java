package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ae2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k70 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae2(k70 k70Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k70Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ae2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ae2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k70 k70Var = this.Y;
            iy2 iy2Var = (iy2) ((je7) k70Var.X).getValue();
            this.X = 1;
            obj = iy2Var.d(k70Var.a, this);
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
