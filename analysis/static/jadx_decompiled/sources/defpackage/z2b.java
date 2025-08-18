package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class z2b {
    public static final xj8 t = new xj8(new Object());
    public final lue a;
    public final xj8 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final sze h;
    public final l0f i;
    public final List j;
    public final xj8 k;
    public final boolean l;
    public final int m;
    public final b3b n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public z2b(lue lueVar, xj8 xj8Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, sze szeVar, l0f l0fVar, List list, xj8 xj8Var2, boolean z2, int i2, b3b b3bVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.a = lueVar;
        this.b = xj8Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = szeVar;
        this.i = l0fVar;
        this.j = list;
        this.k = xj8Var2;
        this.l = z2;
        this.m = i2;
        this.n = b3bVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }

    public static z2b h(l0f l0fVar) {
        eue eueVar = lue.a;
        xj8 xj8Var = t;
        return new z2b(eueVar, xj8Var, -9223372036854775807L, 0L, 1, null, false, sze.o, l0fVar, ffc.X, xj8Var, false, 0, b3b.o, 0L, 0L, 0L, false, false);
    }

    public final z2b a(xj8 xj8Var) {
        return new z2b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, xj8Var, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b b(xj8 xj8Var, long j, long j2, long j3, long j4, sze szeVar, l0f l0fVar, List list) {
        return new z2b(this.a, xj8Var, j2, j3, this.e, this.f, this.g, szeVar, l0fVar, list, this.k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    public final z2b c(boolean z) {
        return new z2b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public final z2b d(int i, boolean z) {
        return new z2b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b e(ExoPlaybackException exoPlaybackException) {
        return new z2b(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b f(int i) {
        return new z2b(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2b g(lue lueVar) {
        return new z2b(lueVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
