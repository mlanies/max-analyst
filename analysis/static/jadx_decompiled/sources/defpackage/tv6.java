package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class tv6 extends vj0 {
    public final ku6 C0;
    public final p54 D0;
    public final ArrayDeque E0;
    public boolean F0;
    public boolean G0;
    public sv6 H0;
    public long I0;
    public long J0;
    public int K0;
    public int L0;
    public qy5 M0;
    public vn0 N0;
    public p54 O0;
    public dv6 P0;
    public Bitmap Q0;
    public boolean R0;
    public mx1 S0;
    public mx1 T0;
    public int U0;

    public tv6(o9g o9gVar) {
        super(4);
        this.C0 = o9gVar;
        this.P0 = dv6.a;
        this.D0 = new p54(0);
        this.H0 = sv6.c;
        this.E0 = new ArrayDeque();
        this.J0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.K0 = 0;
        this.L0 = 1;
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) {
        return ((o9g) this.C0).D(qy5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(long r13) throws androidx.media3.exoplayer.ExoPlaybackException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.F(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.G(long):boolean");
    }

    public final void H() throws ExoPlaybackException, InterruptedException {
        qy5 qy5Var = this.M0;
        o9g o9gVar = (o9g) this.C0;
        int iD = o9gVar.D(qy5Var);
        if (iD != vj0.b(4, 0, 0, 0) && iD != vj0.b(3, 0, 0, 0)) {
            throw e(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.M0, false, 4005);
        }
        vn0 vn0Var = this.N0;
        if (vn0Var != null) {
            vn0Var.release();
        }
        this.N0 = new vn0((un0) o9gVar.b);
    }

    public final void J() throws InterruptedException {
        this.O0 = null;
        this.K0 = 0;
        this.J0 = -9223372036854775807L;
        vn0 vn0Var = this.N0;
        if (vn0Var != null) {
            vn0Var.release();
            this.N0 = null;
        }
    }

    @Override // defpackage.vj0, defpackage.q4b
    public final void a(int i, Object obj) {
        if (i != 15) {
            return;
        }
        dv6 dv6Var = obj instanceof dv6 ? (dv6) obj : null;
        if (dv6Var == null) {
            dv6Var = dv6.a;
        }
        this.P0 = dv6Var;
    }

    @Override // defpackage.vj0
    public final String k() {
        return "ImageRenderer";
    }

    @Override // defpackage.vj0
    public final boolean m() {
        return this.G0;
    }

    @Override // defpackage.vj0
    public final boolean o() {
        int i = this.L0;
        return i == 3 || (i == 0 && this.R0);
    }

    @Override // defpackage.vj0
    public final void p() throws InterruptedException {
        this.M0 = null;
        this.H0 = sv6.c;
        this.E0.clear();
        J();
        this.P0.getClass();
    }

    @Override // defpackage.vj0
    public final void q(boolean z, boolean z2) {
        this.L0 = z2 ? 1 : 0;
    }

    @Override // defpackage.vj0
    public final void r(long j, boolean z) {
        this.L0 = Math.min(this.L0, 1);
        this.G0 = false;
        this.F0 = false;
        this.Q0 = null;
        this.S0 = null;
        this.T0 = null;
        this.R0 = false;
        this.O0 = null;
        vn0 vn0Var = this.N0;
        if (vn0Var != null) {
            vn0Var.flush();
        }
        this.E0.clear();
    }

    @Override // defpackage.vj0
    public final void s() throws InterruptedException {
        J();
    }

    @Override // defpackage.vj0
    public final void u() throws InterruptedException {
        J();
        this.L0 = Math.min(this.L0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // defpackage.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.qy5[] r6, long r7, long r9) {
        /*
            r5 = this;
            sv6 r6 = r5.H0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.E0
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.J0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.I0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            sv6 r7 = new sv6
            long r0 = r5.J0
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            sv6 r6 = new sv6
            r6.<init>(r0, r9)
            r5.H0 = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv6.x(qy5[], long, long):void");
    }

    @Override // defpackage.vj0
    public final void z(long j, long j2) throws ExoPlaybackException, InterruptedException {
        if (this.G0) {
            return;
        }
        if (this.M0 == null) {
            y7g y7gVar = this.c;
            y7gVar.t();
            p54 p54Var = this.D0;
            p54Var.v();
            int iY = y(y7gVar, p54Var, 2);
            if (iY != -5) {
                if (iY == -4) {
                    fm9.k(p54Var.f(4));
                    this.F0 = true;
                    this.G0 = true;
                    return;
                }
                return;
            }
            qy5 qy5Var = (qy5) y7gVar.c;
            fm9.l(qy5Var);
            this.M0 = qy5Var;
            H();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (F(j)) {
            }
            while (G(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw e(e, null, false, 4003);
        }
    }
}
