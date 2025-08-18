package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wl6 {
    public final zl6 a;
    public final r24 b;
    public final r24 c;
    public final o9g d;
    public final Uri[] e;
    public final oy5[] f;
    public final hb4 g;
    public final qze h;
    public final List i;
    public final i4b k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public m85 q;
    public boolean s;
    public final bkg j = new bkg(13);
    public byte[] m = maf.f;
    public long r = -9223372036854775807L;

    public wl6(zl6 zl6Var, hb4 hb4Var, Uri[] uriArr, oy5[] oy5VarArr, gaa gaaVar, y0f y0fVar, o9g o9gVar, List list, i4b i4bVar) {
        this.a = zl6Var;
        this.g = hb4Var;
        this.e = uriArr;
        this.f = oy5VarArr;
        this.d = o9gVar;
        this.i = list;
        this.k = i4bVar;
        r24 r24VarA = ((p24) gaaVar.a).a();
        this.b = r24VarA;
        if (y0fVar != null) {
            r24VarA.N(y0fVar);
        }
        this.c = ((p24) gaaVar.a).a();
        this.h = new qze("", oy5VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((oy5VarArr[i].X & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        qze qzeVar = this.h;
        int[] iArrC0 = s5c.c0(arrayList);
        tl6 tl6Var = new tl6(qzeVar, iArrC0);
        tl6Var.g = tl6Var.q(qzeVar.c[iArrC0[0]]);
        this.q = tl6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.h78[] a(defpackage.cm6 r20, long r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl6.a(cm6, long):h78[]");
    }

    public final int b(cm6 cm6Var) {
        if (cm6Var.z0 == -1) {
            return 1;
        }
        pm6 pm6VarA = this.g.a(this.e[this.h.a(cm6Var.o)], false);
        pm6VarA.getClass();
        int i = (int) (cm6Var.u0 - pm6VarA.k);
        if (i < 0) {
            return 1;
        }
        zw6 zw6Var = pm6VarA.r;
        zw6 zw6Var2 = i < zw6Var.size() ? ((km6) zw6Var.get(i)).x0 : pm6VarA.s;
        int size = zw6Var2.size();
        int i2 = cm6Var.z0;
        if (i2 >= size) {
            return 2;
        }
        gm6 gm6Var = (gm6) zw6Var2.get(i2);
        if (gm6Var.x0) {
            return 0;
        }
        return maf.a(Uri.parse(kq0.D(pm6VarA.a, gm6Var.a)), cm6Var.b.a) ? 1 : 2;
    }

    public final Pair c(cm6 cm6Var, boolean z, pm6 pm6Var, long j, long j2) {
        boolean z2 = true;
        if (cm6Var != null && !z) {
            boolean z3 = cm6Var.S0;
            long jB = cm6Var.u0;
            int i = cm6Var.z0;
            if (!z3) {
                return new Pair(Long.valueOf(jB), Integer.valueOf(i));
            }
            if (i == -1) {
                jB = cm6Var.b();
            }
            return new Pair(Long.valueOf(jB), Integer.valueOf(i != -1 ? i + 1 : -1));
        }
        long j3 = pm6Var.u + j;
        if (cm6Var != null && !this.p) {
            j2 = cm6Var.Z;
        }
        boolean z4 = pm6Var.o;
        long j4 = pm6Var.k;
        zw6 zw6Var = pm6Var.r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + zw6Var.size()), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        int i2 = 0;
        if (this.g.Y && cm6Var != null) {
            z2 = false;
        }
        int iE = maf.e(lValueOf, zw6Var, z2);
        long j6 = iE + j4;
        if (iE >= 0) {
            km6 km6Var = (km6) zw6Var.get(iE);
            long j7 = km6Var.X + km6Var.c;
            zw6 zw6Var2 = pm6Var.s;
            zw6 zw6Var3 = j5 < j7 ? km6Var.x0 : zw6Var2;
            while (true) {
                if (i2 >= zw6Var3.size()) {
                    break;
                }
                gm6 gm6Var = (gm6) zw6Var3.get(i2);
                if (j5 >= gm6Var.X + gm6Var.c) {
                    i2++;
                } else if (gm6Var.w0) {
                    j6 += zw6Var3 == zw6Var2 ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pl6 d(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        bkg bkgVar = this.j;
        byte[] bArr = (byte[]) ((i56) bkgVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        z24 z24Var = new z24(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 1, null);
        oy5 oy5Var = this.f[i];
        int iK = this.q.k();
        Object objM = this.q.m();
        byte[] bArr2 = this.m;
        pl6 pl6Var = new pl6(this.c, z24Var, 3, oy5Var, iK, objM, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = maf.f;
        }
        pl6Var.u0 = bArr2;
        return pl6Var;
    }
}
