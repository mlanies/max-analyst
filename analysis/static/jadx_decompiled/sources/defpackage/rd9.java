package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class rd9 implements ka5 {
    public static final hj8 u = new hj8(21);
    public final int a;
    public final long b;
    public final yaf c;
    public final ie9 d;
    public final da6 e;
    public final sy4 f;
    public final dt4 g;
    public oa5 h;
    public xze i;
    public xze j;
    public int k;
    public e99 l;
    public long m;
    public long n;
    public long o;
    public int p;
    public c2d q;
    public boolean r;
    public boolean s;
    public long t;

    public rd9() {
        this(-9223372036854775807L);
    }

    public static long b(e99 e99Var) {
        if (e99Var == null) {
            return -9223372036854775807L;
        }
        for (c99 c99Var : e99Var.a) {
            if (c99Var instanceof ipe) {
                ipe ipeVar = (ipe) c99Var;
                if (ipeVar.a.equals("TLEN")) {
                    return maf.D(Long.parseLong(ipeVar.c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final ii3 a(ra4 ra4Var, boolean z) {
        yaf yafVar = this.c;
        ra4Var.q(yafVar.a, 0, 4, false);
        yafVar.H(0);
        int iH = yafVar.h();
        ie9 ie9Var = this.d;
        ie9Var.a(iH);
        return new ii3(ra4Var.c, ra4Var.o, ie9Var.g, ie9Var.d, z);
    }

    public final boolean c(ra4 ra4Var) {
        c2d c2dVar = this.q;
        if (c2dVar != null) {
            long jA = c2dVar.a();
            if (jA != -1 && ra4Var.r() > jA - 4) {
                return true;
            }
        }
        try {
            return !ra4Var.q(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        c2d c2dVar = this.q;
        if (!(c2dVar instanceof wz6) || ((wz6) c2dVar).d(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    public final boolean e(ra4 ra4Var, boolean z) throws ParserException, EOFException {
        int iR;
        int i;
        int iP;
        int i2 = z ? 32768 : 131072;
        ra4Var.Y = 0;
        if (ra4Var.o == 0) {
            e99 e99VarK = this.f.K(ra4Var, (this.a & 8) == 0 ? null : u);
            this.l = e99VarK;
            if (e99VarK != null) {
                this.e.b(e99VarK);
            }
            iR = (int) ra4Var.r();
            if (!z) {
                ra4Var.z(iR);
            }
            i = 0;
        } else {
            iR = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!c(ra4Var)) {
                yaf yafVar = this.c;
                yafVar.H(0);
                int iH = yafVar.h();
                if ((i == 0 || ((-128000) & iH) == (i & (-128000))) && (iP = ay7.p(iH)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(iH);
                        i = iH;
                    }
                    ra4Var.b(iP - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.a(null, "Searched too many bytes.");
                    }
                    if (z) {
                        ra4Var.Y = 0;
                        ra4Var.b(iR + i5, false);
                    } else {
                        ra4Var.z(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ra4Var.z(iR + i4);
        } else {
            ra4Var.Y = 0;
        }
        this.k = i;
        return true;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.h = oa5Var;
        xze xzeVarB = oa5Var.B(0, 1);
        this.i = xzeVarB;
        this.j = xzeVarB;
        this.h.w();
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        return e((ra4) ma5Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0281 A[PHI: r3
      0x0281: PHI (r3v27 da6) = (r3v26 da6), (r3v40 da6) binds: [B:96:0x0216, B:192:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r37, defpackage.lh4 r38) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd9.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }

    public rd9(long j) {
        this.a = 0;
        this.b = j;
        this.c = new yaf(10);
        this.d = new ie9(0);
        this.e = new da6();
        this.m = -9223372036854775807L;
        this.f = new sy4(17);
        dt4 dt4Var = new dt4();
        this.g = dt4Var;
        this.j = dt4Var;
    }
}
