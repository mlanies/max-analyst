package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.media.attaches.ActAttachesView;

/* loaded from: classes2.dex */
public final class j5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActAttachesView b;

    public /* synthetic */ j5(ActAttachesView actAttachesView, int i) {
        this.a = i;
        this.b = actAttachesView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.n1.setVisibility(4);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.n1.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
