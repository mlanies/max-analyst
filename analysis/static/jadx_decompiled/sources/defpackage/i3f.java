package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i3f implements la5 {
    public boolean A0;
    public boolean B0;
    public n3f C0;
    public int D0;
    public int E0;
    public final SparseIntArray X;
    public final df4 Y;
    public final mbe Z;
    public final int a;
    public final int b;
    public final List c;
    public final wpa o;
    public final SparseArray s0;
    public final SparseBooleanArray t0;
    public final SparseBooleanArray u0;
    public final g3f v0;
    public km5 w0;
    public pa5 x0;
    public int y0;
    public boolean z0;

    public i3f(int i, int i2, mbe mbeVar, tue tueVar, df4 df4Var) {
        this.Y = df4Var;
        this.a = i;
        this.b = i2;
        this.Z = mbeVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(tueVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(tueVar);
        }
        this.o = new wpa(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.t0 = sparseBooleanArray;
        this.u0 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.s0 = sparseArray;
        this.X = new SparseIntArray();
        this.v0 = new g3f(1);
        this.x0 = pa5.v;
        this.E0 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (n3f) sparseArray2.valueAt(i3));
        }
        aab aabVar = new aab();
        aabVar.b = this;
        aabVar.a = new s02(new byte[4], 4, 2, (byte) 0);
        sparseArray.put(0, new h1d(aabVar));
        this.C0 = null;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        if ((this.b & 1) == 0) {
            pa5Var = new k8g(pa5Var, this.Z);
        }
        this.x0 = pa5Var;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        km5 km5Var;
        long j3;
        fm9.k(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tue tueVar = (tue) list.get(i);
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
        }
        if (j2 != 0 && (km5Var = this.w0) != null) {
            km5Var.e(j2);
        }
        this.o.D(0);
        this.X.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.s0;
            if (i2 >= sparseArray.size()) {
                this.D0 = 0;
                return;
            } else {
                ((n3f) sparseArray.valueAt(i2)).a();
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        ?? r2;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        long j2 = ((sa4) na5Var).c;
        int i5 = this.a;
        Object[] objArr = i5 == 2;
        if (this.z0) {
            long j3 = -9223372036854775807L;
            g3f g3fVar = this.v0;
            if (j2 != -1 && objArr != true && !g3fVar.b) {
                int i6 = this.E0;
                if (i6 <= 0) {
                    g3fVar.b((sa4) na5Var);
                    return 0;
                }
                boolean z = g3fVar.d;
                wpa wpaVar = (wpa) g3fVar.i;
                int i7 = g3fVar.a;
                if (!z) {
                    sa4 sa4Var = (sa4) na5Var;
                    long j4 = sa4Var.c;
                    int iMin = (int) Math.min(i7, j4);
                    long j5 = j4 - iMin;
                    if (sa4Var.o == j5) {
                        wpaVar.D(iMin);
                        sa4Var.Y = 0;
                        sa4Var.q(wpaVar.a, 0, iMin, false);
                        int i8 = wpaVar.b;
                        int i9 = wpaVar.c;
                        int i10 = i9 - 188;
                        while (true) {
                            if (i10 < i8) {
                                break;
                            }
                            byte[] bArr = wpaVar.a;
                            int i11 = -4;
                            int i12 = 0;
                            while (true) {
                                if (i11 > 4) {
                                    break;
                                }
                                int i13 = (i11 * 188) + i10;
                                if (i13 < i8 || i13 >= i9 || bArr[i13] != 71) {
                                    i12 = 0;
                                } else {
                                    i12++;
                                    if (i12 == 5) {
                                        long jC = wmd.C(wpaVar, i10, i6);
                                        if (jC != -9223372036854775807L) {
                                            j3 = jC;
                                            break;
                                        }
                                    }
                                }
                                i11++;
                            }
                            i10--;
                        }
                        g3fVar.f = j3;
                        g3fVar.d = true;
                        return 0;
                    }
                    lh4Var.a = j5;
                } else {
                    if (g3fVar.f == -9223372036854775807L) {
                        g3fVar.b((sa4) na5Var);
                        return 0;
                    }
                    if (g3fVar.c) {
                        long j6 = g3fVar.e;
                        if (j6 == -9223372036854775807L) {
                            g3fVar.b((sa4) na5Var);
                            return 0;
                        }
                        tue tueVar = (tue) g3fVar.h;
                        g3fVar.g = tueVar.c(g3fVar.f) - tueVar.b(j6);
                        g3fVar.b((sa4) na5Var);
                        return 0;
                    }
                    sa4 sa4Var2 = (sa4) na5Var;
                    int iMin2 = (int) Math.min(i7, sa4Var2.c);
                    long j7 = 0;
                    if (sa4Var2.o == j7) {
                        wpaVar.D(iMin2);
                        sa4Var2.Y = 0;
                        sa4Var2.q(wpaVar.a, 0, iMin2, false);
                        int i14 = wpaVar.b;
                        int i15 = wpaVar.c;
                        while (true) {
                            if (i14 >= i15) {
                                break;
                            }
                            if (wpaVar.a[i14] == 71) {
                                long jC2 = wmd.C(wpaVar, i14, i6);
                                if (jC2 != -9223372036854775807L) {
                                    j3 = jC2;
                                    break;
                                }
                            }
                            i14++;
                        }
                        g3fVar.e = j3;
                        g3fVar.c = true;
                        return 0;
                    }
                    lh4Var.a = j7;
                }
                return 1;
            }
            if (this.A0) {
                i = i5;
                j = j2;
            } else {
                this.A0 = true;
                long j8 = g3fVar.g;
                if (j8 != -9223372036854775807L) {
                    i = i5;
                    j = j2;
                    km5 km5Var = new km5(new ob6(), new f3f(this.E0, (tue) g3fVar.h), j8, j8 + 1, 0L, j2, 188L, 940);
                    this.w0 = km5Var;
                    this.x0.J((hm0) km5Var.c);
                } else {
                    i = i5;
                    j = j2;
                    this.x0.J(new wd0(j8));
                }
            }
            if (this.B0) {
                this.B0 = false;
                d(0L, 0L);
                if (((sa4) na5Var).o != 0) {
                    lh4Var.a = 0L;
                    return 1;
                }
            }
            r2 = 1;
            r2 = 1;
            km5 km5Var2 = this.w0;
            if (km5Var2 != null && ((im0) km5Var2.e) != null) {
                return km5Var2.b((sa4) na5Var, lh4Var);
            }
        } else {
            r2 = 1;
            i = i5;
            j = j2;
        }
        wpa wpaVar2 = this.o;
        byte[] bArr2 = wpaVar2.a;
        if (9400 - wpaVar2.b < 188) {
            int iA = wpaVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, wpaVar2.b, bArr2, 0, iA);
            }
            wpaVar2.E(iA, bArr2);
        }
        while (true) {
            int iA2 = wpaVar2.a();
            SparseArray sparseArray = this.s0;
            if (iA2 >= 188) {
                int i16 = wpaVar2.b;
                int i17 = wpaVar2.c;
                byte[] bArr3 = wpaVar2.a;
                int i18 = i16;
                while (i18 < i17 && bArr3[i18] != 71) {
                    i18++;
                }
                wpaVar2.G(i18);
                int i19 = i18 + 188;
                if (i19 > i17) {
                    int i20 = (i18 - i16) + this.D0;
                    this.D0 = i20;
                    i2 = i;
                    i3 = 2;
                    if (i2 == 2 && i20 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                    i4 = 0;
                } else {
                    i2 = i;
                    i3 = 2;
                    i4 = 0;
                    this.D0 = 0;
                }
                int i21 = wpaVar2.c;
                if (i19 > i21) {
                    return i4;
                }
                int iG = wpaVar2.g();
                if ((8388608 & iG) != 0) {
                    wpaVar2.G(i19);
                    return i4;
                }
                int i22 = (4194304 & iG) != 0 ? r2 : 0;
                int i23 = (2096896 & iG) >> 8;
                boolean z2 = (iG & 32) != 0 ? r2 : false;
                n3f n3fVar = (iG & 16) != 0 ? (n3f) sparseArray.get(i23) : null;
                if (n3fVar == null) {
                    wpaVar2.G(i19);
                    return 0;
                }
                if (i2 != i3) {
                    int i24 = iG & 15;
                    SparseIntArray sparseIntArray = this.X;
                    int i25 = sparseIntArray.get(i23, i24 - 1);
                    sparseIntArray.put(i23, i24);
                    if (i25 == i24) {
                        wpaVar2.G(i19);
                        return 0;
                    }
                    if (i24 != ((i25 + r2) & 15)) {
                        n3fVar.a();
                    }
                }
                if (z2) {
                    int iU = wpaVar2.u();
                    i22 |= (wpaVar2.u() & 64) != 0 ? i3 : 0;
                    wpaVar2.H(iU - r2);
                }
                boolean z3 = this.z0;
                if (i2 == i3 || z3 || !this.u0.get(i23, false)) {
                    wpaVar2.F(i19);
                    n3fVar.c(i22, wpaVar2);
                    wpaVar2.F(i21);
                }
                if (i2 != i3 && !z3 && this.z0 && j != -1) {
                    this.B0 = r2;
                }
                wpaVar2.G(i19);
                return 0;
            }
            int i26 = wpaVar2.c;
            int i27 = ((sa4) na5Var).read(bArr2, i26, 9400 - i26);
            if (i27 == -1) {
                for (int i28 = 0; i28 < sparseArray.size(); i28++) {
                    n3f n3fVar2 = (n3f) sparseArray.valueAt(i28);
                    if (n3fVar2 instanceof mua) {
                        mua muaVar = (mua) n3fVar2;
                        if (muaVar.c == 3 && muaVar.j == -1 && (objArr == false || !(muaVar.a instanceof kh6))) {
                            muaVar.c(r2, new wpa());
                        }
                    }
                }
                return -1;
            }
            wpaVar2.F(i26 + i27);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0 + 1;
     */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(defpackage.na5 r6) {
        /*
            r5 = this;
            wpa r5 = r5.o
            byte[] r5 = r5.a
            r0 = r6
            sa4 r0 = (defpackage.sa4) r0
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r0.q(r5, r1, r2, r1)
            r0 = r1
        Le:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L2c
            r2 = r1
        L13:
            r3 = 5
            if (r2 >= r3) goto L25
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L22
            int r0 = r0 + 1
            goto Le
        L22:
            int r2 = r2 + 1
            goto L13
        L25:
            sa4 r6 = (defpackage.sa4) r6
            r6.z(r0)
            r5 = 1
            return r5
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3f.n(na5):boolean");
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
