package defpackage;

/* loaded from: classes2.dex */
public final class m2g implements z97 {
    public final boolean a;

    public m2g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2g) && this.a == ((m2g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ShowBackButton(isVisible="), this.a, ")");
    }
}
