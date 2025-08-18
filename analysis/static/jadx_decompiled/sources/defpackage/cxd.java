package defpackage;

/* loaded from: classes2.dex */
public final class cxd {
    public final String a = "<unknown>";
    public final String b = "DEF_SSL";
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final int k;
    public final long l;

    public cxd(long j, long j2, int i, long j3, long j4, int i2, long j5, long j6, int i3) {
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = j3;
        this.g = j4;
        this.h = i2;
        this.i = j5;
        this.j = j6;
        this.k = i3;
        this.l = j3 + j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxd)) {
            return false;
        }
        cxd cxdVar = (cxd) obj;
        return tpa.f(this.a, cxdVar.a) && tpa.f(this.b, cxdVar.b) && this.c == cxdVar.c && this.d == cxdVar.d && this.e == cxdVar.e && this.f == cxdVar.f && this.g == cxdVar.g && this.h == cxdVar.h && this.i == cxdVar.i && this.j == cxdVar.j && this.k == cxdVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + h4f.m(h4f.m(k7d.e(this.h, h4f.m(h4f.m(k7d.e(this.e, h4f.m(h4f.m(k7d.e(0, h4f.m(h4f.m(k7d.e(0, h4f.m(h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, 0L), 31, 0L), 31), 31, 0L), 31, 0L), 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SslProviderStat(");
        sb.append(this.b);
        sb.append("|v=");
        sb.append(this.a);
        sb.append("|init=0/0_0|scc=0/0_0|sfc=");
        sb.append(this.c);
        sb.append("/");
        sb.append(this.d);
        sb.append("_");
        sb.append(this.e);
        sb.append("|sh=");
        sb.append(this.i);
        sb.append("/");
        sb.append(this.j);
        sb.append("_");
        sb.append(this.k);
        sb.append("|sv=");
        sb.append(this.f);
        sb.append("/");
        sb.append(this.g);
        sb.append("_");
        return zr6.j(sb, this.h, ")");
    }
}
