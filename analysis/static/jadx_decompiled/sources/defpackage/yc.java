package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yc implements ka5 {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int j;
    public long k;
    public oa5 l;
    public xze m;
    public u1d n;
    public boolean o;
    public final int b = 0;
    public final byte[] a = new byte[1];
    public int i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i = maf.a;
        Charset charset = b52.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public final int a(ra4 ra4Var) throws ParserException {
        boolean z;
        ra4Var.Y = 0;
        byte[] bArr = this.a;
        ra4Var.q(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid padding bits for frame header ");
            sb.append((int) b);
            throw ParserException.a(null, sb.toString());
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? q[i] : p[i];
        }
        String str = this.c ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i);
        throw ParserException.a(null, sb2.toString());
    }

    public final boolean b(ra4 ra4Var) {
        ra4Var.Y = 0;
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        ra4Var.q(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            ra4Var.z(bArr.length);
            return true;
        }
        ra4Var.Y = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        ra4Var.q(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        ra4Var.z(bArr3.length);
        return true;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (j != 0) {
            u1d u1dVar = this.n;
            if (u1dVar instanceof gi3) {
                this.k = (Math.max(0L, j - ((gi3) u1dVar).b) * 8000000) / r0.e;
                return;
            }
        }
        this.k = 0L;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.l = oa5Var;
        this.m = oa5Var.B(0, 1);
        oa5Var.w();
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        return b((ra4) ma5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r20, defpackage.lh4 r21) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
