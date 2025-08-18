package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class td4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ovd d;
    public final /* synthetic */ ud4 e;

    public td4(ViewGroup viewGroup, View view, boolean z, ovd ovdVar, ud4 ud4Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = ovdVar;
        this.e = ud4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        ovd ovdVar = this.d;
        if (z) {
            k7d.a(ovdVar.a, view, viewGroup);
        }
        ud4 ud4Var = this.e;
        ((ovd) ud4Var.c.b).c(ud4Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(ovdVar);
        }
    }
}
