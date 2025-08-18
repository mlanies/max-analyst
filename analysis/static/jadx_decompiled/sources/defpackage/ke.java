package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ke extends Animatable2.AnimationCallback {
    public final /* synthetic */ le a;

    public ke(le leVar) {
        this.a = leVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.a.b(drawable);
    }
}
