package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rm0 {
    public final int a;
    public final CharSequence b;

    public rm0(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rm0)) {
            return false;
        }
        rm0 rm0Var = (rm0) obj;
        if (this.a != rm0Var.a) {
            return false;
        }
        CharSequence charSequence = this.b;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = rm0Var.b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        return (string == null && string2 == null) || (string != null && string.equals(string2));
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
