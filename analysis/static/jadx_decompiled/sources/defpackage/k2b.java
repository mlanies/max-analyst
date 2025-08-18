package defpackage;

/* loaded from: classes2.dex */
public final class k2b implements l2b {
    public final String a;

    public k2b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2b) && tpa.f(this.a, ((k2b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("UserPhoto(url="), this.a, ")");
    }
}
