package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h49 extends ffe implements a66 {
    public e52 X;
    public int Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ axc s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h49(n59 n59Var, axc axcVar, Continuation continuation) {
        super(2, continuation);
        this.Z = n59Var;
        this.s0 = axcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h49(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e52 e52Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 e52Var2 = (e52) this.Z.o1.a.getValue();
            if (e52Var2 == null) {
                return e5fVar;
            }
            lx8 lx8Var = (lx8) this.Z.Q0.getValue();
            long j = this.Z.b.a;
            this.X = e52Var2;
            this.Y = 1;
            p82 p82VarL = ((jz2) ((iy2) lx8Var.b.getValue())).l();
            p82VarL.getClass();
            p82VarL.h(j, true, new v72(j, 0L));
            p82VarL.m.c(new tc2(j, 0L));
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
            e52Var = e52Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e52Var = this.X;
            od2.a0(obj);
        }
        qz7 qz7Var = this.Z.u0;
        long j2 = this.s0.a;
        String str = (String) qz7Var.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.h(j2, "Marking as read reaction for message="), null);
        }
        ((p7c) ((je7) qz7Var.c).getValue()).d(e52Var.b.a, e52Var.n(), j2, false, false, false, true);
        return e5fVar;
    }
}
