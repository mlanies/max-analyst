package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wce extends ffe implements a66 {
    public jce X;
    public int Y;
    public final /* synthetic */ yce Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ j92 u0;
    public final /* synthetic */ moa v0;
    public final /* synthetic */ cjg w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wce(yce yceVar, String str, int i, j92 j92Var, moa moaVar, cjg cjgVar, Continuation continuation) {
        super(2, continuation);
        this.Z = yceVar;
        this.s0 = str;
        this.t0 = i;
        this.u0 = j92Var;
        this.v0 = moaVar;
        this.w0 = cjgVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wce(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objT0;
        jce jceVar;
        e52 e52Var;
        Object value;
        Object value2;
        Object value3;
        q0e q0eVar;
        Object value4;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        yce yceVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            String str = yceVar.B0.a;
            String str2 = this.s0;
            if (!tpa.f(str, str2)) {
                yceVar.B0 = gde.g;
            }
            j0e j0eVar = yceVar.b;
            e52 e52Var2 = (e52) j0eVar.getValue();
            boolean z = false;
            if (e52Var2 != null && e52Var2.H()) {
                z = true;
            }
            jce jceVarC = ece.c(str2, this.t0, this.u0);
            jce jceVar2 = jce.X;
            q0e q0eVar2 = yceVar.C0;
            if (jceVarC == jceVar2) {
                do {
                    value3 = q0eVar2.getValue();
                } while (!q0eVar2.c(value3, null));
                return e5fVar;
            }
            if (z && (jceVarC == jce.a || jceVarC == jce.b)) {
                do {
                    value2 = q0eVar2.getValue();
                } while (!q0eVar2.c(value2, null));
                return e5fVar;
            }
            if (jceVarC == jce.c && ((e52Var = (e52) j0eVar.getValue()) == null || !e52Var.n0())) {
                do {
                    value = q0eVar2.getValue();
                } while (!q0eVar2.c(value, null));
                return e5fVar;
            }
            gde gdeVar = yceVar.B0;
            this.X = jceVarC;
            this.Y = 1;
            moa moaVar = this.v0;
            objT0 = j47.t0(((w9a) ((kke) moaVar.b)).a(), new hce(gdeVar, this.s0, this.t0, moaVar, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            jceVar = jceVarC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jceVar = this.X;
            od2.a0(obj);
            objT0 = obj;
        }
        gde gdeVar2 = (gde) objT0;
        yceVar.B0 = gdeVar2;
        ArrayList arrayListD = this.w0.d(gdeVar2.d);
        do {
            q0eVar = yceVar.C0;
            value4 = q0eVar.getValue();
        } while (!q0eVar.c(value4, new kce(jceVar, arrayListD)));
        return e5fVar;
    }
}
