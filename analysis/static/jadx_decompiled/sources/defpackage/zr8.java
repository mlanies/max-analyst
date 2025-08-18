package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class zr8 implements yd8, wd8 {
    public wd8 Y;
    public sze Z;
    public final yd8[] a;
    public final IdentityHashMap b;
    public final mq9 c;
    public yd8[] s0;
    public rxd t0;
    public final ArrayList o = new ArrayList();
    public final HashMap X = new HashMap();

    public zr8(mq9 mq9Var, long[] jArr, yd8... yd8VarArr) {
        this.c = mq9Var;
        this.a = yd8VarArr;
        mq9Var.getClass();
        this.t0 = new rxd(10, new i6d[0]);
        this.b = new IdentityHashMap();
        this.s0 = new yd8[0];
        for (int i = 0; i < yd8VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new xr8(yd8VarArr[i], j);
            }
        }
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        yd8[] yd8VarArr = this.s0;
        return (yd8VarArr.length > 0 ? yd8VarArr[0] : this.a[0]).A(j, w1dVar);
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.t0.C(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((yd8) arrayList.get(i)).C(j);
        }
        return false;
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.Y = wd8Var;
        ArrayList arrayList = this.o;
        yd8[] yd8VarArr = this.a;
        Collections.addAll(arrayList, yd8VarArr);
        for (yd8 yd8Var : yd8VarArr) {
            yd8Var.J(this, j);
        }
    }

    @Override // defpackage.yd8
    public final long L(m85[] m85VarArr, boolean[] zArr, frc[] frcVarArr, boolean[] zArr2, long j) {
        HashMap map;
        IdentityHashMap identityHashMap;
        yd8[] yd8VarArr;
        HashMap map2;
        ArrayList arrayList;
        int[] iArr = new int[m85VarArr.length];
        int[] iArr2 = new int[m85VarArr.length];
        int i = 0;
        while (true) {
            int length = m85VarArr.length;
            map = this.X;
            identityHashMap = this.b;
            yd8VarArr = this.a;
            if (i >= length) {
                break;
            }
            frc frcVar = frcVarArr[i];
            Integer num = frcVar == null ? null : (Integer) identityHashMap.get(frcVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            m85 m85Var = m85VarArr[i];
            if (m85Var != null) {
                qze qzeVar = (qze) map.get(m85Var.a());
                qzeVar.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= yd8VarArr.length) {
                        break;
                    }
                    if (yd8VarArr[i2].q().b(qzeVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = m85VarArr.length;
        frc[] frcVarArr2 = new frc[length2];
        frc[] frcVarArr3 = new frc[m85VarArr.length];
        m85[] m85VarArr2 = new m85[m85VarArr.length];
        ArrayList arrayList2 = new ArrayList(yd8VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < yd8VarArr.length) {
            int i4 = 0;
            while (i4 < m85VarArr.length) {
                frcVarArr3[i4] = iArr[i4] == i3 ? frcVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    m85 m85Var2 = m85VarArr[i4];
                    m85Var2.getClass();
                    arrayList = arrayList2;
                    qze qzeVar2 = (qze) map.get(m85Var2.a());
                    qzeVar2.getClass();
                    map2 = map;
                    m85VarArr2[i4] = new vr8(m85Var2, qzeVar2);
                } else {
                    map2 = map;
                    arrayList = arrayList2;
                    m85VarArr2[i4] = null;
                }
                i4++;
                arrayList2 = arrayList;
                map = map2;
            }
            HashMap map3 = map;
            ArrayList arrayList3 = arrayList2;
            int i5 = i3;
            m85[] m85VarArr3 = m85VarArr2;
            long jL = yd8VarArr[i3].L(m85VarArr2, zArr, frcVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jL;
            } else if (jL != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < m85VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    frc frcVar2 = frcVarArr3[i6];
                    frcVar2.getClass();
                    frcVarArr2[i6] = frcVarArr3[i6];
                    identityHashMap.put(frcVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    np8.f(frcVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList3.add(yd8VarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList2 = arrayList3;
            m85VarArr2 = m85VarArr3;
            map = map3;
        }
        System.arraycopy(frcVarArr2, 0, frcVarArr, 0, length2);
        yd8[] yd8VarArr2 = (yd8[]) arrayList2.toArray(new yd8[0]);
        this.s0 = yd8VarArr2;
        this.c.getClass();
        this.t0 = new rxd(10, yd8VarArr2);
        return j2;
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.t0.a();
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        wd8 wd8Var = this.Y;
        wd8Var.getClass();
        wd8Var.c(this);
    }

    @Override // defpackage.wd8
    public final void d(yd8 yd8Var) {
        ArrayList arrayList = this.o;
        arrayList.remove(yd8Var);
        if (arrayList.isEmpty()) {
            yd8[] yd8VarArr = this.a;
            int i = 0;
            for (yd8 yd8Var2 : yd8VarArr) {
                i += yd8Var2.q().a;
            }
            qze[] qzeVarArr = new qze[i];
            int i2 = 0;
            for (int i3 = 0; i3 < yd8VarArr.length; i3++) {
                sze szeVarQ = yd8VarArr[i3].q();
                int i4 = szeVarQ.a;
                int i5 = 0;
                while (i5 < i4) {
                    qze qzeVarA = szeVarQ.a(i5);
                    String str = qzeVarA.b;
                    StringBuilder sb = new StringBuilder(rh4.e(12, str));
                    sb.append(i3);
                    sb.append(":");
                    sb.append(str);
                    qze qzeVar = new qze(sb.toString(), qzeVarA.c);
                    this.X.put(qzeVar, qzeVarA);
                    qzeVarArr[i2] = qzeVar;
                    i5++;
                    i2++;
                }
            }
            this.Z = new sze(qzeVarArr);
            wd8 wd8Var = this.Y;
            wd8Var.getClass();
            wd8Var.d(this);
        }
    }

    @Override // defpackage.i6d
    public final long f() {
        return this.t0.f();
    }

    @Override // defpackage.yd8
    public final void k() {
        for (yd8 yd8Var : this.a) {
            yd8Var.k();
        }
    }

    @Override // defpackage.yd8
    public final long l(long j) {
        long jL = this.s0[0].l(j);
        int i = 1;
        while (true) {
            yd8[] yd8VarArr = this.s0;
            if (i >= yd8VarArr.length) {
                return jL;
            }
            if (yd8VarArr[i].l(jL) != jL) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.yd8
    public final long n() {
        long j = -9223372036854775807L;
        for (yd8 yd8Var : this.s0) {
            long jN = yd8Var.n();
            if (jN == -9223372036854775807L) {
                if (j != -9223372036854775807L && yd8Var.l(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (yd8 yd8Var2 : this.s0) {
                    if (yd8Var2 == yd8Var) {
                        break;
                    }
                    if (yd8Var2.l(jN) != jN) {
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

    @Override // defpackage.yd8
    public final sze q() {
        sze szeVar = this.Z;
        szeVar.getClass();
        return szeVar;
    }

    @Override // defpackage.i6d
    public final long r() {
        return this.t0.r();
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        for (yd8 yd8Var : this.s0) {
            yd8Var.s(j, z);
        }
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        this.t0.t(j);
    }
}
