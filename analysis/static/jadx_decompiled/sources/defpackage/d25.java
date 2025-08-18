package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final class d25 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public d25(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        Iterator it = x53.D0(enhancedAnimatedVectorDrawable.animationCallbacks).iterator();
        while (it.hasNext()) {
            ((le) it.next()).a(enhancedAnimatedVectorDrawable);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        Iterator it = x53.D0(enhancedAnimatedVectorDrawable.animationCallbacks).iterator();
        while (it.hasNext()) {
            ((le) it.next()).b(enhancedAnimatedVectorDrawable);
        }
    }
}
