package defpackage;

/* loaded from: classes.dex */
public final class eb implements jb {
    public final gg1 a;
    public final boolean b;

    public eb(gg1 gg1Var, boolean z) {
        this.a = gg1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return tpa.f(this.a, ebVar.a) && this.b == ebVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableCameraForParticipant(id=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        return au1.j(sb, this.b, ")");
    }
}
