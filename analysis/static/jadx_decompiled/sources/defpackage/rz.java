package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* loaded from: classes2.dex */
public final class rz {
    public static final int w = (int) vl.o.getResources().getDimension(jtb.attach_drawable);
    public static final Drawable x = vl.o.getResources().getDrawable(gpc.w);
    public static final Drawable y = vl.o.getResources().getDrawable(woc.B0);
    public static final Drawable z = vl.o.getResources().getDrawable(gpc.V);
    public final r20 a = new r20(vl.o);
    public final r20 b;
    public final r20 c;
    public final ed3 d;
    public final o20 e;
    public final bk4 f;
    public final Context g;
    public final qz h;
    public l20 i;
    public es8 j;
    public boolean k;
    public boolean l;
    public VideoInfoTextView m;
    public VideoPlayerSeekBar n;
    public boolean o;
    public final GradientDrawable p;
    public final sme q;
    public boolean r;
    public LiveVideoPlaceHolderView s;
    public sd7 t;
    public float[] u;
    public e52 v;

    public rz(View view, qz qzVar) {
        r20 r20Var = new r20(vl.o);
        this.b = r20Var;
        r20 r20Var2 = new r20(vl.o, gpc.V);
        this.c = r20Var2;
        this.k = false;
        this.o = true;
        ed3 ed3VarB = vl.b();
        this.d = ed3VarB;
        this.g = view.getContext();
        this.e = ((y8a) ed3VarB).d();
        this.f = bk4.b();
        this.h = qzVar;
        r20Var.setCallback(view);
        r20Var2.setCallback(view);
        Context context = view.getContext();
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        this.q = smeVarR;
        this.p = hm9.S(Integer.valueOf(smeVarR.r), null, null);
        Drawable drawable = x;
        int i = smeVarR.t;
        ngg.G(drawable, i);
        ngg.G(z, i);
        ngg.G(y, i);
    }

