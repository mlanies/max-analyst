package defpackage;

import android.os.Build;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ih0 extends ffe implements a66 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ jh0 u0;
    public final /* synthetic */ vg0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(jh0 jh0Var, vg0 vg0Var, Continuation continuation) {
        super(2, continuation);
        this.u0 = jh0Var;
        this.v0 = vg0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ih0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ih0 ih0Var = new ih0(this.u0, this.v0, continuation);
        ih0Var.t0 = obj;
        return ih0Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean zB;
        boolean z;
        boolean z2;
        boolean z3;
        tx3 tx3Var = tx3.a;
        int i = this.s0;
        jh0 jh0Var = this.u0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.t0;
            boolean z4 = !((eua) jh0Var.a.getValue()).b(eua.f);
            je7 je7Var = jh0Var.a;
            eua euaVar = (eua) je7Var.getValue();
            if (Build.VERSION.SDK_INT >= 33) {
                zB = euaVar.b(eua.k);
            } else {
                euaVar.getClass();
                zB = true;
            }
            boolean z5 = !zB;
            boolean z6 = !((eua) je7Var.getValue()).b(eua.h);
            je7 je7Var2 = jh0Var.d;
            yf4[] yf4VarArr = {j47.h(sx3Var, ((w9a) ((kke) je7Var2.getValue())).b(), new fh0(jh0Var, null), 2), j47.h(sx3Var, ((w9a) ((kke) je7Var2.getValue())).b(), new gh0(jh0Var, null), 2), j47.h(sx3Var, ((w9a) ((kke) je7Var2.getValue())).a(), new hh0(this.v0, null), 2)};
            this.X = z4;
            this.Y = z5;
            this.Z = z6;
            this.s0 = 1;
            obj = new de0(yf4VarArr).a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            z = z4;
            z2 = z6;
            z3 = z5;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z;
            z3 = this.Y;
            z = this.X;
            od2.a0(obj);
        }
        List list = (List) obj;
        ((Boolean) list.get(0)).booleanValue();
        ((Boolean) list.get(1)).booleanValue();
        ((Boolean) list.get(2)).booleanValue();
        jh0Var.e = z;
        jh0Var.g = z3;
        jh0Var.f = z2;
        return e5f.a;
    }
}
