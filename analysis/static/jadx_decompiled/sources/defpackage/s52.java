package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s52 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ u52 Z;
    public final /* synthetic */ e52 s0;
    public final /* synthetic */ List t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s52(Object obj, Continuation continuation, u52 u52Var, e52 e52Var, List list) {
        super(2, continuation);
        this.Y = obj;
        this.Z = u52Var;
        this.s0 = e52Var;
        this.t0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((s52) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new s52(this.Y, continuation, this.Z, this.s0, this.t0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            long jLongValue = ((Number) this.Y).longValue();
            u52 u52Var = this.Z;
            dh4 dh4Var = (dh4) u52Var.Y.getValue();
            long j = u52Var.b;
            e52 e52Var = this.s0;
            long j2 = e52Var.b.a;
            int iE = e52Var.e(jLongValue);
            this.X = 1;
            ((k4a) ((pk) dh4Var.a.getValue())).I(j, j2, this.t0, true, iE);
            if (e5fVar == tx3Var) {
                return tx3Var;
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
