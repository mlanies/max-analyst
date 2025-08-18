package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q39 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q39(n59 n59Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        q39 q39Var = (q39) n((xw3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        q39Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q39 q39Var = new q39(this.Y, this.Z, continuation);
        q39Var.X = obj;
        return q39Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        pnd pndVar;
        od2.a0(obj);
        xw3 xw3Var = (xw3) this.X;
        if (xw3Var instanceof ww3) {
            pndVar = new pnd(((ww3) xw3Var).a, 0, null, 6);
        } else {
            if (!(xw3Var instanceof vw3)) {
                throw new NoWhenBranchMatchedException();
            }
            pndVar = new pnd(((vw3) xw3Var).a, 0, null, 6);
        }
        n59 n59Var = this.Y;
        pnf.o(n59Var.u1, pndVar);
        n59Var.x1.remove(new Long(this.Z));
        return e5f.a;
    }
}
