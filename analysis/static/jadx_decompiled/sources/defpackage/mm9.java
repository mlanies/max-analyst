package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class mm9 {
    public final aea a;
    public final sc4 b;
    public final ExecutorService c;
    public final String d;
    public volatile boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayList());
    public volatile Future g;

    public mm9(aea aeaVar, sc4 sc4Var, ExecutorService executorService, String str, boolean z) {
        this.a = aeaVar;
        this.b = sc4Var;
        this.c = executorService;
        this.d = str;
        this.e = z;
    }

    public final void a(nm9 nm9Var) {
        AtomicReference atomicReference;
        boolean z = false;
        loop0: while (true) {
            atomicReference = this.f;
            ArrayList arrayList = (ArrayList) atomicReference.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == nm9Var) {
                    z = true;
                    break;
                }
            }
            while (!atomicReference.compareAndSet(arrayList, arrayList2)) {
                if (atomicReference.get() != arrayList) {
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        while (true) {
            ArrayList arrayList3 = (ArrayList) atomicReference.get();
            ArrayList arrayList4 = new ArrayList(arrayList3);
            arrayList4.add(new WeakReference(nm9Var));
            while (!atomicReference.compareAndSet(arrayList3, arrayList4)) {
                if (atomicReference.get() != arrayList3) {
                    break;
                }
            }
            return;
        }
    }

    public final void b(qm9 qm9Var, nm9 nm9Var) {
        if (qm9Var != null) {
            try {
                if (qm9Var.b.exists() && qm9Var.b.canRead()) {
                    nm9Var.onFinished(this.d, qm9Var.b, qm9Var.a);
                    return;
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        nm9Var.onFailed(cause);
                    }
                } else {
                    nm9Var.onFailed(th);
                }
                if (this.e) {
                    a(nm9Var);
                    d();
                    return;
                }
                return;
            }
        }
        if (this.e) {
            a(nm9Var);
            d();
        }
    }

    public final void c(File file, String str) {
        for (WeakReference weakReference : (Iterable) this.f.get()) {
            nm9 nm9Var = (nm9) weakReference.get();
            if (nm9Var != null) {
                nm9Var.onFinished(this.d, file, str);
            }
            weakReference.clear();
        }
    }

    public final void d() {
        Future future = this.g;
        if (future == null || future.isDone()) {
            this.g = this.c.submit(new l5(10, this));
        }
    }

    public final void e(nm9 nm9Var) {
        Future future;
        if (this.g == null || !((future = this.g) == null || future.isDone())) {
            a(nm9Var);
        } else {
            this.c.execute(new vs5(this, 29, nm9Var));
        }
    }
}
