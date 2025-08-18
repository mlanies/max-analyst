package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class amf extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ bc7[] A0 = {new oi9(amf.class, "videoShape", "getVideoShape()Lone/me/sdk/media/player/view/VideoView$VideoShape;"), rh4.g(nec.a, amf.class, "videoContentMode", "getVideoContentMode()Lone/me/sdk/media/player/view/VideoView$VideoContentMode;")};
    public final String a;
    public ylf b;
    public Surface c;
    public SurfaceTexture o;
    public tlf s0;
    public int t0;
    public int u0;
    public int v0;
    public final int[] w0;
    public final zlf x0;
    public final zlf y0;
    public final Path z0;

    public amf(Context context) {
        super(context);
        this.a = amf.class.getName();
        this.w0 = new int[2];
        this.x0 = new zlf(this, 0);
        this.y0 = new zlf(this, 1);
        this.z0 = new Path();
    }

    public final void a(tlf tlfVar) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("Video view. Bind listener and create surface, has listener:", tlfVar != null), null);
        }
        this.s0 = tlfVar;
        this.v0 = tlfVar != null ? tlfVar.j() : 0;
        d();
        if (this.b == null) {
            ylf ylfVar = new ylf(this, getContext());
            ylfVar.setSurfaceTextureListener(this);
            addView(ylfVar, 0);
            this.b = ylfVar;
            return;
        }
        String str2 = this.a;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, ey8.j("Video view. Already has texture, has surface:", this.c != null), null);
        }
        Surface surface = this.c;
        if (surface == null || tlfVar == null) {
            return;
        }
        tlfVar.G(surface);
    }

    public final void b() {
        this.s0 = null;
        this.v0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        ylf ylfVar = this.b;
        if (ylfVar != null) {
            ylfVar.setSurfaceTextureListener(null);
            removeView(ylfVar);
            this.b = null;
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.o = null;
    }

    public final void c(int i, int i2, boolean z) {
        if (z) {
            int i3 = this.v0;
            boolean z2 = i > 0 && i2 > 0;
            boolean z3 = getMeasuredWidth() > 0 && getMeasuredHeight() > 0;
            if (z2 && z3 && i3 != 0) {
                jt jtVar = new jt(getMeasuredWidth(), getMeasuredHeight(), 8);
                jt jtVar2 = new jt(i, i2, 8);
                Matrix matrix = new Matrix();
                matrix.postConcat(np8.y(jtVar2, jtVar, i3));
                ylf ylfVar = this.b;
                if (ylfVar != null) {
                    ylfVar.setTransform(matrix);
                }
                this.t0 = i;
                this.u0 = i2;
            }
        } else {
            this.t0 = i;
            this.u0 = i2;
            requestLayout();
        }
        ylf ylfVar2 = this.b;
        if (ylfVar2 != null) {
            ylfVar2.setVisibility((this.t0 <= 0 || this.u0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        tlf tlfVar = this.s0;
        int iR = tlfVar != null ? tlfVar.R() : 0;
        tlf tlfVar2 = this.s0;
        c(iR, tlfVar2 != null ? tlfVar2.M0() : 0, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.z0;
        if (path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return ((canvas instanceof RecordingCanvas) || canvas.getClass().equals(Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final ulf getVideoContentMode() {
        bc7 bc7Var = A0[1];
        return (ulf) this.y0.b;
    }

    public final xlf getVideoShape() {
        bc7 bc7Var = A0[0];
        return (xlf) this.x0.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        if (this.t0 <= 0 || this.u0 <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int iOrdinal = getVideoContentMode().ordinal();
            if (iOrdinal == 0) {
                int i3 = this.t0;
                int i4 = this.u0;
                int[] iArr2 = this.w0;
                hm9.z(size, size2, i3, i4, iArr2);
                iArr = iArr2;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr = this.w0;
                iArr[0] = size;
                iArr[1] = size2;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824));
            c(this.t0, this.u0, true);
        }
        xlf videoShape = getVideoShape();
        if (videoShape == null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.z0.reset();
        if (!(videoShape instanceof vlf)) {
            if (!(videoShape instanceof wlf)) {
                throw new NoWhenBranchMatchedException();
            }
            this.z0.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, ((wlf) videoShape).a, Path.Direction.CW);
        } else {
            if (measuredWidth == measuredHeight) {
                float f = measuredWidth / 2.0f;
                this.z0.addCircle(f, measuredHeight / 2.0f, f, Path.Direction.CW);
                return;
            }
            String str = this.a;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, str, rh4.h("VideoShape.AsCircle requires square dimensions but got width=", measuredWidth, measuredHeight, ", height="), null);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + (this.s0 != null), null);
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture2 = this.o;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.o = surfaceTexture;
        this.c = new Surface(surfaceTexture);
        d();
        tlf tlfVar = this.s0;
        if (tlfVar != null) {
            tlfVar.G(this.c);
        }
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

    public final void setVideoContentMode(ulf ulfVar) {
        this.y0.o1(this, A0[1], ulfVar);
    }

    public final void setVideoShape(xlf xlfVar) {
        this.x0.o1(this, A0[0], xlfVar);
    }
}
