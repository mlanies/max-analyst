package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes2.dex */
public final class lmd extends LayerDrawable implements Animatable, kre {
    public int X;
    public final boolean Y;
    public final int a;
    public final kmd b;
    public final int c;
    public int o;

    public lmd(Context context) {
        super(new Drawable[0]);
        kmd kmdVar = new kmd(context);
        this.b = kmdVar;
        this.o = tu0.G(80 * fk4.d().getDisplayMetrics().density);
        this.X = -1;
        this.Y = lz7.q(context).compareTo(vi4.o) >= 0;
        Drawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int iAddLayer = addLayer(colorDrawable);
        this.a = iAddLayer;
        setLayerGravity(iAddLayer, 119);
        int iAddLayer2 = addLayer(kmdVar);
        this.c = iAddLayer2;
        kmdVar.setCallback(this);
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void a(int i) {
        this.X = i;
        if (getBounds().isEmpty()) {
            return;
        }
        setLayerInsetBottom(this.c, getBounds().centerY() - i);
    }

    public final boolean b(Drawable drawable) {
        if (drawable == this) {
            return true;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getDrawable(i) == drawable) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.Y && this.b.isRunning();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMin = Math.min(rect.width() - (this.o * 2), rect.height() - (this.o * 2));
        int i = this.c;
        setLayerSize(i, iMin, iMin);
        int i2 = this.X;
        if (i2 > 0) {
            setLayerInsetBottom(i, rect.centerY() - i2);
        }
        super.onBoundsChange(rect);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b.a(fkaVar);
        ((ColorDrawable) getDrawable(this.a)).setColor(fkaVar.b().k);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.Y) {
            this.b.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.Y) {
            this.b.stop();
        }
    }
}
