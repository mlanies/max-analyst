package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xm2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cn2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm2(cn2 cn2Var, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cn2Var;
        this.Z = j;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xm2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xm2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            cn2 cn2Var = this.Y;
            Long lJ = cn2Var.j();
            if (lJ != null) {
                long jLongValue = lJ.longValue();
                eh4 eh4Var = (eh4) cn2Var.m.getValue();
                List listSingletonList = Collections.singletonList(new Long(this.Z));
                this.X = 1;
                eh4Var.a(cn2Var.a, jLongValue, listSingletonList, this.s0);
                if (e5fVar == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
