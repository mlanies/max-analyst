package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm5 implements la5 {
    public pa5 X;
    public yze Y;
    public f99 s0;
    public qm5 t0;
    public int u0;
    public int v0;
    public km5 w0;
    public int x0;
    public long y0;
    public final byte[] a = new byte[42];
    public final wpa b = new wpa(0, new byte[32768]);
    public final boolean c = false;
    public final lh4 o = new lh4();
    public int Z = 0;

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.X = pa5Var;
        this.Y = pa5Var.mo6B(0, 1);
        pa5Var.w();
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.Z = 0;
        } else {
            km5 km5Var = this.w0;
            if (km5Var != null) {
                km5Var.e(j2);
            }
        }
        this.y0 = j2 != 0 ? -1L : 0L;
        this.x0 = 0;
        this.b.D(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, byte, int] */
    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        qm5 qm5Var;
        pa5 pa5Var;
        v1d wd0Var;
        pa5 pa5Var2;
        long j;
        boolean z;
        long j2;
        boolean zB;
        ?? r1 = 0;
        int i = 2;
        int i2 = 1;
        int i3 = this.Z;
        f99 f99Var = null;
        if (i3 == 0) {
            boolean z2 = !this.c;
            ((sa4) na5Var).Y = 0;
            sa4 sa4Var = (sa4) na5Var;
            long jR = sa4Var.r();
            f99 f99VarB = new wd6(17).B(sa4Var, z2 ? null : bt6.l);
            if (f99VarB != null && f99VarB.a.length != 0) {
                f99Var = f99VarB;
            }
            sa4Var.z((int) (sa4Var.r() - jR));
            this.s0 = f99Var;
            this.Z = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i3 == 1) {
            ((sa4) na5Var).q(bArr, 0, bArr.length, false);
            ((sa4) na5Var).Y = 0;
            this.Z = 2;
            return 0;
        }
        if (i3 == 2) {
            wpa wpaVar = new wpa(4);
            ((sa4) na5Var).h(wpaVar.a, 0, 4, false);
            if (wpaVar.w() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.Z = 3;
            return 0;
        }
        if (i3 == 3) {
            qm5 qm5Var2 = this.t0;
            boolean z3 = false;
            while (!z3) {
                ((sa4) na5Var).Y = r1;
                byte[] bArr2 = new byte[4];
                s02 s02Var = new s02(bArr2, 4, i, (byte) r1);
                sa4 sa4Var2 = (sa4) na5Var;
                sa4Var2.q(bArr2, r1, 4, r1);
                boolean zH = s02Var.h();
                int i4 = s02Var.i(i);
                int i5 = s02Var.i(24) + 4;
                if (i4 == 0) {
                    byte[] bArr3 = new byte[38];
                    sa4Var2.h(bArr3, r1, 38, r1);
                    qm5Var = new qm5(bArr3, 4, i2);
                } else {
                    if (qm5Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i4 == 3) {
                        wpa wpaVar2 = new wpa(i5);
                        sa4Var2.h(wpaVar2.a, 0, i5, false);
                        qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, ft.s(wpaVar2), (f99) qm5Var2.m);
                    } else {
                        f99 f99Var2 = (f99) qm5Var2.m;
                        if (i4 == 4) {
                            wpa wpaVar3 = new wpa(i5);
                            sa4Var2.h(wpaVar3.a, 0, i5, false);
                            wpaVar3.H(4);
                            f99 f99VarB2 = m6d.B(Arrays.asList((String[]) m6d.J(wpaVar3, false, false).a));
                            if (f99Var2 != null) {
                                f99VarB2 = f99Var2.b(f99VarB2);
                            }
                            qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, (h7b) qm5Var2.l, f99VarB2);
                        } else if (i4 == 6) {
                            wpa wpaVar4 = new wpa(i5);
                            sa4Var2.h(wpaVar4.a, 0, i5, false);
                            wpaVar4.H(4);
                            f99 f99Var3 = new f99(zw6.n(sza.a(wpaVar4)));
                            if (f99Var2 != null) {
                                f99Var3 = f99Var2.b(f99Var3);
                            }
                            qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, (h7b) qm5Var2.l, f99Var3);
                        } else {
                            sa4Var2.z(i5);
                            int i6 = oaf.a;
                            this.t0 = qm5Var2;
                            z3 = zH;
                            r1 = 0;
                            i = 2;
                            i2 = 1;
                            i = 7;
                        }
                    }
                }
                qm5Var2 = qm5Var;
                int i62 = oaf.a;
                this.t0 = qm5Var2;
                z3 = zH;
                r1 = 0;
                i = 2;
                i2 = 1;
                i = 7;
            }
            this.t0.getClass();
            this.u0 = Math.max(this.t0.d, 6);
            yze yzeVar = this.Y;
            int i7 = oaf.a;
            yzeVar.e(this.t0.e(bArr, this.s0));
            this.Z = 4;
            return 0;
        }
        long j3 = 0;
        if (i3 == 4) {
            ((sa4) na5Var).Y = 0;
            wpa wpaVar5 = new wpa(2);
            sa4 sa4Var3 = (sa4) na5Var;
            sa4Var3.q(wpaVar5.a, 0, 2, false);
            int iA = wpaVar5.A();
            if ((iA >> 2) != 16382) {
                sa4Var3.Y = 0;
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            sa4Var3.Y = 0;
            this.v0 = iA;
            pa5 pa5Var3 = this.X;
            int i8 = oaf.a;
            long j4 = sa4Var3.o;
            this.t0.getClass();
            qm5 qm5Var3 = this.t0;
            if (((h7b) qm5Var3.l) != null) {
                wd0Var = new wd0(qm5Var3, j4, 1);
                pa5Var2 = pa5Var3;
            } else {
                long j5 = sa4Var3.c;
                if (j5 == -1 || qm5Var3.k <= 0) {
                    pa5Var = pa5Var3;
                    wd0Var = new wd0(qm5Var3.c());
                } else {
                    int i9 = this.v0;
                    q64 q64Var = new q64(27, qm5Var3);
                    im5 im5Var = new im5(qm5Var3, i9);
                    long jC = qm5Var3.c();
                    int i10 = qm5Var3.d;
                    int i11 = qm5Var3.e;
                    if (i11 > 0) {
                        pa5Var = pa5Var3;
                        j = ((i11 + i10) / 2) + 1;
                    } else {
                        pa5Var = pa5Var3;
                        int i12 = qm5Var3.c;
                        int i13 = qm5Var3.b;
                        j = (((((i13 != i12 || i13 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i13) * qm5Var3.h) * qm5Var3.i) / 8) + 64;
                    }
                    km5 km5Var = new km5(q64Var, im5Var, jC, qm5Var3.k, j4, j5, j, Math.max(6, i10));
                    this.w0 = km5Var;
                    wd0Var = (hm0) km5Var.c;
                }
                pa5Var2 = pa5Var;
            }
            pa5Var2.J(wd0Var);
            this.Z = 5;
            return 0;
        }
        if (i3 != 5) {
            throw new IllegalStateException();
        }
        this.Y.getClass();
        this.t0.getClass();
        km5 km5Var2 = this.w0;
        if (km5Var2 != null && ((im0) km5Var2.e) != null) {
            return km5Var2.b((sa4) na5Var, lh4Var);
        }
        if (this.y0 == -1) {
            qm5 qm5Var4 = this.t0;
            ((sa4) na5Var).Y = 0;
            sa4 sa4Var4 = (sa4) na5Var;
            sa4Var4.b(1, false);
            byte[] bArr4 = new byte[1];
            sa4Var4.q(bArr4, 0, 1, false);
            boolean z4 = (bArr4[0] & 1) == 1;
            sa4Var4.b(2, false);
            i = z4 ? 7 : 6;
            wpa wpaVar6 = new wpa(i);
            byte[] bArr5 = wpaVar6.a;
            int i14 = 0;
            while (i14 < i) {
                int iD = sa4Var4.d(i14, bArr5, i - i14);
                if (iD == -1) {
                    break;
                }
                i14 += iD;
            }
            wpaVar6.F(i14);
            sa4Var4.Y = 0;
            try {
                long jB = wpaVar6.B();
                if (!z4) {
                    jB *= qm5Var4.c;
                }
                j3 = jB;
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                throw ParserException.a(null, null);
            }
            this.y0 = j3;
            return 0;
        }
        wpa wpaVar7 = this.b;
        int i15 = wpaVar7.c;
        if (i15 < 32768) {
            int i16 = ((sa4) na5Var).read(wpaVar7.a, i15, 32768 - i15);
            z = i16 == -1;
            if (!z) {
                wpaVar7.F(i15 + i16);
            } else if (wpaVar7.a() == 0) {
                long j6 = this.y0 * 1000000;
                qm5 qm5Var5 = this.t0;
                int i17 = oaf.a;
                this.Y.a(j6 / qm5Var5.f, 1, this.x0, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i18 = wpaVar7.b;
        int i19 = this.x0;
        int i20 = this.u0;
        if (i19 < i20) {
            wpaVar7.H(Math.min(i20 - i19, wpaVar7.a()));
        }
        this.t0.getClass();
        int i21 = wpaVar7.b;
        while (true) {
            int i22 = wpaVar7.c - 16;
            lh4 lh4Var2 = this.o;
            if (i21 <= i22) {
                wpaVar7.G(i21);
                if (z7.b(wpaVar7, this.t0, this.v0, lh4Var2)) {
                    wpaVar7.G(i21);
                    j2 = lh4Var2.a;
                    break;
                }
                i21++;
            } else {
                if (z) {
                    while (true) {
                        int i23 = wpaVar7.c;
                        if (i21 > i23 - this.u0) {
                            wpaVar7.G(i23);
                            break;
                        }
                        wpaVar7.G(i21);
                        try {
                            zB = z7.b(wpaVar7, this.t0, this.v0, lh4Var2);
                        } catch (IndexOutOfBoundsException unused2) {
                            zB = false;
                        }
                        if (wpaVar7.b > wpaVar7.c) {
                            zB = false;
                        }
                        if (zB) {
                            wpaVar7.G(i21);
                            j2 = lh4Var2.a;
                            break;
                        }
                        i21++;
                    }
                } else {
                    wpaVar7.G(i21);
                }
                j2 = -1;
            }
        }
        int i24 = wpaVar7.b - i18;
        wpaVar7.G(i18);
        this.Y.b(wpaVar7, i24, 0);
        int i25 = i24 + this.x0;
        this.x0 = i25;
        if (j2 != -1) {
            long j7 = this.y0 * 1000000;
            qm5 qm5Var6 = this.t0;
            int i26 = oaf.a;
            this.Y.a(j7 / qm5Var6.f, 1, i25, 0, null);
            this.x0 = 0;
            this.y0 = j2;
        }
        if (wpaVar7.a() >= 16) {
            return 0;
        }
        int iA2 = wpaVar7.a();
        byte[] bArr6 = wpaVar7.a;
        System.arraycopy(bArr6, wpaVar7.b, bArr6, 0, iA2);
        wpaVar7.G(0);
        wpaVar7.F(iA2);
        return 0;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        sa4 sa4Var = (sa4) na5Var;
        f99 f99VarB = new wd6(17).B(sa4Var, bt6.l);
        if (f99VarB != null) {
            int length = f99VarB.a.length;
        }
        wpa wpaVar = new wpa(4);
        sa4Var.q(wpaVar.a, 0, 4, false);
        return wpaVar.w() == 1716281667;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
