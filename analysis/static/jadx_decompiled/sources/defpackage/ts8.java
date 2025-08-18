package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.views.widgets.VideoInfoTextView;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public class ts8 extends ViewGroup implements GestureDetector.OnGestureListener, qz, hc7, kj9, s00 {
    public static final Drawable V0 = ngg.u(gpc.e0, -1, vl.o);
    public static final int W0 = (int) vl.o.getResources().getDimension(jtb.attach_drawable);
    public static final float X0 = vl.o.getResources().getDimension(jtb.divider_item_collage);
    public fd7 A0;
    public u2 B0;
    public l20 C0;
    public TextPaint D0;
    public Paint E0;
    public TextPaint F0;
    public Paint G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public View K0;
    public Drawable L0;
    public o20 M0;
    public dz N0;
    public qqd O0;
    public e52 P0;
    public boolean Q0;
    public a6d R0;
    public Drawable S0;
    public final xpb T0;
    public sd7 U0;
    public ed3 a;
    public bk4 b;
    public int c;
    public final ar0 o;
    public kk5 s0;
    public float[] t0;
    public List u0;
    public int v0;
    public k8g w0;
    public l20 x0;
    public es8 y0;
    public ps8 z0;

    public ts8(Context context) {
        super(context);
        this.o = new ar0();
        this.v0 = 0;
        this.J0 = true;
        this.T0 = new xpb();
        z();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(defpackage.l20 r4, defpackage.l20 r5) {
        /*
            d20 r0 = r5.o
            d20 r1 = r4.o
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L10
            boolean r0 = r1.c()
            if (r0 != 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            boolean r1 = r4.f()
            if (r1 == 0) goto L2f
            x10 r1 = r4.b
            java.lang.String r1 = r1.t0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2f
            d20 r5 = r5.o
            d20 r4 = r4.o
            if (r5 == r4) goto L2f
            boolean r4 = r4.c()
            if (r4 == 0) goto L2f
            r4 = r3
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r0 != 0) goto L34
            if (r4 == 0) goto L35
        L34:
            r2 = r3
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.H(l20, l20):boolean");
    }

    private float[] getCornersForVideo() {
        float[] fArrW = w(0);
        if (fArrW != null) {
            for (int i = 0; i < fArrW.length; i++) {
                float f = fArrW[i];
                if (f > 0.0f) {
                    fArrW[i] = f - this.b.a;
                }
            }
        }
        return fArrW;
    }

    public static void l(la6 la6Var, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        float f;
        float f2;
        vl vlVar = vl.o;
        bk4.b();
        float fB = fk4.b((int) 11.0f);
        float f3 = 0.0f;
        if (i2 != 1) {
            float f4 = (i == 0 && z3 && i3 == 1) ? fB : 0.0f;
            f = f4;
            if (i == 0 && z3 && f4 == 0.0f) {
                f4 = fB;
            }
            if (i == 1 && i3 > 1 && !z && z3) {
                f = fB;
            }
            int i4 = i2 - 1;
            if (i == i4 && i3 == 1) {
                f2 = fB;
                f3 = f2;
            } else {
                f2 = 0.0f;
            }
            if (i == i4 && i3 > 1) {
                f2 = fB;
            }
            if (i == i2 - 2 && !z2) {
                f3 = fB;
            }
            fB = f4;
        } else if (z3) {
            f2 = fB;
            f3 = f2;
            f = f3;
        } else {
            f2 = fB;
            f = 0.0f;
            fB = 0.0f;
            f3 = f2;
        }
        wnc wncVarA = wnc.a(fB, f, f2, f3);
        wncVarA.h = true;
        la6Var.n(wncVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setCornersForCollage(List<b53> list) {
        for (int i = 0; i < list.size(); i++) {
            if (this.w0.h(((c53) list.get(i).get(0)).c) != null) {
                O(list, i, ((c53) list.get(i).get(0)).c);
                if (list.get(i).size() > 1 && this.w0.h(((c53) list.get(i).get(1)).c) != null) {
                    O(list, i, ((c53) list.get(i).get(1)).c);
                }
            }
        }
    }

    public final void A(int i) {
        ar0 ar0Var = this.o;
        Rect bounds = (i >= ((ArrayList) ar0Var.b).size() || ((ArrayList) ar0Var.b).size() <= 1) ? null : ar0Var.i(i).e().getBounds();
        if (bounds == null) {
            this.K0 = this;
            return;
        }
        View view = new View(getContext());
        this.K0 = view;
        view.setLeft(bounds.left);
        this.K0.setTop(bounds.top);
        this.K0.setRight(bounds.right);
        this.K0.setBottom(bounds.bottom);
        addView(this.K0);
    }

    public final boolean B() {
        l20 l20VarA = this.y0.a.a(g20.u0);
        if (s5c.P(l20VarA) || s5c.N(l20VarA)) {
            return true;
        }
        return TextUtils.isEmpty(this.y0.a.s0) && this.y0.c == null && !this.H0 && !this.I0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jk9, u2] */
    @Override // defpackage.hc7
    public final boolean B0(int i, KeyEvent keyEvent) {
        ?? r0 = this.B0;
        if (r0 == 0) {
            return false;
        }
        return r0.B0(i, keyEvent);
    }

    public final boolean C() {
        l20 l20VarK = this.w0.k(g20.c);
        l20 l20VarK2 = this.w0.k(g20.o);
        return ((l20VarK != null && l20VarK.b.s0 > 0) || (l20VarK2 != null && l20VarK2.d.a > 0)) && this.y0.a.s();
    }

    public final boolean D(l20 l20Var) {
        boolean zIsEmpty = TextUtils.isEmpty(l20Var.b.u0);
        x10 x10Var = l20Var.b;
        File fileN = !zIsEmpty ? this.s0.n(x10Var.u0) : null;
        if (fileN == null || !fileN.exists()) {
            fileN = this.s0.k(x10Var.s0);
        }
        return l20Var.o.c() && fileN.exists();
    }

    public final boolean E(int i) {
        return !this.w0.h(i).t && (this.w0.h(i).a == g20.c || this.w0.h(i).a == g20.o);
    }

    public final boolean F(l20 l20Var) {
        if ((this.w0.i() <= 1 && this.J0 && !this.y0.a.s()) || this.z0 == null) {
            return false;
        }
        A(u(l20Var));
        this.z0.getClass();
        return true;
    }

    @Override // defpackage.kj9
    public final void G() {
    }

    public final boolean I() {
        return (!((y8a) this.a).k().q() || this.y0 == null || ((y8a) this.a).e().C(this.y0.a.t0) == null) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [jk9, u2] */
    public final void J() {
        if (this.B0 == null) {
            return;
        }
        if (this.w0.i() == 1) {
            this.B0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        } else {
            this.B0.u1().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 2, 1073741824));
        }
    }

    @Override // defpackage.kj9
    public final void L() {
    }

    public final void M(int i) {
        if (this.z0 == null) {
            return;
        }
        A(i);
        l20 l20VarH = this.w0.h(i);
        if (this.w0.i() == 1 && l20VarH.i()) {
            d(l20VarH);
            return;
        }
        ps8 ps8Var = this.z0;
        this.w0.h(i);
        ps8Var.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [jk9, u2] */
    public final void N() {
        if (this.B0 == null) {
            return;
        }
        hm9.n("ts8", "removeVideoView: ");
        this.B0.l1(false);
        removeView(this.B0.u1());
        this.B0 = null;
        R();
        this.x0 = null;
        this.C0 = null;
        requestLayout();
    }

    public final void O(List list, int i, int i2) {
        rq4 rq4Var = t(this.y0, i2, this.w0.h(i2)).o;
        rq4Var.getClass();
        l((la6) rq4Var, i2, this.w0.i(), ((b53) list.get(i)).size(), ((b53) list.get(0)).size() == 1, ((b53) list.get(list.size() - 1)).size() == 1, B());
    }

    public final void Q(l20 l20Var, sz szVar, boolean z) {
        mq4 mq4Var = szVar.X;
        boolean zU = s5c.U(l20Var, this.y0);
        this.Q0 = zU;
        boolean z2 = true;
        e2b e2bVarC = szVar.Z.c(mq4Var, z, true, zU);
        Context context = getContext();
        k8g k8gVar = this.w0;
        if (k8gVar == null || (k8gVar.i() <= 1 && lz7.q(vl.o) != vi4.c)) {
            z2 = false;
        }
        tfg.b(context, l20Var, e2bVarC, z2, false);
        if (l20Var.a == g20.c || s5c.N(l20Var)) {
            e2bVarC.h = new rs8(this, this.y0, l20Var);
        } else {
            this.Q0 = false;
        }
        if (this.y0.a.s()) {
            tp0 tp0VarA = vl.b().a(9, 10);
            wv6 wv6Var = (wv6) e2bVarC.e;
            if (wv6Var != null) {
                xv6 xv6VarB = xv6.b(wv6Var);
                xv6VarB.l = tp0VarA;
                e2bVarC.e = xv6VarB.a();
            }
            e2bVarC.j = false;
        }
        szVar.i(e2bVarC.a());
    }

    public final void R() {
        int iU;
        l20 l20Var = this.x0;
        if (l20Var == null || (iU = u(l20Var)) < 0) {
            return;
        }
        rz rzVar = ((sz) this.o.i(iU)).Z;
        rzVar.o = true;
        VideoInfoTextView videoInfoTextView = rzVar.m;
        if (videoInfoTextView != null) {
            videoInfoTextView.setVisibility(0);
        }
        VideoPlayerSeekBar videoPlayerSeekBar = rzVar.n;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setVisibility(0);
        }
        if (rzVar.s == null || !s5c.b0(((y8a) vl.b()).n(), rzVar.i)) {
            return;
        }
        rzVar.s.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [jk9, u2] */
    public final void S() {
        if (this.B0 == null) {
            return;
        }
        hm9.n("ts8", "switchVideoToFullScreen");
        this.B0.X0();
        nd7.R(new os8(this, 1), ((y8a) this.a).c().a.b());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [jk9, u2] */
    @Override // defpackage.ik9
    public final void T() {
        if (this.B0 == null) {
            return;
        }
        if (!I()) {
            ?? r0 = this.B0;
            if ((r0 instanceof lj9) && !((lj9) r0).z0.a) {
                r0.k1(true);
                return;
            }
        }
        S();
    }

    public final void U(es8 es8Var, l20 l20Var, d20 d20Var, boolean z) {
        if (u(l20Var) >= 0) {
            es8 es8VarU = ((y8a) this.a).l().u(es8Var.a, l20Var.r, d20Var);
            if (z) {
                m(es8VarU);
            }
        }
    }

    @Override // defpackage.ik9
    public final void W() {
        int iU = this.w0.i() == 1 ? 0 : u(this.x0);
        ps8 ps8Var = this.z0;
        this.w0.h(iU);
        ps8Var.getClass();
    }

    @Override // defpackage.ik9
    public final void X() {
        post(new os8(this, 1));
    }

    @Override // defpackage.ik9
    public final void Y(Throwable th) {
        N();
        a14.N(0, getContext(), zqe.b(getContext(), th));
    }

    @Override // defpackage.qz
    public final void a(l20 l20Var) {
        U(this.y0, l20Var, d20.b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.l20 r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.b(l20):void");
    }

    @Override // defpackage.qz
    public final void c(l20 l20Var) {
        if (!l20Var.o.e()) {
            U(this.y0, l20Var, d20.a, true);
            return;
        }
        int iU = u(l20Var);
        if (iU >= 0) {
            ar0 ar0Var = this.o;
            if (((ArrayList) ar0Var.b).size() > iU) {
                Q(l20Var, (sz) ar0Var.i(iU), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Type inference failed for: r0v51, types: [jk9, u2] */
    @Override // defpackage.qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.l20 r18) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.d(l20):void");
    }

    @Override // defpackage.qz
    public final void e(l20 l20Var, es8 es8Var) {
        ((y8a) this.a).p().getClass();
        jyc jycVar = (jyc) jke.b();
        au8 au8VarN = jycVar.n();
        String str = l20Var.r;
        jy8 jy8Var = (jy8) jycVar.getAccessor().c(jy8.class);
        au8VarN.getClass();
        cqc.a(new vt8(au8VarN, es8Var, str, jy8Var), au8VarN.h, null, new hj8(12), null);
    }

    @Override // defpackage.qz
    public final void g() {
        invalidate();
    }

    public List<View> getClickableChildren() {
        return l6d.i0(l6d.Z(lz7.m(this), new g27(17)));
    }

    @Override // defpackage.qz
    public final boolean j(l20 l20Var) {
        int iU = u(l20Var);
        if (iU < 0) {
            return false;
        }
        ar0 ar0Var = this.o;
        return ((ArrayList) ar0Var.b).size() > iU && ar0Var.i(iU).X != null && ((k0) ar0Var.i(iU).X).c() != null && ((k0) ar0Var.i(iU).X).c().isRunning();
    }

    @Override // defpackage.kj9
    public final void k(String str) {
        N();
        hm9.V(getContext(), str);
    }

    public void m(es8 es8Var) {
        float[] fArr;
        k20 k20Var;
        int i;
        int i2;
        x10 x10Var;
        e52 e52Var;
        w1a w1aVarT = this.T0.t(1000L, TimeUnit.MILLISECONDS);
        z16 z16Var = new z16(28, this);
        oz7 oz7Var = ft.f;
        r66 r66Var = ft.d;
        sd7 sd7Var = new sd7(z16Var, oz7Var, r66Var);
        w1aVarT.a(sd7Var);
        this.U0 = sd7Var;
        View view = this.K0;
        if (view != null && !view.equals(this)) {
            removeView(this.K0);
            this.K0 = null;
        }
        es8 es8Var2 = this.y0;
        k8g k8gVar = es8Var.a.z0;
        this.w0 = k8gVar;
        this.y0 = es8Var;
        int i3 = k8gVar.i();
        g20 g20Var = g20.o;
        if (i3 == 1) {
            fArr = s36.c;
        } else {
            float[] fArr2 = new float[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                l20 l20VarH = k8gVar.h(i4);
                if (l20VarH != null) {
                    g20 g20Var2 = g20.c;
                    g20 g20Var3 = l20VarH.a;
                    float f = 1.0f;
                    if (g20Var3 != g20Var2 ? !(g20Var3 != g20Var || (i = (k20Var = l20VarH.d).f) == 0 || (i2 = k20Var.e) == 0) : !((i = (x10Var = l20VarH.b).o) == 0 || (i2 = x10Var.c) == 0)) {
                        f = i2 / i;
                    }
                    fArr2[i4] = f;
                } else {
                    fArr2[i4] = 0.0f;
                }
            }
            fArr = fArr2;
        }
        this.t0 = fArr;
        es8 es8Var3 = this.y0;
        boolean z = es8Var2 == null || es8Var2.a.b != es8Var3.a.b || s5c.h(es8Var2, es8Var3);
        if (this.w0.i() == 1) {
            l20 l20VarH2 = this.w0.h(0);
            if (l20VarH2.a == g20Var || s5c.P(l20VarH2)) {
                y00 y00Var = this.M0.b;
                y00Var.getClass();
                if (!y00Var.d.containsKey(l20VarH2.r)) {
                    k28 k28Var = new k28(new w00(y00Var, l20VarH2, 2));
                    hle hleVar = y00Var.a;
                    hleVar.getClass();
                    jle jleVar = (jle) hleVar;
                    a38 a38VarF = k28Var.h(jleVar.a()).f(jleVar.b());
                    xw0 xw0Var = new xw0(23);
                    g28 g28Var = new g28(new w00(y00Var, l20VarH2, 1), new x00(y00Var), r66Var);
                    Objects.requireNonNull(g28Var, "observer is null");
                    try {
                        a38VarF.a(new cb3(g28Var, 1, xw0Var));
                        y00Var.f.a(g28Var);
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th) {
                        c37.B(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                }
                e52 e52VarC = ((y8a) this.a).e().C(this.y0.a.t0);
                this.P0 = e52VarC;
                if (e52VarC != null) {
                    ikf ikfVar = (ikf) ((y8a) this.a).getAccessor().c(ikf.class);
                    long j = this.P0.b.a;
                    long j2 = this.y0.a.c;
                    ikfVar.getClass();
                }
                this.N0.a(this.y0.a);
            }
        }
        for (int i5 = 0; i5 < this.w0.i(); i5++) {
            l20 l20VarH3 = this.w0.h(i5);
            sz szVarT = t(es8Var, i5, l20VarH3);
            int i6 = this.w0.i();
            ssc sscVar = ssc.l;
            if (i6 == 1) {
                if (s5c.P(l20VarH3)) {
                    rq4 rq4Var = szVarT.o;
                    rq4Var.getClass();
                    ((la6) rq4Var).h(ssc.o);
                } else {
                    rq4 rq4Var2 = szVarT.o;
                    rq4Var2.getClass();
                    ((la6) rq4Var2).h(sscVar);
                }
                rq4 rq4Var3 = szVarT.o;
                rq4Var3.getClass();
                l((la6) rq4Var3, i5, this.w0.i(), 1, false, false, B());
            } else {
                rq4 rq4Var4 = szVarT.o;
                rq4Var4.getClass();
                ((la6) rq4Var4).h(sscVar);
            }
            e52 e52VarC2 = ((y8a) this.a).e().C(this.y0.a.t0);
            boolean z2 = (e52VarC2 == null || es8Var2 == null || s5c.U(l20VarH3, this.y0) == s5c.U(es8Var2.a.z0.h(i5), this.y0)) ? false : true;
            boolean z3 = (e52VarC2 == null || (e52Var = this.P0) == null || !e52Var.M() || this.P0.l().a.c.k == e52VarC2.l().a.c.k) ? false : true;
            this.P0 = e52VarC2;
            if (z3 || z2 || z || es8Var2 == null || H(l20VarH3, es8Var2.a.z0.h(i5))) {
                Q(l20VarH3, szVarT, false);
            }
        }
        List list = this.u0;
        if (list == null) {
            this.u0 = new ArrayList();
        } else {
            list.clear();
        }
        if (z) {
            N();
            ((y8a) this.a).p().getClass();
            if (((ge2) ((jyc) jke.b()).getAccessor().c(ge2.class)).b(true)) {
                for (int i7 = 0; i7 < this.w0.i(); i7++) {
                    l20 l20VarH4 = this.w0.h(i7);
                    boolean zF = l20VarH4.f();
                    x10 x10Var2 = l20VarH4.b;
                    boolean z4 = zF && !TextUtils.isEmpty(x10Var2.u0) && this.s0.n(x10Var2.u0).exists();
                    if (l20VarH4.f() && !TextUtils.isEmpty(x10Var2.t0) && !z4) {
                        d20 d20Var = l20VarH4.o;
                        if (d20Var.e() || d20Var.b() || !D(l20VarH4)) {
                            o(l20VarH4);
                        }
                    }
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [jk9, u2] */
    @Override // defpackage.kj9
    public final void n() {
        Context context = getContext();
        String[] strArr = wmd.d;
        if (!(context == null ? false : Settings.canDrawOverlays(context))) {
            hm9.p("ts8", "Pip request listener is null", null);
            return;
        }
        ?? r0 = this.B0;
        if (r0 == 0 || this.x0 == null) {
            return;
        }
        View viewU1 = r0.u1();
        Rect rect = mpf.a;
        mpf.d(rect, viewU1);
        this.B0.F1();
        this.P0 = ((y8a) this.a).e().C(this.y0.a.t0);
        j10 j10VarJ = this.x0.j();
        tpa.I(j10VarJ, this.B0.k(), this.B0.c(), this.B0.c0());
        this.x0 = j10VarJ.a();
        ((y8a) this.a).k().u0.d(getContext(), this.P0, this.y0, this.x0, rect, true);
        R();
        N();
    }

    public final void o(l20 l20Var) {
        U(this.y0, l20Var, d20.X, true);
        one oneVar = new one();
        oneVar.a = this.y0.a.b;
        oneVar.b = l20Var.r;
        x10 x10Var = l20Var.b;
        oneVar.e = x10Var.s0;
        oneVar.g = x10Var.t0;
        oneVar.h = true;
        ((rf5) ((y8a) this.a).getAccessor().c(rf5.class)).a(new pne(oneVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.p();
        this.M0.g.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ar0 ar0Var = this.o;
        ar0Var.r();
        for (int i = 0; i < ((ArrayList) ar0Var.b).size(); i++) {
            cqc.b(((sz) ar0Var.i(i)).Z.t);
        }
        N();
        this.M0.g.remove(this);
        sd7 sd7Var = this.U0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        a6d a6dVar;
        int i = this.w0.i();
        ar0 ar0Var = this.o;
        if (i != 1) {
            Iterator it = this.u0.iterator();
            while (it.hasNext()) {
                Iterator<E> it2 = ((b53) it.next()).iterator();
                while (it2.hasNext()) {
                    c53 c53Var = (c53) it2.next();
                    if (this.w0.h(c53Var.c) != null) {
                        int i2 = c53Var.c;
                        boolean zE = E(i2);
                        Rect rect = c53Var.d;
                        if (zE) {
                            umc umcVarE = ar0Var.i(i2).e();
                            if (umcVarE != null) {
                                umcVarE.setBounds(rect.left, rect.top, rect.right, rect.bottom);
                                umcVarE.draw(canvas);
                                boolean zU = s5c.U(this.w0.h(i2), this.y0);
                                if (zU) {
                                    int i3 = rect.left;
                                    int intrinsicWidth = this.S0.getIntrinsicWidth();
                                    int i4 = c53Var.a;
                                    int i5 = ((i4 - intrinsicWidth) / 2) + i3;
                                    int i6 = rect.top;
                                    int intrinsicHeight = this.S0.getIntrinsicHeight();
                                    int i7 = c53Var.b;
                                    this.S0.setBounds(i5, ((i7 - intrinsicHeight) / 2) + i6, rect.right - ((i4 - this.S0.getIntrinsicWidth()) / 2), rect.bottom - ((i7 - this.S0.getIntrinsicHeight()) / 2));
                                    this.S0.draw(canvas);
                                }
                                if (!C()) {
                                    ((sz) ar0Var.i(i2)).Z.b(canvas, umcVarE.getBounds(), zU);
                                }
                            }
                        } else {
                            p(canvas, y(i2), rect.left, rect.top, rect.right, rect.bottom, c53Var.c);
                        }
                    }
                }
            }
        } else if (E(0) || ((!this.w0.h(0).t && s5c.P(this.w0.h(0))) || (!this.w0.h(0).t && s5c.N(this.w0.h(0))))) {
            umc umcVarE2 = ar0Var.i(0).e();
            if (umcVarE2 != null) {
                umcVarE2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                umcVarE2.draw(canvas);
                if (this.Q0 && (a6dVar = this.R0) != null) {
                    a6dVar.draw(canvas);
                }
                if (!C()) {
                    ((sz) ar0Var.i(0)).Z.b(canvas, umcVarE2.getBounds(), this.Q0);
                }
            }
        } else {
            p(canvas, y(0), 0, 0, getMeasuredWidth(), getMeasuredHeight(), 0);
        }
        if (C()) {
            if (this.G0 == null) {
                Paint paint = new Paint();
                this.G0 = paint;
                Context context = getContext();
                khe kheVar = sme.a0;
                paint.setColor(fm9.R(context).r);
                this.G0.setStyle(Paint.Style.FILL);
                this.G0.setAntiAlias(true);
            }
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            float f = measuredWidth;
            canvas.drawCircle(f, measuredHeight, W0 / 2.0f, this.G0);
            if (this.y0.a.N0 != 0) {
                if (this.L0 == null) {
                    Drawable drawableB = kt3.b(getContext(), gpc.w0);
                    this.L0 = drawableB;
                    Context context2 = getContext();
                    khe kheVar2 = sme.a0;
                    drawableB.setColorFilter(fm9.R(context2).t, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable = this.L0;
                if (drawable != null) {
                    int intrinsicWidth2 = drawable.getIntrinsicWidth() / 2;
                    int intrinsicHeight2 = this.L0.getIntrinsicHeight() / 2;
                    this.L0.setBounds(measuredWidth - intrinsicWidth2, measuredHeight - intrinsicHeight2, measuredWidth + intrinsicWidth2, measuredHeight + intrinsicHeight2);
                    this.L0.draw(canvas);
                    return;
                }
                return;
            }
            if (this.F0 == null) {
                TextPaint textPaint = new TextPaint();
                this.F0 = textPaint;
                textPaint.setTextSize(getContext().getResources().getDimension(fpc.a));
                TextPaint textPaint2 = this.F0;
                Context context3 = getContext();
                khe kheVar3 = sme.a0;
                textPaint2.setColor(fm9.R(context3).t);
                this.F0.setTypeface(Typeface.DEFAULT);
                this.F0.setTextAlign(Paint.Align.CENTER);
                this.F0.setAntiAlias(true);
            }
            Context context4 = getContext();
            int minutes = this.y0.a.M0;
            int i8 = zqe.a;
            if (minutes < 60) {
                string = context4.getString(jpc.Z2);
            } else {
                string = context4.getString(jpc.Y2);
                minutes = (int) TimeUnit.SECONDS.toMinutes(minutes);
            }
            canvas.drawText(context4.getString(jpc.a3, Integer.valueOf(minutes), string), f, (int) (r3 - ((this.F0.ascent() + this.F0.descent()) / 2.0f)), this.F0);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.o.p();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jk9, u2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [jk9, u2] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        if (this.w0.i() == 1) {
            this.B0.u1().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int measuredWidth = getMeasuredWidth() / 2;
        int iU = u(this.C0);
        int i5 = (iU % 2) * measuredWidth;
        int i6 = (iU / 2) * measuredWidth;
        this.B0.u1().layout(i5, i6, i5 + measuredWidth, measuredWidth + i6);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        mi6.VIRTUAL_KEY.b(this);
        if (this.z0 != null) {
            int iV = this.w0.i() == 1 ? 0 : v(motionEvent);
            if (iV < this.w0.i()) {
                ps8 ps8Var = this.z0;
                this.w0.h(iV);
                ps8Var.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.onMeasure(int, int):void");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.w0.i() != 0) {
            int iV = this.w0.i() == 1 ? 0 : v(motionEvent);
            if (iV < this.w0.i()) {
                ar0 ar0Var = this.o;
                if (iV < ((ArrayList) ar0Var.b).size()) {
                    umc umcVarE = ar0Var.i(iV).e();
                    if (!((sz) ar0Var.i(iV)).Z.e(umcVarE.getBounds().centerX(), umcVarE.getBounds().centerY(), motionEvent)) {
                        this.T0.e(Integer.valueOf(iV));
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a6d a6dVar = this.R0;
        if (a6dVar != null) {
            a6dVar.setBounds(0, 0, i, i2);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.o.r();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.A0.a).onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0 || this.B0 == null) {
            return;
        }
        N();
    }

    public final void p(Canvas canvas, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (this.D0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.D0 = textPaint;
            textPaint.setTextSize(getContext().getResources().getDimension(fpc.c));
            this.D0.setColor(getContext().getResources().getColor(epc.f));
            this.D0.setTypeface(Typeface.DEFAULT);
        }
        if (this.E0 == null) {
            Paint paint = new Paint(1);
            this.E0 = paint;
            paint.setColor(getContext().getResources().getColor(epc.d));
            this.E0.setStyle(Paint.Style.FILL);
        }
        float[] fArrW = w(i5);
        if (fArrW == null) {
            canvas.drawRect(i, i2, i3, i4, this.E0);
        } else {
            Path path = new Path();
            path.addRoundRect(i, i2, i3, i4, fArrW, Path.Direction.CW);
            canvas.drawPath(path, this.E0);
        }
        int i7 = i3 - i;
        int i8 = i7 - (this.c * 2);
        if (i8 < 0) {
            ((cba) ((y8a) this.a).g()).c(new HandledException("when draw unknown attach, width < 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i8 = i - i3;
        }
        if (i8 < 0) {
            ((cba) ((y8a) this.a).g()).c(new HandledException("when draw unknown attach, width < 0, return 0. text: %s, left: %d, top: %d, right: %d, bottom: %d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)), false);
            i6 = 0;
        } else {
            i6 = i8;
        }
        StaticLayout staticLayout = new StaticLayout(str, this.D0, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i9 = this.b.x;
        Drawable drawable = V0;
        drawable.setBounds(0, 0, i9, i9);
        int height = staticLayout.getHeight();
        bk4 bk4Var = this.b;
        int i10 = (bk4Var.d * 2) + height + bk4Var.x;
        canvas.save();
        int i11 = (i7 / 2) + i;
        int i12 = ((i4 - i2) / 2) + i2;
        int i13 = i10 / 2;
        canvas.translate(i11 - (this.b.x / 2), i12 - i13);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(i11 - (staticLayout.getWidth() / 2), (i12 + i13) - staticLayout.getHeight());
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final Animatable q(int i) {
        ar0 ar0Var = this.o;
        if (((ArrayList) ar0Var.b).size() <= i || ar0Var.i(i).X == null) {
            return null;
        }
        return ((k0) ar0Var.i(i).X).c();
    }

    @Override // defpackage.kj9
    public final void s() {
        S();
    }

    public void setAttachClickListener(ps8 ps8Var) {
        this.z0 = ps8Var;
    }

    public void setAttachVideoListener(qs8 qs8Var) {
    }

    public void setEmbeddedPlayer(boolean z) {
        this.J0 = z;
    }

    public void setForwarded(boolean z) {
        this.I0 = z;
    }

    public void setPipRequestListener(ss8 ss8Var) {
    }

    public void setSenderVisible(boolean z) {
        this.H0 = z;
    }

    public final sz t(es8 es8Var, int i, l20 l20Var) {
        sz szVar = (sz) x(i);
        rz rzVar = szVar.Z;
        float[] cornersForVideo = getCornersForVideo();
        rzVar.u = cornersForVideo;
        LiveVideoPlaceHolderView liveVideoPlaceHolderView = rzVar.s;
        if (liveVideoPlaceHolderView != null) {
            liveVideoPlaceHolderView.setCorners(cornersForVideo);
        }
        szVar.Z.f(l20Var, es8Var, this.P0);
        rz rzVar2 = szVar.Z;
        rq4 rq4Var = szVar.o;
        rq4Var.getClass();
        rzVar2.a((la6) rq4Var, ssc.l);
        if (C()) {
            rq4 rq4Var2 = szVar.o;
            rq4Var2.getClass();
            ((la6) rq4Var2).m(-0.1f, true);
        }
        return szVar;
    }

    public int u(l20 l20Var) {
        for (int i = 0; i < this.w0.i(); i++) {
            if (this.w0.h(i).r.equals(l20Var.r)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int v(MotionEvent motionEvent) {
        if (this.u0.size() == 0) {
            return 0;
        }
        int y = (int) (motionEvent.getY() / (getMeasuredHeight() / this.u0.size()));
        if (y >= this.u0.size()) {
            hm9.m("ts8", "getAttachPosition: wrong calculated row: %d", Integer.valueOf(y));
            y = this.u0.size() - 1;
        }
        if (((b53) this.u0.get(y)).size() == 0) {
            return 0;
        }
        int x = (int) (motionEvent.getX() / (getMeasuredWidth() / ((b53) this.u0.get(y)).size()));
        if (x >= ((b53) this.u0.get(y)).size()) {
            hm9.m("ts8", "getAttachPosition: wrong calculated column: %d", Integer.valueOf(x));
            x = ((b53) this.u0.get(y)).size() - 1;
        }
        return ((c53) ((b53) this.u0.get(y)).get(x)).c;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        int i = 0;
        while (true) {
            ar0 ar0Var = this.o;
            if (i >= ((ArrayList) ar0Var.b).size()) {
                return super.verifyDrawable(drawable);
            }
            if (ar0Var.i(i).e() == drawable) {
                return true;
            }
            i++;
        }
    }

    public final float[] w(int i) {
        if (i < 0 || ((ArrayList) this.o.b).size() <= 0) {
            return null;
        }
        rq4 rq4Var = x(i).o;
        rq4Var.getClass();
        wnc wncVar = ((la6) rq4Var).c;
        if (wncVar != null) {
            return wncVar.c;
        }
        return null;
    }

    public final sq4 x(int i) {
        ar0 ar0Var = this.o;
        if (((ArrayList) ar0Var.b).size() > i) {
            return ar0Var.i(i);
        }
        ma6 ma6Var = new ma6(getContext().getResources());
        ma6Var.b = 0;
        la6 la6VarA = ma6Var.a();
        getContext();
        sz szVar = new sz(la6VarA);
        szVar.e().setCallback(this);
        szVar.Z = new rz(this, this);
        ar0Var.b(szVar);
        return szVar;
    }

    public final String y(int i) {
        if (!this.w0.h(i).t) {
            return getContext().getString(jpc.h3);
        }
        Context context = getContext();
        l20 l20VarH = this.w0.h(i);
        int i2 = zqe.a;
        g20 g20Var = l20VarH.a;
        return g20Var == g20.o ? context.getString(jpc.V) : g20Var == g20.c ? context.getString(jpc.U) : context.getString(jpc.T);
    }

    public final void z() {
        this.a = vl.b();
        getContext();
        this.b = bk4.b();
        this.s0 = ((y8a) this.a).h();
        this.M0 = ((y8a) this.a).d();
        ((y8a) this.a).p().getClass();
        this.N0 = (dz) ((jyc) jke.b()).getAccessor().c(dz.class);
        this.c = this.b.i;
        this.O0 = new qqd(22, (uuc) ((y8a) this.a).getAccessor().c(uuc.class));
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.A0 = new fd7(getContext(), this);
        this.R0 = new a6d(getContext(), this.b.j);
        Drawable drawableB = kt3.b(getContext(), gpc.g0);
        this.S0 = drawableB;
        drawableB.setTint(-1);
    }

    public ts8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new ar0();
        this.v0 = 0;
        this.J0 = true;
        this.T0 = new xpb();
        z();
    }
}
