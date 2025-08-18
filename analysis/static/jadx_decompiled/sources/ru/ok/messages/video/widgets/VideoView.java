package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.gte;
import defpackage.j47;
import defpackage.jt;
import defpackage.np8;
import defpackage.qme;
import defpackage.slf;

/* loaded from: classes2.dex */
public class VideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public qme a;
    public Surface b;
    public SurfaceTexture c;
    public slf o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(slf slfVar) {
        this.o = slfVar;
        this.v0 = slfVar.j();
        d();
        if (this.a != null) {
            return;
        }
        qme qmeVar = new qme(getContext());
        this.a = qmeVar;
        qmeVar.setSurfaceTextureListener(this);
        addView(this.a, 0);
    }

    public final void b() {
        this.o = null;
        this.v0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        qme qmeVar = this.a;
        if (qmeVar != null) {
            qmeVar.setListener(null);
            this.a.setSurfaceTextureListener(null);
            removeView(this.a);
            this.a = null;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.c = null;
        }
    }

    public final void c(int i, int i2, int i3, boolean z) {
        if (!z) {
            this.s0 = i;
            this.t0 = i2;
            this.u0 = i3;
            requestLayout();
        } else if (i > 0 && i2 > 0 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && this.v0 != 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            jt jtVar = new jt(measuredWidth, measuredHeight, 8);
            jt jtVar2 = new jt(i, i2, 8);
            Matrix matrix = new Matrix();
            matrix.postConcat(np8.y(jtVar2, jtVar, this.v0));
            float f = measuredWidth / 2.0f;
            float f2 = measuredHeight / 2.0f;
            matrix.postRotate(i3, f, f2);
            if (i3 == 90 || i3 == 270) {
                float measuredHeight2 = getMeasuredHeight() / getMeasuredWidth();
                matrix.postScale(1.0f / measuredHeight2, measuredHeight2, f, f2);
            }
            qme qmeVar = this.a;
            if (qmeVar != null) {
                qmeVar.setTransform(matrix);
            }
            this.s0 = i;
            this.t0 = i2;
            this.u0 = i3;
        }
        qme qmeVar2 = this.a;
        if (qmeVar2 != null) {
            qmeVar2.setVisibility((this.s0 <= 0 || this.t0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        slf slfVar = this.o;
        int iR = slfVar == null ? 0 : slfVar.R();
        slf slfVar2 = this.o;
        int iM0 = slfVar2 == null ? 0 : slfVar2.M0();
        slf slfVar3 = this.o;
        c(iR, iM0, slfVar3 == null ? 0 : slfVar3.i1(), false);
    }

    public BitmapDrawable getVideoScreenShot() {
        qme qmeVar = this.a;
        if (qmeVar == null || this.u0 != 0 || !qmeVar.isAvailable() || !this.a.isShown() || this.s0 <= 0 || this.t0 <= 0) {
            return null;
        }
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = width;
        float f2 = f > 640.0f ? 640.0f / f : 1.0f;
        float f3 = height;
        int iMin = (int) Math.min(f2, f3 > 480.0f ? 480.0f / f3 : 1.0f);
        Bitmap bitmap = this.a.getBitmap(width * iMin, height * iMin);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(getResources(), bitmap);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.s0 <= 0 || this.t0 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] iArrG = j47.G(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), this.s0, this.t0);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArrG[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArrG[1], 1073741824));
        c(this.s0, this.t0, this.u0, true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture2 = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.c = null;
        }
        this.c = surfaceTexture;
        this.b = new Surface(surfaceTexture);
        d();
        slf slfVar = this.o;
        if (slfVar == null) {
            return;
        }
        slfVar.G(this.b);
        this.a.setListener(new gte(this, surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
