package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g72 extends ffe implements a66 {
    public final /* synthetic */ k72 X;
    public final /* synthetic */ o22 Y;
    public final /* synthetic */ e52 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g72(k72 k72Var, o22 o22Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.X = k72Var;
        this.Y = o22Var;
        this.Z = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        g72 g72Var = (g72) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        g72Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new g72(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long jL;
        od2.a0(obj);
        k72 k72Var = this.X;
        AtomicLong atomicLong = k72Var.t;
        o22 o22Var = this.Y;
        int iOrdinal = o22Var.b.ordinal();
        je7 je7Var = k72Var.o;
        e52 e52Var = this.Z;
        if (iOrdinal == 0) {
            jL = ((k4a) ((pk) je7Var.getValue())).l(e52Var.a, e52Var.b.a, 1, o22Var.c, false, null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            jL = ((k4a) ((pk) je7Var.getValue())).l(e52Var.a, e52Var.b.a, 2, null, false, null);
        }
        atomicLong.set(jL);
        k72Var.w.set(true);
        return e5f.a;
    }
}
