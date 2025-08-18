package defpackage;

/* loaded from: classes2.dex */
public final class ci7 extends di7 {
    public final long a;
    public final Long b;
    public final Long c;
    public final kq3 d;
    public final dh6 e;
    public final def f;
    public final Long g;
    public final String h;

    public ci7(long j, Long l, Long l2, kq3 kq3Var, dh6 dh6Var, def defVar, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = kq3Var;
        this.e = dh6Var;
        this.f = defVar;
        this.g = l3;
        this.h = str;
    }

    @Override // defpackage.di7
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci7)) {
            return false;
        }
        ci7 ci7Var = (ci7) obj;
        return this.a == ci7Var.a && tpa.f(this.b, ci7Var.b) && tpa.f(this.c, ci7Var.c) && tpa.f(this.d, ci7Var.d) && tpa.f(this.e, ci7Var.e) && tpa.f(this.f, ci7Var.f) && tpa.f(this.g, ci7Var.g) && tpa.f(this.h, ci7Var.h);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        kq3 kq3Var = this.d;
        int iHashCode4 = (iHashCode3 + (kq3Var == null ? 0 : kq3Var.hashCode())) * 31;
        dh6 dh6Var = this.e;
        int iHashCode5 = (iHashCode4 + (dh6Var == null ? 0 : dh6Var.hashCode())) * 31;
        def defVar = this.f;
        int iHashCode6 = (iHashCode5 + (defVar == null ? 0 : defVar.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
