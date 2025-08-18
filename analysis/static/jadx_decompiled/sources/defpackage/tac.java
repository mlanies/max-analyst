package defpackage;

/* loaded from: classes2.dex */
public final class tac implements uac {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ tac(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tac)) {
            return false;
        }
        tac tacVar = (tac) obj;
        return this.a == tacVar.a && this.b == tacVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Stop(wasLocked=" + this.a + ", afterSwipe=" + this.b + ")";
    }

    public tac(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
