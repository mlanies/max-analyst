package defpackage;

/* loaded from: classes2.dex */
public final class ixe {
    public final jxe a;
    public final kxe b;

    public ixe(jxe jxeVar, kxe kxeVar) {
        this.a = jxeVar;
        this.b = kxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixeVar = (ixe) obj;
        return tpa.f(this.a, ixeVar.a) && tpa.f(this.b, ixeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarIconColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
