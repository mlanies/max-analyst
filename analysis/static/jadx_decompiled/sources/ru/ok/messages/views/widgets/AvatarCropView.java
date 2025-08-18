package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import defpackage.b9b;
import defpackage.bk4;
import defpackage.epc;
import defpackage.gd0;
import defpackage.oz3;
import defpackage.qp4;
import defpackage.r68;
import defpackage.ru6;
import defpackage.vl;
import defpackage.y8a;
import defpackage.z7d;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class AvatarCropView extends ZoomableDraweeView {
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final Path K0;
    public final Paint L0;
    public final Paint M0;
    public final Rect N0;
    public int O0;
    public int P0;
    public gd0 Q0;

    public AvatarCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P0 = 0;
        getContext();
        bk4 bk4VarB = bk4.b();
        int i = bk4VarB.n;
        this.G0 = i;
        this.H0 = bk4VarB.D;
        this.I0 = i;
        this.J0 = bk4VarB.A;
        z7d z7dVar = ((y8a) vl.b()).n().b;
        z7dVar.getClass();
        setZoomableController(new oz3(new b9b(new r68()), (int) z7dVar.q(PmsKey.f83minimagesidesize, 64)));
        this.K0 = new Path();
        this.N0 = new Rect();
        Paint paint = new Paint();
        this.L0 = paint;
        paint.setColor(qp4.u0.j(this).b().e);
        this.L0.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.M0 = paint2;
        paint2.setColor(getResources().getColor(epc.f));
        this.M0.setStyle(Paint.Style.STROKE);
        this.M0.setAntiAlias(true);
        this.M0.setStrokeWidth(bk4VarB.a);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, defpackage.iag
    public final void f(Matrix matrix) {
        super.f(matrix);
        ((ActAvatarCrop) this.Q0).Y0.setVisibility(0);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView
    public final void o(ru6 ru6Var) {
        super.o(ru6Var);
        this.O0 = ru6Var.getWidth();
        ((oz3) getZoomableController()).e();
        if (this.P0 == 0) {
            ((oz3) getZoomableController()).d(this.O0);
        }
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.K0, Region.Op.DIFFERENCE);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.L0);
        canvas.restore();
        if (this.P0 != 1) {
            canvas.drawCircle(this.N0.centerX(), this.N0.centerY(), this.N0.width() / 2, this.M0);
            return;
        }
        canvas.drawRect((getMeasuredWidth() / 2) - (this.N0.width() / 2), (getMeasuredHeight() / 2) - (this.N0.height() / 2), (this.N0.width() / 2) + (getMeasuredWidth() / 2), (this.N0.height() / 2) + (getMeasuredHeight() / 2), this.M0);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((oz3) getZoomableController()).e();
        if (this.O0 <= 0 || this.P0 != 0) {
            return;
        }
        ((oz3) getZoomableController()).d(this.O0);
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.P0 == 1) {
            iMin = getMeasuredWidth() - (this.I0 * 2);
            measuredHeight = getMeasuredHeight() - (this.J0 * 2);
        } else {
            iMin = Math.min(getMeasuredWidth() - (this.G0 * 2), getMeasuredHeight() - (this.H0 * 2));
            measuredHeight = iMin;
        }
        this.K0.reset();
        if (this.P0 == 1) {
            int i3 = iMin / 2;
            int i4 = measuredHeight / 2;
            this.K0.addRect((getMeasuredWidth() / 2) - i3, (getMeasuredHeight() / 2) - i4, (getMeasuredWidth() / 2) + i3, (getMeasuredHeight() / 2) + i4, Path.Direction.CCW);
        } else {
            this.K0.addCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, iMin / 2, Path.Direction.CCW);
        }
        int i5 = iMin / 2;
        int i6 = measuredHeight / 2;
        this.N0.set((getMeasuredWidth() / 2) - i5, (getMeasuredHeight() / 2) - i6, (getMeasuredWidth() / 2) + i5, (getMeasuredHeight() / 2) + i6);
        ((oz3) getZoomableController()).m = this.N0;
    }

    public void setMode(int i) {
        this.P0 = i;
        if (i == 1) {
            this.M0.setAlpha(255);
            ((oz3) getZoomableController()).o = false;
        } else {
            this.M0.setAlpha(50);
            ((oz3) getZoomableController()).o = true;
        }
    }

    public void setTransformChangeListener(gd0 gd0Var) {
        this.Q0 = gd0Var;
    }
}
