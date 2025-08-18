package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public final class ssd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideOutLayout b;

    public ssd(SlideOutLayout slideOutLayout, int i) {
        this.b = slideOutLayout;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tsd tsdVar = this.b.y0;
        if (tsdVar != null) {
            tsdVar.M(this.a);
        }
    }
}
