package defpackage;

/* loaded from: classes.dex */
public final class xn9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xn9(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn9)) {
            return false;
        }
        xn9 xn9Var = (xn9) obj;
        return this.a == xn9Var.a && this.b == xn9Var.b && this.c == xn9Var.c && this.d == xn9Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.c;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.d;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
