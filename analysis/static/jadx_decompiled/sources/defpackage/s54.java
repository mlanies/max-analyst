package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s54 {
    public final String a;
    public final qy5 b;
    public final qy5 c;
    public final int d;
    public final int e;

    public s54(String str, qy5 qy5Var, qy5 qy5Var2, int i, int i2) {
        fm9.f(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        qy5Var.getClass();
        this.b = qy5Var;
        qy5Var2.getClass();
        this.c = qy5Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s54.class != obj.getClass()) {
            return false;
        }
        s54 s54Var = (s54) obj;
        return this.d == s54Var.d && this.e == s54Var.e && this.a.equals(s54Var.a) && this.b.equals(s54Var.b) && this.c.equals(s54Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + rh4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
