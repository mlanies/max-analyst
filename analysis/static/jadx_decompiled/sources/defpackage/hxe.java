package defpackage;

/* loaded from: classes2.dex */
public final class hxe {
    public final exe a;
    public final ixe b;
    public final lxe c;
    public final oxe d;

    public hxe(exe exeVar, ixe ixeVar, lxe lxeVar, oxe oxeVar) {
        this.a = exeVar;
        this.b = ixeVar;
        this.c = lxeVar;
        this.d = oxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe)) {
            return false;
        }
        hxe hxeVar = (hxe) obj;
        return tpa.f(this.a, hxeVar.a) && tpa.f(this.b, hxeVar.b) && tpa.f(this.c, hxeVar.c) && tpa.f(this.d, hxeVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopbarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
