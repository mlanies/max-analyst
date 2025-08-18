package defpackage;

/* loaded from: classes2.dex */
public final class jpd {
    public final bg1 a;
    public final String b;

    public jpd(bg1 bg1Var, String str) {
        this.a = bg1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpd)) {
            return false;
        }
        jpd jpdVar = (jpd) obj;
        return tpa.f(this.a, jpdVar.a) && tpa.f(this.b, jpdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
