package defpackage;

/* loaded from: classes2.dex */
public final class pf6 {
    public final int a;

    public pf6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf6) && this.a == ((pf6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("GradientsSkeletonGradientCellColors(staticBackground="), this.a, ")");
    }
}
