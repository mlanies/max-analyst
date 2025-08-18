package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uj2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj2(ck2 ck2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((uj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new uj2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        gef gefVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ck2.d1;
            ck2 ck2Var = this.Y;
            sb8 sb8VarX = ck2Var.x();
            qb8 qb8Var = sb8VarX instanceof qb8 ? (qb8) sb8VarX : null;
            if (qb8Var == null || (gefVar = ((ej2) ck2Var.V0.getValue()).b) == null) {
                return e5fVar;
            }
            wrc wrcVar = (wrc) ck2Var.C0.getValue();
            long jC = gefVar.c();
            boolean zC0 = gefVar.c0();
            this.X = 1;
            if (wrcVar.a(qb8Var.a, qb8Var.X, this.Z, jC, zC0, this) == tx3Var) {
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
