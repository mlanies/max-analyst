package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xk2 extends ffe implements a66 {
    public final /* synthetic */ bl2 X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk2(bl2 bl2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = bl2Var;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xk2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xk2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String strD;
        od2.a0(obj);
        bl2 bl2Var = this.X;
        ds3 ds3Var = (ds3) bl2Var.X.getValue();
        long j = this.Y;
        uj3 uj3Var = (uj3) ds3Var.c(j).a.getValue();
        e5f e5fVar = e5f.a;
        if (uj3Var != null && (strD = uj3Var.d()) != null) {
            int iS = au1.s(bl2Var.w0);
            s35 s35Var = bl2Var.x0;
            if (iS == 0) {
                pnf.o(s35Var, np8.l(Collections.singletonList(new Long(j)), new gqe(yea.k2, ys.m0(new Object[]{strD})), null));
            } else {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                pnf.o(s35Var, np8.m(Collections.singletonList(new Long(j)), new gqe(yea.l2, ys.m0(new Object[]{strD})), null));
            }
        }
        return e5fVar;
    }
}
