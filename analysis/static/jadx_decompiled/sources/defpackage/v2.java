package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class v2 implements kk9, ed6 {
    public final Object a;
    public final Object b;
    public Object c;

    public v2(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = context;
    }

    public q36 f() {
        ilc ilcVar = (ilc) this.a;
        ilcVar.a();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (q36) ((khe) this.c).getValue() : ilcVar.d(g());
    }

    public abstract String g();

    public void i() {
        synchronized (this.b) {
            try {
                xff xffVar = (xff) this.c;
                if (xffVar != null) {
                    ((nx0) this.a).w(xffVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface j() {
        throw new UnsupportedOperationException();
    }

    public abstract int k();

    public void l(ViewGroup viewGroup, int i) {
        this.c = LayoutInflater.from((Context) this.b).inflate(i, viewGroup, false);
        m();
    }

    public abstract void m();

    public void n(tj3 tj3Var) {
        Iterator it = ((Set) this.a).iterator();
        while (it.hasNext()) {
            tj3Var.accept(it.next());
        }
    }

    public void o(Bitmap bitmap, t26 t26Var, uue uueVar) {
        throw new UnsupportedOperationException();
    }

    public void p(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void q(t26 t26Var) {
        throw new UnsupportedOperationException();
    }

    public void r(Object obj) {
        ((Set) this.a).add(obj);
    }

    public abstract void release();

    public void t(q36 q36Var) {
        if (q36Var == ((q36) ((khe) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void u() {
    }

    @Override // defpackage.ed6
    public void v() {
        ((nx0) this.a).v(new nf4(5, this));
    }

    public void w(t26 t26Var) {
    }

    public void x(sg9 sg9Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void y(od4 od4Var);

    public abstract void z();

    public v2(ilc ilcVar) {
        this.a = ilcVar;
        this.b = new AtomicBoolean(false);
        this.c = new khe(new ie(8, this));
    }

    public v2(nx0 nx0Var) {
        this.a = nx0Var;
        this.b = new Object();
    }
}
