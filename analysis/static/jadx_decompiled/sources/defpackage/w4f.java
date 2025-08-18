package defpackage;

/* loaded from: classes.dex */
public final class w4f {
    public final CharSequence a;
    public final CharSequence b;
    public final m31 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public w4f(CharSequence charSequence, String str, m31 m31Var, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = str;
        this.c = m31Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4f)) {
            return false;
        }
        w4f w4fVar = (w4f) obj;
        return tpa.f(this.a, w4fVar.a) && tpa.f(this.b, w4fVar.b) && tpa.f(this.c, w4fVar.c) && this.d == w4fVar.d && this.e == w4fVar.e && this.f == w4fVar.f;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        m31 m31Var = this.c;
        return Boolean.hashCode(this.f) + ms2.d(ms2.d((iHashCode2 + (m31Var != null ? m31Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "UnavailableCallState(callDescription=" + ((Object) this.a) + ", callStateStatus=" + ((Object) this.b) + ", chatInfo=" + this.c + ", isCallBackAvailable=" + this.d + ", isVideoCall=" + this.e + ", isPrivacyReason=" + this.f + ")";
    }
}
