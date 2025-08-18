package defpackage;

/* loaded from: classes2.dex */
public final class lo8 implements qo8 {
    public final int a;
    public final long b;

    public lo8(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo8)) {
            return false;
        }
        lo8 lo8Var = (lo8) obj;
        return this.a == lo8Var.a && this.b == lo8Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnContextActionClicked(actionId=" + this.a + ", memberId=" + this.b + ")";
    }
}
