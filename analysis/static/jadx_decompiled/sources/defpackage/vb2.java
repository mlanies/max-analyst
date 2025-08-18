package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vb2 extends ffe implements a66 {
    public zb2 X;
    public int Y;
    public final /* synthetic */ zb2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb2(zb2 zb2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zb2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vb2(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        zb2 zb2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            zb2Var = this.Z;
            alc alcVarE = zb2Var.e();
            this.X = zb2Var;
            this.Y = 1;
            obj = alcVarE.d(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            zb2Var = this.X;
            od2.a0(obj);
        }
        this.X = null;
        this.Y = 2;
        if (zb2.j(zb2Var, (List) obj, false, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
