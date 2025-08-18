package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h3f implements ka5 {
    public final int a;
    public final List b;
    public final yaf c;
    public final SparseIntArray d;
    public final df4 e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final g3f i;
    public jm5 j;
    public oa5 k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public m3f p;
    public int q;
    public int r;

    public h3f() {
        int i = 0;
        sue sueVar = new sue(0L);
        ls5 ls5Var = zw6.b;
        this(1, sueVar, new df4(ffc.X, i, i));
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        jm5 jm5Var;
        long j3;
        np8.f(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sue sueVar = (sue) list.get(i);
            synchronized (sueVar) {
                j3 = sueVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jC = sueVar.c();
                z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
            }
            if (z) {
                sueVar.d(j2);
            }
        }
        if (j2 != 0 && (jm5Var = this.j) != null) {
            jm5Var.e(j2);
        }
        this.c.E(0);
        this.d.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i2 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((m3f) sparseArray.valueAt(i2)).a();
                i2++;
            }
        }
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.k = oa5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.ma5 r6) {
        /*
            r5 = this;
            yaf r5 = r5.c
            byte[] r5 = r5.a
            ra4 r6 = (defpackage.ra4) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.q(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.z(r1)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h3f.h(ma5):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        ?? r3;
        int i;
        ?? r2;
        long j;
        int i2;
        boolean z;
        long jX;
        long j2;
        long j3 = ((ra4) ma5Var).c;
        boolean z2 = this.m;
        int i3 = this.a;
        if (z2) {
            g3f g3fVar = this.i;
            if (j3 != -1 && i3 != 2 && !g3fVar.b) {
                int i4 = this.r;
                if (i4 <= 0) {
                    g3fVar.a((ra4) ma5Var);
                    return 0;
                }
                boolean z3 = g3fVar.d;
                yaf yafVar = (yaf) g3fVar.i;
                int i5 = g3fVar.a;
                if (!z3) {
                    ra4 ra4Var = (ra4) ma5Var;
                    long j4 = ra4Var.c;
                    int iMin = (int) Math.min(i5, j4);
                    long j5 = j4 - iMin;
                    if (ra4Var.o == j5) {
                        yafVar.E(iMin);
                        ra4Var.Y = 0;
                        ra4Var.q(yafVar.a, 0, iMin, false);
                        int i6 = yafVar.b;
                        int i7 = yafVar.c;
                        int i8 = i7 - 188;
                        while (true) {
                            if (i8 < i6) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = yafVar.a;
                            int i9 = -4;
                            int i10 = 0;
                            while (true) {
                                if (i9 > 4) {
                                    break;
                                }
                                int i11 = (i9 * 188) + i8;
                                if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                                    i10 = 0;
                                } else {
                                    i10++;
                                    if (i10 == 5) {
                                        long jX2 = s5c.X(yafVar, i8, i4);
                                        if (jX2 != -9223372036854775807L) {
                                            j2 = jX2;
                                            break;
                                        }
                                    }
                                }
                                i9++;
                            }
                            i8--;
                        }
                        g3fVar.f = j2;
                        g3fVar.d = true;
                        return 0;
                    }
                    lh4Var.a = j5;
                } else {
                    if (g3fVar.f == -9223372036854775807L) {
                        g3fVar.a((ra4) ma5Var);
                        return 0;
                    }
                    if (g3fVar.c) {
                        long j6 = g3fVar.e;
                        if (j6 == -9223372036854775807L) {
                            g3fVar.a((ra4) ma5Var);
                            return 0;
                        }
                        sue sueVar = (sue) g3fVar.h;
                        long jB = sueVar.b(g3fVar.f) - sueVar.b(j6);
                        g3fVar.g = jB;
                        if (jB < 0) {
                            g3fVar.g = -9223372036854775807L;
                        }
                        g3fVar.a((ra4) ma5Var);
                        return 0;
                    }
                    ra4 ra4Var2 = (ra4) ma5Var;
                    int iMin2 = (int) Math.min(i5, ra4Var2.c);
                    long j7 = 0;
                    if (ra4Var2.o == j7) {
                        yafVar.E(iMin2);
                        ra4Var2.Y = 0;
                        ra4Var2.q(yafVar.a, 0, iMin2, false);
                        int i12 = yafVar.b;
                        int i13 = yafVar.c;
                        while (true) {
                            if (i12 >= i13) {
                                jX = -9223372036854775807L;
                                break;
                            }
                            if (yafVar.a[i12] == 71) {
                                jX = s5c.X(yafVar, i12, i4);
                                if (jX != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i12++;
                        }
                        g3fVar.e = jX;
                        g3fVar.c = true;
                        return 0;
                    }
                    lh4Var.a = j7;
                }
                return 1;
            }
            if (this.n) {
                i = i3;
                j = j3;
            } else {
                this.n = true;
                long j8 = g3fVar.g;
                if (j8 != -9223372036854775807L) {
                    int i14 = this.r;
                    vu4 vu4Var = new vu4();
                    sue sueVar2 = (sue) g3fVar.h;
                    ty tyVar = new ty();
                    tyVar.a = i14;
                    tyVar.c = sueVar2;
                    tyVar.b = 112800;
                    tyVar.o = new yaf(3, false);
                    i = i3;
                    j = j3;
                    jm5 jm5Var = new jm5(vu4Var, tyVar, j8, j8 + 1, 0L, j3, 188L, 940);
                    this.j = jm5Var;
                    this.k.M((gm0) jm5Var.c);
                } else {
                    i = i3;
                    j = j3;
                    this.k.M(new pm5(j8));
                }
            }
            if (this.o) {
                z = false;
                this.o = false;
                d(0L, 0L);
                if (((ra4) ma5Var).o != 0) {
                    lh4Var.a = 0L;
                    return 1;
                }
            } else {
                z = false;
            }
            r3 = 1;
            r3 = 1;
            jm5 jm5Var2 = this.j;
            r2 = z;
            if (jm5Var2 != null) {
                r2 = z;
                if (((im0) jm5Var2.e) != null) {
                    return jm5Var2.a((ra4) ma5Var, lh4Var);
                }
            }
        } else {
            r3 = 1;
            i = i3;
            r2 = 0;
            j = j3;
        }
        yaf yafVar2 = this.c;
        byte[] bArr2 = yafVar2.a;
        if (9400 - yafVar2.b < 188) {
            int iC = yafVar2.c();
            if (iC > 0) {
                System.arraycopy(bArr2, yafVar2.b, bArr2, r2, iC);
            }
            yafVar2.F(iC, bArr2);
        }
        while (yafVar2.c() < 188) {
            int i15 = yafVar2.c;
            int i16 = ((ra4) ma5Var).read(bArr2, i15, 9400 - i15);
            if (i16 == -1) {
                return -1;
            }
            yafVar2.G(i15 + i16);
        }
        int i17 = yafVar2.b;
        int i18 = yafVar2.c;
        byte[] bArr3 = yafVar2.a;
        int i19 = i17;
        while (i19 < i18 && bArr3[i19] != 71) {
            i19++;
        }
        yafVar2.H(i19);
        int i20 = i19 + 188;
        if (i20 > i18) {
            int i21 = (i19 - i17) + this.q;
            this.q = i21;
            i2 = i;
            if (i2 == 2 && i21 > 376) {
                throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i2 = i;
            this.q = r2;
        }
        int i22 = yafVar2.c;
        if (i20 > i22) {
            return r2;
        }
        int iH = yafVar2.h();
        if ((8388608 & iH) != 0) {
            yafVar2.H(i20);
            return r2;
        }
        int i23 = (4194304 & iH) != 0 ? r3 : r2;
        int i24 = (2096896 & iH) >> 8;
        boolean z4 = (iH & 32) != 0 ? r3 : r2;
        m3f m3fVar = (iH & 16) != 0 ? (m3f) this.f.get(i24) : null;
        if (m3fVar == null) {
            yafVar2.H(i20);
            return r2;
        }
        if (i2 != 2) {
            int i25 = iH & 15;
            SparseIntArray sparseIntArray = this.d;
            int i26 = sparseIntArray.get(i24, i25 - 1);
            sparseIntArray.put(i24, i25);
            if (i26 == i25) {
                yafVar2.H(i20);
                return r2;
            }
            if (i25 != ((i26 + r3) & 15)) {
                m3fVar.a();
            }
        }
        if (z4) {
            int iV = yafVar2.v();
            i23 |= (yafVar2.v() & 64) != 0 ? 2 : r2;
            yafVar2.I(iV - r3);
        }
        boolean z5 = this.m;
        if (i2 == 2 || z5 || !this.h.get(i24, r2)) {
            yafVar2.G(i20);
            m3fVar.b(i23, yafVar2);
            yafVar2.G(i22);
        }
        if (i2 != 2 && !z5 && this.m && j != -1) {
            this.o = r3;
        }
        yafVar2.H(i20);
        return r2;
    }

    @Override // defpackage.ka5
    public final void release() {
    }

    public h3f(int i, sue sueVar, df4 df4Var) {
        this.e = df4Var;
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(sueVar);
        } else {
            this.b = Collections.singletonList(sueVar);
        }
        this.c = new yaf(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new g3f(0);
        this.k = oa5.u;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (m3f) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new g1d(new wva(this)));
        this.p = null;
    }
}
