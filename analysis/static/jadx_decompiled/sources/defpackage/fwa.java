package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fwa {
    public final khe a;
    public final khe b;
    public final khe c = new khe(new zj7(29, this));

    public fwa(Context context, je7 je7Var) {
        this.a = new khe(new md(je7Var, context, 1));
        this.b = new khe(new md(je7Var, context, 2));
    }

    public final jic a(int i, int i2, boolean z) {
        int i3;
        int iIntValue = ((Number) this.b.getValue()).intValue();
        int iIntValue2 = ((Number) this.a.getValue()).intValue();
        if (!z) {
            iIntValue = iIntValue2;
        }
        if (i2 * i < iIntValue * iIntValue) {
            return null;
        }
        if (i2 <= iIntValue && i <= iIntValue) {
            return null;
        }
        if (i2 > i) {
            int i4 = iIntValue;
            iIntValue = (int) ((i / i2) * iIntValue);
            i3 = i4;
        } else {
            i3 = (int) ((i2 / i) * iIntValue);
        }
        return new jic(0.0f, iIntValue, i3, 12);
    }
}
