package defpackage;

/* loaded from: classes.dex */
public final class dl6 extends hl6 {
    public final CharSequence a;

    public dl6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl6) && tpa.f(this.a, ((dl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + ((Object) this.a) + ")";
    }
}
