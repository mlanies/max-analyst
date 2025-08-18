package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* loaded from: classes.dex */
public abstract class vj0 implements q4b {
    public jgc B0;
    public int X;
    public j4b Y;
    public she Z;
    public final int b;
    public lgc o;
    public int s0;
    public grc t0;
    public qy5[] u0;
    public long v0;
    public long w0;
    public boolean y0;
    public boolean z0;
    public final Object a = new Object();
    public final y7g c = new y7g(18);
    public long x0 = Long.MIN_VALUE;
    public mue A0 = mue.a;

    public vj0(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static int h(int i) {
        return i & 384;
    }

    public static int i(int i) {
        return i & 64;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public final void A(qy5[] qy5VarArr, grc grcVar, long j, long j2, yj8 yj8Var) {
        fm9.k(!this.y0);
        this.t0 = grcVar;
        if (this.x0 == Long.MIN_VALUE) {
            this.x0 = j;
        }
        this.u0 = qy5VarArr;
        this.v0 = j2;
        x(qy5VarArr, j, j2);
    }

    public final void B() {
        fm9.k(this.s0 == 0);
        this.c.t();
        u();
    }

    public void C(float f, float f2) {
    }

    public abstract int D(qy5 qy5Var);

    public int E() {
        return 0;
    }

    @Override // defpackage.q4b
    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, qy5 qy5Var) {
        return e(mediaCodecUtil$DecoderQueryException, qy5Var, false, 4002);
    }

    public final ExoPlaybackException e(Throwable th, qy5 qy5Var, boolean z, int i) {
        int iD;
        if (qy5Var == null || this.z0) {
            iD = 4;
        } else {
            this.z0 = true;
            try {
                iD = D(qy5Var) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.z0 = false;
            }
        }
        return new ExoPlaybackException(1, th, i, k(), this.X, qy5Var, qy5Var == null ? 4 : iD, z);
    }

    public void g() {
    }

    public m78 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.x0 == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public void p() {
    }

    public void q(boolean z, boolean z2) {
    }

    public void r(long j, boolean z) {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(qy5[] qy5VarArr, long j, long j2);

    public final int y(y7g y7gVar, p54 p54Var, int i) {
        grc grcVar = this.t0;
        grcVar.getClass();
        int iJ = grcVar.j(y7gVar, p54Var, i);
        if (iJ == -4) {
            if (p54Var.f(4)) {
                this.x0 = Long.MIN_VALUE;
                return this.y0 ? -4 : -3;
            }
            long j = p54Var.Z + this.v0;
            p54Var.Z = j;
            this.x0 = Math.max(this.x0, j);
        } else if (iJ == -5) {
            qy5 qy5Var = (qy5) y7gVar.c;
            qy5Var.getClass();
            long j2 = qy5Var.s;
            if (j2 != Long.MAX_VALUE) {
                ny5 ny5VarA = qy5Var.a();
                ny5VarA.r = j2 + this.v0;
                y7gVar.c = ny5VarA.a();
            }
        }
        return iJ;
    }

    public abstract void z(long j, long j2);
}
