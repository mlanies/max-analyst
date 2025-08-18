package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class ip6 extends mne {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip6(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.mne
    public final long a() throws IOException {
        switch (this.e) {
            case 0:
                kp6 kp6Var = (kp6) this.f;
                kp6Var.getClass();
                try {
                    kp6Var.J0.n(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    kp6Var.a(2, 2, e);
                    return -1L;
                }
            case 1:
                g8c g8cVar = (g8c) this.f;
                long jNanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) g8cVar.e).iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                f8c f8cVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    f8c f8cVar2 = (f8c) it.next();
                    synchronized (f8cVar2) {
                        if (g8cVar.c(f8cVar2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - f8cVar2.p;
                            if (j2 > j) {
                                f8cVar = f8cVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = g8cVar.a;
                if (j < j3 && i <= g8cVar.b) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (f8cVar) {
                    if (!f8cVar.o.isEmpty()) {
                        return 0L;
                    }
                    if (f8cVar.p + j != jNanoTime) {
                        return 0L;
                    }
                    f8cVar.i = true;
                    ((ConcurrentLinkedQueue) g8cVar.e).remove(f8cVar);
                    naf.d(f8cVar.c);
                    if (!((ConcurrentLinkedQueue) g8cVar.e).isEmpty()) {
                        return 0L;
                    }
                    ((coe) g8cVar.c).a();
                    return 0L;
                }
            default:
                ((k56) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip6(String str, kp6 kp6Var) {
        super(str, true);
        this.e = 0;
        this.f = kp6Var;
    }
}
