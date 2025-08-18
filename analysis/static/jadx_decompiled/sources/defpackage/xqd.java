package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class xqd extends bd8 implements wqd, ot8, cmf {
    public boolean A0;
    public final je7 B0;
    public final zef w0;
    public final w38 x0;
    public final OneMeDraweeView y0;
    public final je7 z0;

    public xqd(Context context) {
        zef zefVar = new zef();
        super(context);
        this.w0 = zefVar;
        w38 w38Var = new w38(context);
        this.x0 = w38Var;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.y0 = oneMeDraweeView;
        this.z0 = tu0.r(3, new xda(context, 28));
        this.B0 = tu0.r(3, new xda(context, 29));
        zefVar.b = this;
        addView(oneMeDraweeView, -1, -2);
        addView(w38Var, new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setupNewController(true);
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.z0.getValue();
    }

    private final pm8 getMediaType() {
        return (pm8) this.B0.getValue();
    }

    @Override // defpackage.mc8
    public final int b(int i, int i2) {
        w38 w38Var = this.x0;
        boolean zR = w38Var.r();
        OneMeDraweeView oneMeDraweeView = this.y0;
        int measuredHeight = zR ? ((oneMeDraweeView.getMeasuredHeight() - w38Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.A0 || w38Var.r()) ? i : (getMeasuredWidth() - w38Var.getMeasuredWidth()) / 2;
        if (this.A0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38Var, measuredWidth, measuredHeight, 0, 12);
        zef zefVar = this.w0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.T(measuredWidth, measuredHeight);
        }
        je7 je7Var = this.B0;
        if (je7Var.a()) {
            float f = 4;
            ote.E((pm8) je7Var.getValue(), rh4.c(f, fk4.d().getDisplayMetrics().density, w38Var.getLeft()), w38Var.getBottom() - (tu0.G(f * fk4.d().getDisplayMetrics().density) + getMediaType().getMeasuredHeight()), 0, 12);
        }
        return this.A0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.y0;
        if (view == oneMeDraweeView && !this.A0) {
            return false;
        }
        if (view != this.x0 && view != oneMeDraweeView && view != this.w0.R()) {
            return super.drawChild(canvas, view, j);
        }
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = 2;
        float f2 = (measuredWidth - ((fk4.d().getDisplayMetrics().density * 1.0f) * f)) / measuredWidth;
        float f3 = (measuredHeight - ((1.0f * fk4.d().getDisplayMetrics().density) * f)) / measuredHeight;
        Matrix matrixA = k78.a();
        matrixA.reset();
        matrixA.setScale(f2, f3, measuredWidth / 2.0f, measuredHeight / 2.0f);
        Path pathB = k78.b();
        pathB.reset();
        pathB.set(((vs8) getBackground()).a());
        pathB.transform(k78.a());
        Path pathB2 = k78.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            super.drawChild(canvas, view, j);
            canvas.restoreToCount(iSave);
            return true;
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // defpackage.cmf
    public View getPreviewView() {
        return this.x0;
    }

    @Override // defpackage.ot8
    public final boolean h(MotionEvent motionEvent) {
        return true;
    }

    @Override // defpackage.cmf
    public final boolean j() {
        return this.x0.getImageAttach().e;
    }

    @Override // defpackage.cmf
    public final boolean m() {
        return br7.H((je7) this.w0.c);
    }

    @Override // defpackage.cmf
    public final void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2) {
        this.w0.o(tlfVar, o00Var, j, z, true);
    }

    @Override // defpackage.cmf
    public final boolean s() {
        return this.w0.s();
    }

    @Override // defpackage.cmf
    public void setVideoClickListener(a66 a66Var) {
        this.w0.o = a66Var;
    }

    @Override // defpackage.cmf
    public void setVideoLongClickListener(a66 a66Var) {
        this.w0.X = a66Var;
    }

    @Override // defpackage.mc8
    public final long t(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        w38 w38Var = this.x0;
        w38Var.measure(iMakeMeasureSpec, i4);
        je7 je7Var = this.B0;
        if (je7Var.a()) {
            ((pm8) je7Var.getValue()).measure(i3, i4);
        }
        zef zefVar = this.w0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.U(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38Var.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.y0;
        if (blurOffset == 0) {
            boolean z = w38Var.getMeasuredWidth() < i;
            this.A0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38Var.E0 > 0) {
                this.A0 = true;
                int blurOffset2 = (w38Var.getBlurOffset() * 2) + w38Var.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            } else if (w38Var.r()) {
                this.A0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38Var.getBlurOffset() * 2) + w38Var.getMeasuredHeight(), 1073741824));
            } else {
                this.A0 = false;
            }
        }
        return dy7.l(Math.max(this.A0 ? oneMeDraweeView.getMeasuredWidth() : w38Var.getMeasuredWidth(), getDate().getMeasuredWidth() + br7.B(je7Var)), Math.max(this.A0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), br7.A(je7Var))));
    }

    @Override // defpackage.cmf
    public final void u() {
        this.w0.u();
    }

    @Override // defpackage.mc8
    public final void v(x38 x38Var) {
        yt6 yt6Var = ((vqd) x38Var).c;
        this.x0.setImageAttach(yt6Var);
        OneMeDraweeView oneMeDraweeView = this.y0;
        xv6 xv6VarD = xv6.d(yt6Var.b);
        xv6VarD.d = yt6Var.i;
        xv6VarD.l = getBlurPostProcessor();
        oneMeDraweeView.o(xv6VarD.a(), null);
        ((la6) oneMeDraweeView.getHierarchy()).h(yt6Var.j);
        if (yt6Var.e) {
            ay7.a(this, getMediaType(), new ViewGroup.LayoutParams(-2, -2));
            getMediaType().setVisibility(0);
        } else {
            je7 je7Var = this.B0;
            if (je7Var.a()) {
                ((pm8) je7Var.getValue()).setVisibility(8);
            }
        }
    }
}
