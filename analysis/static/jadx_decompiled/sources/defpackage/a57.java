package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class a57 extends hqd {
    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(y47 y47Var) {
        Drawable drawableB;
        z47 z47Var = (z47) this.a;
        CharSequence charSequenceB = y47Var.b.b(z47Var.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        z47Var.setText(charSequenceB);
        Integer num = y47Var.c;
        if (num != null) {
            drawableB = kt3.b(z47Var.getContext(), num.intValue());
        } else {
            drawableB = null;
        }
        z47Var.setIcon(drawableB);
    }
}
