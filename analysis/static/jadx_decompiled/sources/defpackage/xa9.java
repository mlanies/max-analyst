package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class xa9 {
    public final String a;
    public final CharSequence b;
    public final hy3 c;
    public final Set d;

    public xa9(String str, CharSequence charSequence, hy3 hy3Var, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = hy3Var;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa9)) {
            return false;
        }
        xa9 xa9Var = (xa9) obj;
        return tpa.f(this.a, xa9Var.a) && tpa.f(this.b, xa9Var.b) && tpa.f(this.c, xa9Var.c) && tpa.f(this.d, xa9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k7d.e(this.c.a, rh4.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MiniFolder(id=" + this.a + ", name=" + ((Object) this.b) + ", counter=" + this.c + ", options=" + this.d + ")";
    }
}
