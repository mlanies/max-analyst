package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class z21 {
    public final Context a;
    public final je7 b = tu0.r(3, new x5(22, this));

    public z21(Context context) {
        this.a = context;
    }

    public final m31 a(y21 y21Var) {
        CharSequence charSequence;
        Long l = y21Var.e;
        return new m31(y21Var.a, y21Var.c, new md0((l == null || (charSequence = y21Var.f) == null) ? null : oag.a(charSequence, Long.valueOf(l.longValue())), y21Var.d), y21Var.g ? (od0) this.b.getValue() : null, y21Var.g);
    }
}
