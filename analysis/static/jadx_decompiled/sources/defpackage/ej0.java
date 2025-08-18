package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class ej0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final jn c = new jn(new CopyOnWriteArrayList(), 0, (yj8) null);
    public final lr4 d = new lr4(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public mue f;
    public j4b g;

    public boolean a(tb8 tb8Var) {
        return false;
    }

    public final jn b(yj8 yj8Var) {
        return new jn((CopyOnWriteArrayList) this.c.o, 0, yj8Var);
    }

    public abstract zd8 c(yj8 yj8Var, n64 n64Var, long j);

    public final void d(ak8 ak8Var) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(ak8Var);
        if (z && hashSet.isEmpty()) {
            e();
        }
    }

    public void e() {
    }

    public final void f(ak8 ak8Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ak8Var);
        if (zIsEmpty) {
            g();
        }
    }

    public void g() {
    }

    public mue h() {
        return null;
    }

    public abstract tb8 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(ak8 ak8Var, z0f z0fVar, j4b j4bVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        fm9.f(looper == null || looper == looperMyLooper);
        this.g = j4bVar;
        mue mueVar = this.f;
        this.a.add(ak8Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(ak8Var);
            m(z0fVar);
        } else if (mueVar != null) {
            f(ak8Var);
            ak8Var.a(this, mueVar);
        }
    }

    public abstract void m(z0f z0fVar);

    public final void n(mue mueVar) {
        this.f = mueVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ak8) it.next()).a(this, mueVar);
        }
    }

    public abstract void o(zd8 zd8Var);

    public final void p(ak8 ak8Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(ak8Var);
        if (!arrayList.isEmpty()) {
            d(ak8Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        q();
    }

    public abstract void q();

    public final void r(nr4 nr4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            if (jr4Var.b == nr4Var) {
                copyOnWriteArrayList.remove(jr4Var);
            }
        }
    }

    public final void s(ik8 ik8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.o;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fk8 fk8Var = (fk8) it.next();
            if (fk8Var.b == ik8Var) {
                copyOnWriteArrayList.remove(fk8Var);
            }
        }
    }

    public void t(tb8 tb8Var) {
    }
}
