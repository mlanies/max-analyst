package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

/* loaded from: classes.dex */
public final class qg implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
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

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                Drawable background = ((View) this.c).getBackground();
                if (background != null) {
                    background.setAlpha(this.b);
                    break;
                }
                break;
            case 1:
                break;
            default:
                ptd ptdVar = (ptd) ((l17) this.c);
                ptdVar.B("");
                ptdVar.H0.setTextColor(f8.G(this.b, 1.0f));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                Drawable background = ((View) obj).getBackground();
                if (background != null) {
                    background.setAlpha(i);
                    break;
                }
                break;
            case 1:
                int i2 = MarkdownMenuView.u0;
                ((MarkdownMenuView) obj).a(i, false);
                break;
            default:
                ptd ptdVar = (ptd) ((l17) obj);
                ptdVar.B("");
                ptdVar.H0.setTextColor(f8.G(i, 1.0f));
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
