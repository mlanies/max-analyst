package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class na2 extends of2 {
    public um8 F0;

    @Override // defpackage.of2
    public final void E(xm8 xm8Var, m56 m56Var, a66 a66Var) {
        um8 um8Var = (um8) xm8Var;
        kf2 kf2Var = (kf2) this.a;
        A(um8Var);
        tu0.K(kf2Var, 300L, new tb(m56Var, 12, um8Var));
        kf2Var.setOnLongClickListener(new z52(a66Var, um8Var, this, 1));
    }

    @Override // defpackage.hqd
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void A(um8 um8Var) {
        um8 um8Var2 = this.F0;
        long j = um8Var.a;
        boolean z = um8Var2 == null || um8Var2.a != j;
        this.F0 = um8Var;
        kf2 kf2Var = (kf2) this.a;
        kf2Var.setId((int) j);
        boolean z2 = !z;
        je7 je7Var = kf2Var.K0;
        s5a s5aVar = kf2Var.L0;
        hm9 hm9Var = um8Var.v0;
        String str = um8Var.o;
        if (str == null || str.length() == 0) {
            s5aVar.setVisibility(8);
            ((View) je7Var.getValue()).setVisibility(0);
            boolean z3 = hm9Var instanceof rm8;
            uf5 uf5Var = um8Var.w0;
            if (z3) {
                ((ch5) je7Var.getValue()).b(uf5Var, z2);
            } else if (hm9Var instanceof sm8) {
                ((ch5) je7Var.getValue()).c(uf5Var, ((sm8) hm9Var).p, z2);
            } else {
                if (!(hm9Var instanceof tm8)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ch5) je7Var.getValue()).d(uf5Var, z2);
            }
        } else {
            if (je7Var.a()) {
                ((View) je7Var.getValue()).setVisibility(8);
            }
            s5aVar.setVisibility(0);
            s5a.j(s5aVar, kf2Var.I0, l5a.a, 28);
            s5aVar.setAvatarUrl(str);
        }
        kf2Var.setTitle(um8Var.X);
        kf2Var.setFileDescription(((Object) um8Var.Y) + " · " + ((Object) hm9Var.C().b(kf2Var.getContext())));
    }
}
