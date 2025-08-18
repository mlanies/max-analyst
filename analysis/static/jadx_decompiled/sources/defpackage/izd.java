package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class izd extends ffe implements a66 {
    public jzd X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ jzd s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(jzd jzdVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = jzdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((izd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new izd(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        jzd jzdVar;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        jzd jzdVar2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35Var = jzdVar2.z0;
            oc6 oc6Var = (oc6) jzdVar2.Z.getValue();
            this.X = jzdVar2;
            this.Y = s35Var;
            this.Z = 1;
            obj = oc6Var.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            jzdVar = jzdVar2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            s35Var = this.Y;
            jzdVar = this.X;
            od2.a0(obj);
        }
        ryd rydVar = new ryd((Uri) obj);
        bc7[] bc7VarArr = jzd.A0;
        jzdVar.getClass();
        pnf.o(s35Var, rydVar);
        nx3 nx3VarA = ((w9a) ((kke) jzdVar2.o.getValue())).a();
        hzd hzdVar = new hzd(2, null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(nx3VarA, hzdVar, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
