package defpackage;

/* loaded from: classes2.dex */
public final class bd2 extends of2 {
    @Override // defpackage.of2
    public final void E(xm8 xm8Var, m56 m56Var, a66 a66Var) {
        vm8 vm8Var = (vm8) xm8Var;
        lf2 lf2Var = (lf2) this.a;
        A(vm8Var);
        tu0.K(lf2Var, 300L, new yc2(m56Var, vm8Var, 2));
        lf2Var.setOnLongClickListener(new zc2(a66Var, vm8Var, this, 1));
    }

    @Override // defpackage.hqd
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void A(vm8 vm8Var) {
        lf2 lf2Var = (lf2) this.a;
        lf2Var.setId((int) vm8Var.a);
        lf2Var.setTitle(vm8Var.X);
        CharSequence charSequence = vm8Var.Z;
        if (charSequence != null) {
            lf2Var.setLink(charSequence);
        }
        lf2Var.setSubtitle(vm8Var.Y);
        lf2Var.setLinkPhoto(vm8Var.o);
    }
}
