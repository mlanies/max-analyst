package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class rd4 extends nvd {
    public final sd4 c;

    public rd4(sd4 sd4Var) {
        this.c = sd4Var;
    }

    @Override // defpackage.nvd
    public final void a(ViewGroup viewGroup) {
        sd4 sd4Var = this.c;
        ovd ovdVar = (ovd) sd4Var.b;
        View view = ovdVar.c.U0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((ovd) sd4Var.b).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            ovdVar.toString();
        }
    }

    @Override // defpackage.nvd
    public final void b(ViewGroup viewGroup) throws Resources.NotFoundException {
        sd4 sd4Var = this.c;
        boolean zU1 = sd4Var.U1();
        ovd ovdVar = (ovd) sd4Var.b;
        if (zU1) {
            ovdVar.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = ovdVar.c.U0;
        ph4 ph4VarZ1 = sd4Var.Z1(context);
        if (ph4VarZ1 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Animation animation = (Animation) ph4VarZ1.a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (ovdVar.a != 1) {
            view.startAnimation(animation);
            ovdVar.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        a16 a16Var = new a16(animation, viewGroup, view);
        a16Var.setAnimationListener(new qd4(ovdVar, viewGroup, view, this));
        view.startAnimation(a16Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            ovdVar.toString();
        }
    }
}
