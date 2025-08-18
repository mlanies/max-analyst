package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ha extends hqd {
    public final lrf F0;

    public ha(Context context, lrf lrfVar) {
        super(new lk3(context, null));
        this.F0 = lrfVar;
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(z9f z9fVar) {
        lk3 lk3Var = (lk3) this.a;
        lk3Var.setCustomTheme(qp4.u0.p(lk3Var).c);
        lk3Var.setCallButtonMode(jk3.b);
        lk3Var.setName(z9fVar.a.b(lk3Var.getContext()));
        lk3Var.setMessage(null);
        uc0 uc0Var = z9fVar.b;
        lk3Var.O(uc0Var.a, uc0Var.b, z9fVar.c);
    }
}
