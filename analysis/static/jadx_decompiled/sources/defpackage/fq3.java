package defpackage;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class fq3 extends kgb {
    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        zm3 zm3Var = (zm3) ol7Var;
        lk3 lk3Var = (lk3) this.a;
        if (zm3Var.t0) {
            if (zm3Var.Z == rdb.o) {
                int iG = tu0.G(64 * fk4.d().getDisplayMetrics().density);
                int iG2 = tu0.G(80 * fk4.d().getDisplayMetrics().density);
                lk3Var.b1.b = c32.Y;
                ViewGroup.LayoutParams layoutParams = lk3Var.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iG2;
                lk3Var.setLayoutParams(layoutParams);
                lk3Var.g1 = iG;
                lk3Var.J();
            }
        }
        lk3Var.O(zm3Var.a, zm3Var.Y, zm3Var.o);
        lk3Var.setName(zm3Var.b);
        lk3Var.setMessage(zm3Var.c.b(lk3Var.getContext()));
    }
}
