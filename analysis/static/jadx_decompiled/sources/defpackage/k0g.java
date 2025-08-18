package defpackage;

/* loaded from: classes2.dex */
public final class k0g extends wm9 {
    public final c64 b;

    public k0g(c64 c64Var) {
        super(e5f.a);
        this.b = c64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0g) && tpa.f(this.b, ((k0g) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenAndClose(linkEvent=" + this.b + ")";
    }
}
