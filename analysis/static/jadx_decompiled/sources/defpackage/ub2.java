package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ub2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ e52 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(zb2 zb2Var, long j, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2Var;
        this.s0 = j;
        this.t0 = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ub2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ub2(this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        zb2 zb2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            zb2 zb2Var2 = this.Z;
            if (zb2Var2.E0.get()) {
                ConcurrentHashMap concurrentHashMap = zb2Var2.F0;
                long j = this.s0;
                concurrentHashMap.put(new Long(j), new tb2(zb2Var2, j, this.t0, 0));
                return e5fVar;
            }
            alc alcVarE = zb2Var2.e();
            this.X = zb2Var2;
            this.Y = 1;
            obj = alcVarE.d(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            zb2Var = zb2Var2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zb2Var = this.X;
            od2.a0(obj);
        }
        this.X = null;
        this.Y = 2;
        return zb2.j(zb2Var, (List) obj, false, this) == tx3Var ? tx3Var : e5fVar;
    }
}
