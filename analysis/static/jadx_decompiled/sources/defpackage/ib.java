package defpackage;

/* loaded from: classes.dex */
public final class ib implements jb {
    public final gg1 a;

    public ib(gg1 gg1Var) {
        this.a = gg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ib) {
            return tpa.f(this.a, ((ib) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableScreenSharingForParticipant(id=" + this.a + ", isSuccess=true)";
    }
}
