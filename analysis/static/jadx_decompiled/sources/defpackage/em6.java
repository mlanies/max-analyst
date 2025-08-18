package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class em6 implements yd8, fn6, g6d {
    public final i4b A0;
    public wd8 B0;
    public int C0;
    public sze D0;
    public sn6[] E0;
    public sn6[] F0;
    public int G0;
    public rxd H0;
    public final sr4 X;
    public final kr4 Y;
    public final buc Z;
    public final zl6 a;
    public final hb4 b;
    public final gaa c;
    public final y0f o;
    public final gk8 s0;
    public final n64 t0;
    public final IdentityHashMap u0;
    public final o9g v0;
    public final mq9 w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    public em6(zl6 zl6Var, hb4 hb4Var, gaa gaaVar, y0f y0fVar, sr4 sr4Var, kr4 kr4Var, buc bucVar, gk8 gk8Var, n64 n64Var, mq9 mq9Var, boolean z, int i, boolean z2, i4b i4bVar) {
        this.a = zl6Var;
        this.b = hb4Var;
        this.c = gaaVar;
        this.o = y0fVar;
        this.X = sr4Var;
        this.Y = kr4Var;
        this.Z = bucVar;
        this.s0 = gk8Var;
        this.t0 = n64Var;
        this.w0 = mq9Var;
        this.x0 = z;
        this.y0 = i;
        this.z0 = z2;
        this.A0 = i4bVar;
        mq9Var.getClass();
        this.H0 = new rxd(10, new i6d[0]);
        this.u0 = new IdentityHashMap();
        this.v0 = new o9g(28);
        this.E0 = new sn6[0];
        this.F0 = new sn6[0];
    }

    public static oy5 h(oy5 oy5Var, oy5 oy5Var2, boolean z) {
        String strQ;
        e99 e99Var;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (oy5Var2 != null) {
            strQ = oy5Var2.t0;
            e99Var = oy5Var2.u0;
            i2 = oy5Var2.J0;
            i = oy5Var2.o;
            i3 = oy5Var2.X;
            str = oy5Var2.c;
            str2 = oy5Var2.b;
        } else {
            strQ = maf.q(1, oy5Var.t0);
            e99Var = oy5Var.u0;
            if (z) {
                i2 = oy5Var.J0;
                i = oy5Var.o;
                i3 = oy5Var.X;
                str = oy5Var.c;
                str2 = oy5Var.b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        String strC = ha9.c(strQ);
        int i4 = z ? oy5Var.Y : -1;
        int i5 = z ? oy5Var.Z : -1;
        my5 my5Var = new my5();
        my5Var.a = oy5Var.a;
        my5Var.b = str2;
        my5Var.j = oy5Var.v0;
        my5Var.k = strC;
        my5Var.h = strQ;
        my5Var.i = e99Var;
        my5Var.f = i4;
        my5Var.g = i5;
        my5Var.x = i2;
        my5Var.d = i;
        my5Var.e = i3;
        my5Var.c = str;
        return new oy5(my5Var);
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        sn6[] sn6VarArr = this.F0;
        int length = sn6VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            sn6 sn6Var = sn6VarArr[i];
            if (sn6Var.L0 == 2) {
                wl6 wl6Var = sn6Var.o;
                int iB = wl6Var.q.b();
                Uri[] uriArr = wl6Var.e;
                int length2 = uriArr.length;
                hb4 hb4Var = wl6Var.g;
                pm6 pm6VarA = (iB >= length2 || iB == -1) ? null : hb4Var.a(uriArr[wl6Var.q.i()], true);
                if (pm6VarA != null) {
                    zw6 zw6Var = pm6VarA.r;
                    if (!zw6Var.isEmpty() && pm6VarA.c) {
                        long j2 = pm6VarA.h - hb4Var.Z;
                        long j3 = j - j2;
                        int iE = maf.e(Long.valueOf(j3), zw6Var, true);
                        long j4 = ((km6) zw6Var.get(iE)).X;
                        return w1dVar.a(j3, j4, iE != zw6Var.size() - 1 ? ((km6) zw6Var.get(iE + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        if (this.D0 != null) {
            return this.H0.C(j);
        }
        for (sn6 sn6Var : this.E0) {
            if (!sn6Var.O0) {
                sn6Var.C(sn6Var.a1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.HashMap] */
    @Override // defpackage.yd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(defpackage.wd8 r26, long r27) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.J(wd8, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // defpackage.yd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.m85[] r38, boolean[] r39, defpackage.frc[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.L(m85[], boolean[], frc[], boolean[], long):long");
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.H0.a();
    }

    @Override // defpackage.fn6
    public final void b() {
        for (sn6 sn6Var : this.E0) {
            ArrayList arrayList = sn6Var.y0;
            if (!arrayList.isEmpty()) {
                cm6 cm6Var = (cm6) mqd.m(arrayList);
                int iB = sn6Var.o.b(cm6Var);
                if (iB == 1) {
                    cm6Var.V0 = true;
                } else if (iB == 2 && !sn6Var.e1) {
                    jo7 jo7Var = sn6Var.u0;
                    if (jo7Var.o()) {
                        jo7Var.a();
                    }
                }
            }
        }
        this.B0.c(this);
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        this.B0.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[SYNTHETIC] */
    @Override // defpackage.fn6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(android.net.Uri r17, defpackage.wn7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sn6[] r2 = r0.E0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La6
            r8 = r2[r6]
            wl6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.maf.l(r10, r1)
            if (r10 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto La1
        L1d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            m85 r12 = r9.q
            ty4 r12 = defpackage.ay7.h(r12)
            buc r8 = r8.t0
            r8.getClass()
            r8 = r18
            b11 r12 = defpackage.buc.u(r12, r8)
            if (r12 == 0) goto L41
            int r13 = r12.b
            r14 = 2
            if (r13 != r14) goto L41
            long r12 = r12.c
            goto L42
        L3f:
            r8 = r18
        L41:
            r12 = r10
        L42:
            r14 = 0
        L43:
            android.net.Uri[] r15 = r9.e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L55
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L52
            goto L56
        L52:
            int r14 = r14 + 1
            goto L43
        L55:
            r14 = r4
        L56:
            if (r14 != r4) goto L5b
        L58:
            r4 = 1
            r5 = 1
            goto L98
        L5b:
            m85 r5 = r9.q
            int r5 = r5.p(r14)
            if (r5 != r4) goto L64
            goto L58
        L64:
            boolean r4 = r9.s
            android.net.Uri r14 = r9.o
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.s = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L96
            m85 r4 = r9.q
            boolean r4 = r4.r(r5, r12)
            if (r4 == 0) goto L93
            hb4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            fb4 r4 = (defpackage.fb4) r4
            if (r4 == 0) goto L8e
            boolean r4 = defpackage.fb4.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L90
        L8e:
            r5 = 1
            r4 = 0
        L90:
            if (r4 == 0) goto L94
            goto L97
        L93:
            r5 = 1
        L94:
            r4 = 0
            goto L98
        L96:
            r5 = 1
        L97:
            r4 = r5
        L98:
            if (r4 == 0) goto La0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto La0
            r4 = r5
            goto La1
        La0:
            r4 = 0
        La1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La6:
            wd8 r1 = r0.B0
            r1.c(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em6.e(android.net.Uri, wn7, boolean):boolean");
    }

    @Override // defpackage.i6d
    public final long f() {
        return this.H0.f();
    }

    public final sn6 g(String str, int i, Uri[] uriArr, oy5[] oy5VarArr, oy5 oy5Var, List list, Map map, long j) {
        return new sn6(str, i, this, new wl6(this.a, this.b, uriArr, oy5VarArr, this.c, this.o, this.v0, list, this.A0), map, this.t0, j, oy5Var, this.X, this.Y, this.Z, this.s0, this.y0);
    }

    public final void i() {
        int i = this.C0 - 1;
        this.C0 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (sn6 sn6Var : this.E0) {
            sn6Var.d();
            i2 += sn6Var.T0.a;
        }
        qze[] qzeVarArr = new qze[i2];
        int i3 = 0;
        for (sn6 sn6Var2 : this.E0) {
            sn6Var2.d();
            int i4 = sn6Var2.T0.a;
            int i5 = 0;
            while (i5 < i4) {
                sn6Var2.d();
                qzeVarArr[i3] = sn6Var2.T0.a(i5);
                i5++;
                i3++;
            }
        }
        this.D0 = new sze(qzeVarArr);
        this.B0.d(this);
    }

    @Override // defpackage.yd8
    public final void k() throws ParserException {
        for (sn6 sn6Var : this.E0) {
            sn6Var.u();
            if (sn6Var.e1 && !sn6Var.O0) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.yd8
    public final long l(long j) {
        sn6[] sn6VarArr = this.F0;
        if (sn6VarArr.length > 0) {
            boolean zD = sn6VarArr[0].D(j, false);
            int i = 1;
            while (true) {
                sn6[] sn6VarArr2 = this.F0;
                if (i >= sn6VarArr2.length) {
                    break;
                }
                sn6VarArr2[i].D(j, zD);
                i++;
            }
            if (zD) {
                ((SparseArray) this.v0.b).clear();
            }
        }
        return j;
    }

    @Override // defpackage.yd8
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.yd8
    public final sze q() {
        sze szeVar = this.D0;
        szeVar.getClass();
        return szeVar;
    }

    @Override // defpackage.i6d
    public final long r() {
        return this.H0.r();
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        for (sn6 sn6Var : this.F0) {
            if (sn6Var.N0 && !sn6Var.m()) {
                int length = sn6Var.G0.length;
                for (int i = 0; i < length; i++) {
                    sn6Var.G0[i].h(j, z, sn6Var.Y0[i]);
                }
            }
        }
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        this.H0.t(j);
    }
}
