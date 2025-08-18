package defpackage;

import android.transition.Transition;
import android.view.View;

/* loaded from: classes2.dex */
public final class m6c implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ au4 b;
    public final /* synthetic */ float c;

    public m6c(View view, au4 au4Var, float f) {
        this.a = view;
        this.b = au4Var;
        this.c = f;
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
        View view = this.a;
        au4 au4Var = this.b;
        float f = this.c;
        kwd kwdVar = new kwd(view, au4Var, f);
        kwdVar.a = 0.0f;
        lwd lwdVar = new lwd(f);
        lwdVar.b(400.0f);
        lwdVar.a(0.68f);
        kwdVar.m = lwdVar;
        kwdVar.g();
    }
}
