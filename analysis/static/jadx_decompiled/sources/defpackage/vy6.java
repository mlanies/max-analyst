package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vy6 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fz6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vy6(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fz6 fz6Var = this.Y;
            fz6Var.v0.setValue(null);
            hm9.n(fz6.E0, "cancel prefetchJob");
            x77 x77Var = fz6Var.y0;
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            fz6Var.y0 = null;
            fz6Var.f();
            x77 x77Var2 = fz6Var.y0;
            if (x77Var2 != null) {
                this.X = 1;
                if (x77Var2.join(this) == tx3Var) {
                    return tx3Var;
                }
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
