package defpackage;

/* loaded from: classes2.dex */
public final class q73 {
    public final o73 a;
    public final p73 b;
    public final s73 c;
    public final u73 d;

    public q73(o73 o73Var, p73 p73Var, s73 s73Var, u73 u73Var) {
        this.a = o73Var;
        this.b = p73Var;
        this.c = s73Var;
        this.d = u73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q73)) {
            return false;
        }
        q73 q73Var = (q73) obj;
        return tpa.f(this.a, q73Var.a) && tpa.f(this.b, q73Var.b) && tpa.f(this.c, q73Var.c) && tpa.f(this.d, q73Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonColors(bubbleGradientPrimary=" + this.a + ", bubbleGradientSecondary=" + this.b + ", stickerPrimary=" + this.c + ", stickerSecondary=" + this.d + ")";
    }
}
