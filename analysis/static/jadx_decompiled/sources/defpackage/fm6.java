package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class fm6 implements zd8, gn6 {
    public final j4b A0;
    public final wmc B0 = new wmc(this, false);
    public final long C0;
    public xd8 D0;
    public int E0;
    public tze F0;
    public tn6[] G0;
    public tn6[] H0;
    public int I0;
    public sc3 J0;
    public final tr4 X;
    public final lr4 Y;
    public final huc Z;
    public final am6 a;
    public final hb4 b;
    public final w4d c;
    public final z0f o;
    public final jn s0;
    public final n64 t0;
    public final IdentityHashMap u0;
    public final mfe v0;
    public final oq9 w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    public fm6(am6 am6Var, hb4 hb4Var, w4d w4dVar, z0f z0fVar, tr4 tr4Var, lr4 lr4Var, huc hucVar, jn jnVar, n64 n64Var, oq9 oq9Var, boolean z, int i, boolean z2, j4b j4bVar, long j) {
        this.a = am6Var;
        this.b = hb4Var;
        this.c = w4dVar;
        this.o = z0fVar;
        this.X = tr4Var;
        this.Y = lr4Var;
        this.Z = hucVar;
        this.s0 = jnVar;
        this.t0 = n64Var;
        this.w0 = oq9Var;
        this.x0 = z;
        this.y0 = i;
        this.z0 = z2;
        this.A0 = j4bVar;
        this.C0 = j;
        oq9Var.getClass();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        this.J0 = new sc3(ffcVar, ffcVar);
        this.u0 = new IdentityHashMap();
        mfe mfeVar = new mfe();
        mfeVar.a = new SparseArray();
        this.v0 = mfeVar;
        this.G0 = new tn6[0];
        this.H0 = new tn6[0];
    }

    public static qy5 e(qy5 qy5Var, qy5 qy5Var2, boolean z) {
        f99 f99Var;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        List list;
        ls5 ls5Var = zw6.b;
        List list2 = ffc.X;
        if (qy5Var2 != null) {
            str3 = qy5Var2.j;
            f99Var = qy5Var2.k;
            i2 = qy5Var2.B;
            i = qy5Var2.e;
            i3 = qy5Var2.f;
            str = qy5Var2.d;
            str2 = qy5Var2.b;
            list = qy5Var2.c;
        } else {
            String strV = oaf.v(1, qy5Var.j);
            f99Var = qy5Var.k;
            if (z) {
                i2 = qy5Var.B;
                i = qy5Var.e;
                i3 = qy5Var.f;
                str = qy5Var.d;
                str2 = qy5Var.b;
                list2 = qy5Var.c;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            List list3 = list2;
            str3 = strV;
            list = list3;
        }
        String strC = ia9.c(str3);
        int i4 = z ? qy5Var.g : -1;
        int i5 = z ? qy5Var.h : -1;
        ny5 ny5Var = new ny5();
        ny5Var.a = qy5Var.a;
        ny5Var.b = str2;
        ny5Var.c = zw6.j(list);
        ny5Var.l = ia9.l(qy5Var.m);
        ny5Var.m = ia9.l(strC);
        ny5Var.i = str3;
        ny5Var.j = f99Var;
        ny5Var.g = i4;
        ny5Var.h = i5;
        ny5Var.A = i2;
        ny5Var.e = i;
        ny5Var.f = i3;
        ny5Var.d = str;
        return new qy5(ny5Var);
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.J0.a();
    }

    @Override // defpackage.gn6
    public final void b() {
        for (tn6 tn6Var : this.G0) {
            ArrayList arrayList = tn6Var.y0;
            if (!arrayList.isEmpty()) {
                dm6 dm6Var = (dm6) mqd.m(arrayList);
                int iB = tn6Var.o.b(dm6Var);
                if (iB == 1) {
                    dm6Var.W0 = true;
                } else if (iB == 0) {
                    tn6Var.C0.post(new vs5(tn6Var, 2, dm6Var));
                } else if (iB == 2 && !tn6Var.e1) {
                    vq7 vq7Var = tn6Var.u0;
                    if (vq7Var.o()) {
                        vq7Var.l();
                    }
                }
            }
        }
        this.D0.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0055 A[SYNTHETIC] */
    @Override // defpackage.gn6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r17, defpackage.wn7 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            tn6[] r2 = r0.G0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La6
            r8 = r2[r6]
            xl6 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.oaf.m(r10, r1)
            if (r10 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto La1
        L1d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            n85 r12 = r9.r
            ty4 r12 = defpackage.dy7.n(r12)
            huc r8 = r8.t0
            r8.getClass()
            r8 = r18
            b11 r12 = defpackage.huc.o(r12, r8)
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
            n85 r5 = r9.r
            int r5 = r5.p(r14)
            if (r5 != r4) goto L64
            goto L58
        L64:
            boolean r4 = r9.t
            android.net.Uri r14 = r9.p
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.t = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L96
            n85 r4 = r9.r
            boolean r4 = r4.u(r5, r12)
            if (r4 == 0) goto L93
            hb4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            gb4 r4 = (defpackage.gb4) r4
            if (r4 == 0) goto L8e
            boolean r4 = defpackage.gb4.a(r4, r12)
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
            xd8 r1 = r0.D0
            r1.j(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.c(android.net.Uri, wn7, boolean):boolean");
    }

    public final tn6 d(String str, int i, Uri[] uriArr, qy5[] qy5VarArr, qy5 qy5Var, List list, Map map, long j) {
        return new tn6(str, i, this.B0, new xl6(this.a, this.b, uriArr, qy5VarArr, this.c, this.o, this.v0, this.C0, list, this.A0), map, this.t0, j, qy5Var, this.X, this.Y, this.Z, this.s0, this.y0);
    }

    @Override // defpackage.j6d
    public final long f() {
        return this.J0.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(defpackage.n85[] r37, boolean[] r38, defpackage.grc[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.g(n85[], boolean[], grc[], boolean[], long):long");
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        tn6[] tn6VarArr = this.H0;
        int length = tn6VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            tn6 tn6Var = tn6VarArr[i];
            if (tn6Var.L0 == 2) {
                xl6 xl6Var = tn6Var.o;
                int iB = xl6Var.r.b();
                Uri[] uriArr = xl6Var.e;
                int length2 = uriArr.length;
                hb4 hb4Var = xl6Var.g;
                qm6 qm6VarB = (iB >= length2 || iB == -1) ? null : hb4Var.b(uriArr[xl6Var.r.i()], true);
                if (qm6VarB != null) {
                    zw6 zw6Var = qm6VarB.r;
                    if (!zw6Var.isEmpty() && qm6VarB.c) {
                        long j2 = qm6VarB.h - hb4Var.Z;
                        long j3 = j - j2;
                        int iD = oaf.d(Long.valueOf(j3), zw6Var, true);
                        long j4 = ((lm6) zw6Var.get(iD)).X;
                        return x1dVar.a(j3, j4, iD != zw6Var.size() - 1 ? ((lm6) zw6Var.get(iD + 1)).X : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap] */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.xd8 r27, long r28) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm6.i(xd8, long):void");
    }

    @Override // defpackage.zd8
    public final void k() throws IOException {
        for (tn6 tn6Var : this.G0) {
            tn6Var.D();
            if (tn6Var.e1 && !tn6Var.O0) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        tn6[] tn6VarArr = this.H0;
        if (tn6VarArr.length > 0) {
            boolean zG = tn6VarArr[0].G(j, false);
            int i = 1;
            while (true) {
                tn6[] tn6VarArr2 = this.H0;
                if (i >= tn6VarArr2.length) {
                    break;
                }
                tn6VarArr2[i].G(j, zG);
                i++;
            }
            if (zG) {
                ((SparseArray) this.v0.a).clear();
            }
        }
        return j;
    }

    @Override // defpackage.zd8
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        if (this.F0 != null) {
            return this.J0.o(qo7Var);
        }
        for (tn6 tn6Var : this.G0) {
            if (!tn6Var.O0) {
                po7 po7Var = new po7();
                po7Var.a = tn6Var.a1;
                tn6Var.o(new qo7(po7Var));
            }
        }
        return false;
    }

    @Override // defpackage.zd8
    public final tze q() {
        tze tzeVar = this.F0;
        tzeVar.getClass();
        return tzeVar;
    }

    @Override // defpackage.j6d
    public final long r() {
        return this.J0.r();
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        for (tn6 tn6Var : this.H0) {
            if (tn6Var.N0 && !tn6Var.z()) {
                int length = tn6Var.G0.length;
                for (int i = 0; i < length; i++) {
                    tn6Var.G0[i].g(j, z, tn6Var.Y0[i]);
                }
            }
        }
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        this.J0.t(j);
    }
}
