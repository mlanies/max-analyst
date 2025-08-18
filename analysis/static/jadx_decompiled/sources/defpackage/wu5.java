package defpackage;

/* loaded from: classes.dex */
public final class wu5 extends hqd {
    @Override // defpackage.hqd
    public final void D() {
        ((d12) this.a).setOnTrailClick(null);
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(pu5 pu5Var) {
        d12 d12Var = (d12) this.a;
        d12Var.setTitle(pu5Var.c);
        Long lValueOf = Long.valueOf(pu5Var.o);
        CharSequence charSequence = pu5Var.X;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(d12Var.a, pu5Var.b, lValueOf, charSequence);
        d12Var.requestLayout();
        d12Var.invalidate();
        d12Var.setVerified(pu5Var.Y);
    }
}
