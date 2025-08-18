package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class da2 extends ffe implements a66 {
    public AtomicLong X;
    public int Y;
    public final /* synthetic */ ka2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da2(ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((da2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new da2(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        AtomicLong atomicLong;
        Object l;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        ka2 ka2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            e52 e52VarP = ka2Var.p();
            if (e52VarP == null) {
                return e5fVar;
            }
            atomicLong = ka2Var.l;
            yfc yfcVar = (yfc) ka2Var.x.getValue();
            this.X = atomicLong;
            this.Y = 1;
            iy2 iy2Var = (iy2) yfcVar.a.getValue();
            v82 v82Var = v82.b;
            p82 p82VarL = ((jz2) iy2Var).l();
            long j = e52VarP.a;
            p82VarL.c(j, v82Var);
            e52 e52VarF = ((jz2) ((iy2) yfcVar.a.getValue())).f(j, new w8c(2));
            if (e52VarF == null) {
                l = new Long(0L);
            } else {
                ((av0) yfcVar.c.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, null, null, 124));
                l = new Long(((k4a) ((pk) yfcVar.b.getValue())).m(j, e52VarF.b.a, null, "", null));
            }
            if (l == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AtomicLong atomicLong2 = this.X;
            od2.a0(obj);
            atomicLong = atomicLong2;
            l = obj;
        }
        atomicLong.set(((Number) l).longValue());
        kld kldVar = ka2Var.d;
        sfb sfbVar = new sfb(new eqe(vea.W), new Integer(woc.m));
        this.X = null;
        this.Y = 2;
        return kldVar.a(sfbVar, this) == tx3Var ? tx3Var : e5fVar;
    }
}
