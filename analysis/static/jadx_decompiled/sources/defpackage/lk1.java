package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lk1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lk1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lk1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 3;
        int i2 = 0;
        tx3 tx3Var = tx3.a;
        int i3 = this.X;
        e5f e5fVar = e5f.a;
        if (i3 == 0) {
            od2.a0(obj);
            el1 el1Var = this.Y;
            q0e q0eVarB = el1Var.c.b();
            ir1 ir1Var = el1Var.c;
            j0e j0eVarE = ir1Var.e();
            q0e q0eVar = ((l31) ir1Var.f).k;
            q0e q0eVarF = ir1Var.f();
            q0e q0eVar2 = ((yz0) ir1Var.l).F0;
            Continuation continuation = null;
            kk1 kk1Var = new kk1(el1Var, continuation, i2);
            this.X = 1;
            Object objH = oag.h(gr9.a, bv3.Z, new vp5(continuation, (Object) kk1Var, i), this, new mn5[]{q0eVarB, j0eVarE, q0eVar, q0eVarF, q0eVar2});
            if (objH != tx3Var) {
                objH = e5fVar;
            }
            if (objH != tx3Var) {
                objH = e5fVar;
            }
            if (objH == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
