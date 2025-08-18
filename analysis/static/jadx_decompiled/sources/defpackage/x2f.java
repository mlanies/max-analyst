package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class x2f implements gef {
    public final de9 a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final Uri f;
    public final int g;
    public final int h;

    public x2f(de9 de9Var, long j, long j2, boolean z) {
        this.a = de9Var;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j2 - j;
        this.f = Uri.parse(de9Var.a);
        this.g = de9Var.b;
        this.h = de9Var.c;
    }

    @Override // defpackage.gef
    public final long c() {
        return this.e;
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
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2f)) {
            return false;
        }
        x2f x2fVar = (x2f) obj;
        return tpa.f(this.a, x2fVar.a) && this.b == x2fVar.b && this.c == x2fVar.c && this.d == x2fVar.d && this.e == x2fVar.e;
    }

    @Override // defpackage.gef
    public final int getHeight() {
        return this.h;
    }

    @Override // defpackage.gef
    public final int getWidth() {
        return this.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ms2.d(h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // defpackage.gef
    public final long k() {
        return this.c;
    }

    @Override // defpackage.gef
    public final Uri l() {
        return this.f;
    }

    @Override // defpackage.gef
    public final long m() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmedMp4VideoContent(item=");
        sb.append(this.a);
        sb.append(", startPosition=");
        sb.append(this.b);
        sb.append(", endPosition=");
        sb.append(this.c);
        sb.append(", isMute=");
        sb.append(this.d);
        sb.append(", duration=");
        return zr6.k(sb, this.e, ")");
    }
}
