package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class dj0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final gk8 c = new gk8();
    public final kr4 d = new kr4();
    public Looper e;
    public lue f;
    public i4b g;

    public abstract yd8 a(xj8 xj8Var, n64 n64Var, long j);

    public final void b(zj8 zj8Var) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(zj8Var);
        if (z && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(zj8 zj8Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zj8Var);
        if (zIsEmpty) {
            e();
        }
    }

    public void e() {
    }

    public abstract rb8 f();

    public abstract void g();

    public final void h(zj8 zj8Var, y0f y0fVar, i4b i4bVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        np8.d(looper == null || looper == looperMyLooper);
        this.g = i4bVar;
        lue lueVar = this.f;
        this.a.add(zj8Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(zj8Var);
            i(y0fVar);
        } else if (lueVar != null) {
            d(zj8Var);
            zj8Var.a(this, lueVar);
        }
    }

    public abstract void i(y0f y0fVar);

    public final void j(lue lueVar) {
        this.f = lueVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zj8) it.next()).a(this, lueVar);
        }
    }

    public abstract void k(yd8 yd8Var);

    public final void l(zj8 zj8Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(zj8Var);
        if (!arrayList.isEmpty()) {
            b(zj8Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        m();
    }

    public abstract void m();

    public final void n(mr4 mr4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            if (ir4Var.b == mr4Var) {
                copyOnWriteArrayList.remove(ir4Var);
            }
        }
    }

    public final void o(hk8 hk8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            if (ek8Var.b == hk8Var) {
                copyOnWriteArrayList.remove(ek8Var);
            }
        }
    }
}
