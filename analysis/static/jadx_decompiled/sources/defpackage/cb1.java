package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class cb1 extends gb1 {
    public final CharSequence a;
    public final String b;

    public cb1(SpannableStringBuilder spannableStringBuilder, String str) {
        this.a = spannableStringBuilder;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1Var = (cb1) obj;
        return tpa.f(this.a, cb1Var.a) && tpa.f(this.b, cb1Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Name(name=" + ((Object) this.a) + ", accessibility=" + this.b + ")";
    }
}
