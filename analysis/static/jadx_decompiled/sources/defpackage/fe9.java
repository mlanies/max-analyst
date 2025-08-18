package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class fe9 implements gef {
    public final List a;
    public final uy b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final long h;
    public final Uri i;

    public fe9(List list, uy uyVar, long j, long j2, boolean z, int i, int i2) {
        this.a = list;
        this.b = uyVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = j2;
        this.i = list.isEmpty() ? Uri.EMPTY : Uri.parse(((de9) list.get(0)).a);
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
        return false;
    }

    @Override // defpackage.gef
    public final long d() {
        return 0L;
    }

    @Override // defpackage.gef
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe9)) {
            return false;
        }
        fe9 fe9Var = (fe9) obj;
        return tpa.f(this.a, fe9Var.a) && tpa.f(this.b, fe9Var.b) && this.c == fe9Var.c && this.d == fe9Var.d && this.e == fe9Var.e && this.f == fe9Var.f && this.g == fe9Var.g;
    }

    @Override // defpackage.gef
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.gef
    public final int getWidth() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uy uyVar = this.b;
        return Integer.hashCode(this.g) + k7d.e(this.f, ms2.d(h4f.m(h4f.m((iHashCode + (uyVar == null ? 0 : uyVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    @Override // defpackage.gef
    public final long k() {
        return this.h;
    }

    @Override // defpackage.gef
    public final Uri l() {
        return this.i;
    }

    @Override // defpackage.gef
    public final long m() {
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", isMute=");
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        return zr6.j(sb, this.g, ")");
    }
}
