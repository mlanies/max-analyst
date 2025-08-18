package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class esd extends bd8 implements csd, bmf, cmf {
    public final je7 A0;
    public boolean B0;
    public final mdf C0;
    public final je7 D0;
    public o50 E0;
    public x77 F0;
    public final zef w0;
    public final y2b x0;
    public final w38 y0;
    public final OneMeDraweeView z0;

    public esd(Context context) {
        zef zefVar = new zef();
        super(context);
        this.w0 = zefVar;
        y2b y2bVar = new y2b(context);
        this.x0 = y2bVar;
        w38 w38Var = new w38(context);
        w38Var.setUseMaxDimensionsOnMeasure(true);
        w38Var.setIgnoreCropCriteria(true);
        w38Var.setOverlayDrawable(y2bVar);
        this.y0 = w38Var;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.z0 = oneMeDraweeView;
        this.A0 = tu0.r(3, new yqd(context, 2));
        mdf mdfVar = new mdf(context);
        mdfVar.setDrawableEnabled(false);
        mdfVar.setBackgroundEnabled(true);
        this.C0 = mdfVar;
        this.D0 = tu0.r(3, new yqd(context, 3));
        zefVar.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(w38Var, new ViewGroup.LayoutParams(-1, -1));
        addView(mdfVar, new ViewGroup.LayoutParams(-2, -2));
        oneMeDraweeView.setupNewController(true);
    }

    public static final void e(esd esdVar, b00 b00Var) {
        bsd bsdVar = (bsd) esdVar.getModel();
        if (tpa.f(bsdVar != null ? Long.valueOf(bsdVar.a) : null, b00Var != null ? Long.valueOf(b00Var.a()) : null)) {
            if (!(b00Var instanceof xz) && !(b00Var instanceof a00)) {
                je7 je7Var = esdVar.D0;
                if (je7Var.a()) {
                    ((mdf) je7Var.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            ay7.a(esdVar, esdVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
            esdVar.getTransferStatusView().setVisibility(0);
            mdf transferStatusView = esdVar.getTransferStatusView();
            CharSequence charSequenceB = b00Var.b().b(esdVar.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            transferStatusView.setContent(charSequenceB);
        }
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.A0.getValue();
    }

    private final mdf getTransferStatusView() {
        return (mdf) this.D0.getValue();
    }

    @Override // defpackage.mc8
    public final int b(int i, int i2) {
        w38 w38Var = this.y0;
        boolean zR = w38Var.r();
        OneMeDraweeView oneMeDraweeView = this.z0;
        int measuredHeight = zR ? ((oneMeDraweeView.getMeasuredHeight() - w38Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.B0 || w38Var.r()) ? i : (getMeasuredWidth() - w38Var.getMeasuredWidth()) / 2;
        if (this.B0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38Var, measuredWidth, measuredHeight, 0, 12);
        zef zefVar = this.w0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.T(measuredWidth, measuredHeight);
        }
        je7 je7Var = this.D0;
        if (je7Var.a()) {
            float f = 4;
            ote.E((mdf) je7Var.getValue(), rh4.c(f, fk4.d().getDisplayMetrics().density, measuredWidth), rh4.c(f, fk4.d().getDisplayMetrics().density, w38Var.getTop()), 0, 12);
        }
        float f2 = 4;
        int iC = rh4.c(f2, fk4.d().getDisplayMetrics().density, i);
        int measuredHeight2 = w38Var.getMeasuredHeight() + i2;
        mdf mdfVar = this.C0;
        ote.E(mdfVar, iC, rh4.q(f2, fk4.d().getDisplayMetrics().density, measuredHeight2 - mdfVar.getMeasuredHeight()), 0, 12);
        return this.B0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.z0;
        if (view == oneMeDraweeView && !this.B0) {
            return false;
        }
        if (view != this.y0 && view != oneMeDraweeView && view != this.w0.R()) {
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
        return this.y0;
    }

    @Override // defpackage.cmf
    public final boolean j() {
        return this.w0.j();
    }

    @Override // defpackage.cmf
    public final boolean m() {
        return br7.H((je7) this.w0.c);
    }

    @Override // defpackage.cmf
    public final void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2) {
        this.w0.o(tlfVar, o00Var, j, z, true);
    }

    @Override // defpackage.bmf
    public final xlf r(boolean z) {
        return b46.v0;
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
        mdf mdfVar = this.C0;
        mdfVar.measure(iMakeMeasureSpec, i4);
        je7 je7Var = this.D0;
        if (je7Var.a()) {
            ((mdf) je7Var.getValue()).measure(i3, i4);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        w38 w38Var = this.y0;
        w38Var.measure(iMakeMeasureSpec2, i4);
        zef zefVar = this.w0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.U(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38Var.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.z0;
        if (blurOffset == 0) {
            boolean z = w38Var.getMeasuredWidth() < i;
            this.B0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38Var.E0 > 0) {
                this.B0 = true;
                int blurOffset2 = (w38Var.getBlurOffset() * 2) + w38Var.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            } else if (w38Var.r()) {
                this.B0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38Var.getBlurOffset() * 2) + w38Var.getMeasuredHeight(), 1073741824));
            } else {
                this.B0 = false;
            }
        }
        return dy7.l(Math.max(this.B0 ? oneMeDraweeView.getMeasuredWidth() : w38Var.getMeasuredWidth(), Math.max(br7.B(je7Var), mdfVar.getMeasuredWidth() + getDate().getMeasuredWidth())), Math.max(this.B0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight(), Math.max(getDate().getMeasuredHeight(), br7.A(je7Var))));
    }

    @Override // defpackage.cmf
    public final void u() {
        this.w0.u();
    }

    @Override // defpackage.mc8
    public final void v(x38 x38Var) {
        bsd bsdVar = (bsd) x38Var;
        wcf wcfVar = bsdVar.c;
        this.y0.setImageAttach(new yt6(0L, wcfVar.b, wcfVar.c, wcfVar.d, false, wcfVar.e, false, wcfVar.h, wcfVar.i, null, null, 3584));
        OneMeDraweeView oneMeDraweeView = this.z0;
        xv6 xv6VarD = xv6.d(wcfVar.b);
        xv6VarD.d = wcfVar.i;
        xv6VarD.l = getBlurPostProcessor();
        oneMeDraweeView.o(xv6VarD.a(), null);
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.l);
        long jE = ft4.e(wcfVar.f);
        String[] strArr = are.b;
        this.C0.setContent(tfg.c(jE));
        j0e j0eVar = bsdVar.d;
        if ((j0eVar.getValue() instanceof xz) || (j0eVar.getValue() instanceof a00)) {
            return;
        }
        je7 je7Var = this.D0;
        if (je7Var.a()) {
            ((mdf) je7Var.getValue()).setVisibility(8);
        }
    }
}
