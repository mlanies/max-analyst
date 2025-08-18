package defpackage;

/* loaded from: classes.dex */
public final class te1 extends ue1 {
    public final boolean a;

    public te1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te1) && this.a == ((te1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("RaiseHand(isEnabled="), this.a, ")");
    }
}
