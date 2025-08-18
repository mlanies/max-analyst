package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class as8 implements zd8, xd8 {
    public xd8 Y;
    public tze Z;
    public final zd8[] a;
    public final IdentityHashMap b;
    public final oq9 c;
    public zd8[] s0;
    public sc3 t0;
    public final ArrayList o = new ArrayList();
    public final HashMap X = new HashMap();

    public as8(oq9 oq9Var, long[] jArr, zd8... zd8VarArr) {
        this.c = oq9Var;
        this.a = zd8VarArr;
        oq9Var.getClass();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        this.t0 = new sc3(ffcVar, ffcVar);
        this.b = new IdentityHashMap();
        this.s0 = new zd8[0];
        for (int i = 0; i < zd8VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new ute(zd8VarArr[i], j);
            }
        }
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.t0.a();
    }

    @Override // defpackage.xd8
    public final void e(zd8 zd8Var) {
        ArrayList arrayList = this.o;
        arrayList.remove(zd8Var);
        if (arrayList.isEmpty()) {
            zd8[] zd8VarArr = this.a;
            int i = 0;
            for (zd8 zd8Var2 : zd8VarArr) {
                i += zd8Var2.q().a;
            }
            rze[] rzeVarArr = new rze[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zd8VarArr.length; i3++) {
                tze tzeVarQ = zd8VarArr[i3].q();
                int i4 = tzeVarQ.a;
                int i5 = 0;
                while (i5 < i4) {
                    rze rzeVarA = tzeVarQ.a(i5);
                    qy5[] qy5VarArr = new qy5[rzeVarA.a];
                    for (int i6 = 0; i6 < rzeVarA.a; i6++) {
                        qy5 qy5Var = rzeVarA.d[i6];
                        ny5 ny5VarA = qy5Var.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = qy5Var.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        ny5VarA.a = sb.toString();
                        qy5VarArr[i6] = ny5VarA.a();
                    }
                    rze rzeVar = new rze(i3 + ":" + rzeVarA.b, qy5VarArr);
                    this.X.put(rzeVar, rzeVarA);
                    rzeVarArr[i2] = rzeVar;
                    i5++;
                    i2++;
                }
            }
            this.Z = new tze(rzeVarArr);
            xd8 xd8Var = this.Y;
            xd8Var.getClass();
            xd8Var.e(this);
        }
    }

    @Override // defpackage.j6d
    public final long f() {
        return this.t0.f();
    }

    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[n85VarArr.length];
        int[] iArr2 = new int[n85VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = n85VarArr.length;
            identityHashMap = this.b;
            if (i2 >= length) {
                break;
            }
            grc grcVar = grcVarArr[i2];
            Integer num = grcVar == null ? null : (Integer) identityHashMap.get(grcVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            n85 n85Var = n85VarArr[i2];
            if (n85Var != null) {
                String str = n85Var.a().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = n85VarArr.length;
        grc[] grcVarArr2 = new grc[length2];
        grc[] grcVarArr3 = new grc[n85VarArr.length];
        n85[] n85VarArr2 = new n85[n85VarArr.length];
        zd8[] zd8VarArr = this.a;
        ArrayList arrayList2 = new ArrayList(zd8VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zd8VarArr.length) {
            int i4 = i;
            while (i4 < n85VarArr.length) {
                grcVarArr3[i4] = iArr[i4] == i3 ? grcVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    n85 n85Var2 = n85VarArr[i4];
                    n85Var2.getClass();
                    arrayList = arrayList2;
                    rze rzeVar = (rze) this.X.get(n85Var2.a());
                    rzeVar.getClass();
                    n85VarArr2[i4] = new wr8(n85Var2, rzeVar);
                } else {
                    arrayList = arrayList2;
                    n85VarArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            zd8[] zd8VarArr2 = zd8VarArr;
            n85[] n85VarArr3 = n85VarArr2;
            long jG = zd8VarArr[i3].g(n85VarArr2, zArr, grcVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jG;
            } else if (jG != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < n85VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    grc grcVar2 = grcVarArr3[i6];
                    grcVar2.getClass();
                    grcVarArr2[i6] = grcVarArr3[i6];
                    identityHashMap.put(grcVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    fm9.k(grcVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList3.add(zd8VarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            zd8VarArr = zd8VarArr2;
            n85VarArr2 = n85VarArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(grcVarArr2, i7, grcVarArr, i7, length2);
        this.s0 = (zd8[]) arrayList4.toArray(new zd8[i7]);
        AbstractList abstractListZ = br7.Z(new hj8(8), arrayList4);
        this.c.getClass();
        this.t0 = new sc3(arrayList4, abstractListZ);
        return j2;
    }

    @Override // defpackage.zd8
    public final long h(long j, x1d x1dVar) {
        zd8[] zd8VarArr = this.s0;
        return (zd8VarArr.length > 0 ? zd8VarArr[0] : this.a[0]).h(j, x1dVar);
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.Y = xd8Var;
        ArrayList arrayList = this.o;
        zd8[] zd8VarArr = this.a;
        Collections.addAll(arrayList, zd8VarArr);
        for (zd8 zd8Var : zd8VarArr) {
            zd8Var.i(this, j);
        }
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        xd8 xd8Var = this.Y;
        xd8Var.getClass();
        xd8Var.j(this);
    }

    @Override // defpackage.zd8
    public final void k() {
        for (zd8 zd8Var : this.a) {
            zd8Var.k();
        }
    }

    @Override // defpackage.zd8
    public final long l(long j) {
        long jL = this.s0[0].l(j);
        int i = 1;
        while (true) {
            zd8[] zd8VarArr = this.s0;
            if (i >= zd8VarArr.length) {
                return jL;
            }
            if (zd8VarArr[i].l(jL) != jL) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.zd8
    public final long n() {
        long j = -9223372036854775807L;
        for (zd8 zd8Var : this.s0) {
            long jN = zd8Var.n();
            if (jN == -9223372036854775807L) {
                if (j != -9223372036854775807L && zd8Var.l(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zd8 zd8Var2 : this.s0) {
                    if (zd8Var2 == zd8Var) {
                        break;
                    }
                    if (zd8Var2.l(jN) != jN) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jN;
            } else if (jN != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.t0.o(qo7Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zd8) arrayList.get(i)).o(qo7Var);
        }
        return false;
    }

    @Override // defpackage.zd8
    public final tze q() {
        tze tzeVar = this.Z;
        tzeVar.getClass();
        return tzeVar;
    }

    @Override // defpackage.j6d
    public final long r() {
        return this.t0.r();
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        for (zd8 zd8Var : this.s0) {
            zd8Var.s(j, z);
        }
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        this.t0.t(j);
    }
}
