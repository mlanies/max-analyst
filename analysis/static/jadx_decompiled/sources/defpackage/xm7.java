package defpackage;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class xm7 {
    public static final Object k = new Object();
    public final Object a;
    public final rqc b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q57 j;

    public xm7(Object obj) {
        this.a = new Object();
        this.b = new rqc();
        this.c = 0;
        this.f = k;
        this.j = new q57(4, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        ds.g0().d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(zr6.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(wm7 wm7Var) {
        if (wm7Var.b) {
            if (!wm7Var.d()) {
                wm7Var.a(false);
                return;
            }
            int i = wm7Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            wm7Var.c = i2;
            wm7Var.a.a(this.e);
        }
    }

    public final void c(wm7 wm7Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (wm7Var != null) {
                b(wm7Var);
                wm7Var = null;
            } else {
                rqc rqcVar = this.b;
                rqcVar.getClass();
                pqc pqcVar = new pqc(rqcVar);
                rqcVar.c.put(pqcVar, Boolean.FALSE);
                while (pqcVar.hasNext()) {
                    b((wm7) ((Map.Entry) pqcVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(eh7 eh7Var, g2a g2aVar) {
        a("observe");
        if (eh7Var.Q().d == fg7.a) {
            return;
        }
        vm7 vm7Var = new vm7(this, eh7Var, g2aVar);
        wm7 wm7Var = (wm7) this.b.b(g2aVar, vm7Var);
        if (wm7Var != null && !wm7Var.c(eh7Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wm7Var != null) {
            return;
        }
        eh7Var.Q().a(vm7Var);
    }

    public final void f(g2a g2aVar) {
        a("observeForever");
        um7 um7Var = new um7(this, g2aVar);
        wm7 wm7Var = (wm7) this.b.b(g2aVar, um7Var);
        if (wm7Var instanceof vm7) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (wm7Var != null) {
            return;
        }
        um7Var.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            ds.g0().i0(this.j);
        }
    }

    public void j(g2a g2aVar) {
        a("removeObserver");
        wm7 wm7Var = (wm7) this.b.c(g2aVar);
        if (wm7Var == null) {
            return;
        }
        wm7Var.b();
        wm7Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public xm7() {
        this.a = new Object();
        this.b = new rqc();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new q57(4, this);
        this.e = obj;
        this.g = -1;
    }
}
