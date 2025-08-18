package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;

/* loaded from: classes.dex */
public abstract class uj0 implements p4b {
    public i4b X;
    public int Y;
    public frc Z;
    public final int a;
    public kgc c;
    public int o;
    public oy5[] s0;
    public long t0;
    public boolean v0;
    public boolean w0;
    public final imc b = new imc(19);
    public long u0 = Long.MIN_VALUE;

    public uj0(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int f(int i) {
        return i & 128;
    }

    public static int g(int i) {
        return i & 64;
    }

    public abstract int A(oy5 oy5Var);

    public int B() {
        return 0;
    }

    @Override // defpackage.p4b
    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, oy5 oy5Var) {
        return e(mediaCodecUtil$DecoderQueryException, oy5Var, false, 4002);
    }

    public final ExoPlaybackException e(Exception exc, oy5 oy5Var, boolean z, int i) {
        int iA;
        if (oy5Var == null || this.w0) {
            iA = 4;
        } else {
            this.w0 = true;
            try {
                iA = A(oy5Var) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.w0 = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, i(), this.o, oy5Var, oy5Var == null ? 4 : iA, z);
    }

    public l78 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.u0 == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public void n(boolean z, boolean z2) {
    }

    public abstract void o(long j, boolean z);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public abstract void s(oy5[] oy5VarArr, long j, long j2);

    public final int v(imc imcVar, o54 o54Var, int i) {
        frc frcVar = this.Z;
        frcVar.getClass();
        int iG = frcVar.g(imcVar, o54Var, i);
        if (iG == -4) {
            if (o54Var.f(4)) {
                this.u0 = Long.MIN_VALUE;
                return this.v0 ? -4 : -3;
            }
            long j = o54Var.Y + this.t0;
            o54Var.Y = j;
            this.u0 = Math.max(this.u0, j);
        } else if (iG == -5) {
            oy5 oy5Var = (oy5) imcVar.c;
            oy5Var.getClass();
            long j2 = oy5Var.A0;
            if (j2 != Long.MAX_VALUE) {
                my5 my5VarA = oy5Var.a();
                my5VarA.o = j2 + this.t0;
                imcVar.c = my5VarA.a();
            }
        }
        return iG;
    }

    public abstract void w(long j, long j2);

    public final void x(oy5[] oy5VarArr, frc frcVar, long j, long j2) {
        np8.f(!this.v0);
        this.Z = frcVar;
        if (this.u0 == Long.MIN_VALUE) {
            this.u0 = j;
        }
        this.s0 = oy5VarArr;
        this.t0 = j2;
        s(oy5VarArr, j, j2);
    }

    public final void y() {
        np8.f(this.Y == 0);
        this.b.N();
        p();
    }

    public void z(float f, float f2) {
    }
}
