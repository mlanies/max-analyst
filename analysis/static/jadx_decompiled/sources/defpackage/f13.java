package defpackage;

import android.os.Looper;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f13 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qp4 Y;
    public final /* synthetic */ k56 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f13(qp4 qp4Var, u4a u4aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = qp4Var;
        this.Z = u4aVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f13 f13Var = (f13) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        f13Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f13 f13Var = new f13(this.Y, (u4a) this.Z, continuation);
        f13Var.X = obj;
        return f13Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        if (!(!tpa.f(Looper.myLooper(), Looper.getMainLooper()))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        qp4 qp4Var = this.Y;
        w7c w7cVar = (w7c) ((wva) qp4Var.c).c;
        w03 w03Var = new w03((w7c) ((td) qp4Var.o).o, qp4Var, 1);
        v7c v7cVar = (v7c) ((pl8) qp4Var.Y).o;
        mn5 mn5VarX = od2.x(od2.d0(new zn5(new w03(new t03(v7cVar, 0), qp4Var, 0), new x03(qp4Var, null)), new y03(3, (Continuation) null, 0)));
        q0e q0eVar = (q0e) qp4Var.s0;
        od2.L(new cp5(new ac(new zn5(new t03(new w03(od2.E(new qn5(2, new mn5[]{w7cVar, w03Var, v7cVar, mn5VarX, q0eVar})), qp4Var, 2), 11), new z03(qp4Var, null), 5), 18, new a13(qp4Var, null, 0)), new a13(qp4Var, null, 1)), sx3Var);
        k56 k56Var = this.Z;
        od2.L(new zn5((w7c) qp4Var.t0, new b13(qp4Var, k56Var, null), 5), sx3Var);
        od2.L(new zn5(q0eVar, new c13(qp4Var, k56Var, null), 5), sx3Var);
        return e5f.a;
    }
}
