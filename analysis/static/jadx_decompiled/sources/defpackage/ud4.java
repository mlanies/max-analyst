package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ud4 extends nvd {
    public final sd4 c;
    public AnimatorSet d;

    public ud4(sd4 sd4Var) {
        this.c = sd4Var;
    }

    @Override // defpackage.nvd
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        sd4 sd4Var = this.c;
        if (animatorSet == null) {
            ((ovd) sd4Var.b).c(this);
            return;
        }
        ovd ovdVar = (ovd) sd4Var.b;
        if (ovdVar.g) {
            wd4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            ovdVar.toString();
        }
    }

    @Override // defpackage.nvd
    public final void b(ViewGroup viewGroup) {
        ovd ovdVar = (ovd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            ovdVar.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(ovdVar);
        }
    }

    @Override // defpackage.nvd
    public final void c(ge0 ge0Var) {
        ovd ovdVar = (ovd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            ovdVar.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !ovdVar.c.y0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            ovdVar.toString();
        }
        long jA = vd4.a.a(animatorSet);
        long j = (long) (ge0Var.c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            animatorSet.toString();
            ovdVar.toString();
        }
        wd4.a.b(animatorSet, j);
    }

    @Override // defpackage.nvd
    public final void d(ViewGroup viewGroup) throws Resources.NotFoundException {
        sd4 sd4Var = this.c;
        if (sd4Var.U1()) {
            return;
        }
        ph4 ph4VarZ1 = sd4Var.Z1(viewGroup.getContext());
        this.d = ph4VarZ1 != null ? (AnimatorSet) ph4VarZ1.b : null;
        ovd ovdVar = (ovd) sd4Var.b;
        a aVar = ovdVar.c;
        boolean z = ovdVar.a == 3;
        View view = aVar.U0;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.addListener(new td4(viewGroup, view, z, ovdVar, this));
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
