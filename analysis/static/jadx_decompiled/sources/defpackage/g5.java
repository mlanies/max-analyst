package defpackage;

import android.transition.Transition;
import androidx.fragment.app.a;
import java.util.HashSet;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* loaded from: classes2.dex */
public final class g5 implements Transition.TransitionListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ es8 b;
    public final /* synthetic */ ActAttachesView c;

    public g5(ActAttachesView actAttachesView, FrgAttachView frgAttachView, es8 es8Var) {
        this.c = actAttachesView;
        this.a = frgAttachView;
        this.b = es8Var;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        HashSet hashSet = ActAttachesView.z1;
        hm9.k("ru.ok.messages.media.attaches.ActAttachesView", "onTransitionCancel");
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.c.f1.postDelayed(new f5(this, (FrgAttachView) this.a, this.b, 0), 100L);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
