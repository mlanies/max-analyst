package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ttf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttf(ouf oufVar, Continuation continuation) {
        super(2, continuation);
        this.Y = oufVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ttf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ttf(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            w97 w97Var = this.Y.l;
            if (w97Var instanceof hn0) {
                this.X = 1;
                if (ouf.b(this.Y, (hn0) w97Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else if (w97Var instanceof ln0) {
                this.X = 2;
                if (ouf.d(this.Y, (ln0) w97Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else if (w97Var instanceof in0) {
                this.X = 3;
                if (ouf.c(this.Y, (in0) w97Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                w97 w97Var2 = this.Y.l;
                if (w97Var2 != null) {
                    w97Var2.b(new s0());
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.Y.l = null;
        return e5f.a;
    }
}
