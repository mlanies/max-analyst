package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class d2b extends k0 {
    public final lq8 A;
    public ww0 B;
    public ide C;
    public boolean D;
    public wz E;
    public xu3 F;
    public HashSet G;
    public wv6 H;
    public wv6 I;
    public final s94 y;
    public final wz z;

    public d2b(Resources resources, bg4 bg4Var, j84 j84Var, ExecutorService executorService, y7g y7gVar, wz wzVar) {
        super(bg4Var, executorService);
        this.y = new s94(resources, j84Var);
        this.z = wzVar;
        this.A = y7gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static psc s(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof psc) {
            return (psc) drawable;
        }
        if (drawable instanceof dq4) {
            return s(((dq4) drawable).j());
        }
        if (drawable instanceof js) {
            js jsVar = (js) drawable;
            int length = jsVar.c.length;
            for (int i = 0; i < length; i++) {
                psc pscVarS = s(jsVar.a(i));
                if (pscVarS != null) {
                    return pscVarS;
                }
            }
        }
        return null;
    }

    public static Drawable u(wz wzVar, l43 l43Var) {
        Drawable drawableA;
        if (wzVar == null) {
            return null;
        }
        Iterator<E> it = wzVar.iterator();
        while (it.hasNext()) {
            cq4 cq4Var = (cq4) it.next();
            if (cq4Var.b(l43Var) && (drawableA = cq4Var.a(l43Var)) != null) {
                return drawableA;
            }
        }
        return null;
    }

    @Override // defpackage.k0
    public final Drawable b(Object obj) {
        o43 o43Var = (o43) obj;
        try {
            f46.I();
            od2.p(o43.n0(o43Var));
            l43 l43Var = (l43) o43Var.e0();
            v(l43Var);
            Drawable drawableU = u(this.E, l43Var);
            if (drawableU == null && (drawableU = u(this.z, l43Var)) == null && (drawableU = this.y.a(l43Var)) == null) {
                throw new UnsupportedOperationException("Unrecognized image class: " + l43Var);
            }
            return drawableU;
        } finally {
            f46.I();
        }
    }

    @Override // defpackage.k0
    public final ru6 e(Object obj) {
        o43 o43Var = (o43) obj;
        od2.p(o43.n0(o43Var));
        return ((l43) o43Var.e0()).getImageInfo();
    }

    public final synchronized void t(ImagePerfDataListener imagePerfDataListener, n0 n0Var) {
        try {
            xu3 xu3Var = this.F;
            if (xu3Var != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) xu3Var.h;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                xu3Var.v(false);
                ((d) xu3Var.d).Z1();
            }
            if (imagePerfDataListener != null) {
                if (this.F == null) {
                    this.F = new xu3(AwakeTimeSinceBootClock.get(), this);
                }
                xu3 xu3Var2 = this.F;
                if (((CopyOnWriteArrayList) xu3Var2.h) == null) {
                    xu3Var2.h = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) xu3Var2.h).add(imagePerfDataListener);
                this.F.v(true);
            }
            this.H = (wv6) n0Var.e;
            this.I = (wv6) n0Var.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.k0
    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.e(super.toString(), "super");
        nw4VarR0.e(this.C, "dataSourceSupplier");
        return nw4VarR0.toString();
    }

    public final void v(l43 l43Var) {
        psc pscVarS;
        if (this.D) {
            if (this.i == null) {
                t44 t44Var = new t44();
                a(new bv6(t44Var));
                this.i = t44Var;
                la6 la6Var = this.h;
                if (la6Var != null) {
                    umc umcVar = la6Var.d;
                    umcVar.X = t44Var;
                    umcVar.invalidateSelf();
                }
            }
            Drawable drawable = this.i;
            if (drawable instanceof t44) {
                t44 t44Var2 = (t44) drawable;
                String str = this.j;
                t44Var2.getClass();
                if (str == null) {
                    str = "none";
                }
                t44Var2.a = str;
                t44Var2.invalidateSelf();
                la6 la6Var2 = this.h;
                t44Var2.X = (la6Var2 == null || (pscVarS = s(la6Var2.d)) == null) ? null : pscVarS.X;
                Object obj = this.k;
                String string = obj != null ? obj.toString() : null;
                if (string != null) {
                    t44Var2.Y.put("cc", string);
                }
                if (l43Var == null) {
                    t44Var2.b();
                    return;
                }
                int width = l43Var.getWidth();
                int height = l43Var.getHeight();
                t44Var2.b = width;
                t44Var2.c = height;
                t44Var2.invalidateSelf();
                t44Var2.o = l43Var.getSizeInBytes();
            }
        }
    }

    public final void w(rq4 rq4Var) {
        if (ta5.a.i(2)) {
            ta5.f(k0.x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, rq4Var);
        }
        this.a.a(rq4Var != null ? pq4.a : pq4.b);
        if (this.m) {
            this.b.g(this);
            n();
        }
        la6 la6Var = this.h;
        if (la6Var != null) {
            umc umcVar = la6Var.d;
            umcVar.X = null;
            umcVar.invalidateSelf();
            this.h = null;
        }
        if (rq4Var != null) {
            if (!(rq4Var instanceof la6)) {
                throw new IllegalArgumentException();
            }
            la6 la6Var2 = (la6) rq4Var;
            this.h = la6Var2;
            t44 t44Var = (t44) this.i;
            umc umcVar2 = la6Var2.d;
            umcVar2.X = t44Var;
            umcVar2.invalidateSelf();
        }
        v(null);
    }
}
