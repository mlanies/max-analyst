package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wb9 extends ffe implements a66 {
    public zf4 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ long[] s0;
    public final /* synthetic */ xb9 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb9(xb9 xb9Var, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.s0 = jArr;
        this.t0 = xb9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wb9 wb9Var = new wb9(this.t0, continuation, this.s0);
        wb9Var.Z = obj;
        return wb9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        zf4 zf4Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Z;
            long[] jArr = this.s0;
            if (jArr.length != 0) {
                xb9 xb9Var = this.t0;
                if (xb9Var.i() && j1e.z(sx3Var2)) {
                    zf4 zf4VarH = j47.h(sx3Var2, null, new vb9(xb9Var, null, jArr), 3);
                    ArrayList arrayListD0 = ys.d0(new yf4[]{zf4VarH, null});
                    this.Z = sx3Var2;
                    this.X = zf4VarH;
                    this.Y = 1;
                    if (pag.c(arrayListD0, this) == tx3Var) {
                        return tx3Var;
                    }
                    sx3Var = sx3Var2;
                    zf4Var = zf4VarH;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zf4Var = this.X;
        sx3Var = (sx3) this.Z;
        od2.a0(obj);
        j1e.o(sx3Var);
        ym3 ym3Var = (ym3) zf4Var.m();
        if (ym3Var == null) {
            return null;
        }
        return new kpa(ym3Var, null);
    }
}
