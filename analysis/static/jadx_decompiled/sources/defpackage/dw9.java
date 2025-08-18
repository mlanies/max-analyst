package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dw9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ew9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw9(ew9 ew9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ew9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dw9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dw9(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                ew9 ew9Var = this.Y;
                this.X = 1;
                ew9Var.getClass();
                if (ote.j(ew9Var.a, new ia4(8, ew9Var), this) == tx3Var) {
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
            hm9.p("NotificationsDao", "fail to clear on logout", th);
        }
        return e5f.a;
    }
}
