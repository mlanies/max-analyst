package defpackage;

/* loaded from: classes2.dex */
public final class u92 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(v92 v92Var) {
        t92 t92Var = (t92) this.a;
        t92Var.setTitle(v92Var.a);
        t92Var.setSubtitle(v92Var.b);
        t92Var.a.setCustomOverlay(v92Var.Y);
        Long lValueOf = Long.valueOf(v92Var.X);
        CharSequence charSequence = v92Var.o;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(t92Var.a, v92Var.c, lValueOf, charSequence);
        t92Var.setDescriptions(v92Var.Z);
    }
}
