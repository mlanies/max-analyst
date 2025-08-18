package defpackage;

import android.animation.ValueAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.services.PipWorker;
import ru.ok.messages.video.widgets.FloatingVideoView;

/* loaded from: classes2.dex */
public final class o1b implements ComponentCallbacks, kn5, kj9 {
    public final o45 A0;
    public lj9 B0;
    public FloatingVideoView C0;
    public jn5 D0;
    public pj9 E0;
    public l20 F0;
    public es8 G0;
    public e52 H0;
    public long J0;
    public final tg X;
    public final au8 Y;
    public final dlf Z;
    public final Context a;
    public final ef7 b;
    public final ti4 c;
    public final p7b o;
    public final hle t0;
    public final ke7 u0;
    public final o20 v0;
    public final k1b w0;
    public final y1b x0;
    public final av0 y0;
    public final p82 z0;
    public final HashSet I0 = new HashSet();
    public volatile boolean K0 = false;
    public final bk4 s0 = bk4.b();

    public o1b(Context context, ef7 ef7Var, ti4 ti4Var, p7b p7bVar, tg tgVar, au8 au8Var, dlf dlfVar, hle hleVar, qz7 qz7Var, o20 o20Var, y1b y1bVar, av0 av0Var, p82 p82Var, o45 o45Var) {
        this.a = context;
        this.b = ef7Var;
        this.c = ti4Var;
        this.o = p7bVar;
        this.X = tgVar;
        this.Y = au8Var;
        this.Z = dlfVar;
        this.t0 = hleVar;
        this.u0 = qz7Var;
        this.v0 = o20Var;
        this.x0 = y1bVar;
        this.w0 = new k1b(context, this);
        this.y0 = av0Var;
        this.z0 = p82Var;
        this.A0 = o45Var;
        context.registerComponentCallbacks(this);
    }

    @Override // defpackage.kj9
    public final void G() {
        e(true);
    }

    @Override // defpackage.kj9
    public final void L() {
    }

