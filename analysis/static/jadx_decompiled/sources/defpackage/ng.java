package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class ng implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((View) this.b).setAnimation(null);
                break;
            case 1:
                View view = (View) this.b;
                view.setAnimation(null);
                view.setVisibility(8);
                break;
            case 2:
                ((View) this.b).setAnimation(null);
                break;
            case 3:
                View view2 = (View) this.b;
                view2.setAnimation(null);
                view2.setVisibility(8);
                break;
            default:
                ((kp) this.b).p();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                ((View) this.b).setVisibility(0);
                break;
            case 2:
                ((View) this.b).setVisibility(0);
                break;
            case 4:
                ((kp) this.b).r();
                break;
        }
    }
}
