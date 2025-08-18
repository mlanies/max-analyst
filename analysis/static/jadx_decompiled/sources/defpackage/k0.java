package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class k0 implements mq4, ag4, sa6 {
    public static final Map v = dx6.a("component_tag", "drawee");
    public static final Map w = dx6.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class x = k0.class;
    public final qq4 a;
    public final bg4 b;
    public final Executor c;
    public zs6 d;
    public ta6 e;
    public ev3 f;
    public final ForwardingControllerListener2 g;
    public la6 h;
    public Drawable i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public g0 q;
    public Object r;
    public boolean s;
    public boolean t;
    public Drawable u;

    public k0(bg4 bg4Var, ExecutorService executorService) {
        this.a = qq4.c ? new qq4() : qq4.b;
        this.g = new ForwardingControllerListener2();
        this.s = true;
        this.t = false;
        this.b = bg4Var;
        this.c = executorService;
        g(null, null);
    }

    public final void a(ev3 ev3Var) {
        ev3Var.getClass();
        ev3 ev3Var2 = this.f;
        if (ev3Var2 instanceof j0) {
            ((j0) ev3Var2).b(ev3Var);
            return;
        }
        if (ev3Var2 == null) {
            this.f = ev3Var;
            return;
        }
        if (f46.W()) {
            f46.e("AbstractDraweeController#createInternal");
        }
        j0 j0Var = new j0();
        j0Var.b(ev3Var2);
        j0Var.b(ev3Var);
        if (f46.W()) {
            f46.A();
        }
        this.f = j0Var;
    }

    public abstract Drawable b(Object obj);

    public final Animatable c() {
        Object obj = this.u;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    public final ev3 d() {
        ev3 ev3Var = this.f;
        return ev3Var == null ? ii0.a : ev3Var;
    }

    public abstract ru6 e(Object obj);

    public final la6 f() {
        la6 la6Var = this.h;
        if (la6Var != null) {
            return la6Var;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.k);
    }

    public final synchronized void g(Object obj, String str) {
        bg4 bg4Var;
        try {
            f46.I();
            this.a.a(pq4.Y);
            if (!this.s && (bg4Var = this.b) != null) {
                bg4Var.g(this);
            }
            this.l = false;
            o();
            this.o = false;
            zs6 zs6Var = this.d;
            if (zs6Var != null) {
                zs6Var.b = false;
                zs6Var.a = 4;
                zs6Var.c = 0;
            }
            ta6 ta6Var = this.e;
            if (ta6Var != null) {
                ta6Var.a = null;
                ta6Var.c = false;
                ta6Var.d = false;
                ta6Var.a = this;
            }
            ev3 ev3Var = this.f;
            if (ev3Var instanceof j0) {
                j0 j0Var = (j0) ev3Var;
                synchronized (j0Var) {
                    j0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            la6 la6Var = this.h;
            if (la6Var != null) {
                la6Var.f.o(la6Var.a);
                la6Var.g();
                umc umcVar = this.h.d;
                umcVar.X = null;
                umcVar.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (ta5.a.i(2)) {
                ta5.f(x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            f46.I();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean h(String str, g0 g0Var) {
        if (g0Var == null && this.q == null) {
            return true;
        }
        return str.equals(this.j) && g0Var == this.q && this.m;
    }

    public final void i(String str, Throwable th) {
        if (ta5.a.i(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (ta5.a.i(2)) {
                ft7 ft7Var = ta5.a;
                String simpleName = x.getSimpleName();
                String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th);
                ft7Var.b(simpleName);
            }
        }
    }

    public final void j(Object obj, String str) {
        if (ta5.a.i(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            o43 o43Var = (o43) obj;
            int iIdentityHashCode = 0;
            if (o43Var != null && o43Var.m0()) {
                iIdentityHashCode = System.identityHashCode(o43Var.b.b());
            }
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf(iIdentityHashCode)};
            if (ta5.a.i(2)) {
                ft7 ft7Var = ta5.a;
                String simpleName2 = x.getSimpleName();
                String.format(null, "controller %x %s: %s: image: %s %x", objArr);
                ft7Var.b(simpleName2);
            }
        }
    }

    public final ControllerListener2.Extras k(Map map, Map map2, Uri uri) {
        PointF pointF;
        String strValueOf;
        la6 la6Var = this.h;
        if (la6Var instanceof la6) {
            strValueOf = String.valueOf(!(la6Var.e(2) instanceof psc) ? null : la6Var.f(2).X);
            pointF = !(la6Var.e(2) instanceof psc) ? null : la6Var.f(2).Z;
        } else {
            pointF = null;
            strValueOf = null;
        }
        la6 la6Var2 = this.h;
        Rect bounds = la6Var2 == null ? null : la6Var2.d.getBounds();
        Object obj = this.k;
        boolean z = this.t;
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = strValueOf;
        if (pointF != null) {
            extras.focusX = Float.valueOf(pointF.x);
            extras.focusY = Float.valueOf(pointF.y);
        }
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = z;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = w;
        extras.componentExtras = v;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void l(String str, g0 g0Var, Throwable th, boolean z) {
        Drawable drawable;
        f46.I();
        if (!h(str, g0Var)) {
            i("ignore_old_datasource @ onFailure", th);
            g0Var.a();
            f46.I();
            return;
        }
        this.a.a(z ? pq4.x0 : pq4.y0);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            i("final_failed @ onFailure", th);
            this.q = null;
            this.n = true;
            la6 la6Var = this.h;
            if (la6Var != null) {
                if (!this.o || (drawable = this.u) == null) {
                    boolean zQ = q();
                    ya5 ya5Var = la6Var.e;
                    if (zQ) {
                        ya5Var.C0++;
                        la6Var.c();
                        if (ya5Var.a(4) != null) {
                            la6Var.b(4);
                        } else {
                            la6Var.b(1);
                        }
                        ya5Var.c();
                    } else {
                        ya5Var.C0++;
                        la6Var.c();
                        if (ya5Var.a(5) != null) {
                            la6Var.b(5);
                        } else {
                            la6Var.b(1);
                        }
                        ya5Var.c();
                    }
                } else {
                    la6Var.j(drawable, 1.0f, true);
                }
            }
            ControllerListener2.Extras extrasK = k(g0Var == null ? null : g0Var.a, null, null);
            d().d(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, extrasK);
        } else {
            i("intermediate_failed @ onFailure", th);
            d().k(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        f46.I();
    }

    public final void m(String str, g0 g0Var, Object obj, float f, boolean z, boolean z2, boolean z3) {
        try {
            f46.I();
            if (!h(str, g0Var)) {
                j(obj, "ignore_old_datasource @ onNewResult");
                o43.S((o43) obj);
                g0Var.a();
                f46.I();
                return;
            }
            this.a.a(z ? pq4.v0 : pq4.w0);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.r;
                Object obj3 = this.u;
                this.r = obj;
                this.u = drawableB;
                try {
                    if (z) {
                        j(obj, "set_final_result @ onNewResult");
                        this.q = null;
                        f().j(drawableB, 1.0f, z2);
                        ru6 ru6VarE = e(obj);
                        d().a(str, ru6VarE, c());
                        this.g.onFinalImageSet(str, ru6VarE, k(g0Var == null ? null : g0Var.a, ru6VarE == null ? null : ru6VarE.getExtras(), null));
                    } else if (z3) {
                        j(obj, "set_temporary_result @ onNewResult");
                        f().j(drawableB, 1.0f, z2);
                        ru6 ru6VarE2 = e(obj);
                        d().a(str, ru6VarE2, c());
                        this.g.onFinalImageSet(str, ru6VarE2, k(g0Var == null ? null : g0Var.a, ru6VarE2 == null ? null : ru6VarE2.getExtras(), null));
                    } else {
                        j(obj, "set_intermediate_result @ onNewResult");
                        f().j(drawableB, f, z2);
                        ru6 ru6VarE3 = e(obj);
                        d().h(str, ru6VarE3);
                        this.g.onIntermediateImageSet(str, ru6VarE3);
                    }
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof kq4)) {
                        ((kq4) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        j(obj2, "release_previous_result @ onNewResult");
                        o43.S((o43) obj2);
                    }
                    f46.I();
                } catch (Throwable th) {
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof kq4)) {
                        ((kq4) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        j(obj2, "release_previous_result @ onNewResult");
                        o43.S((o43) obj2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                j(obj, "drawable_failed @ onNewResult");
                o43.S((o43) obj);
                l(str, g0Var, e, z);
                f46.I();
            }
        } catch (Throwable th2) {
            f46.I();
            throw th2;
        }
    }

    public final void n() {
        this.a.a(pq4.t0);
        zs6 zs6Var = this.d;
        if (zs6Var != null) {
            zs6Var.c = 0;
        }
        ta6 ta6Var = this.e;
        if (ta6Var != null) {
            ta6Var.c = false;
            ta6Var.d = false;
        }
        la6 la6Var = this.h;
        if (la6Var != null) {
            la6Var.f.o(la6Var.a);
            la6Var.g();
        }
        o();
    }

    public final void o() {
        Map map;
        Map extras;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        g0 g0Var = this.q;
        if (g0Var != null) {
            map = g0Var.a;
            g0Var.a();
            this.q = null;
        } else {
            map = null;
        }
        Object obj = this.u;
        if (obj != null && (obj instanceof kq4)) {
            ((kq4) obj).a();
        }
        if (this.p != null) {
            this.p = null;
        }
        this.u = null;
        Object obj2 = this.r;
        if (obj2 != null) {
            ru6 ru6VarE = e(obj2);
            extras = ru6VarE == null ? null : ru6VarE.getExtras();
            j(this.r, "release");
            o43.S((o43) this.r);
            this.r = null;
        } else {
            extras = null;
        }
        if (z) {
            d().g(this.j);
            this.g.onRelease(this.j, k(map, extras, null));
        }
    }

    public final void p(g0 g0Var, ru6 ru6Var) {
        d().e(this.k, this.j);
        String str = this.j;
        Object obj = this.k;
        d2b d2bVar = (d2b) this;
        wv6 wv6Var = d2bVar.H;
        wv6 wv6Var2 = d2bVar.I;
        Uri uri = wv6Var != null ? wv6Var.b : null;
        if (uri == null) {
            uri = wv6Var2 != null ? wv6Var2.b : null;
        }
        this.g.onSubmit(str, obj, k(g0Var == null ? null : g0Var.a, ru6Var != null ? ru6Var.getExtras() : null, uri));
    }

    public final boolean q() {
        zs6 zs6Var;
        return this.n && (zs6Var = this.d) != null && zs6Var.b && zs6Var.c < zs6Var.a;
    }

    public final void r() {
        o43 o43Var;
        ww0 ww0Var;
        f46.I();
        d2b d2bVar = (d2b) this;
        f46.I();
        try {
            lq8 lq8Var = d2bVar.A;
            if (lq8Var == null || (ww0Var = d2bVar.B) == null) {
                f46.I();
                o43Var = null;
            } else {
                o43 o43Var2 = lq8Var.get(ww0Var);
                if (o43Var2 == null || ((hx6) ((l43) o43Var2.e0()).getQualityInfo()).c) {
                    f46.I();
                    o43Var = o43Var2;
                } else {
                    o43Var2.close();
                    f46.I();
                    o43Var = null;
                }
            }
            if (o43Var != null) {
                f46.I();
                this.q = null;
                this.m = true;
                this.n = false;
                this.a.a(pq4.D0);
                p(this.q, e(o43Var));
                synchronized (d2bVar) {
                }
                m(this.j, this.q, o43Var, 1.0f, true, true, true);
                f46.I();
                return;
            }
            this.a.a(pq4.u0);
            this.h.m(0.0f, true);
            this.m = true;
            this.n = false;
            f46.I();
            if (ta5.a.i(2)) {
                ta5.d(d2b.class, Integer.valueOf(System.identityHashCode(d2bVar)), "controller %x: getDataSource");
            }
            g0 g0Var = (g0) d2bVar.C.get();
            f46.I();
            this.q = g0Var;
            p(g0Var, null);
            if (ta5.a.i(2)) {
                ta5.f(x, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.j, Integer.valueOf(System.identityHashCode(this.q)));
            }
            this.q.m(new i0(this, this.j, this.q.f()), this.c);
        } finally {
            f46.I();
        }
    }

    public String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.d("isAttached", this.l);
        nw4VarR0.d("isRequestSubmitted", this.m);
        nw4VarR0.d("hasFetchFailed", this.n);
        o43 o43Var = (o43) this.r;
        int iIdentityHashCode = 0;
        if (o43Var != null && o43Var.m0()) {
            iIdentityHashCode = System.identityHashCode(o43Var.b.b());
        }
        nw4VarR0.a(iIdentityHashCode, "fetchedImage");
        nw4VarR0.e(this.a.a.toString(), "events");
        return nw4VarR0.toString();
    }
}
