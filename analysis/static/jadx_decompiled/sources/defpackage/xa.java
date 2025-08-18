package defpackage;

/* loaded from: classes.dex */
public final class xa implements jb {
    public final boolean a;
    public final boolean b;

    public xa(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return this.a == xaVar.a && this.b == xaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableAllCameraInCall(isSuccess=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        return au1.j(sb, this.b, ")");
    }
}
