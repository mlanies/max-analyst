package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class a3b {
    public static final yj8 u = new yj8(new Object());
    public final mue a;
    public final yj8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final tze h;
    public final l0f i;
    public final List j;
    public final yj8 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final c3b o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public a3b(mue mueVar, yj8 yj8Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, tze tzeVar, l0f l0fVar, List list, yj8 yj8Var2, boolean z2, int i2, int i3, c3b c3bVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = mueVar;
        this.b = yj8Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = tzeVar;
        this.i = l0fVar;
        this.j = list;
        this.k = yj8Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = c3bVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static a3b i(l0f l0fVar) {
        fue fueVar = mue.a;
        yj8 yj8Var = u;
        return new a3b(fueVar, yj8Var, -9223372036854775807L, 0L, 1, null, false, tze.d, l0fVar, ffc.X, yj8Var, false, 1, 0, c3b.d, 0L, 0L, 0L, 0L, false);
    }

    public final a3b a() {
        return new a3b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.p);
    }

    public final a3b b(yj8 yj8Var) {
        return new a3b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, yj8Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b c(yj8 yj8Var, long j, long j2, long j3, long j4, tze tzeVar, l0f l0fVar, List list) {
        return new a3b(this.a, yj8Var, j2, j3, this.e, this.f, this.g, tzeVar, l0fVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final a3b d(int i, int i2, boolean z) {
        return new a3b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b e(ExoPlaybackException exoPlaybackException) {
        return new a3b(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b f(c3b c3bVar) {
        return new a3b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, c3bVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b g(int i) {
        return new a3b(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3b h(mue mueVar) {
        return new a3b(mueVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long j() {
        long j;
        long j2;
        if (!k()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return oaf.S(oaf.h0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
