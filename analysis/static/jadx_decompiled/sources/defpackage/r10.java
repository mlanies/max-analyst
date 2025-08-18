package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class r10 {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public s10 a() {
        return new s10(this);
    }

    public void b() {
        Collection collection;
        m55 m55Var = (m55) this.e;
        if (m55Var.a.isTerminated() || m55Var.a.isShutdown()) {
            return;
        }
        boolean z = true;
        if (((AtomicBoolean) this.c).compareAndSet(true, false)) {
            this.b = m55.c(m55Var.g(), this.a);
            try {
                m55Var.execute((dd4) this.d);
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        if (ft4.c(m55Var.g(), this.b) > 0) {
            this.b = ft4.b;
            qv7 qv7Var = m55Var.Z;
            ReentrantReadWriteLock.ReadLock lock = m55Var.s0.readLock();
            lock.lock();
            try {
                if (qv7Var.f != 0) {
                    z = false;
                }
                if (z) {
                    collection = nz4.a;
                } else {
                    Object[] objArr = qv7Var.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        urf urfVar = obj instanceof urf ? (urf) obj : null;
                        if (urfVar != null) {
                            arrayList.add(urfVar);
                        }
                    }
                    collection = arrayList;
                }
                lock.unlock();
                m55Var.b.d(collection);
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    public o3g c(boolean z) {
        return z ? (i3g) ((khe) this.e).getValue() : (h3g) ((khe) this.d).getValue();
    }
}
