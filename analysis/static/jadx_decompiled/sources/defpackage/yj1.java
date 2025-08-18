package defpackage;

/* loaded from: classes.dex */
public final class yj1 {
    public static final yj1 g = new yj1(false, false, false, null, false, null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final gg1 d;
    public final boolean e;
    public final CharSequence f;

    public yj1(boolean z, boolean z2, boolean z3, gg1 gg1Var, boolean z4, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = gg1Var;
        this.e = z4;
        this.f = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj1)) {
            return false;
        }
        yj1 yj1Var = (yj1) obj;
        return this.a == yj1Var.a && this.b == yj1Var.b && this.c == yj1Var.c && tpa.f(this.d, yj1Var.d) && this.e == yj1Var.e && tpa.f(this.f, yj1Var.f);
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        gg1 gg1Var = this.d;
        int iD2 = ms2.d((iD + (gg1Var == null ? 0 : gg1Var.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        return iD2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "CallScreenRecordState(isMe=" + this.a + ", meIsAdmin=" + this.b + ", isRecordStateEnabled=" + this.c + ", recordScreenOpponentId=" + this.d + ", isAdminDisableScreenRecord=" + this.e + ", userName=" + ((Object) this.f) + ")";
    }
}
