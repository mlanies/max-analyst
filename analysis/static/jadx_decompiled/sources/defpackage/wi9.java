package defpackage;

/* loaded from: classes2.dex */
public final class wi9 {
    public final vi9 a;
    public final boolean b;

    public wi9(vi9 vi9Var, boolean z) {
        this.a = vi9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi9)) {
            return false;
        }
        wi9 wi9Var = (wi9) obj;
        return tpa.f(this.a, wi9Var.a) && this.b == wi9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MuteState(muteEvent=" + this.a + ", isForAll=" + this.b + ")";
    }
}
