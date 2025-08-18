package defpackage;

/* loaded from: classes2.dex */
public final class cz8 {
    public final boolean a;
    public final CharSequence b;

    public cz8(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz8)) {
            return false;
        }
        cz8 cz8Var = (cz8) obj;
        return this.a == cz8Var.a && tpa.f(this.b, cz8Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "MiniAppData(isVisible=" + this.a + ", title=" + ((Object) this.b) + ")";
    }
}
