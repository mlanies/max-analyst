package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class rf8 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((d) this.b).k(true);
                break;
            default:
                pg8 pg8Var = ((ng8) this.b).x0;
                pg8Var.J0 = false;
                pg8Var.o();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ng8) this.b).x0.J0 = true;
                break;
        }
    }
}
