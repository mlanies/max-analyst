package defpackage;

/* loaded from: classes2.dex */
public final class is6 {
    public final int a;

    public is6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is6) && this.a == ((is6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("IconLocalPromoColors(accent="), this.a, ")");
    }
}
