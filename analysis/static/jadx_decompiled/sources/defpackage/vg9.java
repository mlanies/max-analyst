package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class vg9 {
    public final Object a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Closeable c;
    public float d;
    public int e;
    public oj0 f;
    public f3 g;
    public final /* synthetic */ eo0 h;

    public vg9(eo0 eo0Var, Object obj) {
        this.h = eo0Var;
        this.a = obj;
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean a(fi0 fi0Var, eab eabVar) {
        vg9 vg9Var;
        Pair pairCreate = Pair.create(fi0Var, eabVar);
        synchronized (this) {
            try {
                eo0 eo0Var = this.h;
                Object obj = this.a;
                synchronized (eo0Var) {
                    vg9Var = (vg9) eo0Var.a.get(obj);
                }
                if (vg9Var != this) {
                    return false;
                }
                this.b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableC = this.c;
                float f = this.d;
                int i = this.e;
                oj0.c(arrayListK);
                oj0.d(arrayListL);
                oj0.b(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            if (closeableC != this.c) {
                                closeableC = null;
                            } else if (closeableC != null) {
                                closeableC = this.h.c(closeableC);
                            }
                        }
                        if (closeableC != null) {
                            if (f > 0.0f) {
                                fi0Var.i(f);
                            }
                            fi0Var.g(i, closeableC);
                            b(closeableC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                oj0 oj0Var = (oj0) eabVar;
                oj0Var.a(new xq6(this, pairCreate, false, 1));
                return true;
            } finally {
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((oj0) ((eab) ((Pair) it.next()).second)).f()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (!((oj0) ((eab) ((Pair) it.next()).second)).g()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized a9b e() {
        a9b a9bVar;
        a9b a9bVar2;
        a9bVar = a9b.a;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            oj0 oj0Var = (oj0) ((eab) ((Pair) it.next()).second);
            synchronized (oj0Var) {
                a9bVar2 = oj0Var.s0;
            }
            if (a9bVar.ordinal() <= a9bVar2.ordinal()) {
                a9bVar = a9bVar2;
            }
        }
        return a9bVar;
    }

    public final void f(f3 f3Var, Throwable th) {
        synchronized (this) {
            try {
                if (this.g != f3Var) {
                    return;
                }
                Iterator it = this.b.iterator();
                this.b.clear();
                this.h.e(this.a, this);
                b(this.c);
                this.c = null;
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            Object obj = pair.second;
                            ((oj0) ((eab) obj)).c.d((eab) obj, this.h.d, th, null);
                            oj0 oj0Var = this.f;
                            if (oj0Var != null) {
                                ((oj0) ((eab) pair.second)).putExtras(oj0Var.Y);
                            }
                            ((fi0) pair.first).e(th);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void g(f3 f3Var, Closeable closeable, int i) {
        synchronized (this) {
            try {
                if (this.g != f3Var) {
                    return;
                }
                b(this.c);
                this.c = null;
                Iterator it = this.b.iterator();
                int size = this.b.size();
                if (fi0.b(i)) {
                    this.c = this.h.c(closeable);
                    this.e = i;
                } else {
                    this.b.clear();
                    this.h.e(this.a, this);
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        try {
                            if (fi0.a(i)) {
                                Object obj = pair.second;
                                ((oj0) ((eab) obj)).c.a((eab) obj, this.h.d, null);
                                oj0 oj0Var = this.f;
                                if (oj0Var != null) {
                                    ((oj0) ((eab) pair.second)).putExtras(oj0Var.Y);
                                }
                                ((oj0) ((eab) pair.second)).putExtra(this.h.e, Integer.valueOf(size));
                            }
                            ((fi0) pair.first).g(i, closeable);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void h(f3 f3Var, float f) {
        synchronized (this) {
            try {
                if (this.g != f3Var) {
                    return;
                }
                this.d = f;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        ((fi0) pair.first).i(f);
                    }
                }
            } finally {
            }
        }
    }

    public final void i(int i) {
        boolean z;
        synchronized (this) {
            try {
                if (!(this.f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.b.isEmpty()) {
                    this.h.e(this.a, this);
                    return;
                }
                eab eabVar = (eab) ((Pair) this.b.iterator().next()).second;
                oj0 oj0Var = new oj0(((oj0) eabVar).a, ((oj0) eabVar).b, null, (b47) ((oj0) eabVar).c, ((oj0) eabVar).o, ((oj0) eabVar).X, d(), c(), e(), ((oj0) eabVar).w0);
                this.f = oj0Var;
                oj0Var.putExtras(((oj0) eabVar).Y);
                if (i == 0) {
                    throw null;
                }
                if (i != 3) {
                    oj0 oj0Var2 = this.f;
                    int iS = au1.s(i);
                    if (iS == 0) {
                        z = true;
                    } else {
                        if (iS != 1) {
                            if (iS == 2) {
                                throw new IllegalStateException("No boolean equivalent for UNSET");
                            }
                            throw new IllegalStateException("Unrecognized TriState value: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "UNSET" : "NO" : "YES"));
                        }
                        z = false;
                    }
                    oj0Var2.putExtra("started_as_prefetch", Boolean.valueOf(z));
                }
                f3 f3Var = new f3(1, this);
                this.g = f3Var;
                this.h.b.a(f3Var, this.f);
            } finally {
            }
        }
    }

    public final synchronized ArrayList j() {
        oj0 oj0Var = this.f;
        ArrayList arrayList = null;
        if (oj0Var == null) {
            return null;
        }
        boolean zC = c();
        synchronized (oj0Var) {
            if (zC != oj0Var.t0) {
                oj0Var.t0 = zC;
                arrayList = new ArrayList(oj0Var.v0);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList k() {
        oj0 oj0Var = this.f;
        ArrayList arrayList = null;
        if (oj0Var == null) {
            return null;
        }
        boolean zD = d();
        synchronized (oj0Var) {
            if (zD != oj0Var.Z) {
                oj0Var.Z = zD;
                arrayList = new ArrayList(oj0Var.v0);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList l() {
        oj0 oj0Var = this.f;
        if (oj0Var == null) {
            return null;
        }
        return oj0Var.i(e());
    }
}
