package ru.ok.messages.video.widgets;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import defpackage.bk4;
import defpackage.dd4;
import defpackage.fk4;
import defpackage.hm9;
import defpackage.kn5;
import defpackage.mf;
import defpackage.nd7;
import defpackage.t33;
import defpackage.tg;
import defpackage.vl;
import defpackage.y8a;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FloatingVideoView extends FrameLayout {
    public static final /* synthetic */ int E0 = 0;
    public kn5 A0;
    public final WindowManager.LayoutParams B0;
    public final tg C0;
    public VelocityTracker D0;
    public final int a;
    public final int b;
    public final int c;
    public int o;
    public int s0;
    public final int t0;
    public final WindowManager u0;
    public int v0;
    public int w0;
    public float x0;
    public float y0;
    public AnimatorSet z0;

    public FloatingVideoView(Context context) {
        super(context);
        this.t0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.u0 = nd7.z(getContext());
        getContext();
        bk4 bk4VarB = bk4.b();
        this.C0 = ((y8a) vl.b()).c();
        this.a = fk4.b((int) 140.0f);
        int i = bk4VarB.h;
        this.b = i;
        this.c = i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, 0, 0, 2038, 16779016, -3);
        this.B0 = layoutParams;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }

    public final void a() {
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null && animatorSet.isStarted()) {
            hm9.n("ru.ok.messages.video.widgets.FloatingVideoView", "Frontier animation is already started");
            return;
        }
        AnimatorSet animatorSet2 = this.z0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.z0.removeAllListeners();
            this.z0 = null;
        }
        ArrayList arrayList = new ArrayList();
        WindowManager.LayoutParams layoutParams = this.B0;
        int i = (layoutParams.width / 2) + layoutParams.x;
        int i2 = this.o;
        arrayList.add(ObjectAnimator.ofInt(this, "x", this.B0.x, i < i2 / 2 ? getLeftMargin() : (i2 - getRightMargin()) - this.B0.width));
        if (arrayList.isEmpty()) {
            t33 t33Var = vl.o.a().a;
            WindowManager.LayoutParams layoutParams2 = this.B0;
            int i3 = layoutParams2.x;
            int i4 = layoutParams2.y;
            t33Var.k(i3, "app.video.pip.pos.x");
            t33Var.k(i4, "app.video.pip.pos.y");
            return;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.z0 = animatorSet3;
        animatorSet3.setInterpolator(this.C0.a.l());
        this.z0.setDuration(120L);
        this.z0.playTogether(arrayList);
        this.z0.addListener(new mf(4, this));
        this.z0.start();
    }

    public final void b(boolean z) {
        int leftMargin = getLeftMargin();
        int rightMargin = getRightMargin();
        WindowManager.LayoutParams layoutParams = this.B0;
        int i = layoutParams.x;
        if (i < leftMargin) {
            layoutParams.x = leftMargin;
        } else {
            int i2 = layoutParams.width;
            int i3 = i + i2;
            int i4 = this.o - rightMargin;
            if (i3 > i4) {
                layoutParams.x = i4 - i2;
            }
        }
        int topMargin = getTopMargin();
        WindowManager.LayoutParams layoutParams2 = this.B0;
        if (layoutParams2.y < topMargin) {
            layoutParams2.y = topMargin;
        }
        if (z) {
            int i5 = layoutParams2.y;
            int i6 = layoutParams2.height;
            int i7 = i5 + i6;
            int i8 = this.s0 - topMargin;
            if (i7 > i8) {
                layoutParams2.y = i8 - i6;
            }
        }
    }

    public final void c(int i, int i2) {
        int i3;
        int iMin = (int) (Math.min(this.o, this.s0) * 0.62d);
        if (i <= 0) {
            i = this.a;
        }
        if (i2 <= 0) {
            i2 = this.a;
        }
        if (i > i2) {
            i3 = (i2 * iMin) / i;
        } else {
            int i4 = (i * iMin) / i2;
            i3 = iMin;
            iMin = i4;
        }
        int i5 = this.a;
        if (iMin < i5) {
            i3 = (i3 * i5) / iMin;
            iMin = i5;
        }
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.width = iMin;
        layoutParams.height = i3;
        post(new dd4(23, this));
    }

    public int getLeftMargin() {
        return this.b;
    }

    public int getRightMargin() {
        return this.b;
    }

    public int getTopMargin() {
        return ((y8a) vl.b()).f().j() + this.c;
    }

    public int getWindowHeight() {
        return this.B0.height;
    }

    public WindowManager.LayoutParams getWindowManagerLayoutParams() {
        return this.B0;
    }

    public int getWindowWidth() {
        return this.B0.width;
    }

    public int getXPos() {
        return this.B0.x;
    }

    public int getYPos() {
        return this.B0.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.z0.removeAllListeners();
            this.z0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.video.widgets.FloatingVideoView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(kn5 kn5Var) {
        this.A0 = kn5Var;
    }

    @Keep
    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.x = i;
        this.u0.updateViewLayout(this, layoutParams);
    }

    @Keep
    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.B0;
        layoutParams.y = i;
        this.u0.updateViewLayout(this, layoutParams);
    }
}
