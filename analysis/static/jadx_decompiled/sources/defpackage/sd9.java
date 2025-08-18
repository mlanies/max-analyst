package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class sd9 implements la5 {
    public static final hj8 F0 = new hj8(22);
    public int A0;
    public d2d B0;
    public boolean C0;
    public boolean D0;
    public long E0;
    public final ea6 X;
    public final wd6 Y;
    public final sk4 Z;
    public final int a;
    public final long b;
    public final wpa c;
    public final ie9 o;
    public pa5 s0;
    public yze t0;
    public yze u0;
    public int v0;
    public f99 w0;
    public long x0;
    public long y0;
    public long z0;

    public sd9(int i) {
        this(i, -9223372036854775807L);
    }

    public static long a(f99 f99Var) {
        if (f99Var == null) {
            return -9223372036854775807L;
        }
        int iD = f99Var.d();
        for (int i = 0; i < iD; i++) {
            d99 d99VarC = f99Var.c(i);
            if (d99VarC instanceof jpe) {
                jpe jpeVar = (jpe) d99VarC;
                if (jpeVar.a.equals("TLEN")) {
                    return oaf.S(Long.parseLong((String) jpeVar.c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.s0 = pa5Var;
        yze yzeVarMo6B = pa5Var.mo6B(0, 1);
        this.t0 = yzeVarMo6B;
        this.u0 = yzeVarMo6B;
        this.s0.w();
    }

    public final boolean b(sa4 sa4Var) {
        d2d d2dVar = this.B0;
        if (d2dVar != null) {
            long jA = d2dVar.a();
            if (jA != -1 && sa4Var.r() > jA - 4) {
                return true;
            }
        }
        try {
            return !sa4Var.q(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean c(sa4 sa4Var, boolean z) throws ParserException, EOFException, InterruptedIOException {
        int iR;
        int i;
        int iW;
        int i2 = z ? 32768 : 131072;
        sa4Var.Y = 0;
        if (sa4Var.o == 0) {
            f99 f99VarB = this.Y.B(sa4Var, (this.a & 8) == 0 ? null : F0);
            this.w0 = f99VarB;
            if (f99VarB != null) {
                this.X.b(f99VarB);
            }
            iR = (int) sa4Var.r();
            if (!z) {
                sa4Var.z(iR);
            }
            i = 0;
        } else {
            iR = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!b(sa4Var)) {
                wpa wpaVar = this.c;
                wpaVar.G(0);
                int iG = wpaVar.g();
                if ((i == 0 || ((-128000) & iG) == (i & (-128000))) && (iW = dy7.w(iG)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.o.a(iG);
                        i = iG;
                    }
                    sa4Var.b(iW - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        throw ParserException.a(null, "Searched too many bytes.");
                    }
                    if (z) {
                        sa4Var.Y = 0;
                        sa4Var.b(iR + i5, false);
                    } else {
                        sa4Var.z(1);
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
            sa4Var.z(iR + i4);
        } else {
            sa4Var.Y = 0;
        }
        this.v0 = i;
        return true;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.v0 = 0;
        this.x0 = -9223372036854775807L;
        this.y0 = 0L;
        this.A0 = 0;
        this.E0 = j2;
        d2d d2dVar = this.B0;
        if (!(d2dVar instanceof xz6) || ((xz6) d2dVar).d(j2)) {
            return;
        }
        this.D0 = true;
        this.u0 = this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r51, defpackage.lh4 r52) throws androidx.media3.common.ParserException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd9.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        return c((sa4) na5Var, true);
    }

    @Override // defpackage.la5
    public final void release() {
    }

    public sd9(int i, long j) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new wpa(10);
        this.o = new ie9(1);
        this.X = new ea6();
        this.x0 = -9223372036854775807L;
        this.Y = new wd6(17);
        sk4 sk4Var = new sk4();
        this.Z = sk4Var;
        this.u0 = sk4Var;
    }
}
