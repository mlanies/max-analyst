package defpackage;

/* loaded from: classes.dex */
public final class i15 {
    public final String a;

    public i15(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i15)) {
            return false;
        }
        return this.a.equals(((i15) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
