package defpackage;

/* loaded from: classes.dex */
public final class fb implements jb {
    public final gg1 a;
    public final boolean b;

    public fb(gg1 gg1Var, boolean z) {
        this.a = gg1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return tpa.f(this.a, fbVar.a) && this.b == fbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableMicForParticipant(id=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        return au1.j(sb, this.b, ")");
    }
}
