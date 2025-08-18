package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* loaded from: classes2.dex */
public final class lre extends DrawableWrapper implements kre, Animatable {
    public final int a;

    public lre(int i, Context context, Drawable drawable) {
        super(drawable);
        this.a = i;
        if (context != null) {
            setTint(qp4.u0.b(context).i().c(i));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        if (!(getDrawable() instanceof kre)) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.setTint(fkaVar.c(this.a));
                return;
            }
            return;
        }
        Object drawable2 = getDrawable();
        kre kreVar = drawable2 instanceof kre ? (kre) drawable2 : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(fkaVar);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
