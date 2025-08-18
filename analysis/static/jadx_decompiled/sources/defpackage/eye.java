package defpackage;

import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.Set;

/* loaded from: classes2.dex */
public final class eye extends FrameLayout {
    public dye a;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                el9 el9Var = (el9) this.a;
                if (el9Var.D0.getVisibility() == 0) {
                    ViewPropertyAnimator viewPropertyAnimatorTranslationY = el9Var.C0.animate().translationY(-el9Var.M0.n);
                    tg tgVar = el9Var.v0;
                    viewPropertyAnimatorTranslationY.setInterpolator(tgVar.a.n()).setDuration(tgVar.a.b());
                }
                el9Var.n(new fj0(8));
            } else if (action == 1) {
                el9 el9Var2 = (el9) this.a;
                if (el9Var2.D0.getVisibility() == 0) {
                    ViewPropertyAnimator viewPropertyAnimatorTranslationY2 = el9Var2.C0.animate().translationY(0.0f);
                    tg tgVar2 = el9Var2.v0;
                    viewPropertyAnimatorTranslationY2.setInterpolator(tgVar2.a.n()).setDuration(tgVar2.a.b());
                }
                el9Var2.n(new fj0(0));
            } else if (action == 2) {
                for (fk9 fk9Var : (Set) ((el9) this.a).a) {
                    fk9Var.F0 = false;
                    d08 d08VarA = fk9Var.E0.a();
                    d08VarA.a = er7.Z;
                    fk9Var.E0 = d08VarA.a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(dye dyeVar) {
        this.a = dyeVar;
    }
}
