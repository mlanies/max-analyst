package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class de5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ he5 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de5(he5 he5Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = he5Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((de5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new de5(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                he5 he5Var = this.Y;
                long j = this.Z;
                ew9 ew9Var = (ew9) he5Var.Y.getValue();
                this.X = 1;
                obj = ew9Var.b(j, this);
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
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            hm9.p("he5", "failed to read fcm notifications", th);
            return nz4.a;
        }
    }
}
