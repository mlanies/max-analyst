package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import defpackage.lh8;
import defpackage.pn;
import defpackage.vsb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends pn {
    public final float b;
    public boolean c;
    public Drawable o;
    public int s0;
    public int t0;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, vsb.seekBarStyle);
        this.b = lh8.d(context);
    }

    public final void a(int i, int i2) {
        if (this.s0 != i) {
            if (Color.alpha(i) != 255) {
                Integer.toHexString(i);
            }
            this.s0 = i;
        }
        if (this.t0 != i2) {
            if (Color.alpha(i2) != 255) {
                Integer.toHexString(i2);
            }
            this.t0 = i2;
        }
    }

    public final void b(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        super.setThumb(z ? null : this.o);
    }

    @Override // defpackage.pn, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.o;
        int i2 = this.s0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.o.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.t0, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.s0, mode);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.o = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
