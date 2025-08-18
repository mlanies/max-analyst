package defpackage;

/* loaded from: classes.dex */
public final class zx7 {
    public final md0 a;
    public final CharSequence b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final haf h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final CharSequence l;
    public final String m;

    public zx7(md0 md0Var, CharSequence charSequence, gg1 gg1Var, boolean z, boolean z2, boolean z3, boolean z4, haf hafVar, boolean z5, boolean z6, int i, CharSequence charSequence2, String str) {
        this.a = md0Var;
        this.b = charSequence;
        this.c = gg1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = hafVar;
        this.i = z5;
        this.j = z6;
        this.k = i;
        this.l = charSequence2;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx7)) {
            return false;
        }
        zx7 zx7Var = (zx7) obj;
        return tpa.f(this.a, zx7Var.a) && tpa.f(this.b, zx7Var.b) && tpa.f(this.c, zx7Var.c) && this.d == zx7Var.d && this.e == zx7Var.e && this.f == zx7Var.f && this.g == zx7Var.g && tpa.f(this.h, zx7Var.h) && this.i == zx7Var.i && this.j == zx7Var.j && this.k == zx7Var.k && tpa.f(this.l, zx7Var.l) && tpa.f(this.m, zx7Var.m);
    }

    public final int hashCode() {
        md0 md0Var = this.a;
        int iHashCode = (md0Var == null ? 0 : md0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        gg1 gg1Var = this.c;
        int iD = ms2.d(ms2.d(ms2.d(ms2.d((iHashCode2 + (gg1Var == null ? 0 : gg1Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        haf hafVar = this.h;
        int iG = ey8.g(this.k, ms2.d(ms2.d((iD + (hafVar == null ? 0 : hafVar.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        CharSequence charSequence2 = this.l;
        int iHashCode3 = (iG + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.m;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isConnectedOnce=");
        sb.append(this.e);
        sb.append(", isUserConnectionOnce=");
        sb.append(this.f);
        sb.append(", isConnecting=");
        sb.append(this.g);
        sb.append(", videoState=");
        sb.append(this.h);
        sb.append(", isMe=");
        sb.append(this.i);
        sb.append(", isRaiseHand=");
        sb.append(this.j);
        sb.append(", talkingState=");
        sb.append(k7d.p(this.k));
        sb.append(", label=");
        sb.append((Object) this.l);
        sb.append(", userNameAccessibility=");
        return zr6.l(sb, this.m, ")");
    }
}
