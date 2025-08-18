package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fb2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb2(zb2 zb2Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fb2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            zb2 zb2Var = this.Y;
            alc alcVarE = zb2Var.e();
            String str2 = this.Z;
            ArrayList arrayListE = alcVarE.e(str2);
            boolean zF = tpa.f(str2, "all.chat.folder");
            this.X = 1;
            obj = zb2.b(zb2Var, arrayListE, zF, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
