package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i88 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public i88(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != i88.class) {
            return false;
        }
        i88 i88Var = (i88) obj;
        return TextUtils.equals(this.a, i88Var.a) && this.b == i88Var.b && this.c == i88Var.c;
    }

    public final int hashCode() {
        return ((rh4.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
