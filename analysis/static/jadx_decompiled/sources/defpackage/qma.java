package defpackage;

/* loaded from: classes.dex */
public final class qma {
    public final md0 a;
    public final String b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final haf g;
    public final iaf h;
    public final boolean i;
    public final CharSequence j;

    public qma(md0 md0Var, String str, gg1 gg1Var, boolean z, boolean z2, boolean z3, haf hafVar, iaf iafVar, boolean z4, CharSequence charSequence) {
        this.a = md0Var;
        this.b = str;
        this.c = gg1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = hafVar;
        this.h = iafVar;
        this.i = z4;
        this.j = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qma)) {
            return false;
        }
        qma qmaVar = (qma) obj;
        return tpa.f(this.a, qmaVar.a) && tpa.f(this.b, qmaVar.b) && tpa.f(this.c, qmaVar.c) && this.d == qmaVar.d && this.e == qmaVar.e && this.f == qmaVar.f && tpa.f(this.g, qmaVar.g) && this.h == qmaVar.h && this.i == qmaVar.i && tpa.f(this.j, qmaVar.j);
    }

    public final int hashCode() {
        md0 md0Var = this.a;
        int iHashCode = (md0Var == null ? 0 : md0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gg1 gg1Var = this.c;
        int iD = ms2.d(ms2.d(ms2.d((iHashCode2 + (gg1Var == null ? 0 : gg1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        haf hafVar = this.g;
        int iD2 = ms2.d((this.h.hashCode() + ((iD + (hafVar == null ? 0 : hafVar.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        return iD2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "OpponentPipState(avatar=" + this.a + ", name=" + this.b + ", id=" + this.c + ", isTalking=" + this.d + ", isMicrophoneEnabled=" + this.e + ", isConnecting=" + this.f + ", videoState=" + this.g + ", action=" + this.h + ", isMe=" + this.i + ", userNameWithState=" + ((Object) this.j) + ")";
    }
}
