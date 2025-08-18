package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b9d extends ffe implements a66 {
    public int X;
    public final /* synthetic */ c9d Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9d(c9d c9dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = c9dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b9d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new b9d(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            e8d e8dVar = this.Y.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            js7 js7Var = (js7) e8dVar.w.getValue();
            this.X = 1;
            s1e s1eVarA = js7Var.b().a();
            s1eVarA.getClass();
            xlc xlcVarA = xlc.a(0, "\n            SELECT id FROM events\n            WHERE status = 0 AND isCritical = 1\n        ");
            obj = ote.i(s1eVarA.a, new CancellationSignal(), new r1e(s1eVarA, xlcVarA, 3), this);
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
