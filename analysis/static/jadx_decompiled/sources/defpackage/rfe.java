package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rfe extends ffe implements a66 {
    public aj9 X;
    public cge Y;
    public d7f Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ cge u0;
    public final /* synthetic */ d7f v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfe(cge cgeVar, d7f d7fVar, Continuation continuation) {
        super(2, continuation);
        this.u0 = cgeVar;
        this.v0 = d7fVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rfe) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rfe rfeVar = new rfe(this.u0, this.v0, continuation);
        rfeVar.t0 = obj;
        return rfeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        iab iabVar;
        aj9 aj9Var;
        d7f d7fVar;
        cge cgeVar;
        tx3 tx3Var = tx3.a;
        int i = this.s0;
        try {
            if (i == 0) {
                od2.a0(obj);
                iabVar = (iab) this.t0;
                cge cgeVar2 = this.u0;
                aj9Var = cgeVar2.h;
                this.t0 = iabVar;
                this.X = aj9Var;
                this.Y = cgeVar2;
                d7fVar = this.v0;
                this.Z = d7fVar;
                this.s0 = 1;
                if (aj9Var.d(this) == tx3Var) {
                    return tx3Var;
                }
                cgeVar = cgeVar2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                    return e5f.a;
                }
                d7fVar = this.Z;
                cgeVar = this.Y;
                aj9Var = this.X;
                iabVar = (iab) this.t0;
                od2.a0(obj);
            }
            mn5 mn5Var = (mn5) cgeVar.i.f(d7fVar);
            if (mn5Var == null) {
                cp5 cp5Var = new cp5(new ac(new ac(od2.D(new mqc(new ofe(cgeVar, d7fVar, null)), new pfe(cgeVar, null)), 19, new qfe(cgeVar, null, 0)), 18, new vp5(cgeVar, d7fVar, null, 9)), new y03(cgeVar, d7fVar, (Continuation) null));
                cgeVar.i.k(d7fVar, cp5Var);
                mn5Var = cp5Var;
            }
            aj9Var.e(null);
            mu2 mu2Var = new mu2(1, iabVar);
            this.t0 = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.s0 = 2;
            if (mn5Var.d(mu2Var, this) == tx3Var) {
                return tx3Var;
            }
            return e5f.a;
        } catch (Throwable th) {
            aj9Var.e(null);
            throw th;
        }
    }
}
