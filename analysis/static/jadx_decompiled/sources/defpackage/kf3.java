package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kf3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ of3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf3(of3 of3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kf3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        of3 of3Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            i80 i80Var = (i80) of3Var.s0.getValue();
            this.X = 1;
            obj = i80Var.a(of3Var.X, 2, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        h80 h80Var = (h80) obj;
        of3Var.o = h80Var.c;
        long jS = z7.S(h80Var.X, kt4.MILLISECONDS);
        int i2 = ft4.o;
        of3Var.y0.m(null, new Long(ft4.i(jS, kt4.SECONDS)));
        vxd vxdVar = of3Var.D0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        of3Var.D0 = pnf.n(of3Var, null, null, new nf3(of3Var, null), 3);
        we6 we6Var = (we6) ((cud) of3Var.u0.getValue());
        we6Var.g = of3Var.c;
        we6Var.b();
        return e5f.a;
    }
}
