package defpackage;

/* loaded from: classes2.dex */
public final class oxe {
    public final pxe a;
    public final qxe b;

    public oxe(pxe pxeVar, qxe qxeVar) {
        this.a = pxeVar;
        this.b = qxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxe)) {
            return false;
        }
        oxe oxeVar = (oxe) obj;
        return tpa.f(this.a, oxeVar.a) && tpa.f(this.b, oxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarTextColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
