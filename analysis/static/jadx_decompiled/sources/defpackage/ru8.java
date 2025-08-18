package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ru8 {
    public final int A;
    public final long B;
    public final int C;
    public final int D;
    public final long E;
    public final List F;
    public final ix8 G;
    public final Long H;
    public final Boolean I;
    public final int J;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final iu8 h;
    public final vx8 i;
    public final long j;
    public final String k;
    public final String l;
    public final k8g m;
    public final int n;
    public final boolean o;
    public final int p;
    public final long q;
    public final boolean r;
    public final long s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public ru8(long j, long j2, long j3, long j4, long j5, long j6, String str, iu8 iu8Var, vx8 vx8Var, long j7, String str2, String str3, k8g k8gVar, int i, boolean z, int i2, long j8, boolean z2, long j9, String str4, String str5, long j10, long j11, int i3, long j12, int i4, int i5, int i6, long j13, int i7, int i8, long j14, List list, ix8 ix8Var, Long l, Boolean bool) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = iu8Var;
        this.i = vx8Var;
        this.j = j7;
        this.k = str2;
        this.l = str3;
        this.m = k8gVar;
        this.n = i;
        this.o = z;
        this.p = i2;
        this.q = j8;
        this.r = z2;
        this.s = j9;
        this.t = str4;
        this.u = str5;
        this.v = j10;
        this.w = j11;
        this.J = i3;
        this.x = j12;
        this.y = i4;
        this.z = i5;
        this.A = i6;
        this.B = j13;
        this.C = i7;
        this.D = i8;
        this.E = j14;
        this.F = list;
        this.G = ix8Var;
        this.H = l;
        this.I = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru8)) {
            return false;
        }
        ru8 ru8Var = (ru8) obj;
        return this.a == ru8Var.a && this.b == ru8Var.b && this.c == ru8Var.c && this.d == ru8Var.d && this.e == ru8Var.e && this.f == ru8Var.f && tpa.f(this.g, ru8Var.g) && this.h == ru8Var.h && this.i == ru8Var.i && this.j == ru8Var.j && tpa.f(this.k, ru8Var.k) && tpa.f(this.l, ru8Var.l) && tpa.f(this.m, ru8Var.m) && this.n == ru8Var.n && this.o == ru8Var.o && this.p == ru8Var.p && this.q == ru8Var.q && this.r == ru8Var.r && this.s == ru8Var.s && tpa.f(this.t, ru8Var.t) && tpa.f(this.u, ru8Var.u) && this.v == ru8Var.v && this.w == ru8Var.w && this.J == ru8Var.J && this.x == ru8Var.x && this.y == ru8Var.y && this.z == ru8Var.z && this.A == ru8Var.A && this.B == ru8Var.B && this.C == ru8Var.C && this.D == ru8Var.D && this.E == ru8Var.E && tpa.f(this.F, ru8Var.F) && tpa.f(this.G, ru8Var.G) && tpa.f(this.H, ru8Var.H) && tpa.f(this.I, ru8Var.I);
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iM2 = h4f.m((this.i.hashCode() + ((this.h.hashCode() + ((iM + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j);
        String str2 = this.k;
        int iHashCode = (iM2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        k8g k8gVar = this.m;
        int iM3 = h4f.m(ms2.d(h4f.m(k7d.e(this.p, ms2.d(k7d.e(this.n, (iHashCode2 + (k8gVar == null ? 0 : k8gVar.hashCode())) * 31, 31), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str4 = this.t;
        int iHashCode3 = (iM3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int iG = k7d.g(this.F, h4f.m(k7d.e(this.D, k7d.e(this.C, h4f.m(k7d.e(this.A, k7d.e(this.z, k7d.e(this.y, h4f.m(ey8.g(this.J, h4f.m(h4f.m((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.v), 31, this.w), 31), 31, this.x), 31), 31), 31), 31, this.B), 31), 31), 31, this.E), 31);
        ix8 ix8Var = this.G;
        int iHashCode4 = (iG + (ix8Var == null ? 0 : ix8Var.hashCode())) * 31;
        Long l = this.H;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.I;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MessageEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", updateTime=" + this.d + ", sender=" + this.e + ", cid=" + this.f + ", text=" + this.g + ", deliveryStatus=" + this.h + ", status=" + this.i + ", timeLocal=" + this.j + ", error=" + this.k + ", localizedError=" + this.l + ", attaches=" + this.m + ", mediaType=" + this.n + ", detectShare=" + this.o + ", messagesLinkType=" + this.p + ", messagesLinkId=" + this.q + ", insertedFromMessageLink=" + this.r + ", messagesLinkChatId=" + this.s + ", messageLinkChatName=" + this.t + ", messageLinkChatLink=" + this.u + ", messageLinkOutChatId=" + this.v + ", messageLinkOutMessageId=" + this.w + ", type=" + ey8.n(this.J) + ", chatId=" + this.x + ", ttl=" + this.y + ", channelViews=" + this.z + ", channelForwards=" + this.A + ", viewTime=" + this.B + ", zoom=" + this.C + ", options=" + this.D + ", liveUntil=" + this.E + ", elements=" + this.F + ", reactions=" + this.G + ", timeToFire=" + this.H + ", notifySender=" + this.I + ")";
    }
}
