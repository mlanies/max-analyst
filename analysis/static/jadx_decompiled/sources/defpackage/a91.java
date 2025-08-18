package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class a91 implements c91 {
    public final m31 a;
    public final boolean b;
    public final CharSequence c;

    public a91(m31 m31Var, boolean z, SpannableStringBuilder spannableStringBuilder) {
        this.a = m31Var;
        this.b = z;
        this.c = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a91)) {
            return false;
        }
        a91 a91Var = (a91) obj;
        return tpa.f(this.a, a91Var.a) && this.b == a91Var.b && tpa.f(this.c, a91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", isVideo=" + this.b + ", callTypeDescription=" + ((Object) this.c) + ")";
    }
}
