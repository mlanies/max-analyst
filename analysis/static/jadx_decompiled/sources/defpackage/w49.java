package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w49(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        n59 n59Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var = (e52) n59Var.o1.a.getValue();
            if (e52Var != null && (l = (Long) x53.i0(this.Z)) != null) {
                long jLongValue = l.longValue();
                mm2 mm2Var = (mm2) n59Var.N0.getValue();
                long j = e52Var.b.a;
                this.X = 1;
                if (mm2Var.a(e52Var.a, j, jLongValue, false, this) == tx3Var) {
                    return tx3Var;
                }
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        pnf.o(n59Var.u1, ax8.a);
        return e5fVar;
    }
}
