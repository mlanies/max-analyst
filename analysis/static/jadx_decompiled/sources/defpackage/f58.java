package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;
    public final /* synthetic */ Long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f58(p58 p58Var, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = p58Var;
        this.Z = l;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new f58(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objA;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            r79 r79Var = (r79) this.Y.c.getValue();
            long jLongValue = this.Z.longValue();
            this.X = 1;
            objA = r79Var.a(jLongValue, this);
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
        cu8 cu8Var = (cu8) objA;
        if (cu8Var == null) {
            return e5fVar;
        }
        p58 p58Var = this.Y;
        bc7[] bc7VarArr = p58.I0;
        p4d p4dVarR = p58Var.r();
        p4dVarR.getClass();
        if (cu8Var.n()) {
            int i2 = 0;
            while (true) {
                k8g k8gVar = cu8Var.z0;
                if (i2 >= k8gVar.i()) {
                    break;
                }
                j00 j00VarE = crd.e(k8gVar.h(i2), cu8Var.t0, cu8Var.c, null, ((se5) p4dVarR.i).v());
                if (j00VarE != null) {
                    p4dVarR.r(j00VarE);
                }
                i2++;
            }
        }
        ArrayList arrayListX = dy7.x(this.Y.r());
        this.Y.x0.m(null, arrayListX);
        this.Y.u0 = arrayListX;
        zt0 zt0Var = this.Y.t0;
        d48 d48Var = d48.a;
        this.X = 2;
        return zt0Var.o(d48Var, this) == tx3Var ? tx3Var : e5fVar;
    }
}
