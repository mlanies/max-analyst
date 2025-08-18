package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class owc implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ rwc b;
    public final /* synthetic */ lwc c;
    public final /* synthetic */ rwc d;
    public final /* synthetic */ iwc e;

    public owc(iwc iwcVar, rwc rwcVar, lwc lwcVar, rwc rwcVar2, iwc iwcVar2) {
        this.a = iwcVar;
        this.b = rwcVar;
        this.c = lwcVar;
        this.d = rwcVar2;
        this.e = iwcVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.v0.put((EnumMap) this.c, (lwc) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.v0.put((EnumMap) this.c, (lwc) null);
        this.d.removeView(this.e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
