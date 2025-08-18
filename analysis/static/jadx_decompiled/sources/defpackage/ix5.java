package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ix5 extends ffe implements a66 {
    public hx5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ jx5 s0;
    public final /* synthetic */ lec t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix5(jx5 jx5Var, lec lecVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = jx5Var;
        this.t0 = lecVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ix5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ix5 ix5Var = new ix5(this.s0, this.t0, continuation);
        ix5Var.Z = obj;
        return ix5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        hx5 hx5Var;
        iab iabVar;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        jx5 jx5Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar2 = (iab) this.Z;
            hx5Var = new hx5(this.t0, iabVar2);
            jx5Var.Y.i.add(hx5Var);
            Boolean boolValueOf = Boolean.valueOf(jx5Var.Y.c());
            this.Z = iabVar2;
            this.X = hx5Var;
            this.Y = 1;
            if (((fab) iabVar2).a.o(boolValueOf, this) == tx3Var) {
                return tx3Var;
            }
            iabVar = iabVar2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            hx5Var = this.X;
            iabVar = (iab) this.Z;
            od2.a0(obj);
        }
        yf3 yf3Var = new yf3(jx5Var, 11, hx5Var);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (j47.j(iabVar, yf3Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
