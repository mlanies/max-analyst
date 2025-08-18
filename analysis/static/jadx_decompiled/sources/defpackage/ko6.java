package defpackage;

/* loaded from: classes.dex */
public final class ko6 implements mo6 {
    public final String a;

    public ko6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko6) && tpa.f(this.a, ((ko6) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CustomMode(host="), this.a, ")");
    }
}
