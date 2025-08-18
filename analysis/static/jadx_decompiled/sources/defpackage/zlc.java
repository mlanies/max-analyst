package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zlc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlc(hmc hmcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hmcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zlc(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e s1eVarA = this.Y.a();
            this.X = 1;
            s1eVarA.getClass();
            xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM events");
            obj = ote.i(s1eVarA.a, new CancellationSignal(), new r1e(s1eVarA, xlcVarA, 0), this);
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
