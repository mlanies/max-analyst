package defpackage;

/* loaded from: classes.dex */
public final class aj2 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final zi2 d;

    public aj2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, zi2 zi2Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = zi2Var;
    }

    public static aj2 a(aj2 aj2Var, zi2 zi2Var) {
        CharSequence charSequence = aj2Var.a;
        CharSequence charSequence2 = aj2Var.b;
        CharSequence charSequence3 = aj2Var.c;
        aj2Var.getClass();
        return new aj2(charSequence, charSequence2, charSequence3, zi2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return false;
        }
        aj2 aj2Var = (aj2) obj;
        return tpa.f(this.a, aj2Var.a) && tpa.f(this.b, aj2Var.b) && tpa.f(this.c, aj2Var.c) && tpa.f(this.d, aj2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rh4.f(this.c, rh4.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InfoPanelState(author=" + ((Object) this.a) + ", dateText=" + ((Object) this.b) + ", captionText=" + ((Object) this.c) + ", frameState=" + this.d + ")";
    }
}
