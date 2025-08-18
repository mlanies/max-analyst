package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.a6d;
import defpackage.au8;
import defpackage.c37;
import defpackage.cqc;
import defpackage.cu8;
import defpackage.d20;
import defpackage.e52;
import defpackage.ed3;
import defpackage.es8;
import defpackage.hle;
import defpackage.hm9;
import defpackage.iv6;
import defpackage.j43;
import defpackage.j47;
import defpackage.jle;
import defpackage.k0;
import defpackage.k8d;
import defpackage.l01;
import defpackage.l20;
import defpackage.ma6;
import defpackage.mg4;
import defpackage.n46;
import defpackage.o43;
import defpackage.p00;
import defpackage.q00;
import defpackage.qj9;
import defpackage.qqd;
import defpackage.qz;
import defpackage.r00;
import defpackage.r20;
import defpackage.ru6;
import defpackage.rz;
import defpackage.s36;
import defpackage.s5c;
import defpackage.s8g;
import defpackage.ssc;
import defpackage.uuc;
import defpackage.vl;
import defpackage.wv6;
import defpackage.x10;
import defpackage.xw0;
import defpackage.xxc;
import defpackage.y8a;
import java.util.Collections;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* loaded from: classes2.dex */
public class AttachPhotoView extends ZoomableDraweeView implements qz {
    public static final /* synthetic */ int U0 = 0;
    public final ed3 G0;
    public final GestureDetector H0;
    public r00 I0;
    public final rz J0;
    public es8 K0;
    public l20 L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public wv6 P0;
    public boolean Q0;
    public e52 R0;
    public a6d S0;
    public final qqd T0;

