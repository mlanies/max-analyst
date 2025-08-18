package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j92 Y;
    public final /* synthetic */ yce Z;
    public final /* synthetic */ Context s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vce(j92 j92Var, yce yceVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.Y = j92Var;
        this.Z = yceVar;
        this.s0 = context;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vce(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objA;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        j92 j92Var = this.Y;
        yce yceVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            if (j92Var == null) {
                return e5fVar;
            }
            t03 t03Var = new t03(yceVar.b, 11);
            this.X = 1;
            objA = od2.A(t03Var, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objA = obj;
        }
        e52 e52Var = (e52) objA;
        pk pkVar = (pk) yceVar.Z.getValue();
        av0 av0Var = (av0) yceVar.s0.getValue();
        p82 p82Var = (p82) yceVar.u0.getValue();
        dq0 dq0Var = (dq0) yceVar.v0.getValue();
        ztc ztcVarA = ((jle) ((hle) yceVar.w0.getValue())).a();
        je7 je7Var = yceVar.X;
        b0d b0dVar = (b0d) je7Var.getValue();
        je7 je7Var2 = yceVar.A0;
        ida idaVar = (ida) je7Var2.getValue();
        je7 je7Var3 = yceVar.x0;
        m7b m7bVar = (m7b) je7Var3.getValue();
        je7 je7Var4 = yceVar.y0;
        ede edeVar = new ede(pkVar, av0Var, p82Var, dq0Var, e52Var, ztcVarA, b0dVar, idaVar, m7bVar, (u7b) je7Var4.getValue(), (hbd) yceVar.z0.getValue());
        je7 je7Var5 = yceVar.Y;
        moa moaVar = new moa(j92Var, (kke) je7Var5.getValue(), edeVar, new ns3(this.Y, (el3) yceVar.t0.getValue(), (kke) je7Var5.getValue(), (b0d) je7Var.getValue(), (ida) je7Var2.getValue(), (m7b) je7Var3.getValue(), (u7b) je7Var4.getValue()));
        Context context = this.s0;
        je7 je7Var6 = iyc.h;
        cjg cjgVar = new cjg();
        cjgVar.a = context;
        cjgVar.b = j92Var;
        cjgVar.c = je7Var6;
        yceVar.P0 = j92Var;
        yceVar.O0 = moaVar;
        yceVar.Q0 = cjgVar;
        return e5fVar;
    }
}
