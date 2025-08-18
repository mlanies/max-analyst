package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ite implements dab {
    public final dab a;
    public int b;
    public final ConcurrentLinkedQueue c;
    public final Executor d;

    public ite(Executor executor, iic iicVar) {
        executor.getClass();
        this.d = executor;
        this.a = iicVar;
        this.c = new ConcurrentLinkedQueue();
        this.b = 0;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        boolean z;
        ((oj0) eabVar).c.j(eabVar, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(fi0Var, eabVar));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        ((oj0) eabVar).c.a(eabVar, "ThrottlingProducer", null);
        this.a.a(new hte(this, fi0Var), eabVar);
    }
}
