package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i99 implements qv6, h06 {
    public boolean X;
    public final qv6 Y;
    public pv6 Z;
    public final Object a;
    public final oz1 b;
    public int c;
    public final yt8 o;
    public Executor s0;
    public final LongSparseArray t0;
    public final LongSparseArray u0;
    public int v0;
    public final ArrayList w0;
    public final ArrayList x0;

    public i99(int i, int i2, int i3, int i4) {
        td tdVar = new td(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new oz1(1, this);
        this.c = 0;
        this.o = new yt8(6, this);
        this.X = false;
        this.t0 = new LongSparseArray();
        this.u0 = new LongSparseArray();
        this.x0 = new ArrayList();
        this.Y = tdVar;
        this.v0 = 0;
        this.w0 = new ArrayList(m());
    }

    @Override // defpackage.h06
    public final void a(ov6 ov6Var) {
        synchronized (this.a) {
            b(ov6Var);
        }
    }

    public final void b(ov6 ov6Var) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.w0.indexOf(ov6Var);
                if (iIndexOf >= 0) {
                    this.w0.remove(iIndexOf);
                    int i = this.v0;
                    if (iIndexOf <= i) {
                        this.v0 = i - 1;
                    }
                }
                this.x0.remove(ov6Var);
                if (this.c > 0) {
                    d(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ecd ecdVar) {
        pv6 pv6Var;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.w0.size() < m()) {
                    ecdVar.a(this);
                    this.w0.add(ecdVar);
                    pv6Var = this.Z;
                    executor = this.s0;
                } else {
                    ecdVar.close();
                    pv6Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pv6Var != null) {
            if (executor != null) {
                executor.execute(new vs5(this, 26, pv6Var));
            } else {
                pv6Var.f(this);
            }
        }
    }

    @Override // defpackage.qv6
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.X) {
                    return;
                }
                Iterator it = new ArrayList(this.w0).iterator();
                while (it.hasNext()) {
                    ((ov6) it.next()).close();
                }
                this.w0.clear();
                this.Y.close();
                this.X = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(qv6 qv6Var) {
        ov6 ov6VarO;
        synchronized (this.a) {
            try {
                if (this.X) {
                    return;
                }
                int size = this.u0.size() + this.w0.size();
                if (size >= qv6Var.m()) {
                    return;
                }
                do {
                    try {
                        ov6VarO = qv6Var.o();
                        if (ov6VarO != null) {
                            this.c--;
                            size++;
                            this.u0.put(ov6VarO.getImageInfo().getTimestamp(), ov6VarO);
                            e();
                        }
                    } catch (IllegalStateException unused) {
                        ov6VarO = null;
                    }
                    if (ov6VarO == null || this.c <= 0) {
                        break;
                    }
                } while (size < qv6Var.m());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.a) {
            try {
                for (int size = this.t0.size() - 1; size >= 0; size--) {
                    su6 su6Var = (su6) this.t0.valueAt(size);
                    long timestamp = su6Var.getTimestamp();
                    ov6 ov6Var = (ov6) this.u0.get(timestamp);
                    if (ov6Var != null) {
                        this.u0.remove(timestamp);
                        this.t0.removeAt(size);
                        c(new ecd(ov6Var, null, su6Var));
                    }
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.a) {
            try {
                if (this.u0.size() != 0 && this.t0.size() != 0) {
                    long jKeyAt = this.u0.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.t0.keyAt(0);
                    c54.k(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.u0.size() - 1; size >= 0; size--) {
                            if (this.u0.keyAt(size) < jKeyAt2) {
                                ((ov6) this.u0.valueAt(size)).close();
                                this.u0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.t0.size() - 1; size2 >= 0; size2--) {
                            if (this.t0.keyAt(size2) < jKeyAt) {
                                this.t0.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.qv6
    public final ov6 g() {
        synchronized (this.a) {
            try {
                if (this.w0.isEmpty()) {
                    return null;
                }
                if (this.v0 >= this.w0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.w0.size() - 1; i++) {
                    if (!this.x0.contains(this.w0.get(i))) {
                        arrayList.add((ov6) this.w0.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ov6) it.next()).close();
                }
                int size = this.w0.size();
                ArrayList arrayList2 = this.w0;
                this.v0 = size;
                ov6 ov6Var = (ov6) arrayList2.get(size - 1);
                this.x0.add(ov6Var);
                return ov6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qv6
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.Y.getHeight();
        }
        return height;
    }

    @Override // defpackage.qv6
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    @Override // defpackage.qv6
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.Y.getWidth();
        }
        return width;
    }

    @Override // defpackage.qv6
    public final int j() {
        int iJ;
        synchronized (this.a) {
            iJ = this.Y.j();
        }
        return iJ;
    }

    @Override // defpackage.qv6
    public final void k() {
        synchronized (this.a) {
            this.Y.k();
            this.Z = null;
            this.s0 = null;
            this.c = 0;
        }
    }

    @Override // defpackage.qv6
    public final void l(pv6 pv6Var, Executor executor) {
        synchronized (this.a) {
            pv6Var.getClass();
            this.Z = pv6Var;
            executor.getClass();
            this.s0 = executor;
            this.Y.l(this.o, executor);
        }
    }

    @Override // defpackage.qv6
    public final int m() {
        int iM;
        synchronized (this.a) {
            iM = this.Y.m();
        }
        return iM;
    }

    @Override // defpackage.qv6
    public final ov6 o() {
        synchronized (this.a) {
            try {
                if (this.w0.isEmpty()) {
                    return null;
                }
                if (this.v0 >= this.w0.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.w0;
                int i = this.v0;
                this.v0 = i + 1;
                ov6 ov6Var = (ov6) arrayList.get(i);
                this.x0.add(ov6Var);
                return ov6Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
