package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class e25 implements Drawable.Callback {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public e25(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
