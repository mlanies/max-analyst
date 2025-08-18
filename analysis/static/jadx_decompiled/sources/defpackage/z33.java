package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;

/* loaded from: classes.dex */
public final class z33 implements yd8, wd8 {
    public long X;
    public long Y;
    public ClippingMediaSource$IllegalClippingException Z;
    public final yd8 a;
    public wd8 b;
    public x33[] c = new x33[0];
    public long o;

    public z33(yd8 yd8Var, boolean z, long j, long j2) {
        this.a = yd8Var;
        this.o = z ? j : -9223372036854775807L;
        this.X = j;
        this.Y = j2;
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        long j2 = this.X;
        if (j == j2) {
            return j2;
        }
        long jK = maf.k(w1dVar.a, 0L, j - j2);
        long j3 = this.Y;
        long jK2 = maf.k(w1dVar.b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != w1dVar.a || jK2 != w1dVar.b) {
            w1dVar = new w1d(jK, jK2);
        }
        return this.a.A(j, w1dVar);
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.b = wd8Var;
        this.a.J(this, j);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    @Override // defpackage.yd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.m85[] r16, boolean[] r17, defpackage.frc[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.o != -9223372036854775807L;
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        wd8 wd8Var = this.b;
        wd8Var.getClass();
        wd8Var.c(this);
    }

    @Override // defpackage.wd8
    public final void d(yd8 yd8Var) {
        if (this.Z != null) {
            return;
        }
        wd8 wd8Var = this.b;
        wd8Var.getClass();
        wd8Var.d(this);
    }

    @Override // defpackage.i6d
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

    @Override // defpackage.yd8
    public final void k() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.Z;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // defpackage.yd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.o = r0
            x33[] r0 = r5.c
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
            yd8 r0 = r5.a
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
            defpackage.np8.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z33.l(long):long");
    }

    @Override // defpackage.yd8
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
        np8.f(jN2 >= this.X);
        long j2 = this.Y;
        np8.f(j2 == Long.MIN_VALUE || jN2 <= j2);
        return jN2;
    }

    @Override // defpackage.yd8
    public final sze q() {
        return this.a.q();
    }

    @Override // defpackage.i6d
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

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        this.a.t(j);
    }
}
