package defpackage;

/* loaded from: classes.dex */
public final class w81 {
    public final int a;
    public final int b;
    public final v81 c;

    public w81(int i, int i2, v81 v81Var) {
        this.a = i;
        this.b = i2;
        this.c = v81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        return this.a == w81Var.a && this.b == w81Var.b && this.c == w81Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(0, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "CallHistoryTabState(id=" + this.a + ", nameRes=" + this.b + ", count=0, type=" + this.c + ")";
    }
}
