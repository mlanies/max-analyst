package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v5c implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public v5c(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((v5c) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5c) {
            return tpa.f(this.a.toString(), ((v5c) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + v5c.class.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
