package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a67 extends ffe implements a66 {
    public c67 X;
    public s35 Y;
    public int Z;
    public final /* synthetic */ c67 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a67(c67 c67Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = c67Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a67(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        s35 s35Var;
        c67 c67Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        c67 c67Var2 = this.s0;
        if (i == 0) {
            od2.a0(obj);
            s35Var = c67Var2.t0;
            oc6 oc6Var = (oc6) c67Var2.o.getValue();
            this.X = c67Var2;
            this.Y = s35Var;
            this.Z = 1;
            obj = oc6Var.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            c67Var = c67Var2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            s35Var = this.Y;
            c67Var = this.X;
            od2.a0(obj);
        }
        l57 l57Var = new l57((Uri) obj);
        yxc yxcVar = c67.E0;
        c67Var.getClass();
        pnf.o(s35Var, l57Var);
        nx3 nx3VarA = ((w9a) ((kke) c67Var2.Z.getValue())).a();
        z57 z57Var = new z57(2, null);
        this.X = null;
        this.Y = null;
        this.Z = 2;
        if (j47.t0(nx3VarA, z57Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
