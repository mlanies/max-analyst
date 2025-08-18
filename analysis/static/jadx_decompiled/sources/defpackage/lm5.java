package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lm5 implements ka5 {
    public oa5 e;
    public xze f;
    public e99 h;
    public qm5 i;
    public int j;
    public int k;
    public jm5 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final yaf b = new yaf(0, new byte[32768]);
    public final boolean c = false;
    public final lh4 d = new lh4();
    public int g = 0;

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            jm5 jm5Var = this.l;
            if (jm5Var != null) {
                jm5Var.e(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.E(0);
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.e = oa5Var;
        this.f = oa5Var.B(0, 1);
        oa5Var.w();
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        ra4 ra4Var = (ra4) ma5Var;
        e99 e99VarK = new sy4(17).K(ra4Var, at6.x0);
        if (e99VarK != null) {
            int length = e99VarK.a.length;
        }
        byte[] bArr = new byte[4];
        ra4Var.q(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r1v38 */
    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        e99 e99Var;
        qm5 qm5Var;
        e99 e99Var2;
        u1d pm5Var;
        long j;
        long j2;
        boolean z;
        long j3;
        boolean zK;
        int i = 1;
        int i2 = this.g;
        e99 e99Var3 = null;
        if (i2 == 0) {
            boolean z2 = !this.c;
            ((ra4) ma5Var).Y = 0;
            ra4 ra4Var = (ra4) ma5Var;
            long jR = ra4Var.r();
            e99 e99VarK = new sy4(17).K(ra4Var, z2 ? null : at6.x0);
            if (e99VarK != null && e99VarK.a.length != 0) {
                e99Var3 = e99VarK;
            }
            ra4Var.z((int) (ra4Var.r() - jR));
            this.h = e99Var3;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            ((ra4) ma5Var).q(bArr, 0, bArr.length, false);
            ((ra4) ma5Var).Y = 0;
            this.g = 2;
            return 0;
        }
        int i3 = 3;
        if (i2 == 2) {
            ((ra4) ma5Var).h(new byte[4], 0, 4, false);
            if ((((r3[2] & 255) << 8) | ((r3[0] & 255) << 24) | ((r3[1] & 255) << 16) | (r3[3] & 255)) != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        if (i2 == 3) {
            ?? r1 = 0;
            qm5 qm5Var2 = this.i;
            boolean z3 = false;
            while (!z3) {
                ((ra4) ma5Var).Y = r1;
                byte[] bArr2 = new byte[4];
                s02 s02Var = new s02(bArr2, 4, i, (byte) r1);
                ra4 ra4Var2 = (ra4) ma5Var;
                ra4Var2.q(bArr2, r1, 4, r1);
                boolean zH = s02Var.h();
                int i4 = s02Var.i(i);
                int i5 = s02Var.i(24) + 4;
                if (i4 == 0) {
                    byte[] bArr3 = new byte[38];
                    ra4Var2.h(bArr3, r1, 38, r1);
                    qm5Var2 = new qm5(bArr3, 4, r1);
                } else {
                    if (qm5Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i4 == i3) {
                        yaf yafVar = new yaf(i5);
                        ra4Var2.h(yafVar.a, r1, i5, r1);
                        qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, kp.t(yafVar), (e99) qm5Var2.m);
                    } else {
                        e99 e99Var4 = (e99) qm5Var2.m;
                        if (i4 == 4) {
                            yaf yafVar2 = new yaf(i5);
                            ra4Var2.h(yafVar2.a, 0, i5, false);
                            yafVar2.I(4);
                            e99 e99VarV = f8.v(Arrays.asList((String[]) f8.y(yafVar2, false, false).a));
                            if (e99Var4 == null) {
                                e99Var2 = e99VarV;
                            } else {
                                if (e99VarV != null) {
                                    c99[] c99VarArr = e99VarV.a;
                                    if (c99VarArr.length != 0) {
                                        int i6 = maf.a;
                                        c99[] c99VarArr2 = e99Var4.a;
                                        Object[] objArrCopyOf = Arrays.copyOf(c99VarArr2, c99VarArr2.length + c99VarArr.length);
                                        System.arraycopy(c99VarArr, 0, objArrCopyOf, c99VarArr2.length, c99VarArr.length);
                                        e99Var4 = new e99((c99[]) objArrCopyOf);
                                    }
                                }
                                e99Var2 = e99Var4;
                            }
                            qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, (va8) qm5Var2.l, e99Var2);
                        } else if (i4 == 6) {
                            yaf yafVar3 = new yaf(i5);
                            ra4Var2.h(yafVar3.a, 0, i5, false);
                            yafVar3.I(4);
                            e99 e99Var5 = new e99(zw6.n(rza.a(yafVar3)));
                            if (e99Var4 == null) {
                                e99Var = e99Var5;
                            } else {
                                c99[] c99VarArr3 = e99Var5.a;
                                if (c99VarArr3.length != 0) {
                                    int i7 = maf.a;
                                    c99[] c99VarArr4 = e99Var4.a;
                                    Object[] objArrCopyOf2 = Arrays.copyOf(c99VarArr4, c99VarArr4.length + c99VarArr3.length);
                                    System.arraycopy(c99VarArr3, 0, objArrCopyOf2, c99VarArr4.length, c99VarArr3.length);
                                    e99Var4 = new e99((c99[]) objArrCopyOf2);
                                }
                                e99Var = e99Var4;
                            }
                            qm5Var = new qm5(qm5Var2.b, qm5Var2.c, qm5Var2.d, qm5Var2.e, qm5Var2.f, qm5Var2.h, qm5Var2.i, qm5Var2.k, (va8) qm5Var2.l, e99Var);
                        } else {
                            ra4Var2.z(i5);
                        }
                    }
                    qm5Var2 = qm5Var;
                }
                int i8 = maf.a;
                this.i = qm5Var2;
                z3 = zH;
                r1 = 0;
                i = 1;
                i3 = 3;
                i = 7;
            }
            this.i.getClass();
            this.j = Math.max(this.i.d, 6);
            xze xzeVar = this.f;
            int i9 = maf.a;
            xzeVar.d(this.i.d(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long jD = 0;
        if (i2 == 4) {
            ((ra4) ma5Var).Y = 0;
            byte[] bArr4 = new byte[2];
            ra4 ra4Var3 = (ra4) ma5Var;
            ra4Var3.q(bArr4, 0, 2, false);
            int i10 = (bArr4[1] & 255) | ((bArr4[0] & 255) << 8);
            if ((i10 >> 2) != 16382) {
                ra4Var3.Y = 0;
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            ra4Var3.Y = 0;
            this.k = i10;
            oa5 oa5Var = this.e;
            int i11 = maf.a;
            long j4 = ra4Var3.o;
            this.i.getClass();
            qm5 qm5Var3 = this.i;
            if (((va8) qm5Var3.l) != null) {
                pm5Var = new pm5(qm5Var3, j4);
            } else {
                long j5 = ra4Var3.c;
                if (j5 == -1 || qm5Var3.k <= 0) {
                    pm5Var = new pm5(qm5Var3.c());
                } else {
                    int i12 = this.k;
                    q64 q64Var = new q64(26, qm5Var3);
                    jn jnVar = new jn(qm5Var3, i12);
                    long jC = qm5Var3.c();
                    int i13 = qm5Var3.d;
                    int i14 = qm5Var3.e;
                    if (i14 > 0) {
                        j = j4;
                        j2 = ((i14 + i13) / 2) + 1;
                    } else {
                        j = j4;
                        int i15 = qm5Var3.c;
                        int i16 = qm5Var3.b;
                        j2 = (((((i16 != i15 || i16 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i16) * qm5Var3.h) * qm5Var3.i) / 8) + 64;
                    }
                    jm5 jm5Var = new jm5(q64Var, jnVar, jC, qm5Var3.k, j, j5, j2, Math.max(6, i13));
                    this.l = jm5Var;
                    pm5Var = (gm0) jm5Var.c;
                }
            }
            oa5Var.M(pm5Var);
            this.g = 5;
            return 0;
        }
        if (i2 != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        jm5 jm5Var2 = this.l;
        if (jm5Var2 != null && ((im0) jm5Var2.e) != null) {
            return jm5Var2.a((ra4) ma5Var, lh4Var);
        }
        if (this.n == -1) {
            qm5 qm5Var4 = this.i;
            ((ra4) ma5Var).Y = 0;
            ra4 ra4Var4 = (ra4) ma5Var;
            ra4Var4.b(1, false);
            byte[] bArr5 = new byte[1];
            ra4Var4.q(bArr5, 0, 1, false);
            boolean z4 = (bArr5[0] & 1) == 1;
            ra4Var4.b(2, false);
            i = z4 ? 7 : 6;
            yaf yafVar4 = new yaf(i);
            byte[] bArr6 = yafVar4.a;
            int i17 = 0;
            while (i17 < i) {
                int iD = ra4Var4.d(i17, bArr6, i - i17);
                if (iD == -1) {
                    break;
                }
                i17 += iD;
            }
            yafVar4.G(i17);
            ra4Var4.Y = 0;
            try {
                jD = yafVar4.D();
                if (!z4) {
                    jD *= qm5Var4.c;
                }
            } catch (NumberFormatException unused) {
                i = 0;
            }
            if (i == 0) {
                throw ParserException.a(null, null);
            }
            this.n = jD;
            return 0;
        }
        yaf yafVar5 = this.b;
        int i18 = yafVar5.c;
        if (i18 < 32768) {
            int i19 = ((ra4) ma5Var).read(yafVar5.a, i18, 32768 - i18);
            z = i19 == -1;
            if (!z) {
                yafVar5.G(i18 + i19);
            } else if (yafVar5.c() == 0) {
                long j6 = this.n * 1000000;
                qm5 qm5Var5 = this.i;
                int i20 = maf.a;
                this.f.b(j6 / qm5Var5.f, 1, this.m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i21 = yafVar5.b;
        int i22 = this.m;
        int i23 = this.j;
        if (i22 < i23) {
            yafVar5.I(Math.min(i23 - i22, yafVar5.c()));
        }
        this.i.getClass();
        int i24 = yafVar5.b;
        while (true) {
            int i25 = yafVar5.c - 16;
            lh4 lh4Var2 = this.d;
            if (i24 <= i25) {
                yafVar5.H(i24);
                if (ngg.k(yafVar5, this.i, this.k, lh4Var2)) {
                    yafVar5.H(i24);
                    j3 = lh4Var2.a;
                    break;
                }
                i24++;
            } else {
                if (z) {
                    while (true) {
                        int i26 = yafVar5.c;
                        if (i24 > i26 - this.j) {
                            yafVar5.H(i26);
                            break;
                        }
                        yafVar5.H(i24);
                        try {
                            zK = ngg.k(yafVar5, this.i, this.k, lh4Var2);
                        } catch (IndexOutOfBoundsException unused2) {
                            zK = false;
                        }
                        if (yafVar5.b > yafVar5.c) {
                            zK = false;
                        }
                        if (zK) {
                            yafVar5.H(i24);
                            j3 = lh4Var2.a;
                            break;
                        }
                        i24++;
                    }
                } else {
                    yafVar5.H(i24);
                }
                j3 = -1;
            }
        }
        int i27 = yafVar5.b - i21;
        yafVar5.H(i21);
        this.f.c(i27, yafVar5);
        int i28 = i27 + this.m;
        this.m = i28;
        if (j3 != -1) {
            long j7 = this.n * 1000000;
            qm5 qm5Var6 = this.i;
            int i29 = maf.a;
            this.f.b(j7 / qm5Var6.f, 1, i28, 0, null);
            this.m = 0;
            this.n = j3;
        }
        if (yafVar5.c() >= 16) {
            return 0;
        }
        int iC = yafVar5.c();
        byte[] bArr7 = yafVar5.a;
        System.arraycopy(bArr7, yafVar5.b, bArr7, 0, iC);
        yafVar5.H(0);
        yafVar5.G(iC);
        return 0;
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
