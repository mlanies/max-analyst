package defpackage;

/* loaded from: classes2.dex */
public final class ve0 {
    public final ue0 a;
    public final we0 b;
    public final xe0 c;
    public final ye0 d;

    public ve0(ue0 ue0Var, we0 we0Var, xe0 xe0Var, ye0 ye0Var) {
        this.a = ue0Var;
        this.b = we0Var;
        this.c = xe0Var;
        this.d = ye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve0)) {
            return false;
        }
        ve0 ve0Var = (ve0) obj;
        return tpa.f(this.a, ve0Var.a) && tpa.f(this.b, ve0Var.b) && tpa.f(this.c, ve0Var.c) && tpa.f(this.d, ve0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k7d.e(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "BackgroundLocalColors(chips=" + this.a + ", fileType=" + this.b + ", tabBar=" + this.c + ", topBar=" + this.d + ")";
    }
}
