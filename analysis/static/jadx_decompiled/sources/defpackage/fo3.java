package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ oo3 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo3(oo3 oo3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = oo3Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fo3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objD;
        tt3 tt3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xj3 xj3Var = (xj3) this.Y.o.getValue();
            this.X = 1;
            el3 el3Var = (el3) xj3Var.a.getValue();
            long j = this.Z;
            uj3 uj3VarI = el3Var.i(j, false);
            if (uj3VarI == null) {
                objD = nz4.a;
            } else {
                e52 e52VarQ = ((jz2) ((iy2) xj3Var.b.getValue())).q(j);
                kl7 kl7VarL = j1e.l();
                boolean zV = uj3VarI.v();
                boolean zT = uj3VarI.t();
                if (!zV && !zT) {
                    kl7VarL.add(vj3.Z);
                    kl7VarL.add(vj3.s0);
                }
                kl7VarL.add(vj3.a);
                if (zV) {
                    kl7VarL.add(vj3.b);
                } else {
                    kl7VarL.add(vj3.c);
                }
                kl7VarL.add(vj3.o);
                if (!zT || e52VarQ == null || e52VarQ.g0()) {
                    kl7VarL.add(vj3.X);
                } else {
                    kl7VarL.add(vj3.t0);
                }
                if (zT) {
                    kl7VarL.add(vj3.Y);
                }
                objD = j1e.d(kl7VarL);
            }
            obj = objD;
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        qk5 qk5VarA0 = l6d.a0(l6d.a0(new at(2, (Iterable) obj), new pz2(7)), new pz2(8));
        l45 l45Var = oo3.H0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        l6d.h0(qk5VarA0, arrayList2);
        c63.U(arrayList2, l45Var);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            switch (((vj3) it.next()).ordinal()) {
                case 0:
                    tt3Var = new tt3(z8a.d, new eqe(yoc.V), Integer.valueOf(woc.G1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 1:
                    tt3Var = new tt3(z8a.f, new eqe(yoc.X), Integer.valueOf(woc.X1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 2:
                    tt3Var = new tt3(z8a.i, new eqe(yoc.a0), Integer.valueOf(woc.n1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 3:
                    tt3Var = new tt3(z8a.e, new eqe(yoc.W), Integer.valueOf(woc.c), Integer.valueOf(wfa.Q), 4);
                    break;
                case 4:
                    tt3Var = new tt3(z8a.b, new eqe(yoc.T), Integer.valueOf(wfa.U), Integer.valueOf(woc.S), Integer.valueOf(wfa.P));
                    break;
                case 5:
                    tt3Var = new tt3(z8a.c, new eqe(yoc.U), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
                    break;
                case 6:
                    tt3Var = new tt3(z8a.a, new eqe(yoc.S), Integer.valueOf(woc.B1), Integer.valueOf(wfa.Q), 4);
                    break;
                case 7:
                    tt3Var = new tt3(z8a.h, new eqe(yoc.Z), Integer.valueOf(woc.n2), Integer.valueOf(wfa.Q), 4);
                    break;
                case 8:
                    tt3Var = new tt3(z8a.g, new eqe(yoc.Y), Integer.valueOf(wfa.U), Integer.valueOf(woc.p1), Integer.valueOf(wfa.P));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(tt3Var);
        }
        return arrayList;
    }
}
