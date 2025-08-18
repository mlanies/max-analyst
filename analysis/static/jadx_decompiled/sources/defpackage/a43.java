package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* loaded from: classes.dex */
public final class a43 implements zd8, xd8 {
    public long X;
    public long Y;
    public ClippingMediaSource$IllegalClippingException Z;
    public final zd8 a;
    public xd8 b;
    public y33[] c = new y33[0];
    public long o;

    public a43(zd8 zd8Var, boolean z, long j, long j2) {
        this.a = zd8Var;
        this.o = z ? j : -9223372036854775807L;
        this.X = j;
        this.Y = j2;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.o != -9223372036854775807L;
    }

    @Override // defpackage.xd8
    public final void e(zd8 zd8Var) {
        if (this.Z != null) {
            return;
        }
        xd8 xd8Var = this.b;
        xd8Var.getClass();
        xd8Var.e(this);
    }

    @Override // defpackage.j6d
    public final long f() {
        long jF = this.a.f();
        if (jF != Long.MIN_VALUE) {
            long j = this.Y;
            if (j == Long.MIN_VALUE || jF < j) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(defpackage.n85[] r16, boolean[] r17, defpackage.grc[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a43.g(n85[], boolean[], grc[], boolean[], long):long");
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        long j2 = this.X;
        if (j == j2) {
            return j2;
        }
        long jK = oaf.k(x1dVar.a, 0L, j - j2);
        long j3 = this.Y;
        long jK2 = oaf.k(x1dVar.b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != x1dVar.a || jK2 != x1dVar.b) {
            x1dVar = new x1d(jK, jK2);
        }
        return this.a.h(j, x1dVar);
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.b = xd8Var;
        this.a.i(this, j);
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        xd8 xd8Var = this.b;
        xd8Var.getClass();
        xd8Var.j(this);
    }

    @Override // defpackage.zd8
    public final void k() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Z;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.o = r0
            y33[] r0 = r5.c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            zd8 r0 = r5.a
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.X
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r5 = r5.Y
            r3 = -9223372036854775808
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L33
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L34
        L33:
            r2 = 1
        L34:
            defpackage.fm9.k(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a43.l(long):long");
    }

    @Override // defpackage.zd8
    public final long n() {
        if (b()) {
            long j = this.o;
            this.o = -9223372036854775807L;
            long jN = n();
            return jN != -9223372036854775807L ? jN : j;
        }
        long jN2 = this.a.n();
        if (jN2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        fm9.k(jN2 >= this.X);
        long j2 = this.Y;
        fm9.k(j2 == Long.MIN_VALUE || jN2 <= j2);
        return jN2;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        return this.a.o(qo7Var);
    }

    @Override // defpackage.zd8
    public final tze q() {
        return this.a.q();
    }

    @Override // defpackage.j6d
    public final long r() {
        long jR = this.a.r();
        if (jR != Long.MIN_VALUE) {
            long j = this.Y;
            if (j == Long.MIN_VALUE || jR < j) {
                return jR;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        this.a.t(j);
    }
}
