package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m59 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m59(n59 n59Var, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((m59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m59 m59Var = new m59(this.Z, this.s0, this.t0, this.u0, continuation);
        m59Var.Y = obj;
        return m59Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        n59 n59Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Y;
            iy2 iy2Var = n59Var.s0;
            this.Y = sx3Var;
            this.X = 1;
            p82 p82VarL = ((jz2) iy2Var).l();
            Long l = new Long(this.s0);
            p82VarL.getClass();
            p82VarL.c(l.longValue(), v82.o);
            p82VarL.h(l.longValue(), false, new un0(17));
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        ua3 ua3VarA = ngg.a();
        j47.g(sx3Var, ((w9a) n59Var.Y).b().plus(xq9.a), vx3.c, new k59(ua3VarA, this.Z, this.s0, this.t0, this.u0, null));
        cx7 cx7VarC = ((w9a) n59Var.Y).c();
        l59 l59Var = new l59(n59Var, ua3VarA, null);
        this.Y = null;
        this.X = 2;
        return j47.t0(cx7VarC, l59Var, this) == tx3Var ? tx3Var : e5fVar;
    }
}
