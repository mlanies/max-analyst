package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xi2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi2(ck2 ck2Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xi2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xi2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objA;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ck2 ck2Var = this.Y;
            r79 r79Var = ck2Var.s0;
            long j = ck2Var.o;
            this.X = 1;
            objA = r79Var.a(j, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objA = obj;
        }
        final cu8 cu8Var = (cu8) objA;
        if (cu8Var == null) {
            return e5fVar;
        }
        if (this.Y.Y && cu8Var.y()) {
            ck2 ck2Var2 = this.Y;
            this.X = 2;
            return ck2.t(ck2Var2, cu8Var, this) == tx3Var ? tx3Var : e5fVar;
        }
        long j2 = cu8Var.o;
        ck2 ck2Var3 = this.Y;
        new Long(j2);
        ck2Var3.getClass();
        final zc8 zc8Var = (zc8) ((jz2) this.Y.w()).l().J(this.Y.b).getValue();
        final ck2 ck2Var4 = this.Y;
        ck2Var4.I0.updateAndGet(new UnaryOperator() { // from class: wi2
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                ck2 ck2Var5 = ck2Var4;
                zc8 zc8Var2 = zc8Var;
                if (ck2.u(ck2Var5, zc8Var2)) {
                    return zc8Var2;
                }
                long j3 = cu8Var.c;
                return new zc8(j3, j3, ck2Var5.H0, ck2Var5.b);
            }
        });
        String str = this.Y.w0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. Create loader with initialTime:" + j2 + ", saved markers:" + zc8Var, null);
        }
        ck2 ck2Var5 = this.Y;
        vd2 vd2Var = (vd2) this.Z.getValue();
        ck2 ck2Var6 = this.Y;
        long j3 = ck2Var6.b;
        long j4 = ck2Var6.o;
        Set set = ck2Var6.H0;
        v4 v4Var = vd2Var.a;
        Context context = (Context) v4Var.c(Context.class);
        kke kkeVar = (kke) v4Var.c(kke.class);
        khe kheVarD = v4Var.d(iy2.class);
        khe kheVarD2 = v4Var.d(r79.class);
        khe kheVarD3 = v4Var.d(au8.class);
        khe kheVarD4 = v4Var.d(t6b.class);
        khe kheVarD5 = v4Var.d(u9a.class);
        khe kheVarD6 = v4Var.d(ds3.class);
        k70 k70Var = new k70(kheVarD, j3, j4, j2, set);
        yx4 yx4Var = new yx4(ey8.h(j3, "MediaLoader#"));
        eg2 eg2Var = new eg2(kheVarD, v4Var.d(u9a.class), v4Var.d(o45.class), kheVarD2, v4Var.d(qe5.class), kkeVar, j3, set);
        yg2 yg2Var = new yg2(kheVarD, kheVarD3, v4Var.d(q33.class), v4Var.d(pk.class), eg2Var, j3, set, ck2Var6);
        khe kheVar = new khe(new ud2(context, v4Var, 1));
        khe kheVar2 = new khe(new ud2(context, v4Var, 0));
        bx bxVar = new bx(kheVarD, kheVarD2, kheVarD5, v4Var.d(gb6.class), j3, kkeVar, yx4Var, new v19(j3, (av0) v4Var.c(av0.class), kkeVar), kheVar, kheVar2, (ox3) v4Var.c(ox3.class), new m9a(kheVar, kheVar2, kheVarD4, kheVarD6), k70Var, eg2Var, yg2Var, (oe3) v4Var.c(oe3.class), 100, 100);
        ck2 ck2Var7 = this.Y;
        ck2Var7.getClass();
        od2.L(od2.F(new zn5(new xj2(bxVar.B, ck2Var7, 1), new bk2(ck2Var7, null), 5), ((w9a) ck2Var7.t0).b()), ck2Var7.a);
        od2.L(od2.F(new zn5(new xj2(new w7c(((jz2) ck2Var7.w()).l().J(ck2Var7.b)), ck2Var7, 0), new yj2(ck2Var7, null), 5), ((w9a) ck2Var7.t0).a()), ck2Var7.a);
        hm9.n(ck2Var7.w0, "Media viewer. Start load around");
        bxVar.r(j2);
        ck2Var5.F0 = bxVar;
        return e5fVar;
    }
}
