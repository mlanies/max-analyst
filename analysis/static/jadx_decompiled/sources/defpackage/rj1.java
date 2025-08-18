package defpackage;

/* loaded from: classes.dex */
public final class rj1 extends wj1 {
    public final boolean D;

    public rj1(boolean z) {
        this.D = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj1) && this.D == ((rj1) obj).D;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.D);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ShareScreen(isEnabled="), this.D, ")");
    }
}
