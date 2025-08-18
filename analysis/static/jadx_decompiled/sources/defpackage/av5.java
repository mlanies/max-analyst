package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class av5 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final hy3 d;
    public final Set e;

    public av5(String str, CharSequence charSequence, CharSequence charSequence2, hy3 hy3Var, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = hy3Var;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av5)) {
            return false;
        }
        av5 av5Var = (av5) obj;
        return tpa.f(this.a, av5Var.a) && tpa.f(this.b, av5Var.b) && tpa.f(this.c, av5Var.c) && tpa.f(this.d, av5Var.d) && tpa.f(this.e, av5Var.e);
    }

    public final int hashCode() {
        int iF = rh4.f(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.e.hashCode() + k7d.e(this.d.a, (iF + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "FolderModel(id=" + this.a + ", name=" + ((Object) this.b) + ", emoji=" + ((Object) this.c) + ", counter=" + this.d + ", options=" + this.e + ")";
    }
}
