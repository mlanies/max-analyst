package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class c24 implements gef {
    public final String a;
    public final uy b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final Uri j;
    public final long k;

    public c24(int i, int i2, long j, long j2, long j3, uy uyVar, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = uyVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
        this.j = Uri.parse(str);
        this.k = j2;
    }

    @Override // defpackage.gef
    public final gef a(long j) {
        String str = this.a;
        uy uyVar = this.b;
        return new c24(this.h, this.i, this.c, this.d, j, uyVar, str, this.f, this.g);
    }

    @Override // defpackage.gef
    public final uy b() {
        return this.b;
    }

    @Override // defpackage.gef
    public final long c() {
        return this.d;
    }

    @Override // defpackage.gef
    public final boolean c0() {
        return this.f;
    }

    @Override // defpackage.gef
    public final long d() {
        return this.e;
    }

    @Override // defpackage.gef
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c24)) {
            return false;
        }
        c24 c24Var = (c24) obj;
        return tpa.f(this.a, c24Var.a) && tpa.f(this.b, c24Var.b) && this.c == c24Var.c && this.d == c24Var.d && this.e == c24Var.e && this.f == c24Var.f && this.g == c24Var.g && this.h == c24Var.h && this.i == c24Var.i;
    }

    @Override // defpackage.gef
    public final int getHeight() {
        return this.i;
    }

    @Override // defpackage.gef
    public final int getWidth() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uy uyVar = this.b;
        return Integer.hashCode(this.i) + k7d.e(this.h, ms2.d(ms2.d(h4f.m(h4f.m(h4f.m((iHashCode + (uyVar == null ? 0 : uyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    @Override // defpackage.gef
    public final long k() {
        return this.k;
    }

    @Override // defpackage.gef
    public final Uri l() {
        return this.j;
    }

    @Override // defpackage.gef
    public final long m() {
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", initSeekPos=");
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        return zr6.j(sb, this.i, ")");
    }
}
