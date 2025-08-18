package defpackage;

import android.transition.Transition;
import one.me.chats.forward.ForwardPickerScreen;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class a6 implements Transition.TransitionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    private final void e(Transition transition) {
    }

    private final void f(Transition transition) {
    }

    private final void g(Transition transition) {
    }

    private final void h(Transition transition) {
    }

    private final void i(Transition transition) {
    }

    private final void j(Transition transition) {
    }

    private final void k(Transition transition) {
    }

    private final void l(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        switch (this.a) {
            case 0:
                transition.removeListener(this);
                ((ActLocalMedias) this.b).c1.postDelayed(new b(5, this), 100L);
                break;
            case 1:
                ((ForwardPickerScreen) this.b).y0.invoke();
                break;
            default:
                ((b6c) this.b).t0.invoke();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        int i = this.a;
    }
}
