package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class huf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huf(ouf oufVar, Continuation continuation) {
        super(2, continuation);
        this.Y = oufVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((huf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new huf(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ouf oufVar = this.Y;
            mtf mtfVarA = ouf.a(oufVar);
            this.X = 1;
            mtfVarA.getClass();
            xlc xlcVarA = xlc.a(2, "SELECT token FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
            xlcVarA.j(1, oufVar.a);
            xlcVarA.j(2, oufVar.b);
            obj = ote.i(mtfVarA.a, new CancellationSignal(), new jtf(mtfVarA, xlcVarA, 2), this);
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
