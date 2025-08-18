package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class r54 {
    public final String a;
    public final oy5 b;
    public final oy5 c;
    public final int d;
    public final int e;

    public r54(String str, oy5 oy5Var, oy5 oy5Var2, int i, int i2) {
        np8.d(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        oy5Var.getClass();
        this.b = oy5Var;
        oy5Var2.getClass();
        this.c = oy5Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r54.class != obj.getClass()) {
            return false;
        }
        r54 r54Var = (r54) obj;
        return this.d == r54Var.d && this.e == r54Var.e && this.a.equals(r54Var.a) && this.b.equals(r54Var.b) && this.c.equals(r54Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + rh4.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
