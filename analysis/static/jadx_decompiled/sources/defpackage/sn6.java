package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class sn6 implements co7, ho7, i6d, oa5, brc {
    public static final Set j1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ln6 A0;
    public final ln6 B0;
    public final Handler C0;
    public final ArrayList D0;
    public final Map E0;
    public h13 F0;
    public qn6[] G0;
    public int[] H0;
    public final HashSet I0;
    public final SparseIntArray J0;
    public on6 K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public oy5 Q0;
    public oy5 R0;
    public boolean S0;
    public sze T0;
    public Set U0;
    public int[] V0;
    public int W0;
    public final n64 X;
    public boolean X0;
    public final oy5 Y;
    public boolean[] Y0;
    public final sr4 Z;
    public boolean[] Z0;
    public final String a;
    public long a1;
    public final int b;
    public long b1;
    public final em6 c;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public long g1;
    public cr4 h1;
    public cm6 i1;
    public final wl6 o;
    public final kr4 s0;
    public final buc t0;
    public final jo7 u0 = new jo7("Loader:HlsSampleStreamWrapper", 0);
    public final gk8 v0;
    public final int w0;
    public final td x0;
    public final ArrayList y0;
    public final List z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [ln6] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ln6] */
    public sn6(String str, int i, em6 em6Var, wl6 wl6Var, Map map, n64 n64Var, long j, oy5 oy5Var, sr4 sr4Var, kr4 kr4Var, buc bucVar, gk8 gk8Var, int i2) {
        this.a = str;
        this.b = i;
        this.c = em6Var;
        this.o = wl6Var;
        this.E0 = map;
        this.X = n64Var;
        this.Y = oy5Var;
        this.Z = sr4Var;
        this.s0 = kr4Var;
        this.t0 = bucVar;
        this.v0 = gk8Var;
        this.w0 = i2;
        td tdVar = new td(9, (byte) 0);
        tdVar.c = null;
        tdVar.b = false;
        tdVar.o = null;
        this.x0 = tdVar;
        this.H0 = new int[0];
        Set set = j1;
        this.I0 = new HashSet(set.size());
        this.J0 = new SparseIntArray(set.size());
        this.G0 = new qn6[0];
        this.Z0 = new boolean[0];
        this.Y0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y0 = arrayList;
        this.z0 = Collections.unmodifiableList(arrayList);
        this.D0 = new ArrayList();
        final int i3 = 0;
        this.A0 = new Runnable(this) { // from class: ln6
            public final /* synthetic */ sn6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        sn6 sn6Var = this.b;
                        sn6Var.N0 = true;
                        sn6Var.p();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.B0 = new Runnable(this) { // from class: ln6
            public final /* synthetic */ sn6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.p();
                        break;
                    default:
                        sn6 sn6Var = this.b;
                        sn6Var.N0 = true;
                        sn6Var.p();
                        break;
                }
            }
        };
        this.C0 = maf.m(null);
        this.a1 = j;
        this.b1 = j;
    }

    public static oy5 g(oy5 oy5Var, oy5 oy5Var2, boolean z) {
        String strC;
        String strQ;
        if (oy5Var == null) {
            return oy5Var2;
        }
        String str = oy5Var2.w0;
        int iG = ha9.g(str);
        String str2 = oy5Var.t0;
        if (maf.p(iG, str2) == 1) {
            strQ = maf.q(iG, str2);
            strC = ha9.c(strQ);
        } else {
            String strA = ha9.a(str2, str);
            strC = str;
            strQ = strA;
        }
        my5 my5VarA = oy5Var2.a();
        my5VarA.a = oy5Var.a;
        my5VarA.b = oy5Var.b;
        my5VarA.c = oy5Var.c;
        my5VarA.d = oy5Var.o;
        my5VarA.e = oy5Var.X;
        my5VarA.f = z ? oy5Var.Y : -1;
        my5VarA.g = z ? oy5Var.Z : -1;
        my5VarA.h = strQ;
        if (iG == 2) {
            my5VarA.p = oy5Var.B0;
            my5VarA.q = oy5Var.C0;
            my5VarA.r = oy5Var.D0;
        }
        if (strC != null) {
            my5VarA.k = strC;
        }
        int i = oy5Var.J0;
        if (i != -1 && iG == 1) {
            my5VarA.x = i;
        }
        e99 e99Var = oy5Var.u0;
        if (e99Var != null) {
            e99 e99Var2 = oy5Var2.u0;
            if (e99Var2 != null) {
                c99[] c99VarArr = e99Var.a;
                if (c99VarArr.length == 0) {
                    e99Var = e99Var2;
                } else {
                    c99[] c99VarArr2 = e99Var2.a;
                    Object[] objArrCopyOf = Arrays.copyOf(c99VarArr2, c99VarArr2.length + c99VarArr.length);
                    System.arraycopy(c99VarArr, 0, objArrCopyOf, c99VarArr2.length, c99VarArr.length);
                    e99Var = new e99((c99[]) objArrCopyOf);
                }
            }
            my5VarA.i = e99Var;
        }
        return new oy5(my5VarA);
    }

    public static int j(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [dt4] */
    @Override // defpackage.oa5
    public final xze B(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = j1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.I0;
        SparseIntArray sparseIntArray = this.J0;
        qn6 qn6Var = null;
        if (zContains) {
            np8.d(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.H0[i3] = i;
                }
                qn6Var = this.H0[i3] == i ? this.G0[i3] : new dt4();
            }
        } else {
            int i4 = 0;
            while (true) {
                qn6[] qn6VarArr = this.G0;
                if (i4 >= qn6VarArr.length) {
                    break;
                }
                if (this.H0[i4] == i) {
                    qn6Var = qn6VarArr[i4];
                    break;
                }
                i4++;
            }
        }
        if (qn6Var == null) {
            if (this.f1) {
                return new dt4();
            }
            int length = this.G0.length;
            boolean z = i2 == 1 || i2 == 2;
            qn6Var = new qn6(this.X, this.Z, this.s0, this.E0);
            qn6Var.t = this.a1;
            if (z) {
                qn6Var.I = this.h1;
                qn6Var.z = true;
            }
            long j = this.g1;
            if (qn6Var.F != j) {
                qn6Var.F = j;
                qn6Var.z = true;
            }
            cm6 cm6Var = this.i1;
            if (cm6Var != null) {
                qn6Var.C = cm6Var.v0;
            }
            qn6Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.H0, i5);
            this.H0 = iArrCopyOf;
            iArrCopyOf[length] = i;
            qn6[] qn6VarArr2 = this.G0;
            int i6 = maf.a;
            Object[] objArrCopyOf = Arrays.copyOf(qn6VarArr2, qn6VarArr2.length + 1);
            objArrCopyOf[qn6VarArr2.length] = qn6Var;
            this.G0 = (qn6[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.Z0, i5);
            this.Z0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.X0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (j(i2) > j(this.L0)) {
                this.M0 = length;
                this.L0 = i2;
            }
            this.Y0 = Arrays.copyOf(this.Y0, i5);
        }
        if (i2 != 5) {
            return qn6Var;
        }
        if (this.K0 == null) {
            this.K0 = new on6(qn6Var, this.w0);
        }
        return this.K0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024e A[PHI: r9
      0x024e: PHI (r9v13 vl6) = (r9v12 vl6), (r9v22 vl6) binds: [B:92:0x0219, B:100:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[PHI: r1
      0x00c0: PHI (r1v17 long) = (r1v16 long), (r1v16 long), (r1v64 long) binds: [B:39:0x009d, B:41:0x00a1, B:43:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    @Override // defpackage.i6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r56) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn6.C(long):boolean");
    }

    public final boolean D(long j, boolean z) {
        this.a1 = j;
        if (m()) {
            this.b1 = j;
            return true;
        }
        if (this.N0 && !z) {
            int length = this.G0.length;
            for (int i = 0; i < length; i++) {
                if (this.G0[i].A(j, false) || (!this.Z0[i] && this.X0)) {
                }
            }
            return false;
        }
        this.b1 = j;
        this.e1 = false;
        this.y0.clear();
        jo7 jo7Var = this.u0;
        if (jo7Var.o()) {
            if (this.N0) {
                for (qn6 qn6Var : this.G0) {
                    qn6Var.i();
                }
            }
            jo7Var.a();
        } else {
            jo7Var.c = null;
            x();
        }
        return true;
    }

    @Override // defpackage.oa5
    public final void M(u1d u1dVar) {
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.u0.o();
    }

    @Override // defpackage.ho7
    public final void b() {
        for (qn6 qn6Var : this.G0) {
            qn6Var.z(true);
            er4 er4Var = qn6Var.h;
            if (er4Var != null) {
                er4Var.f(qn6Var.e);
                qn6Var.h = null;
                qn6Var.g = null;
            }
        }
    }

    @Override // defpackage.brc
    public final void c() {
        this.C0.post(this.A0);
    }

    public final void d() {
        np8.f(this.O0);
        this.T0.getClass();
        this.U0.getClass();
    }

    public final sze e(qze[] qzeVarArr) {
        for (int i = 0; i < qzeVarArr.length; i++) {
            qze qzeVar = qzeVarArr[i];
            oy5[] oy5VarArr = new oy5[qzeVar.a];
            for (int i2 = 0; i2 < qzeVar.a; i2++) {
                oy5 oy5Var = qzeVar.c[i2];
                int iB = this.Z.b(oy5Var);
                my5 my5VarA = oy5Var.a();
                my5VarA.D = iB;
                oy5VarArr[i2] = my5VarA.a();
            }
            qzeVarArr[i] = new qze(qzeVar.b, oy5VarArr);
        }
        return new sze(qzeVarArr);
    }

    @Override // defpackage.i6d
    public final long f() {
        if (m()) {
            return this.b1;
        }
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        return i().s0;
    }

    public final void h(int i) {
        ArrayList arrayList;
        np8.f(!this.u0.o());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.y0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    cm6 cm6Var = (cm6) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.G0.length; i4++) {
                        if (this.G0[i4].o() > cm6Var.f(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((cm6) arrayList.get(i3)).y0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j = i().s0;
        cm6 cm6Var2 = (cm6) arrayList.get(i2);
        maf.I(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.G0.length; i5++) {
            this.G0[i5].k(cm6Var2.f(i5));
        }
        if (arrayList.isEmpty()) {
            this.b1 = this.a1;
        } else {
            ((cm6) mqd.m(arrayList)).U0 = true;
        }
        this.e1 = false;
        int i6 = this.L0;
        long j2 = cm6Var2.Z;
        gk8 gk8Var = this.v0;
        gk8Var.m(new pc8(1, i6, null, 3, null, gk8Var.a(j2), gk8Var.a(j)));
    }

    public final cm6 i() {
        return (cm6) wg0.f(this.y0, 1);
    }

    public final boolean m() {
        return this.b1 != -9223372036854775807L;
    }

    @Override // defpackage.co7
    public final void o(fo7 fo7Var, long j, long j2, boolean z) {
        h13 h13Var = (h13) fo7Var;
        this.F0 = null;
        long j3 = h13Var.a;
        t1e t1eVar = h13Var.t0;
        xn7 xn7Var = new xn7(j3, h13Var.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.t0.getClass();
        this.v0.d(xn7Var, h13Var.c, this.b, h13Var.o, h13Var.X, h13Var.Y, h13Var.Z, h13Var.s0);
        if (z) {
            return;
        }
        if (m() || this.P0 == 0) {
            x();
        }
        if (this.P0 > 0) {
            this.c.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        int i;
        if (!this.S0 && this.V0 == null && this.N0) {
            int i2 = 0;
            for (qn6 qn6Var : this.G0) {
                if (qn6Var.r() == null) {
                    return;
                }
            }
            sze szeVar = this.T0;
            if (szeVar != null) {
                int i3 = szeVar.a;
                int[] iArr = new int[i3];
                this.V0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        qn6[] qn6VarArr = this.G0;
                        if (i5 < qn6VarArr.length) {
                            oy5 oy5VarR = qn6VarArr[i5].r();
                            np8.g(oy5VarR);
                            oy5 oy5Var = this.T0.a(i4).c[0];
                            String str = oy5Var.w0;
                            String str2 = oy5VarR.w0;
                            int iG = ha9.g(str2);
                            if (iG != 3) {
                                if (iG == ha9.g(str)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (maf.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || oy5VarR.O0 == oy5Var.O0)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.V0[i4] = i5;
                }
                Iterator it = this.D0.iterator();
                while (it.hasNext()) {
                    ((jn6) it.next()).a();
                }
                return;
            }
            int length = this.G0.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                oy5 oy5VarR2 = this.G0[i6].r();
                np8.g(oy5VarR2);
                String str3 = oy5VarR2.w0;
                if (ha9.j(str3)) {
                    i9 = 2;
                } else if (!ha9.h(str3)) {
                    i9 = ha9.i(str3) ? 3 : -2;
                }
                if (j(i9) > j(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            qze qzeVar = this.o.h;
            int i10 = qzeVar.a;
            this.W0 = -1;
            this.V0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.V0[i11] = i11;
            }
            qze[] qzeVarArr = new qze[length];
            int i12 = 0;
            while (i12 < length) {
                oy5 oy5VarR3 = this.G0[i12].r();
                np8.g(oy5VarR3);
                String str4 = this.a;
                oy5 oy5Var2 = this.Y;
                if (i12 == i7) {
                    oy5[] oy5VarArr = new oy5[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        oy5 oy5VarD = qzeVar.c[i13];
                        if (i8 == 1 && oy5Var2 != null) {
                            oy5VarD = oy5VarD.d(oy5Var2);
                        }
                        oy5VarArr[i13] = i10 == 1 ? oy5VarR3.d(oy5VarD) : g(oy5VarD, oy5VarR3, true);
                    }
                    qzeVarArr[i12] = new qze(str4, oy5VarArr);
                    this.W0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !ha9.h(oy5VarR3.w0)) {
                        oy5Var2 = null;
                    }
                    int i14 = i12 < i7 ? i12 : i12 - 1;
                    StringBuilder sb = new StringBuilder(rh4.e(18, str4));
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i14);
                    i = 0;
                    qzeVarArr[i12] = new qze(sb.toString(), g(oy5Var2, oy5VarR3, false));
                }
                i12++;
                i2 = i;
            }
            int i15 = i2;
            this.T0 = e(qzeVarArr);
            np8.f(this.U0 == null ? 1 : i15);
            this.U0 = Collections.emptySet();
            this.O0 = true;
            this.c.i();
        }
    }

    @Override // defpackage.i6d
    public final long r() {
        long j;
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.b1;
        }
        long jMax = this.a1;
        cm6 cm6VarI = i();
        if (!cm6VarI.S0) {
            ArrayList arrayList = this.y0;
            cm6VarI = arrayList.size() > 1 ? (cm6) wg0.f(arrayList, 2) : null;
        }
        if (cm6VarI != null) {
            jMax = Math.max(jMax, cm6VarI.s0);
        }
        if (this.N0) {
            for (qn6 qn6Var : this.G0) {
                synchronized (qn6Var) {
                    j = qn6Var.v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        jo7 jo7Var = this.u0;
        if (jo7Var.n() || m()) {
            return;
        }
        boolean zO = jo7Var.o();
        wl6 wl6Var = this.o;
        List list = this.z0;
        if (zO) {
            this.F0.getClass();
            if (wl6Var.n != null ? false : wl6Var.q.u(j, this.F0, list)) {
                jo7Var.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && wl6Var.b((cm6) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            h(size);
        }
        int size2 = (wl6Var.n != null || wl6Var.q.length() < 2) ? list.size() : wl6Var.q.g(j, list);
        if (size2 < this.y0.size()) {
            h(size2);
        }
    }

    public final void u() {
        this.u0.c();
        wl6 wl6Var = this.o;
        BehindLiveWindowException behindLiveWindowException = wl6Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = wl6Var.o;
        if (uri == null || !wl6Var.s) {
            return;
        }
        fb4 fb4Var = (fb4) wl6Var.g.b.get(uri);
        fb4Var.b.c();
        IOException iOException = fb4Var.u0;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void v(qze[] qzeVarArr, int... iArr) {
        this.T0 = e(qzeVarArr);
        this.U0 = new HashSet();
        for (int i : iArr) {
            this.U0.add(this.T0.a(i));
        }
        this.W0 = 0;
        Handler handler = this.C0;
        em6 em6Var = this.c;
        Objects.requireNonNull(em6Var);
        handler.post(new dd4(29, em6Var));
        this.O0 = true;
    }

    @Override // defpackage.oa5, defpackage.pa5
    public final void w() {
        this.f1 = true;
        this.C0.post(this.B0);
    }

    public final void x() {
        for (qn6 qn6Var : this.G0) {
            qn6Var.z(this.c1);
        }
        this.c1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.co7
    public final void y(fo7 fo7Var, long j, long j2) {
        h13 h13Var = (h13) fo7Var;
        this.F0 = null;
        wl6 wl6Var = this.o;
        wl6Var.getClass();
        if (h13Var instanceof pl6) {
            pl6 pl6Var = (pl6) h13Var;
            wl6Var.m = pl6Var.u0;
            Uri uri = pl6Var.b.a;
            byte[] bArr = pl6Var.w0;
            bArr.getClass();
            bkg bkgVar = wl6Var.j;
            bkgVar.getClass();
            uri.getClass();
        }
        long j3 = h13Var.a;
        t1e t1eVar = h13Var.t0;
        xn7 xn7Var = new xn7(j3, h13Var.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        this.t0.getClass();
        this.v0.f(xn7Var, h13Var.c, this.b, h13Var.o, h13Var.X, h13Var.Y, h13Var.Z, h13Var.s0);
        if (this.O0) {
            this.c.c(this);
        } else {
            C(this.a1);
        }
    }

    @Override // defpackage.co7
    public final b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        boolean zR;
        b11 b11Var;
        int i2;
        h13 h13Var = (h13) fo7Var;
        boolean z = h13Var instanceof cm6;
        if (z && !((cm6) h13Var).V0 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).c) == 410 || i2 == 404)) {
            return jo7.o;
        }
        long j3 = h13Var.t0.b;
        t1e t1eVar = h13Var.t0;
        xn7 xn7Var = new xn7(h13Var.a, h13Var.b, t1eVar.c, t1eVar.o, j, j2, j3);
        maf.M(h13Var.Z);
        maf.M(h13Var.s0);
        wn7 wn7Var = new wn7(i, iOException);
        wl6 wl6Var = this.o;
        ty4 ty4VarH = ay7.h(wl6Var.q);
        this.t0.getClass();
        b11 b11VarU = buc.u(ty4VarH, wn7Var);
        if (b11VarU == null || b11VarU.b != 2) {
            zR = false;
        } else {
            m85 m85Var = wl6Var.q;
            zR = m85Var.r(m85Var.p(wl6Var.h.a(h13Var.o)), b11VarU.c);
        }
        if (zR) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.y0;
                np8.f(((cm6) arrayList.remove(arrayList.size() - 1)) == h13Var);
                if (arrayList.isEmpty()) {
                    this.b1 = this.a1;
                } else {
                    ((cm6) mqd.m(arrayList)).U0 = true;
                }
            }
            b11Var = jo7.X;
        } else {
            long jW = buc.w(wn7Var);
            b11Var = jW != -9223372036854775807L ? new b11(jW, 0, 4, false) : jo7.Y;
        }
        b11 b11Var2 = b11Var;
        boolean z2 = !b11Var2.a();
        this.v0.h(xn7Var, h13Var.c, this.b, h13Var.o, h13Var.X, h13Var.Y, h13Var.Z, h13Var.s0, iOException, z2);
        if (z2) {
            this.F0 = null;
        }
        if (zR) {
            if (this.O0) {
                this.c.c(this);
            } else {
                C(this.a1);
            }
        }
        return b11Var2;
    }
}
