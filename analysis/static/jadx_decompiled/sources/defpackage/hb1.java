package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class hb1 implements kb1 {
    public final iaf A0;
    public final int B0;
    public final md0 X;
    public final boolean Y;
    public final boolean Z;
    public final gg1 a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final haf z0;

    public hb1(gg1 gg1Var, String str, SpannableStringBuilder spannableStringBuilder, String str2, md0 md0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, haf hafVar, iaf iafVar, int i) {
        this.a = gg1Var;
        this.b = str;
        this.c = spannableStringBuilder;
        this.o = str2;
        this.X = md0Var;
        this.Y = z;
        this.Z = z2;
        this.s0 = z3;
        this.t0 = z4;
        this.u0 = z5;
        this.v0 = z6;
        this.w0 = z7;
        this.x0 = z8;
        this.y0 = z9;
        this.z0 = hafVar;
        this.A0 = iafVar;
        this.B0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb1)) {
            return false;
        }
        hb1 hb1Var = (hb1) obj;
        return tpa.f(this.a, hb1Var.a) && tpa.f(this.b, hb1Var.b) && tpa.f(this.c, hb1Var.c) && tpa.f(this.o, hb1Var.o) && tpa.f(this.X, hb1Var.X) && this.Y == hb1Var.Y && this.Z == hb1Var.Z && this.s0 == hb1Var.s0 && this.t0 == hb1Var.t0 && this.u0 == hb1Var.u0 && this.v0 == hb1Var.v0 && this.w0 == hb1Var.w0 && this.x0 == hb1Var.x0 && this.y0 == hb1Var.y0 && tpa.f(this.z0, hb1Var.z0) && this.A0 == hb1Var.A0 && this.B0 == hb1Var.B0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.a.a == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        md0 md0Var = this.X;
        int iD = ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d((iHashCode4 + (md0Var == null ? 0 : md0Var.hashCode())) * 31, 31, this.Y), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31, this.v0), 31, this.w0), 31, this.x0), 31, this.y0);
        haf hafVar = this.z0;
        return au1.s(this.B0) + ((this.A0.hashCode() + ((iD + (hafVar != null ? hafVar.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        hb1 hb1Var = (hb1) ((ol7) obj);
        kl7 kl7VarL = j1e.l();
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = hb1Var.c;
        boolean zF = tpa.f(charSequence, charSequence2);
        String str = hb1Var.o;
        if (!zF || !tpa.f(this.o, str)) {
            kl7VarL.add(new cb1((SpannableStringBuilder) charSequence2, str));
        }
        boolean z = this.s0;
        boolean z2 = hb1Var.s0;
        if (z != z2) {
            kl7VarL.add(new bb1(z2));
        }
        boolean z3 = this.Y;
        boolean z4 = hb1Var.Y;
        if (z3 != z4) {
            kl7VarL.add(new eb1(z4));
        }
        md0 md0Var = this.X;
        md0 md0Var2 = hb1Var.X;
        if (!tpa.f(md0Var, md0Var2)) {
            kl7VarL.add(new za1(md0Var2));
        }
        iaf iafVar = this.A0;
        iaf iafVar2 = hb1Var.A0;
        if (iafVar != iafVar2) {
            kl7VarL.add(new ab1(iafVar2));
        }
        haf hafVar = this.z0;
        haf hafVar2 = hb1Var.z0;
        if (!tpa.f(hafVar, hafVar2)) {
            kl7VarL.add(new fb1(hafVar2));
        }
        boolean z5 = this.v0;
        boolean z6 = hb1Var.v0;
        if (z5 != z6) {
            kl7VarL.add(new db1(z6));
        }
        return j1e.d(kl7VarL);
    }

    public final String toString() {
        return "CallOpponentState(opponentId=" + this.a + ", userName=" + this.b + ", userNameWithState=" + ((Object) this.c) + ", userNameAccessibility=" + this.o + ", avatar=" + this.X + ", isTalking=" + this.Y + ", isConnectedOnce=" + this.Z + ", isConnecting=" + this.s0 + ", isVideoEnabled=" + this.t0 + ", isMicrophoneEnabled=" + this.u0 + ", isRaiseHand=" + this.v0 + ", isMe=" + this.w0 + ", isAdmin=" + this.x0 + ", isCreator=" + this.y0 + ", videoState=" + this.z0 + ", buttonAction=" + this.A0 + ", talkingState=" + k7d.p(this.B0) + ")";
    }
}
