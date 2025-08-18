package defpackage;

/* loaded from: classes.dex */
public final class hb implements jb {
    public final boolean a;

    public hb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb) && this.a == ((hb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("DisableScreenRecord(isRemoved="), this.a, ")");
    }
}
