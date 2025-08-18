package defpackage;

/* loaded from: classes2.dex */
public final class rf6 {
    public final int a;

    public rf6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf6) && this.a == ((rf6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("GradientsSkeletonGradientGridColors(staticBackground="), this.a, ")");
    }
}
