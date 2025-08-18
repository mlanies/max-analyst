package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class nl7 implements bm7 {
    public final oq1 X = f8.g(new sy4(19, this));
    public lq1 Y;
    public List a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger o;

    public nl7(ArrayList arrayList, boolean z, ok4 ok4Var) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.o = new AtomicInteger(arrayList.size());
        d(new q57(3, this), ju0.k());
        if (this.a.isEmpty()) {
            this.Y.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        List list = this.a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            bm7 bm7Var = (bm7) list.get(i2);
            bm7Var.d(new eo(this, i2, bm7Var, 3), ok4Var);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bm7) it.next()).cancel(z);
            }
        }
        return this.X.cancel(z);
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        this.X.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.X.b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        List<bm7> list = this.a;
        if (list != null && !isDone()) {
            loop0: for (bm7 bm7Var : list) {
                while (!bm7Var.isDone()) {
                    try {
                        bm7Var.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.X.b.get();
    }
}
