package defpackage;

/* loaded from: classes2.dex */
public final class yq0 {
    public final int a;
    public final int b;
    public final boolean c;

    public yq0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq0)) {
            return false;
        }
        yq0 yq0Var = (yq0) obj;
        return this.a == yq0Var.a && this.b == yq0Var.b && this.c == yq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ey8.g(this.b, au1.s(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInsetConfig(persistentType=");
        sb.append(ey8.o(this.a));
        sb.append(", imeInsetChange=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Immediate" : "Animated" : "None");
        sb.append(", applyDeviceRoundCorners=");
        return au1.j(sb, this.c, ")");
    }
}
