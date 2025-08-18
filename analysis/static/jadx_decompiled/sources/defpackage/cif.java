package defpackage;

import android.animation.Animator;

/* loaded from: classes2.dex */
public final class cif implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dif b;

    public /* synthetic */ cif(dif difVar, int i) {
        this.a = i;
        this.b = difVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                je7 je7Var = (je7) this.b.s0.c;
                if (je7Var.a()) {
                    amf amfVar = (amf) je7Var.getValue();
                    amfVar.setAlpha(1.0f);
                    amfVar.setVisibility(0);
                    break;
                }
                break;
            default:
                dif.e(this.b);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                je7 je7Var = (je7) this.b.s0.c;
                if (je7Var.a()) {
                    amf amfVar = (amf) je7Var.getValue();
                    amfVar.setAlpha(1.0f);
                    amfVar.setVisibility(0);
                    break;
                }
                break;
            default:
                dif.e(this.b);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
