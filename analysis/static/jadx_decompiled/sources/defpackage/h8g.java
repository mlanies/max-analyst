package defpackage;

import androidx.work.WorkRequest;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class h8g {
    public static final String u = a14.O("WorkSpec");
    public static final mu1 v = new mu1(17);
    public final String a;
    public m7g b;
    public final String c;
    public String d;
    public d24 e;
    public final d24 f;
    public long g;
    public long h;
    public long i;
    public kj3 j;
    public int k;
    public mf0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public jna r;
    public final int s;
    public final int t;

    public h8g(String str, m7g m7gVar, String str2, String str3, d24 d24Var, d24 d24Var2, long j, long j2, long j3, kj3 kj3Var, int i, mf0 mf0Var, long j4, long j5, long j6, long j7, boolean z, jna jnaVar, int i2, int i3) {
        this.a = str;
        this.b = m7gVar;
        this.c = str2;
        this.d = str3;
        this.e = d24Var;
        this.f = d24Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = kj3Var;
        this.k = i;
        this.l = mf0Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = jnaVar;
        this.s = i2;
        this.t = i3;
    }

    public static h8g b(h8g h8gVar, String str, m7g m7gVar, String str2, d24 d24Var, int i, long j, int i2, int i3) {
        String str3 = (i3 & 1) != 0 ? h8gVar.a : str;
        m7g m7gVar2 = (i3 & 2) != 0 ? h8gVar.b : m7gVar;
        String str4 = (i3 & 4) != 0 ? h8gVar.c : str2;
        String str5 = h8gVar.d;
        d24 d24Var2 = (i3 & 16) != 0 ? h8gVar.e : d24Var;
        d24 d24Var3 = h8gVar.f;
        long j2 = h8gVar.g;
        long j3 = h8gVar.h;
        long j4 = h8gVar.i;
        kj3 kj3Var = h8gVar.j;
        int i4 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? h8gVar.k : i;
        mf0 mf0Var = h8gVar.l;
        long j5 = h8gVar.m;
        long j6 = (i3 & 8192) != 0 ? h8gVar.n : j;
        long j7 = h8gVar.o;
        long j8 = h8gVar.p;
        boolean z = h8gVar.q;
        jna jnaVar = h8gVar.r;
        int i5 = h8gVar.s;
        int i6 = (i3 & 524288) != 0 ? h8gVar.t : i2;
        h8gVar.getClass();
        return new h8g(str3, m7gVar2, str4, str5, d24Var2, d24Var3, j2, j3, j4, kj3Var, i4, mf0Var, j5, j6, j7, j8, z, jnaVar, i5, i6);
    }

    public final long a() {
        int i;
        if (this.b == m7g.a && (i = this.k) > 0) {
            long jScalb = this.l == mf0.b ? this.m * i : (long) Math.scalb(this.m, i - 1);
            long j = this.n;
            if (jScalb > WorkRequest.MAX_BACKOFF_MILLIS) {
                jScalb = 18000000;
            }
            return jScalb + j;
        }
        if (!d()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        int i2 = this.s;
        long j2 = this.n;
        if (i2 == 0) {
            j2 += this.g;
        }
        long j3 = this.i;
        long j4 = this.h;
        if (j3 != j4) {
            j = i2 == 0 ? (-1) * j3 : 0L;
            j2 += j4;
        } else if (i2 != 0) {
            j = j4;
        }
        return j + j2;
    }

    public final boolean c() {
        return !kj3.i.equals(this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j) {
        String str = u;
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            a14.u().R(str, "Backoff delay duration exceeds maximum value");
        }
        if (j < WorkRequest.MIN_BACKOFF_MILLIS) {
            a14.u().R(str, "Backoff delay duration less than minimum value");
        }
        this.m = ote.f(j, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8g)) {
            return false;
        }
        h8g h8gVar = (h8g) obj;
        return tpa.f(this.a, h8gVar.a) && this.b == h8gVar.b && tpa.f(this.c, h8gVar.c) && tpa.f(this.d, h8gVar.d) && tpa.f(this.e, h8gVar.e) && tpa.f(this.f, h8gVar.f) && this.g == h8gVar.g && this.h == h8gVar.h && this.i == h8gVar.i && tpa.f(this.j, h8gVar.j) && this.k == h8gVar.k && this.l == h8gVar.l && this.m == h8gVar.m && this.n == h8gVar.n && this.o == h8gVar.o && this.p == h8gVar.p && this.q == h8gVar.q && this.r == h8gVar.r && this.s == h8gVar.s && this.t == h8gVar.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD = rh4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iM = h4f.m(h4f.m(h4f.m(h4f.m((this.l.hashCode() + k7d.e(this.k, (this.j.hashCode() + h4f.m(h4f.m(h4f.m((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.t) + k7d.e(this.s, (this.r.hashCode() + ((iM + i) * 31)) * 31, 31);
    }

    public final String toString() {
        return rh4.m(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public /* synthetic */ h8g(String str, m7g m7gVar, String str2, String str3, d24 d24Var, d24 d24Var2, long j, long j2, long j3, kj3 kj3Var, int i, mf0 mf0Var, long j4, long j5, long j6, long j7, boolean z, jna jnaVar, int i2, int i3, int i4) {
        this(str, (i3 & 2) != 0 ? m7g.a : m7gVar, str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? d24.b : d24Var, (i3 & 32) != 0 ? d24.b : d24Var2, (i3 & 64) != 0 ? 0L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? 0L : j3, (i3 & 512) != 0 ? kj3.i : kj3Var, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i, (i3 & 2048) != 0 ? mf0.a : mf0Var, (i3 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j4, (i3 & 8192) != 0 ? 0L : j5, (i3 & 16384) != 0 ? 0L : j6, (32768 & i3) != 0 ? -1L : j7, (65536 & i3) != 0 ? false : z, (131072 & i3) != 0 ? jna.a : jnaVar, (i3 & 262144) != 0 ? 0 : i2, 0);
    }
}
