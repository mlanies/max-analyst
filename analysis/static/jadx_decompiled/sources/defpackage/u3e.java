package defpackage;

/* loaded from: classes2.dex */
public final class u3e implements v3e {
    public final int a;

    public u3e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3e) && this.a == ((u3e) obj).a;
    }

    public final int hashCode() {
        return au1.s(this.a);
    }

    public final String toString() {
        return "TypeChange(newType=" + k7d.r(this.a) + ")";
    }
}
