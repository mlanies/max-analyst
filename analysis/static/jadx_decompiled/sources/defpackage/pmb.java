package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmb(cnb cnbVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pmb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cnb cnbVar = this.Y;
            vj7 vj7Var = (vj7) cnbVar.w0.getValue();
            vj7Var.getClass();
            String str = this.Z;
            ac acVarE = vj7Var.e(Uri.parse(str));
            o69 o69Var = new o69(cnbVar, 7, str);
            this.X = 1;
            if (acVarE.d(o69Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
