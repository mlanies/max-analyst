package defpackage;

/* loaded from: classes.dex */
public final class bb implements jb {
    public final boolean a;

    public bb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb) && this.a == ((bb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("DisableAllRaiseHandsOnce(isSuccess="), this.a, ")");
    }
}
