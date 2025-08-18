package defpackage;

/* loaded from: classes2.dex */
public final class x27 {
    public static final x27 c = new x27(0, null, 3);
    public static final x27 d = new x27(3, new yq0(3, 3, false));
    public final int a;
    public final yq0 b;

    public x27(int i, yq0 yq0Var) {
        this.a = i;
        this.b = yq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27Var = (x27) obj;
        int i = x27Var.a;
        int i2 = this.a;
        if (i2 != 0 ? i != 0 && i2 == i : i == 0) {
            return tpa.f(this.b, x27Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iS = (i == 0 ? 0 : au1.s(i)) * 31;
        yq0 yq0Var = this.b;
        return iS + (yq0Var != null ? yq0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 0) {
            str = "null";
        } else {
            str = "TopInsetConfig(persistentType=" + ey8.o(i) + ")";
        }
        StringBuilder sbM = au1.m("InsetsConfig(topConfig=", str, ", bottomConfig=");
        sbM.append(this.b);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ x27(int i, yq0 yq0Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : yq0Var);
    }
}
