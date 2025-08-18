package defpackage;

/* loaded from: classes2.dex */
public final class sac implements uac {
    public final boolean a;
    public final boolean b;

    public sac(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sac)) {
            return false;
        }
        sac sacVar = (sac) obj;
        return this.a == sacVar.a && this.b == sacVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Recording(afterPause=" + this.a + ", isLocked=" + this.b + ")";
    }
}
