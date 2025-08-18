package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lo3 extends ffe implements a66 {
    public oo3 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ oo3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo3(oo3 oo3Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = oo3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lo3(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        oo3 oo3Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        oo3 oo3Var2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35Var = oo3Var2.D0;
            oc6 oc6Var = (oc6) oo3Var2.w0.getValue();
            this.X = oo3Var2;
            this.Y = s35Var;
            this.Z = 1;
            obj = oc6Var.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            oo3Var = oo3Var2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            s35Var = this.Y;
            oo3Var = this.X;
            od2.a0(obj);
        }
        jnd jndVar = new jnd((Uri) obj);
        bc7[] bc7VarArr = oo3.G0;
        oo3Var.getClass();
        pnf.o(s35Var, jndVar);
        nx3 nx3VarA = ((w9a) oo3Var2.c).a();
        ko3 ko3Var = new ko3(2, null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(nx3VarA, ko3Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