    @Override // defpackage.ik9
    public final void P(int i, int i2, int i3) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            floatingVideoView.c(i, i2);
        }
    }

    @Override // defpackage.ik9
    public final void T() {
        lj9 lj9Var = this.B0;
        if (lj9Var == null) {
            return;
        }
        lj9Var.k1(true);
    }

    @Override // defpackage.ik9
    public final void X() {
        if (this.H0 == null || this.F0 == null) {
            return;
        }
        this.K0 = false;
    }

    @Override // defpackage.ik9
    public final void Y(Throwable th) {
        Context context = this.a;
        a14.N(0, context, zqe.b(context, th));
    }

    public final int[] a(Context context) {
        int height;
        int width;
        WindowManager windowManagerZ = nd7.z(context);
        this.c.getClass();
        Size sizeI = ti4.i(context);
        int rotation = windowManagerZ.getDefaultDisplay().getRotation();
        if (rotation == 1 || rotation == 3) {
            height = sizeI.getHeight();
            width = sizeI.getWidth();
        } else {
            height = sizeI.getWidth();
            width = sizeI.getHeight();
        }
        return new int[]{height, width};
    }

    public final void b(int i) {
        if (this.B0 == null || this.H0 == null) {
            return;
        }
        int iS = au1.s(i);
        if (iS == 0) {
            this.B0.S0();
            this.K0 = true;
        } else if (iS == 1) {
            this.B0.pause();
            this.K0 = false;
        } else {
            if (iS != 2) {
                return;
            }
            e(true);
        }
    }

    public final void c(boolean z) {
        pj9 pj9Var = this.E0;
        if (pj9Var == null) {
            return;
        }
        uk9 uk9Var = (uk9) ((kk9) pj9Var.b);
        if (uk9Var.Z == z) {
            return;
        }
        if (z) {
            mi6.VIRTUAL_KEY.b(uk9Var.Y);
        }
        uk9Var.Z = z;
        uk9Var.c();
    }

    public final void d(Context context, e52 e52Var, es8 es8Var, l20 l20Var, Rect rect, boolean z) {
        lj9 lj9Var;
        e(false);
        this.J0 = SystemClock.elapsedRealtime();
        this.F0 = l20Var;
        this.G0 = es8Var;
        this.H0 = e52Var;
        WindowManager windowManagerZ = nd7.z(context);
        FloatingVideoView floatingVideoView = new FloatingVideoView(context);
        this.C0 = floatingVideoView;
        floatingVideoView.setListener(this);
        int[] iArrA = a(context);
        FloatingVideoView floatingVideoView2 = this.C0;
        int i = iArrA[0];
        int i2 = iArrA[1];
        floatingVideoView2.o = i;
        floatingVideoView2.s0 = i2;
        s36.o().f(wv6.b((s5c.P(l20Var) ? l20Var.j.d.d : l20Var.d).d), null);
        float f = this.s0.f;
        kl9 kl9Var = new kl9(context, this.X, new float[]{f, f, f, f, f, f, f, f});
        lj9 lj9Var2 = new lj9(kl9Var, (we8) this.u0.get(), this.Z, this.t0, this.b, this.v0, this.Y, this.o, this, this.A0, this.c, false, true);
        this.B0 = lj9Var2;
        lj9Var2.Z1(l20Var, e52Var.b.a, es8Var.a, 1, true);
        this.C0.setVisibility(4);
        this.C0.addView((View) kl9Var.c);
        this.C0.c(this.B0.R(), this.B0.M0());
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (this.C0 != null && (lj9Var = this.B0) != null) {
            int iR = lj9Var.R();
            int iM0 = this.B0.M0();
            if (iR > 0 && iM0 > 0) {
                iWidth = iR;
                iHeight = iM0;
            }
            this.C0.c(iWidth, iHeight);
        }
        p7b p7bVar = this.o;
        t33 t33Var = p7bVar.a;
        t33Var.getClass();
        ne7 ne7Var = t33Var.g;
        Point point = new Point(ne7Var.getInt("app.video.pip.pos.x", 0), ne7Var.getInt("app.video.pip.pos.y", 0));
        if (point.x == 0 && point.y == 0) {
            point.x = this.C0.getLeftMargin();
            point.y = this.C0.getTopMargin();
        }
        FloatingVideoView floatingVideoView3 = this.C0;
        int i3 = point.x;
        int i4 = point.y;
        WindowManager.LayoutParams layoutParams = floatingVideoView3.B0;
        layoutParams.x = i3;
        layoutParams.y = i4;
        floatingVideoView3.b(true);
        FloatingVideoView floatingVideoView4 = this.C0;
        windowManagerZ.addView(floatingVideoView4, floatingVideoView4.getWindowManagerLayoutParams());
        Uri uriA = this.v0.a(l20Var);
        if (p7bVar.c.u() && uriA != null && z) {
            this.C0.setVisibility(4);
            jn5 jn5Var = new jn5(context);
            this.D0 = jn5Var;
            jn5Var.b(uriA, rect.left, rect.top, rect.width(), rect.height());
            this.D0.setListener(new n1b(this));
            jn5 jn5Var2 = this.D0;
            windowManagerZ.addView(jn5Var2, jn5Var2.getWindowLayoutParams());
            this.D0.a(this.C0.getXPos(), this.C0.getYPos(), this.C0.getWindowWidth(), this.C0.getWindowHeight());
        } else {
            g(false);
        }
        context.getApplicationContext();
        v7g v7gVar = (v7g) ((y8a) vl.b()).getAccessor().c(v7g.class);
        hm9.n("PIP_WORKER", "start");
        v7gVar.b("PIP_WORKER", h65.b, (rla) ((qla) new qla(PipWorker.class).setExpedited(jna.a)).build(), true).l();
        k1b k1bVar = this.w0;
        if (!k1bVar.d) {
            z7.N(k1bVar.a, k1bVar, k1bVar.c, null, 4);
            k1bVar.d = true;
        }
        try {
            this.y0.d(this);
        } catch (Exception unused) {
        }
    }

    public final void e(boolean z) {
        v7g v7gVar = (v7g) ((y8a) vl.b()).getAccessor().c(v7g.class);
        hm9.n("PIP_WORKER", "stop");
        v7gVar.c("PIP_WORKER");
        f(z);
        jn5 jn5Var = this.D0;
        if (jn5Var != null) {
            jn5Var.setListener(null);
            ValueAnimator valueAnimator = this.D0.v0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            try {
                nd7.z(this.D0.getContext()).removeView(this.D0);
            } catch (Exception unused) {
            }
            this.D0 = null;
        }
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        Iterator it = this.I0.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void f(boolean z) {
        lj9 lj9Var = this.B0;
        if (lj9Var != null) {
            lj9Var.l1(z);
            this.B0 = null;
        }
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            try {
                nd7.z(floatingVideoView.getContext()).removeView(this.C0);
            } catch (Exception unused) {
            }
            this.C0 = null;
        }
        pj9 pj9Var = this.E0;
        if (pj9Var != null) {
            View view = (View) ((uk9) ((kk9) pj9Var.b)).c;
            if (view != null) {
                try {
                    nd7.z(view.getContext()).removeView(view);
                } catch (Exception unused2) {
                }
            }
            this.E0 = null;
        }
        k1b k1bVar = this.w0;
        if (k1bVar.d) {
            k1bVar.a.unregisterReceiver(k1bVar);
            k1bVar.d = false;
        }
        try {
            this.y0.f(this);
        } catch (Exception unused3) {
        }
    }

    public final void g(boolean z) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            floatingVideoView.setVisibility(0);
        }
        jn5 jn5Var = this.D0;
        if (jn5Var == null) {
            return;
        }
        if (z) {
            this.X.g(jn5Var).u(new tk9(1, this));
            return;
        }
        try {
            ValueAnimator valueAnimator = jn5Var.v0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            nd7.z(this.D0.getContext()).removeView(this.D0);
        } catch (Exception unused) {
        }
        this.D0 = null;
    }

    @Override // defpackage.kj9
    public final void h() {
        if (this.G0 == null || this.F0 == null || this.H0 == null || this.B0 == null) {
            return;
        }
        this.K0 = false;
    }

    @Override // defpackage.kj9
    public final void i() {
        if (this.G0 == null || this.F0 == null || this.H0 == null || this.B0 == null) {
            return;
        }
        this.K0 = true;
    }

    @Override // defpackage.kj9
    public final void k(String str) {
    }

    @Override // defpackage.kj9
    public final void n() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        FloatingVideoView floatingVideoView = this.C0;
        if (floatingVideoView != null) {
            int[] iArrA = a(floatingVideoView.getContext());
            FloatingVideoView floatingVideoView2 = this.C0;
            int i = iArrA[0];
            int i2 = iArrA[1];
            floatingVideoView2.o = i;
            floatingVideoView2.s0 = i2;
            floatingVideoView2.b(true);
            floatingVideoView2.u0.updateViewLayout(floatingVideoView2, floatingVideoView2.B0);
            floatingVideoView2.a();
        }
    }

    @uae
    public void onEvent(re9 re9Var) {
        es8 es8Var = this.G0;
        if (es8Var == null || this.F0 == null || this.H0 == null || this.B0 == null || !re9Var.X.contains(Long.valueOf(es8Var.a.b))) {
            return;
        }
        e(false);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // defpackage.kj9
    public final void s() {
        if (this.B0 == null || this.C0 == null || this.F0 == null || this.G0 == null) {
            return;
        }
        ef7 ef7Var = this.b;
        if (ef7Var.get() != null) {
            ((ad) ef7Var.get()).e(SystemClock.elapsedRealtime() - this.J0, "ACTION_PIP_DURATION", null);
        }
        this.B0.X0();
        WindowManager.LayoutParams windowManagerLayoutParams = this.C0.getWindowManagerLayoutParams();
        if (!this.o.c.u()) {
            this.C0.getContext();
            e(true);
            return;
        }
        Uri uriA = this.v0.a(this.F0);
        if (uriA == null) {
            this.C0.getContext();
            e(true);
            return;
        }
        WindowManager windowManagerZ = nd7.z(this.C0.getContext());
        Display defaultDisplay = windowManagerZ.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        jn5 jn5Var = new jn5(this.C0.getContext());
        this.D0 = jn5Var;
        jn5Var.b(uriA, windowManagerLayoutParams.x, windowManagerLayoutParams.y, ((ViewGroup.LayoutParams) windowManagerLayoutParams).width, ((ViewGroup.LayoutParams) windowManagerLayoutParams).height);
        int[] iArrG = j47.G(point.x, point.y, windowManagerLayoutParams.width, windowManagerLayoutParams.height);
        int i = iArrG[0];
        int i2 = iArrG[1];
        es8 es8Var = this.G0;
        l20 l20Var = this.F0;
        f(false);
        this.D0.setListener(new n1b(this, es8Var, l20Var));
        jn5 jn5Var2 = this.D0;
        windowManagerZ.addView(jn5Var2, jn5Var2.getWindowLayoutParams());
        this.D0.a((point.x / 2) - (i / 2), (point.y / 2) - (i2 / 2), i, i2);
    }

    @uae
    public void onEvent(vc2 vc2Var) {
        e52 e52Var;
        if (this.G0 == null || this.F0 == null || (e52Var = this.H0) == null || this.B0 == null || vc2Var.b != e52Var.a) {
            return;
        }
        e(false);
    }

    @uae
    public void onEvent(vz2 vz2Var) {
        e52 e52Var;
        if (this.G0 == null || this.F0 == null || (e52Var = this.H0) == null || this.B0 == null || !vz2Var.b.contains(Long.valueOf(e52Var.a))) {
            return;
        }
        i92 i92Var = this.z0.C(this.H0.a).b.c;
        if (i92Var == i92.o || i92Var == i92.X) {
            e(false);
        }
    }
}
