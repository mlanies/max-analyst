package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
public final class n6c implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ p6c b;
    public final /* synthetic */ View c;

    public n6c(boolean z, p6c p6cVar, View view) {
        this.a = z;
        this.b = p6cVar;
        this.c = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean zBooleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (zBooleanValue) {
                z5c z5cVar = view instanceof z5c ? (z5c) view : null;
                if (z5cVar == null || !z5cVar.b()) {
                    return;
                }
            }
            pag.F(view, mi6.CONFIRM);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
