package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class xl6 {
    public final am6 a;
    public final t24 b;
    public final t24 c;
    public final mfe d;
    public final Uri[] e;
    public final qy5[] f;
    public final hb4 g;
    public final rze h;
    public final List i;
    public final j4b k;
    public final long l;
    public boolean m;
    public BehindLiveWindowException o;
    public Uri p;
    public boolean q;
    public n85 r;
    public boolean t;
    public final wmc j = new wmc(10);
    public byte[] n = oaf.f;
    public long s = -9223372036854775807L;

    public xl6(am6 am6Var, hb4 hb4Var, Uri[] uriArr, qy5[] qy5VarArr, w4d w4dVar, z0f z0fVar, mfe mfeVar, long j, List list, j4b j4bVar) {
        this.a = am6Var;
        this.g = hb4Var;
        this.e = uriArr;
        this.f = qy5VarArr;
        this.d = mfeVar;
        this.l = j;
        this.i = list;
        this.k = j4bVar;
        t24 t24VarA = ((q24) w4dVar.b).a();
        this.b = t24VarA;
        if (z0fVar != null) {
            t24VarA.H(z0fVar);
        }
        this.c = ((q24) w4dVar.b).a();
        this.h = new rze("", qy5VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((qy5VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        rze rzeVar = this.h;
        int[] iArrC0 = s5c.c0(arrayList);
        ul6 ul6Var = new ul6(rzeVar, iArrC0);
        ul6Var.g = ul6Var.s(rzeVar.d[iArrC0[0]]);
        this.r = ul6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i78[] a(defpackage.dm6 r20, long r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl6.a(dm6, long):i78[]");
    }

    public final int b(dm6 dm6Var) {
        if (dm6Var.z0 == -1) {
            return 1;
        }
        qm6 qm6VarB = this.g.b(this.e[this.h.d(dm6Var.o)], false);
        qm6VarB.getClass();
        int i = (int) (dm6Var.u0 - qm6VarB.k);
        if (i < 0) {
            return 1;
        }
        zw6 zw6Var = qm6VarB.r;
        zw6 zw6Var2 = i < zw6Var.size() ? ((lm6) zw6Var.get(i)).x0 : qm6VarB.s;
        int size = zw6Var2.size();
        int i2 = dm6Var.z0;
        if (i2 >= size) {
            return 2;
        }
        hm6 hm6Var = (hm6) zw6Var2.get(i2);
        if (hm6Var.x0) {
            return 0;
        }
        return oaf.a(Uri.parse(mr0.R(qm6VarB.a, hm6Var.a)), dm6Var.b.a) ? 1 : 2;
    }

    public final Pair c(dm6 dm6Var, boolean z, qm6 qm6Var, long j, long j2) {
        boolean z2 = true;
        if (dm6Var != null && !z) {
            boolean z3 = dm6Var.T0;
            long jB = dm6Var.u0;
            int i = dm6Var.z0;
            if (!z3) {
                return new Pair(Long.valueOf(jB), Integer.valueOf(i));
            }
            if (i == -1) {
                jB = dm6Var.b();
            }
            return new Pair(Long.valueOf(jB), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = qm6Var.u + j;
        if (dm6Var != null && !this.q) {
            j2 = dm6Var.Z;
        }
        boolean z4 = qm6Var.o;
        long j4 = qm6Var.k;
        zw6 zw6Var = qm6Var.r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + zw6Var.size()), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        int i2 = 0;
        if (this.g.Y && dm6Var != null) {
            z2 = false;
        }
        int iD = oaf.d(lValueOf, zw6Var, z2);
        long j6 = iD + j4;
        if (iD >= 0) {
            lm6 lm6Var = (lm6) zw6Var.get(iD);
            long j7 = lm6Var.X + lm6Var.c;
            zw6 zw6Var2 = qm6Var.s;
            zw6 zw6Var3 = j5 < j7 ? lm6Var.x0 : zw6Var2;
            while (true) {
                if (i2 >= zw6Var3.size()) {
                    break;
                }
                hm6 hm6Var = (hm6) zw6Var3.get(i2);
                if (j5 >= hm6Var.X + hm6Var.c) {
                    i2++;
                } else if (hm6Var.w0) {
                    j6 += zw6Var3 == zw6Var2 ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ql6 d(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        wmc wmcVar = this.j;
        byte[] bArr = (byte[]) ((i56) wmcVar.a).remove(uri);
        if (bArr != null) {
            return null;
        }
        a34 a34Var = new a34(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null);
        qy5 qy5Var = this.f[i];
        int iK = this.r.k();
        Object objM = this.r.m();
        byte[] bArr2 = this.n;
        ql6 ql6Var = new ql6(this.c, a34Var, 3, qy5Var, iK, objM, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = oaf.f;
        }
        ql6Var.u0 = bArr2;
        return ql6Var;
    }
}
