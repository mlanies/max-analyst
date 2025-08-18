package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zc implements la5 {
    public static final int[] A0 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] B0;
    public static final byte[] C0;
    public static final byte[] D0;
    public static final int E0;
    public int X;
    public int Y;
    public boolean Z;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long o;
    public long s0;
    public int t0;
    public int u0;
    public long v0;
    public pa5 w0;
    public yze x0;
    public v1d y0;
    public boolean z0;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        B0 = iArr;
        int i = oaf.a;
        Charset charset = b52.c;
        C0 = "#!AMR\n".getBytes(charset);
        D0 = "#!AMR-WB\n".getBytes(charset);
        E0 = iArr[8];
    }

    public zc(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.t0 = -1;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.w0 = pa5Var;
        this.x0 = pa5Var.mo6B(0, 1);
        pa5Var.w();
    }

    public final int a(sa4 sa4Var) throws ParserException {
        boolean z;
        sa4Var.Y = 0;
        byte[] bArr = this.a;
        sa4Var.q(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? B0[i] : A0[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean b(sa4 sa4Var) {
        sa4Var.Y = 0;
        byte[] bArr = C0;
        byte[] bArr2 = new byte[bArr.length];
        sa4Var.q(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            sa4Var.z(bArr.length);
            return true;
        }
        sa4Var.Y = 0;
        byte[] bArr3 = D0;
        byte[] bArr4 = new byte[bArr3.length];
        sa4Var.q(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        sa4Var.z(bArr3.length);
        return true;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.o = 0L;
        this.X = 0;
        this.Y = 0;
        if (j != 0) {
            v1d v1dVar = this.y0;
            if (v1dVar instanceof hi3) {
                this.v0 = (Math.max(0L, j - ((hi3) v1dVar).b) * 8000000) / r0.X;
                return;
            }
        }
        this.v0 = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r20, defpackage.lh4 r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        return b((sa4) na5Var);
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
