package defpackage;

/* loaded from: classes.dex */
public final class ak1 {
    public static final ak1 g = new ak1(false, false, null, false, false, false);
    public final boolean a;
    public final boolean b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ak1(boolean z, boolean z2, gg1 gg1Var, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = gg1Var;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.a && this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return this.a == ak1Var.a && this.b == ak1Var.b && tpa.f(this.c, ak1Var.c) && this.d == ak1Var.d && this.e == ak1Var.e && this.f == ak1Var.f;
    }

    public final int hashCode() {
        int iD = ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        gg1 gg1Var = this.c;
        return Boolean.hashCode(this.f) + ms2.d(ms2.d((iD + (gg1Var == null ? 0 : gg1Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallScreenSharingState(isMe=");
        sb.append(this.a);
        sb.append(", isSharingStateEnabled=");
        sb.append(this.b);
        sb.append(", sharedScreenOpponentId=");
        sb.append(this.c);
        sb.append(", isAdminDisableScreenSharing=");
        sb.append(this.d);
        sb.append(", isMeAudioSharingEnabled=");
        sb.append(this.e);
        sb.append(", isMeAdmin=");
        return au1.j(sb, this.f, ")");
    }
}
