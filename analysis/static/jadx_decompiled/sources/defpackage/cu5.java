package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cu5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nu5 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu5(nu5 nu5Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nu5Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cu5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cu5(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objK;
        uj3 uj3VarL;
        int i = 1;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        if (i2 == 0) {
            od2.a0(obj);
            nu5 nu5Var = this.Y;
            bc7[] bc7VarArr = nu5.D0;
            iy2 iy2Var = (iy2) nu5Var.Z.getValue();
            long j = this.Y.c;
            this.X = 1;
            objK = ((jz2) iy2Var).k(j, this);
            if (objK == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            objK = obj;
        }
        e52 e52Var = (e52) objK;
        at5 at5Var = this.Y.A0;
        Object[] objArr = 0;
        Set set = at5Var != null ? at5Var.C0 : null;
        if (set == null) {
            set = wz4.a;
        }
        st5 st5Var = new st5(objArr == true ? 1 : 0, !set.contains(cv5.o));
        e5f e5fVar = e5f.a;
        if (e52Var == null) {
            this.Y.v0.m(null, y53.M(st5Var, new ou5(2)));
            return e5fVar;
        }
        this.Y.y0.updateAndGet(new c52(e52Var, i));
        nu5 nu5Var2 = this.Y;
        je7 je7Var = this.Z;
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(st5Var);
        kl7VarL.add(new ou5(536870914));
        nu5Var2.getClass();
        Uri uriT = nu5.t(e52Var);
        long j2 = e52Var.b.a;
        String string = uriT != null ? uriT.toString() : null;
        ((ld2) ((lr2) je7Var.getValue())).getClass();
        e52Var.k0();
        CharSequence charSequence = e52Var.u0;
        long jF = e52Var.f();
        e52Var.l0();
        kl7VarL.add(new pu5(j2, string, charSequence, jF, e52Var.x0, e52Var.X() || ((uj3VarL = e52Var.l()) != null && uj3VarL.u()), -2147483644));
        this.Y.v0.setValue(j1e.d(kl7VarL));
        return e5fVar;
    }
}
