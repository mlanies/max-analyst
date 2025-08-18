package defpackage;

/* loaded from: classes2.dex */
public final class ylc {
    public final bg1 a;
    public final String b;
    public final zad c;

    public ylc(bg1 bg1Var, String str, zad zadVar) {
        this.a = bg1Var;
        this.b = str;
        this.c = zadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylc)) {
            return false;
        }
        ylc ylcVar = (ylc) obj;
        return tpa.f(this.a, ylcVar.a) && tpa.f(this.b, ylcVar.b) && tpa.f(this.c, ylcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
