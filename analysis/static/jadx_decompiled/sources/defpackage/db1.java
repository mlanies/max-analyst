package defpackage;

/* loaded from: classes.dex */
public final class db1 extends gb1 {
    public final boolean a;

    public db1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db1) && this.a == ((db1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("RaiseHand(isRaised="), this.a, ")");
    }
}
