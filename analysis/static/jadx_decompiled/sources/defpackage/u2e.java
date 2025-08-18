package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class u2e {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public u2e(long j, long j2, int i, int i2, String str, long j3, String str2, String str3, String str4, List list, int i3, long j4, String str5, boolean z, int i4, String str6) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = j3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i3;
        this.l = j4;
        this.m = str5;
        this.n = z;
        this.o = i4;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e)) {
            return false;
        }
        u2e u2eVar = (u2e) obj;
        return this.a == u2eVar.a && this.b == u2eVar.b && this.c == u2eVar.c && this.d == u2eVar.d && tpa.f(this.e, u2eVar.e) && this.f == u2eVar.f && tpa.f(this.g, u2eVar.g) && tpa.f(this.h, u2eVar.h) && tpa.f(this.i, u2eVar.i) && tpa.f(this.j, u2eVar.j) && this.k == u2eVar.k && this.l == u2eVar.l && tpa.f(this.m, u2eVar.m) && this.n == u2eVar.n && this.o == u2eVar.o && tpa.f(this.p, u2eVar.p);
    }

    public final int hashCode() {
        int iE = k7d.e(this.d, k7d.e(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        String str = this.e;
        int iM = h4f.m((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode = (iM + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iM2 = h4f.m(ey8.g(this.k, k7d.g(this.j, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.l);
        String str5 = this.m;
        int iG = ey8.g(this.o, ms2.d((iM2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31);
        String str6 = this.p;
        return iG + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerEntity(id=");
        sb.append(this.a);
        sb.append(", stickerId=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", mp4Url=");
        sb.append(this.g);
        sb.append(", firstUrl=");
        sb.append(this.h);
        sb.append(", previewUrl=");
        sb.append(this.i);
        sb.append(", tags=");
        sb.append(this.j);
        sb.append(", stickerType=");
        sb.append(k7d.s(this.k));
        sb.append(", setId=");
        sb.append(this.l);
        sb.append(", lottieUrl=");
        sb.append(this.m);
        sb.append(", audio=");
        sb.append(this.n);
        sb.append(", authorType=");
        sb.append(k7d.q(this.o));
        sb.append(", videoUrl=");
        return zr6.l(sb, this.p, ")");
    }
}
