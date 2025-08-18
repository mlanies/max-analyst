package defpackage;

import android.animation.Animator;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class dha implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eha b;

    public /* synthetic */ dha(eha ehaVar, int i) {
        this.a = i;
        this.b = ehaVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                mr0.V((View) this.b.C0.getValue());
                break;
            default:
                eha ehaVar = this.b;
                ((AppCompatEditText) ehaVar.C0.getValue()).setHint(ehaVar.s0);
                ehaVar.A0 = cha.c;
                bha bhaVar = ehaVar.u0;
                if (bhaVar != null) {
                    bhaVar.n();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                eha ehaVar = this.b;
                je7 je7Var = ehaVar.E0;
                if (je7Var.a()) {
                    ((ImageView) je7Var.getValue()).setVisibility(8);
                }
                je7 je7Var2 = ehaVar.D0;
                if (je7Var2.a()) {
                    ((AppCompatImageView) je7Var2.getValue()).setVisibility(8);
                }
                ((View) ehaVar.B0.getValue()).setVisibility(0);
                View view = (View) ehaVar.F0.getValue();
                je7 je7Var3 = ehaVar.C0;
                Editable text = ((AppCompatEditText) je7Var3.getValue()).getText();
                view.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
                ((View) je7Var3.getValue()).setVisibility(0);
                ehaVar.A0 = cha.o;
                break;
        }
    }
}
