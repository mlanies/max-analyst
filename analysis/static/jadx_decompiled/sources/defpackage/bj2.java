package defpackage;

/* loaded from: classes.dex */
public final class bj2 {
    public final boolean a;
    public final boolean b;

    public bj2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj2)) {
            return false;
        }
        bj2 bj2Var = (bj2) obj;
        return this.a == bj2Var.a && this.b == bj2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LoadingState(hasPrev=" + this.a + ", hasNext=" + this.b + ")";
    }
}
