package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ke5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ le5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke5(le5 le5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = le5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ke5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ke5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                le5 le5Var = this.Y;
                this.X = 1;
                le5Var.getClass();
                if (ote.j(le5Var.a, new ia4(5, le5Var), this) == tx3Var) {
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
            hm9.p("FcmNotificationHistoryDao", "onLogout: clear failed", th);
        }
        return e5f.a;
    }
}
