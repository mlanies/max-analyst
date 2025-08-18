package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j44 extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ o44 Z;
    public final /* synthetic */ m56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j44(o44 o44Var, m56 m56Var, Continuation continuation) {
        super(2, continuation);
        this.Z = o44Var;
        this.s0 = m56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j44) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j44(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Throwable th;
        int i;
        String str;
        StringBuilder sb;
        tx3 tx3Var = tx3.a;
        int i2 = this.Y;
        o44 o44Var = this.Z;
        try {
            if (i2 == 0) {
                od2.a0(obj);
                int iIncrementAndGet = o44Var.i.incrementAndGet();
                hm9.n(o44.k, "start " + iIncrementAndGet);
                try {
                    m56 m56Var = this.s0;
                    this.X = iIncrementAndGet;
                    this.Y = 1;
                    if (m56Var.invoke(this) == tx3Var) {
                        return tx3Var;
                    }
                    i = iIncrementAndGet;
                    str = o44.k;
                    sb = new StringBuilder("finish ");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    i = iIncrementAndGet;
                    bc7[] bc7VarArr = o44.j;
                    o44Var.getClass();
                    hm9.p("DebounceNotificationDispatcher", "failure", th);
                    ((cba) ((o45) o44Var.b.getValue())).c(th, false);
                    str = o44.k;
                    sb = new StringBuilder("finish ");
                    sb.append(i);
                    hm9.n(str, sb.toString());
                    return e5f.a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.X;
                try {
                    od2.a0(obj);
                    str = o44.k;
                    sb = new StringBuilder("finish ");
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    th = th3;
                    bc7[] bc7VarArr2 = o44.j;
                    o44Var.getClass();
                    hm9.p("DebounceNotificationDispatcher", "failure", th);
                    ((cba) ((o45) o44Var.b.getValue())).c(th, false);
                    str = o44.k;
                    sb = new StringBuilder("finish ");
                    sb.append(i);
                    hm9.n(str, sb.toString());
                    return e5f.a;
                }
            }
            sb.append(i);
            hm9.n(str, sb.toString());
            return e5f.a;
        } catch (Throwable th4) {
            hm9.n(o44.k, "finish " + ((int) this));
            throw th4;
        }
    }
}
