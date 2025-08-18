package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a61 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ir1 Z;
    public final /* synthetic */ h61 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(ir1 ir1Var, h61 h61Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ir1Var;
        this.s0 = h61Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a61) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        a61 a61Var = new a61(this.Z, this.s0, continuation);
        a61Var.Y = obj;
        return a61Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar = (iab) this.Y;
            z51 z51Var = new z51(iabVar);
            d04 d04Var = (d04) this.Z.b().getValue();
            if (d04Var.f && !(d04Var.j instanceof f95)) {
                ((fab) iabVar).n(g51.c);
            }
            h61 h61Var = this.s0;
            h61Var.b.d(z51Var);
            x2 x2Var = new x2(h61Var, 7, z51Var);
            this.X = 1;
            if (j47.j(iabVar, x2Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
