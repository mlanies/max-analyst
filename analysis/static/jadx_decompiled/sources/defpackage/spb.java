package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class spb implements la5 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public long s0;
    public km5 t0;
    public pa5 u0;
    public boolean v0;
    public final tue a = new tue(0);
    public final wpa c = new wpa(4096);
    public final SparseArray b = new SparseArray();
    public final opb o = new opb(1);

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.u0 = pa5Var;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        long j3;
        tue tueVar = this.a;
        synchronized (tueVar) {
            j3 = tueVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = tueVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            tueVar.f(j2);
        }
        km5 km5Var = this.t0;
        if (km5Var != null) {
            km5Var.e(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            qpb qpbVar = (qpb) sparseArray.valueAt(i);
            qpbVar.f = false;
            qpbVar.a.a();
            i++;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        int i;
        long j;
        wpa wpaVar;
        dw4 kh6Var;
        long jE;
        long jE2;
        fm9.l(this.u0);
        long j2 = ((sa4) na5Var).c;
        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        int i3 = 1;
        opb opbVar = this.o;
        if (i2 != 0 && !opbVar.a) {
            boolean z = opbVar.c;
            wpa wpaVar2 = (wpa) opbVar.h;
            if (!z) {
                sa4 sa4Var = (sa4) na5Var;
                long j3 = sa4Var.c;
                int iMin = (int) Math.min(20000L, j3);
                long j4 = j3 - iMin;
                if (sa4Var.o != j4) {
                    lh4Var.a = j4;
                } else {
                    wpaVar2.D(iMin);
                    sa4Var.Y = 0;
                    sa4Var.q(wpaVar2.a, 0, iMin, false);
                    int i4 = wpaVar2.b;
                    int i5 = wpaVar2.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            jE2 = -9223372036854775807L;
                            break;
                        }
                        if (opb.d(i5, wpaVar2.a) == 442) {
                            wpaVar2.G(i5 + 4);
                            jE2 = opb.e(wpaVar2);
                            if (jE2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i5--;
                    }
                    opbVar.e = jE2;
                    opbVar.c = true;
                    i3 = 0;
                }
            } else {
                if (opbVar.e == -9223372036854775807L) {
                    opbVar.b((sa4) na5Var);
                    return 0;
                }
                if (opbVar.b) {
                    long j5 = opbVar.d;
                    if (j5 == -9223372036854775807L) {
                        opbVar.b((sa4) na5Var);
                        return 0;
                    }
                    tue tueVar = (tue) opbVar.g;
                    opbVar.f = tueVar.c(opbVar.e) - tueVar.b(j5);
                    opbVar.b((sa4) na5Var);
                    return 0;
                }
                sa4 sa4Var2 = (sa4) na5Var;
                int iMin2 = (int) Math.min(20000L, sa4Var2.c);
                long j6 = 0;
                if (sa4Var2.o != j6) {
                    lh4Var.a = j6;
                } else {
                    wpaVar2.D(iMin2);
                    sa4Var2.Y = 0;
                    sa4Var2.q(wpaVar2.a, 0, iMin2, false);
                    int i6 = wpaVar2.b;
                    int i7 = wpaVar2.c;
                    while (true) {
                        if (i6 >= i7 - 3) {
                            jE = -9223372036854775807L;
                            break;
                        }
                        if (opb.d(i6, wpaVar2.a) == 442) {
                            wpaVar2.G(i6 + 4);
                            jE = opb.e(wpaVar2);
                            if (jE != -9223372036854775807L) {
                                break;
                            }
                        }
                        i6++;
                    }
                    opbVar.d = jE;
                    opbVar.b = true;
                    i3 = 0;
                }
            }
            return i3;
        }
        if (this.v0) {
            i = i2;
            j = j2;
        } else {
            this.v0 = true;
            long j7 = opbVar.f;
            if (j7 != -9223372036854775807L) {
                i = i2;
                j = j2;
                km5 km5Var = new km5(new ob6(), new l7b((tue) opbVar.g), j7, j7 + 1, 0L, j2, 188L, 1000);
                this.t0 = km5Var;
                this.u0.J((hm0) km5Var.c);
            } else {
                i = i2;
                j = j2;
                this.u0.J(new wd0(j7));
            }
        }
        km5 km5Var2 = this.t0;
        if (km5Var2 != null && ((im0) km5Var2.e) != null) {
            return km5Var2.b((sa4) na5Var, lh4Var);
        }
        sa4 sa4Var3 = (sa4) na5Var;
        sa4Var3.Y = 0;
        long jR = i != 0 ? j - sa4Var3.r() : -1L;
        if (jR != -1 && jR < 4) {
            return -1;
        }
        wpa wpaVar3 = this.c;
        if (!sa4Var3.q(wpaVar3.a, 0, 4, true)) {
            return -1;
        }
        wpaVar3.G(0);
        int iG = wpaVar3.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            sa4Var3.q(wpaVar3.a, 0, 10, false);
            wpaVar3.G(9);
            sa4Var3.z((wpaVar3.u() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            sa4Var3.q(wpaVar3.a, 0, 2, false);
            wpaVar3.G(0);
            sa4Var3.z(wpaVar3.A() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            sa4Var3.z(1);
            return 0;
        }
        int i8 = iG & 255;
        SparseArray sparseArray = this.b;
        qpb qpbVar = (qpb) sparseArray.get(i8);
        if (!this.X) {
            if (qpbVar == null) {
                if (i8 == 189) {
                    kh6Var = new t3();
                    this.Y = true;
                    this.s0 = sa4Var3.o;
                } else if ((iG & 224) == 192) {
                    kh6Var = new he9(null, 0);
                    this.Y = true;
                    this.s0 = sa4Var3.o;
                } else if ((iG & 240) == 224) {
                    kh6Var = new kh6(null);
                    this.Z = true;
                    this.s0 = sa4Var3.o;
                } else {
                    kh6Var = null;
                }
                if (kh6Var != null) {
                    kh6Var.i(this.u0, new l3f(i8, 256, 1, (byte) 0));
                    qpbVar = new qpb(kh6Var, this.a);
                    sparseArray.put(i8, qpbVar);
                }
            }
            if (sa4Var3.o > ((this.Y && this.Z) ? this.s0 + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.X = true;
                this.u0.w();
            }
        }
        sa4Var3.q(wpaVar3.a, 0, 2, false);
        wpaVar3.G(0);
        int iA = wpaVar3.A() + 6;
        if (qpbVar == null) {
            sa4Var3.z(iA);
            return 0;
        }
        wpaVar3.D(iA);
        sa4Var3.h(wpaVar3.a, 0, iA, false);
        wpaVar3.G(6);
        s02 s02Var = qpbVar.c;
        wpaVar3.e(0, s02Var.b, 3);
        s02Var.q(0);
        s02Var.t(8);
        qpbVar.d = s02Var.h();
        qpbVar.e = s02Var.h();
        s02Var.t(6);
        wpaVar3.e(0, s02Var.b, s02Var.i(8));
        s02Var.q(0);
        qpbVar.g = 0L;
        if (qpbVar.d) {
            s02Var.t(4);
            s02Var.t(1);
            s02Var.t(1);
            long jI = (s02Var.i(3) << 30) | (s02Var.i(15) << 15) | s02Var.i(15);
            s02Var.t(1);
            boolean z2 = qpbVar.f;
            tue tueVar2 = qpbVar.b;
            if (z2 || !qpbVar.e) {
                wpaVar = wpaVar3;
            } else {
                s02Var.t(4);
                s02Var.t(1);
                wpaVar = wpaVar3;
                s02Var.t(1);
                s02Var.t(1);
                tueVar2.b((s02Var.i(3) << 30) | (s02Var.i(15) << 15) | s02Var.i(15));
                qpbVar.f = true;
            }
            qpbVar.g = tueVar2.b(jI);
        } else {
            wpaVar = wpaVar3;
        }
        long j8 = qpbVar.g;
        dw4 dw4Var = qpbVar.a;
        dw4Var.g(4, j8);
        dw4Var.d(wpaVar);
        dw4Var.e(false);
        wpaVar.F(wpaVar.a.length);
        return 0;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        ((sa4) na5Var).q(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.b(bArr[13] & 7, false);
        sa4Var.q(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
