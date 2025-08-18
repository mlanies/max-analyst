package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class eq6 implements Serializable {
    public final int a;
    public final String b;
    public final String c;

    public eq6(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && eq6.class == obj.getClass() && this.a == ((eq6) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpError{code=");
        sb.append(this.a);
        sb.append(", error='");
        sb.append(this.b);
        sb.append("', reason='");
        return zr6.l(sb, this.c, "'}");
    }

    public eq6(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
