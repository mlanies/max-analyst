package defpackage;

/* loaded from: classes2.dex */
public final class ro9 {
    public final int a;
    public final Integer b;

    public ro9(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro9)) {
            return false;
        }
        ro9 ro9Var = (ro9) obj;
        return this.a == ro9Var.a && tpa.f(this.b, ro9Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarScrollEvent(tabIndex=" + this.a + ", firstIndex=" + this.b + ")";
    }
}
