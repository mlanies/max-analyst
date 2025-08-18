package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rs1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ String Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rs1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rs1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iv6 iv6VarO = s36.o();
            this.X = 1;
            obj = fm9.u(iv6VarO, xv6.d(Uri.parse(this.Y)).a(), Long.MAX_VALUE, null, this, 8);
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