    public final void a(la6 la6Var, fm9 fm9Var) {
        boolean zN = s5c.N(this.i);
        l20 l20Var = this.i;
        boolean z2 = false;
        if (l20Var.a == g20.c || zN) {
            x10 x10Var = zN ? l20Var.j.d.b : l20Var.b;
            boolean z3 = l20Var.o.a() || this.i.o.b();
            if (x10Var.s0 == 0 || x10Var.X || (z3 && !h(x10Var))) {
                la6Var.i(null, 3);
            } else {
                la6Var.i(this.a, 3);
            }
        } else {
            la6Var.i(null, 3);
        }
        if (this.v != null && s5c.U(this.i, this.j)) {
            z2 = true;
        }
        BitmapDrawable bitmapDrawableB = this.e.b(this.i, z2);
        if (bitmapDrawableB != null) {
            la6Var.i(new psc(bitmapDrawableB, fm9Var), 1);
        } else {
            la6Var.i(null, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r18, android.graphics.Rect r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.b(android.graphics.Canvas, android.graphics.Rect, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e2b c(defpackage.mq4 r14, boolean r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.c(mq4, boolean, boolean, boolean):e2b");
    }

    public final void d(int i, int i2) {
        VideoInfoTextView videoInfoTextView = this.m;
        if (videoInfoTextView != null) {
            videoInfoTextView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            if (c54.K(this.m)) {
                VideoInfoTextView videoInfoTextView2 = this.m;
                videoInfoTextView2.layout(i - videoInfoTextView2.getMeasuredWidth(), 0, i, this.m.getMeasuredHeight());
            } else {
                VideoInfoTextView videoInfoTextView3 = this.m;
                videoInfoTextView3.layout(0, 0, videoInfoTextView3.getMeasuredWidth(), this.m.getMeasuredHeight());
            }
        }
        VideoPlayerSeekBar videoPlayerSeekBar = this.n;
        if (videoPlayerSeekBar != null) {
            bk4 bk4Var = this.f;
            videoPlayerSeekBar.measure(View.MeasureSpec.makeMeasureSpec(i - (bk4Var.e * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(bk4Var.d, 1073741824));
            VideoPlayerSeekBar videoPlayerSeekBar2 = this.n;
            videoPlayerSeekBar2.layout(0, 0, videoPlayerSeekBar2.getMeasuredWidth(), this.n.getMeasuredHeight());
        }
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = this.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            LiveVideoPlaceHolderView liveVideoPlaceHolderView2 = this.s;
            liveVideoPlaceHolderView2.layout(0, 0, liveVideoPlaceHolderView2.getMeasuredWidth(), this.s.getMeasuredHeight());
        }
    }

    public final boolean e(int i, int i2, MotionEvent motionEvent) {
        qz qzVar = this.h;
        if (qzVar == null) {
            return false;
        }
        if (this.i.a == g20.a) {
            return true;
        }
        boolean z2 = Math.sqrt(Math.pow(((double) i2) - ((double) motionEvent.getY()), 2.0d) + Math.pow(((double) i) - ((double) motionEvent.getX()), 2.0d)) <= ((double) (w / 2));
        l20 l20Var = this.i;
        g20 g20Var = l20Var.a;
        g20 g20Var2 = g20.o;
        vx8 vx8Var = vx8.EDITED;
        if (g20Var == g20Var2 || s5c.P(l20Var)) {
            boolean zP = s5c.P(this.i);
            l20 l20Var2 = this.i;
            if (zP) {
                l20Var2 = l20Var2.j.d;
            }
            k20 k20Var = l20Var2.d;
            if (k20Var.a == 0 && this.i.o.b()) {
                return false;
            }
            if (this.i.o.d() && k20Var.a == 0 && !zP) {
                if (z2) {
                    es8 es8Var = this.j;
                    if (es8Var.a.v0 != vx8Var) {
                        qzVar.e(this.i, es8Var);
                    }
                }
            } else {
                if (!z2) {
                    return false;
                }
                qzVar.d(this.i);
            }
            return true;
        }
        l20 l20Var3 = this.i;
        if (l20Var3.a != g20.c && !s5c.N(l20Var3)) {
            return false;
        }
        x10 x10Var = s5c.N(this.i) ? this.i.j.d.b : this.i.b;
        if (x10Var.s0 == 0 && this.i.o.b()) {
            return false;
        }
        boolean z3 = x10Var.X;
        if (z3 && this.i.o.c()) {
            qzVar.b(this.i);
        } else {
            if (!z2) {
                return false;
            }
            if (x10Var.s0 == 0 && (this.i.o.d() || this.i.o.e())) {
                es8 es8Var2 = this.j;
                if (es8Var2.a.v0 != vx8Var) {
                    qzVar.e(this.i, es8Var2);
                }
            } else if (z3) {
                if (this.i.o.d()) {
                    qzVar.a(this.i);
                } else {
                    qzVar.b(this.i);
                }
            } else if (this.k) {
                this.k = false;
                qzVar.c(this.i);
            } else if (this.i.o.e() || (this.i.o.b() && h(x10Var))) {
                qzVar.a(this.i);
            } else {
                if (!this.i.o.a() && (!this.i.o.b() || h(x10Var))) {
                    return false;
                }
                qzVar.c(this.i);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.l20 r13, defpackage.es8 r14, defpackage.e52 r15) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.f(l20, es8, e52):void");
    }

    public final void g(int i) {
        boolean z2 = this.r;
        r20 r20Var = this.b;
        if (z2) {
            this.r = false;
            if (r20Var.getLevel() == i) {
                r20Var.onLevelChange(i);
                return;
            }
        }
        r20Var.setLevel(i);
    }

    public final boolean h(x10 x10Var) {
        return !x10Var.X && this.i.o.b() && !this.k && ((y8a) this.d).n().a.n() - this.i.p > 60000;
    }

    public final void i() {
        boolean zQ;
        cqc.b(this.t);
        if (this.h == null) {
            return;
        }
        p7b p7bVarN = ((y8a) vl.b()).n();
        l20 l20Var = this.i;
        if (l20Var == null) {
            zQ = false;
        } else {
            zQ = s5c.Q(p7bVarN, s5c.P(l20Var) ? l20Var.j.d.d : l20Var.d);
        }
        if (zQ) {
            r0a r0aVarN = qy9.l(1L, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7Var = new sd7(new ync(3, this), new xw0(21), ft.d);
            r0aVarN.a(sd7Var);
            this.t = sd7Var;
        }
    }
}
