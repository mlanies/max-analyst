package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pw2 extends ffe implements a66 {
    public nx2 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ nx2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pw2(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        nx2 nx2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        nx2 nx2Var2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35Var = nx2Var2.P0;
            oc6 oc6Var = (oc6) nx2Var2.F0.getValue();
            this.X = nx2Var2;
            this.Y = s35Var;
            this.Z = 1;
            obj = oc6Var.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            nx2Var = nx2Var2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            s35Var = this.Y;
            nx2Var = this.X;
            od2.a0(obj);
        }
        knd kndVar = new knd((Uri) obj);
        bc7[] bc7VarArr = nx2.X0;
        nx2Var.getClass();
        pnf.o(s35Var, kndVar);
        nx3 nx3VarA = ((w9a) nx2Var2.Y).a();
        ow2 ow2Var = new ow2(2, null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(nx3VarA, ow2Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
