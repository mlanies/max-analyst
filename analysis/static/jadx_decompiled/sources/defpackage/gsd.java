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
public final class gsd extends bl8 implements csd, cmf, bmf {
    public final zef C0;
    public final y2b D0;
    public final w38 E0;
    public boolean F0;
    public final OneMeDraweeView G0;
    public final je7 H0;
    public final mdf I0;
    public final je7 J0;
    public final int K0;
    public final int L0;
    public o50 M0;
    public x77 N0;

    public gsd(Context context) {
        zef zefVar = new zef();
        super(context);
        this.C0 = zefVar;
        y2b y2bVar = new y2b(context);
        this.D0 = y2bVar;
        w38 w38Var = new w38(context);
        w38Var.setUseMaxDimensionsOnMeasure(true);
        w38Var.setOverlayDrawable(y2bVar);
        this.E0 = w38Var;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.G0 = oneMeDraweeView;
        this.H0 = tu0.r(3, new yqd(context, 4));
        mdf mdfVar = new mdf(context);
        mdfVar.setDrawableEnabled(false);
        mdfVar.setBackgroundEnabled(true);
        this.I0 = mdfVar;
        this.J0 = tu0.r(3, new yqd(context, 5));
        float f = 4;
        this.K0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.L0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        zefVar.b = this;
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-1, -2));
        addView(w38Var, new ViewGroup.LayoutParams(-1, -1));
        addView(mdfVar, new ViewGroup.LayoutParams(-2, -2));
        setTransitionGroup(true);
        oneMeDraweeView.setupNewController(true);
    }

    private final up0 getBlurPostProcessor() {
        return (up0) this.H0.getValue();
    }

    private final mdf getTransferStatusView() {
        return (mdf) this.J0.getValue();
    }

    public static final void y(gsd gsdVar, b00 b00Var) {
        bsd bsdVar = (bsd) gsdVar.getModel();
        if (tpa.f(bsdVar != null ? Long.valueOf(bsdVar.a) : null, b00Var != null ? Long.valueOf(b00Var.a()) : null)) {
            if (!(b00Var instanceof xz) && !(b00Var instanceof a00)) {
                je7 je7Var = gsdVar.J0;
                if (je7Var.a()) {
                    ((mdf) je7Var.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            ay7.a(gsdVar, gsdVar.getTransferStatusView(), new ViewGroup.LayoutParams(-2, -2));
            gsdVar.getTransferStatusView().setVisibility(0);
            mdf transferStatusView = gsdVar.getTransferStatusView();
            CharSequence charSequenceB = b00Var.b().b(gsdVar.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            transferStatusView.setContent(charSequenceB);
        }
    }

    @Override // defpackage.mc8
    public final int b(int i, int i2) {
        w38 w38Var = this.E0;
        boolean zR = w38Var.r();
        OneMeDraweeView oneMeDraweeView = this.G0;
        int measuredHeight = zR ? ((oneMeDraweeView.getMeasuredHeight() - w38Var.getMeasuredHeight()) / 2) + i2 : i2;
        int measuredWidth = (!this.F0 || w38Var.r()) ? i : (getMeasuredWidth() - w38Var.getMeasuredWidth()) / 2;
        if (this.F0) {
            ote.E(oneMeDraweeView, i, i2, 0, 12);
        }
        ote.E(w38Var, measuredWidth, measuredHeight, 0, 12);
        zef zefVar = this.C0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.T(measuredWidth, measuredHeight);
        }
        je7 je7Var = this.J0;
        boolean zA = je7Var.a();
        int i3 = this.K0;
        int i4 = this.L0;
        if (zA) {
            ote.E((mdf) je7Var.getValue(), measuredWidth + i4, w38Var.getTop() + i3, 0, 12);
        }
        int measuredHeight2 = w38Var.getMeasuredHeight() + i2;
        mdf mdfVar = this.I0;
        ote.E(mdfVar, i + i4, (measuredHeight2 - mdfVar.getMeasuredHeight()) - i3, 0, 12);
        return this.F0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (view == oneMeDraweeView && !this.F0) {
            return false;
        }
        if (view != this.E0 && view != oneMeDraweeView && view != this.C0.R()) {
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
        return this.E0;
    }

    @Override // defpackage.ppe, defpackage.ot8
    public final boolean h(MotionEvent motionEvent) {
        return mpf.c(this.E0, this).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // defpackage.cmf
    public final boolean j() {
        return this.C0.j();
    }

    @Override // defpackage.cmf
    public final boolean m() {
        return br7.H((je7) this.C0.c);
    }

    @Override // defpackage.cmf
    public final void o(tlf tlfVar, o00 o00Var, long j, boolean z, boolean z2) {
        this.C0.o(tlfVar, o00Var, j, z, true);
    }

    @Override // defpackage.bmf
    public final xlf r(boolean z) {
        return b46.v0;
    }

    @Override // defpackage.cmf
    public final boolean s() {
        return this.C0.s();
    }

    @Override // defpackage.cmf
    public void setVideoClickListener(a66 a66Var) {
        this.C0.o = a66Var;
    }

    @Override // defpackage.cmf
    public void setVideoLongClickListener(a66 a66Var) {
        this.C0.X = a66Var;
    }

    @Override // defpackage.mc8
    public final long t(int i, int i2, int i3, int i4) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        mdf mdfVar = this.I0;
        mdfVar.measure(iMakeMeasureSpec, i4);
        je7 je7Var = this.J0;
        if (je7Var.a()) {
            ((mdf) je7Var.getValue()).measure(i3, i4);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        w38 w38Var = this.E0;
        w38Var.measure(iMakeMeasureSpec2, i4);
        zef zefVar = this.C0;
        if (br7.H((je7) zefVar.c)) {
            zefVar.U(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
        }
        int blurOffset = w38Var.getBlurOffset();
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (blurOffset == 0) {
            boolean z = w38Var.getMeasuredWidth() < i;
            this.F0 = z;
            if (z) {
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            }
        } else {
            if (w38Var.E0 > 0) {
                this.F0 = true;
                int blurOffset2 = (w38Var.getBlurOffset() * 2) + w38Var.getMeasuredWidth();
                if (i < blurOffset2) {
                    i = blurOffset2;
                }
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredHeight(), 1073741824));
            } else if (w38Var.r()) {
                this.F0 = true;
                oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(w38Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((w38Var.getBlurOffset() * 2) + w38Var.getMeasuredHeight(), 1073741824));
            } else {
                this.F0 = false;
            }
        }
        return dy7.l(Math.max(this.F0 ? oneMeDraweeView.getMeasuredWidth() : w38Var.getMeasuredWidth(), Math.max(br7.B(je7Var), mdfVar.getMeasuredWidth() + getDate$message_list_release().getMeasuredWidth())), Math.max(this.F0 ? oneMeDraweeView.getMeasuredHeight() : w38Var.getMeasuredHeight(), Math.max(getDate$message_list_release().getMeasuredHeight(), br7.A(je7Var))));
    }

    @Override // defpackage.cmf
    public final void u() {
        this.C0.u();
    }

    @Override // defpackage.mc8
    public final void v(x38 x38Var) {
        bsd bsdVar = (bsd) x38Var;
        wcf wcfVar = bsdVar.c;
        this.E0.setImageAttach(new yt6(0L, wcfVar.b, wcfVar.c, wcfVar.d, false, wcfVar.e, false, wcfVar.h, wcfVar.i, null, null, 3584));
        OneMeDraweeView oneMeDraweeView = this.G0;
        xv6 xv6VarD = xv6.d(wcfVar.b);
        xv6VarD.d = wcfVar.i;
        xv6VarD.l = getBlurPostProcessor();
        oneMeDraweeView.o(xv6VarD.a(), null);
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.l);
        long jE = ft4.e(wcfVar.f);
        String[] strArr = are.b;
        this.I0.setContent(tfg.c(jE));
        j0e j0eVar = bsdVar.d;
        if ((j0eVar.getValue() instanceof xz) || (j0eVar.getValue() instanceof a00)) {
            return;
        }
        je7 je7Var = this.J0;
        if (je7Var.a()) {
            ((mdf) je7Var.getValue()).setVisibility(8);
        }
    }
}
