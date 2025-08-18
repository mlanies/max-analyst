package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qy2 extends ffe implements a66 {
    public ti9 X;
    public int Y;
    public final /* synthetic */ ti9 Z;
    public final /* synthetic */ ty2 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy2(q0e q0eVar, Continuation continuation, ty2 ty2Var, long j) {
        super(2, continuation);
        this.Z = q0eVar;
        this.s0 = ty2Var;
        this.t0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qy2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qy2((q0e) this.Z, continuation, this.s0, this.t0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ti9 ti9Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        ty2 ty2Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            ti9 ti9Var2 = this.Z;
            this.X = ti9Var2;
            this.Y = 1;
            Comparable comparableD = ty2.d(ty2Var, this.t0, this);
            if (comparableD == tx3Var) {
                return tx3Var;
            }
            obj = comparableD;
            ti9Var = ti9Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ti9Var = this.X;
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (e52Var != null) {
            long j = e52Var.b.a;
            if (j != 0) {
                ((ti9) ((ConcurrentHashMap) ty2Var.Z).computeIfAbsent(new Long(j), new sy2(new py2(e52Var, 0)))).setValue(e52Var);
            }
        } else {
            e52Var = null;
        }
        ti9Var.setValue(e52Var);
        return e5f.a;
    }
}
