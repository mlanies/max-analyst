package defpackage;

/* loaded from: classes2.dex */
public final class tv9 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public tv9(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i != 0;
    }

    public static tv9 a(tv9 tv9Var, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            i = tv9Var.a;
        }
        if ((i2 & 2) != 0) {
            z = tv9Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = tv9Var.c;
        }
        if ((i2 & 8) != 0) {
            z3 = tv9Var.d;
        }
        tv9Var.getClass();
        return new tv9(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv9)) {
            return false;
        }
        tv9 tv9Var = (tv9) obj;
        return this.a == tv9Var.a && this.b == tv9Var.b && this.c == tv9Var.c && this.d == tv9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ms2.d(ms2.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NotificationStackModel(hasCounterValue=" + this.a + ", hasReaction=" + this.b + ", hasMention=" + this.c + ", isMuted=" + this.d + ")";
    }
}
