package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class gcd implements Serializable {
    public final Object X;
    public final int Y;
    public boolean Z;
    public final int a;
    public final CharSequence b;
    public final String c;
    public final String o;

    public gcd(int i, CharSequence charSequence, String str, String str2, Boolean bool, int i2) {
        this.a = i;
        this.b = charSequence;
        this.c = str;
        this.o = str2;
        this.X = bool;
        this.Y = i2;
    }

    public static gcd a(int i, String str, String str2) {
        return new gcd(i, str, str2, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcd)) {
            return false;
        }
        gcd gcdVar = (gcd) obj;
        if (this.a != gcdVar.a || this.Y != gcdVar.Y || this.Z != gcdVar.Z || Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        CharSequence charSequence = gcdVar.b;
        CharSequence charSequence2 = this.b;
        if (charSequence2 == null ? charSequence != null : !charSequence2.equals(charSequence)) {
            return false;
        }
        String str = gcdVar.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = gcdVar.o;
        String str4 = this.o;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        Object obj2 = gcdVar.X;
        Object obj3 = this.X;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }
}
