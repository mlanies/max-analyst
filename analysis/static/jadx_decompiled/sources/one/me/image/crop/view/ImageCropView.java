package one.me.image.crop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.foa;
import defpackage.goa;
import defpackage.mz3;
import defpackage.nz3;
import defpackage.wa6;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lone/me/image/crop/view/ImageCropView;", "Landroid/widget/FrameLayout;", "Lmz3;", "Lgoa;", "", "freestyleCropModeEnable", "Le5f;", "setFreestyleCropMode", "(I)V", "", "enabled", "setRotateEnabled", "(Z)V", "", "factor", "setMaxScaleMultiplier", "(F)V", "size", "setMinImageSize", "Lnz3;", "getCropState", "()Lnz3;", "getMinOverlaySize", "()F", "getMaxBitmapSize", "()I", "photo-crop_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ImageCropView extends FrameLayout implements mz3, goa {
    public final wa6 a;
    public final foa b;

    public ImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wa6 wa6Var = new wa6(context);
        wa6Var.U0 = true;
        wa6Var.V0 = true;
        wa6Var.W0 = 5;
        this.a = wa6Var;
        addView(wa6Var, new FrameLayout.LayoutParams(-1, -1));
        foa foaVar = new foa(context);
        this.b = foaVar;
        addView(foaVar, new FrameLayout.LayoutParams(-1, -1));
        wa6Var.setCropBoundsChangeListener(this);
        foaVar.setOverlayViewChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[PHI: r1 r3
      0x0081: PHI (r1v10 float) = (r1v6 float), (r1v7 float) binds: [B:16:0x007f, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r3v10 float) = (r3v6 float), (r3v7 float) binds: [B:16:0x007f, B:19:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            wa6 r8 = r8.a
            float r0 = r8.getCurrentScale()
            float r1 = r8.getMinScale()
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L20
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            float r3 = r8.S0
            float r4 = r8.T0
            r2.postScale(r1, r1, r3, r4)
            goto L21
        L20:
            r2 = 0
        L21:
            float r1 = r8.getMaxScale()
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.graphics.RectF r4 = r8.C0
            if (r3 <= 0) goto L44
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r3 = r8.getCurrentImageMatrix()
            r2.<init>(r3)
            float r1 = r1 / r0
            float r0 = r4.width()
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r5 = r4.height()
            float r5 = r5 / r3
            r2.postScale(r1, r1, r0, r5)
        L44:
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.drawable.Drawable r1 = r8.getDrawable()
            int r1 = r1.getIntrinsicWidth()
            float r1 = (float) r1
            android.graphics.drawable.Drawable r3 = r8.getDrawable()
            int r3 = r3.getIntrinsicHeight()
            float r3 = (float) r3
            r5 = 0
            r0.<init>(r5, r5, r1, r3)
            float[] r0 = defpackage.ngg.t(r0)
            if (r2 == 0) goto L65
            r2.mapPoints(r0)
        L65:
            if (r2 == 0) goto L69
            r0 = r2
            goto L6d
        L69:
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
        L6d:
            float[] r1 = r8.v0
            int r3 = r1.length
            float[] r3 = new float[r3]
            r0.mapPoints(r3, r1)
            android.graphics.RectF r0 = defpackage.ngg.J(r3)
            float r1 = r0.right
            float r3 = r4.right
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L83
        L81:
            float r3 = r3 - r1
            goto L8d
        L83:
            float r1 = r0.left
            float r3 = r4.left
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L8c
            goto L81
        L8c:
            r3 = r5
        L8d:
            float r1 = r0.bottom
            float r6 = r4.bottom
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L97
            float r6 = r6 - r1
            goto La3
        L97:
            float r0 = r0.top
            float r1 = r4.top
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto La2
            float r6 = r1 - r0
            goto La3
        La2:
            r6 = r5
        La3:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto Lab
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 == 0) goto Lb9
        Lab:
            if (r2 != 0) goto Lb6
            android.graphics.Matrix r2 = new android.graphics.Matrix
            android.graphics.Matrix r0 = r8.getCurrentImageMatrix()
            r2.<init>(r0)
        Lb6:
            r2.postTranslate(r3, r6)
        Lb9:
            if (r2 == 0) goto Lbe
            r8.setImageMatrix(r2)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.image.crop.view.ImageCropView.a():void");
    }

    public final nz3 getCropState() {
        return this.a.getCropState();
    }

    public final int getMaxBitmapSize() {
        return this.a.getMaxBitmapSize();
    }

    @Override // defpackage.goa
    public float getMinOverlaySize() {
        return this.a.getMinOverlaySize();
    }

    public final void setFreestyleCropMode(int freestyleCropModeEnable) {
        this.b.setFreestyleCropMode(freestyleCropModeEnable);
    }

    public final void setMaxScaleMultiplier(float factor) {
        this.a.setMaxScaleMultiplier(factor);
    }

    public final void setMinImageSize(float size) {
        this.a.setMinImageSize(size);
    }

    public final void setRotateEnabled(boolean enabled) {
        this.a.U0 = enabled;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
