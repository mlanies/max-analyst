package defpackage;

/* loaded from: classes.dex */
public final class y9f extends hqd implements g77 {
    public re6 F0;

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        w9f w9fVar = (w9f) ol7Var;
        x9f x9fVar = (x9f) this.a;
        x9fVar.setType(w9fVar.b);
        CharSequence charSequenceA = w9fVar.c.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        x9fVar.setTitle(charSequenceA);
    }

    @Override // defpackage.hqd
    public final void D() {
        this.F0 = null;
    }
}
