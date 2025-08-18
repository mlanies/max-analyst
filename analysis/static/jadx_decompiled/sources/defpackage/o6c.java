package defpackage;

import android.transition.Transition;
import android.view.View;

/* loaded from: classes2.dex */
public final class o6c implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public o6c(View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.setAlpha(this.b);
    }
}
