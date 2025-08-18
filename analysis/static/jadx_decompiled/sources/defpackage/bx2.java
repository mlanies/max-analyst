package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bx2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nx2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bx2) n((ArrayList) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bx2 bx2Var = new bx2(this.Z, continuation);
        bx2Var.Y = obj;
        return bx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        nx2 nx2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            ArrayList arrayList = (ArrayList) this.Y;
            nx2Var.I0.setValue(arrayList);
            if (nx2.q(nx2Var, (mt2) nx2Var.H0.a.getValue())) {
                nx2Var.J0.setValue(arrayList);
            }
            int i2 = ft4.o;
            long jR = z7.R(1, kt4.MINUTES);
            this.X = 1;
            if (j47.y(jR, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        nx2Var.u();
        return e5f.a;
    }
}