    public AttachPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G0 = vl.b();
        GestureDetector gestureDetector = new GestureDetector(context, new q00(0, this));
        this.H0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6Var = new ma6(getResources());
        ma6Var.l = ssc.o;
        ma6Var.b = 0;
        setHierarchy(ma6Var.a());
        this.J0 = new rz(this, this);
        this.T0 = new qqd(22, (uuc) ((y8a) this.G0).getAccessor().c(uuc.class));
    }

    private Animatable getAnimatable() {
        if (getController() != null) {
            return ((k0) getController()).c();
        }
        return null;
    }

    @Override // defpackage.qz
    public final void a(l20 l20Var) {
        s(d20.b);
    }

    @Override // defpackage.qz
    public final void b(l20 l20Var) {
        n46 n46VarR1;
        if (this.Q0) {
            au8 au8VarL = ((y8a) this.G0).l();
            cu8 cu8Var = this.K0.a;
            au8VarL.getClass();
            au8VarL.t(cu8Var, l20Var.r, new l01());
            return;
        }
        if (TextUtils.isEmpty(l20Var.b.t0) || !TextUtils.isEmpty(l20Var.s) || getAnimatable() != null) {
            if (getAnimatable() == null) {
                setController(this.J0.c(getController(), true, false, false).a());
                r00 r00Var = this.I0;
                if (r00Var != null) {
                    ((FrgAttachPhoto) r00Var).E1(false);
                }
            } else if (getAnimatable().isRunning()) {
                getAnimatable().stop();
            } else {
                getAnimatable().start();
            }
            invalidate();
            return;
        }
        r00 r00Var2 = this.I0;
        if (r00Var2 != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00Var2;
            qj9 qj9Var = frgAttachPhoto.K1;
            if (qj9Var != null && qj9Var.b() && (n46VarR1 = frgAttachPhoto.r1()) != null) {
                ((ActAttachesView) n46VarR1).e();
            }
            frgAttachPhoto.F1(true);
        }
    }

    @Override // defpackage.qz
    public final void c(l20 l20Var) {
        if (l20Var.o.e()) {
            setController(this.J0.c(getController(), true, false, s5c.U(l20Var, this.K0)).a());
        } else {
            s(d20.a);
        }
    }

    @Override // defpackage.qz
    public final void d(l20 l20Var) {
    }

    @Override // defpackage.qz
    public final void e(l20 l20Var, es8 es8Var) {
        r00 r00Var = this.I0;
        if (r00Var != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00Var;
            s8g s8gVarU = frgAttachPhoto.q1.u();
            cu8 cu8Var = frgAttachPhoto.C1.a;
            long j = cu8Var.t0;
            xxc xxcVar = mg4.o;
            s8gVarU.a(new k8d(j, Collections.singletonList(Long.valueOf(cu8Var.b)), null, true, cu8Var.U0));
        }
    }

    @Override // defpackage.qz
    public final boolean j(l20 l20Var) {
        return getAnimatable() != null && getAnimatable().isRunning();
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView
    public final void n(Throwable th) {
        super.n(th);
        hm9.p("ru.ok.messages.media.attaches.AttachPhotoView", "Set photo attach failed, messageId " + this.K0.a.b, th);
        if (th instanceof NullPointerException) {
            return;
        }
        s(d20.o);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView
    public final void o(ru6 ru6Var) throws Throwable {
        boolean zN0;
        super.o(ru6Var);
        if (ru6Var instanceof j43) {
            c37.e((j43) ru6Var, this.L0);
        }
        if (s5c.K(this.L0)) {
            return;
        }
        if (!this.L0.f() || TextUtils.isEmpty(this.L0.b.t0)) {
            iv6 iv6VarO = s36.o();
            wv6 wv6Var = this.P0;
            if (wv6Var == null) {
                iv6VarO.getClass();
                zN0 = false;
            } else {
                o43 o43Var = iv6VarO.f.get(iv6VarO.h.b(wv6Var, null));
                try {
                    zN0 = o43.n0(o43Var);
                } finally {
                    o43.S(o43Var);
                }
            }
            if (!zN0 || this.L0.o.c()) {
                return;
            }
            s(d20.c);
            if (((y8a) this.G0).n().c.g.getBoolean("app.media.save.to.gallery", false)) {
                p00 p00Var = new p00(this, 0, ru6Var);
                xw0 xw0Var = new xw0(22);
                hle hleVarQ = ((y8a) this.G0).q();
                hleVarQ.getClass();
                cqc.a(p00Var, ((jle) hleVarQ).a(), null, xw0Var, null);
            }
        }
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rz rzVar = this.J0;
        if (rzVar != null) {
            rzVar.i();
        }
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rz rzVar = this.J0;
        if (rzVar != null) {
            cqc.b(rzVar.t);
        }
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        a6d a6dVar;
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        if (!this.L0.o.c()) {
            this.J0.b(canvas, getDrawable().getBounds(), this.Q0);
        }
        if (!this.Q0 || (a6dVar = this.S0) == null) {
            return;
        }
        a6dVar.draw(canvas);
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        l20 l20Var;
        boolean zN = s5c.N(this.L0);
        if (!this.M0 || (!this.L0.f() && !zN)) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || (l20Var = this.L0) == null) {
            super.onMeasure(i, i2);
            return;
        }
        x10 x10Var = zN ? l20Var.j.d.b : l20Var.b;
        int[] iArrG = j47.G(size, size2, x10Var.c, x10Var.o);
        setMeasuredDimension(iArrG[0], iArrG[1]);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a6d a6dVar = this.S0;
        if (a6dVar != null) {
            a6dVar.setBounds(0, 0, i, i2);
        }
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, defpackage.uq4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.H0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.L0.o.c()) {
            return true;
        }
        if (this.L0.f() && this.L0.b.X) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.l20 r8, defpackage.es8 r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AttachPhotoView.r(l20, es8):void");
    }

    public final void s(d20 d20Var) {
        es8 es8VarU = ((y8a) this.G0).l().u(this.K0.a, this.L0.r, d20Var);
        this.K0 = es8VarU;
        r00 r00Var = this.I0;
        int i = 0;
        if (r00Var != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) r00Var;
            if (frgAttachPhoto.r1() != null) {
                ((ActAttachesView) frgAttachPhoto.r1()).n0(es8VarU);
            }
            frgAttachPhoto.C1 = es8VarU;
            int i2 = 0;
            while (true) {
                if (i2 >= frgAttachPhoto.C1.a.z0.i()) {
                    break;
                }
                if (frgAttachPhoto.C1.a.z0.h(i2).r.equals(frgAttachPhoto.D1.r)) {
                    frgAttachPhoto.D1 = frgAttachPhoto.C1.a.z0.h(i2);
                    break;
                }
                i2++;
            }
        }
        while (true) {
            if (i >= this.K0.a.z0.i()) {
                i = -1;
                break;
            } else if (this.K0.a.z0.h(i).r.equals(this.L0.r)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            r(this.K0.a.z0.h(i), this.K0);
        }
    }

    public void setListener(r00 r00Var) {
        this.I0 = r00Var;
    }

    public void setWrapContentMeasure(boolean z) {
        l20 l20Var;
        this.M0 = z;
        boolean zN = s5c.N(this.L0);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (l20Var = this.L0) == null || !(l20Var.f() || zN)) {
            requestLayout();
            return;
        }
        x10 x10Var = zN ? this.L0.j.d.b : this.L0.b;
        int[] iArrG = j47.G(getMeasuredWidth(), getMeasuredHeight(), x10Var.c, x10Var.o);
        int i = iArrG[0] / 2;
        int i2 = iArrG[1] / 2;
        layout((getMeasuredWidth() / 2) - i, (getMeasuredHeight() / 2) - i2, (getMeasuredWidth() / 2) + i, (getMeasuredHeight() / 2) + i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof r20) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
