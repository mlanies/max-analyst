package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kcc extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ccc b;
    public final Boolean c;
    public final ir1 o;
    public final w7c s0;
    public final j31 t0;
    public final s35 u0;

    public kcc(ccc cccVar, Boolean bool, ir1 ir1Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        Object value;
        icc iccVar;
        this.b = cccVar;
        this.c = bool;
        this.o = ir1Var;
        this.X = je7Var;
        this.Y = je7Var2;
        this.Z = je7Var3;
        Continuation continuation = null;
        q0e q0eVarA = r0e.a(null);
        this.s0 = new w7c(q0eVarA);
        this.t0 = new j31(od2.X(od2.x(new j31(ir1Var.e(), ir1Var.f(), new c3(this, continuation, 28), 4)), this.a, wld.a, yj1.g), ((vvc) ((lvc) je7Var2.getValue())).z0, new c3(this, continuation, 27), 4);
        this.u0 = new s35(0);
        do {
            value = q0eVarA.getValue();
            int iOrdinal = this.b.ordinal();
            if (iOrdinal != 0) {
                b7a b7aVar = b7a.b;
                if (iOrdinal == 1) {
                    iccVar = new icc(new eqe(b8a.D1), new eqe(b8a.C1), new hcc(y7a.s1, new eqe(b8a.A1), b7a.a), new hcc(y7a.t1, new eqe(b8a.B1), b7aVar), jqe.a, false);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eqe eqeVar = new eqe(b8a.z1);
                    hcc hccVar = new hcc(y7a.l1, new eqe(b8a.x1), b7aVar);
                    hcc hccVar2 = new hcc(y7a.k1, new eqe(b8a.y1), b7aVar);
                    String str = ((y21) ((l31) this.o.f).k.getValue()).c;
                    iccVar = new icc(eqeVar, null, hccVar, hccVar2, new iqe(str == null ? "" : str), true);
                }
            } else {
                iccVar = null;
            }
        } while (!q0eVarA.c(value, iccVar));
        if (this.b == ccc.b) {
            od2.L(new zn5(new m58(((vvc) ((lvc) this.Y.getValue())).t0, 28), new gcc(this, null), 5), this.a);
        }
    }
}
