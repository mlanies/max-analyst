package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rd5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ud5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(ud5 ud5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ud5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rd5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rd5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                ud5 ud5Var = this.Y;
                this.X = 1;
                ud5Var.getClass();
                if (ote.j(ud5Var.a, new ia4(4, ud5Var), this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            hm9.p("FcmAnalyticsDao", "onLogout: clear failed", th);
        }
        return e5f.a;
    }
}
