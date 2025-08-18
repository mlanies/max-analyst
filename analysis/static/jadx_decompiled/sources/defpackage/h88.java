package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h88 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public h88(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != h88.class) {
            return false;
        }
        h88 h88Var = (h88) obj;
        return TextUtils.equals(this.a, h88Var.a) && this.b == h88Var.b && this.c == h88Var.c;
    }

    public final int hashCode() {
        return ((rh4.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
