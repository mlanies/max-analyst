package defpackage;

/* loaded from: classes2.dex */
public final class bxc {
    public static final bxc e = new bxc(0, false, false, null);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final axc d;

    public bxc(int i, boolean z, boolean z2, axc axcVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = axcVar;
    }

    public static bxc a(bxc bxcVar, int i, boolean z, boolean z2, axc axcVar, int i2) {
        if ((i2 & 1) != 0) {
            i = bxcVar.a;
        }
        if ((i2 & 2) != 0) {
            z = bxcVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = bxcVar.c;
        }
        if ((i2 & 8) != 0) {
            axcVar = bxcVar.d;
        }
        bxcVar.getClass();
        return new bxc(i, z, z2, axcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc)) {
            return false;
        }
        bxc bxcVar = (bxc) obj;
        return this.a == bxcVar.a && this.b == bxcVar.b && this.c == bxcVar.c && tpa.f(this.d, bxcVar.d);
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        axc axcVar = this.d;
        return iD + (axcVar == null ? 0 : axcVar.hashCode());
    }

    public final String toString() {
        return "ScrollState(unreadMessages=" + this.a + ", isUnreadButtonVisible=" + this.b + ", isMentionButtonVisible=" + this.c + ", lastReaction=" + this.d + ")";
    }
}
