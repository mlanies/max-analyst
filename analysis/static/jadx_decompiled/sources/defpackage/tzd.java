package defpackage;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class tzd implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TextView c;

    public /* synthetic */ tzd(boolean z, TextView textView, int i) {
        this.a = i;
        this.b = z;
        this.c = textView;
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
        switch (this.a) {
            case 0:
                boolean z = this.b;
                TextView textView = this.c;
                if (!z) {
                    textView.setAlpha(1.0f);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                textView.setLayoutParams(marginLayoutParams);
                textView.setVisibility(4);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                TextView textView = this.c;
                if (!z) {
                    textView.setAlpha(1.0f);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                textView.setLayoutParams(marginLayoutParams);
                textView.setVisibility(4);
                return;
            default:
                return;
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
                return;
            default:
                boolean z = this.b;
                TextView textView = this.c;
                if (z) {
                    textView.setAlpha(0.0f);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(tu0.G(4 * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(marginLayoutParams);
                textView.setVisibility(0);
                return;
        }
    }
}
