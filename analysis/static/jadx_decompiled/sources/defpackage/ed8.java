package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ed8 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public e5c i;
    public e5c j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public final gd8 a() {
        return new gd8(this);
    }

    public final void b(int i, byte[] bArr) {
        if (this.k != null) {
            Integer numValueOf = Integer.valueOf(i);
            int i2 = oaf.a;
            if (!numValueOf.equals(3) && oaf.a(this.l, 3)) {
                return;
            }
        }
        this.k = (byte[]) bArr.clone();
        this.l = Integer.valueOf(i);
    }

    public final void c(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void e(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void f(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void g(CharSequence charSequence) {
        this.z = charSequence;
    }

    public final void h(CharSequence charSequence) {
        this.A = charSequence;
    }

    public final void i(Long l) {
        fm9.f(l == null || l.longValue() >= 0);
        this.h = l;
    }

    public final void j(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final void k(Integer num) {
        this.u = num;
    }

    public final void l(Integer num) {
        this.t = num;
    }

    public final void m(Integer num) {
        this.s = num;
    }

    public final void n(Integer num) {
        this.x = num;
    }

    public final void o(Integer num) {
        this.w = num;
    }

    public final void p(Integer num) {
        this.v = num;
    }

    public final void q(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void r(Integer num) {
        this.o = num;
    }

    public final void s(Integer num) {
        this.n = num;
    }

    public final void t(CharSequence charSequence) {
        this.y = charSequence;
    }
}
