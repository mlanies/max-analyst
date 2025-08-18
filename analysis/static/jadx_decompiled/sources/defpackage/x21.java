package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class x21 extends ch {
    public final je7 A0;
    public final int v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public x21() {
        this(0, 3);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == y7a.Z0;
    }

    @Override // defpackage.ch
    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        boolean zO = o(view2);
        je7 je7Var = this.z0;
        int i = this.v0;
        if (zO && i == 2) {
            return ((t41) je7Var.getValue()).l(viewGroup, view, view2, z, z2);
        }
        boolean zO2 = o(view2);
        je7 je7Var2 = this.x0;
        if (zO2 && i == 1) {
            return ((bi1) je7Var2.getValue()).l(viewGroup, view, view2, z, z2);
        }
        je7 je7Var3 = this.w0;
        if (view != null && view.getId() == y7a.a1 && o(view2)) {
            return (AnimatorSet) je7Var3.getValue();
        }
        je7 je7Var4 = this.y0;
        if ((view2 != null && view2.getId() == y7a.a1) || (view != null && view.getId() == y7a.a1)) {
            return ((am1) je7Var4.getValue()).l(viewGroup, view, view2, z, z2);
        }
        if ((view != null && view.getId() == y7a.q0) || (view2 != null && view2.getId() == y7a.q0)) {
            return (AnimatorSet) je7Var3.getValue();
        }
        boolean zO3 = o(view);
        je7 je7Var5 = this.A0;
        if (zO3 && ((wr1) ((kr1) je7Var5.getValue())).p() && ((wr1) ((kr1) je7Var5.getValue())).y()) {
            return ((bi1) je7Var2.getValue()).l(viewGroup, view, view2, z, z2);
        }
        if ((!o(view) || !((wr1) ((kr1) je7Var5.getValue())).p()) && !((wr1) ((kr1) je7Var5.getValue())).p()) {
            return ((t41) je7Var.getValue()).l(viewGroup, view, view2, z, z2);
        }
        return ((am1) je7Var4.getValue()).l(viewGroup, view, view2, z, z2);
    }

    @Override // defpackage.ch
    public final void n(View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(int i, int i2) {
        super(0);
        i = (i2 & 1) != 0 ? 3 : i;
        this.v0 = i;
        this.w0 = tu0.r(3, new k11(4));
        long j = 250;
        this.x0 = tu0.r(3, new w21(j, 0));
        this.y0 = tu0.r(3, new w21(j, 1));
        this.z0 = tu0.r(3, new w21(j, 2));
        this.A0 = tu0.r(3, new k11(5));
    }
}
