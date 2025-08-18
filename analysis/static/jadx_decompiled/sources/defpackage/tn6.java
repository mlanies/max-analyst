package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
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
public final class tn6 implements do7, io7, j6d, pa5, crc {
    public static final Set j1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final mn6 A0;
    public final mn6 B0;
    public final Handler C0;
    public final ArrayList D0;
    public final Map E0;
    public j13 F0;
    public rn6[] G0;
    public int[] H0;
    public final HashSet I0;
    public final SparseIntArray J0;
    public pn6 K0;
    public int L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public qy5 Q0;
    public qy5 R0;
    public boolean S0;
    public tze T0;
    public Set U0;
    public int[] V0;
    public int W0;
    public final n64 X;
    public boolean X0;
    public final qy5 Y;
    public boolean[] Y0;
    public final tr4 Z;
    public boolean[] Z0;
    public final String a;
    public long a1;
    public final int b;
    public long b1;
    public final wmc c;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public long g1;
    public dr4 h1;
    public dm6 i1;
    public final xl6 o;
    public final lr4 s0;
    public final huc t0;
    public final vq7 u0 = new vq7("Loader:HlsSampleStreamWrapper");
    public final jn v0;
    public final int w0;
    public final td x0;
    public final ArrayList y0;
    public final List z0;

    /* JADX WARN: Type inference failed for: r1v12, types: [mn6] */
    /* JADX WARN: Type inference failed for: r1v13, types: [mn6] */
    public tn6(String str, int i, wmc wmcVar, xl6 xl6Var, Map map, n64 n64Var, long j, qy5 qy5Var, tr4 tr4Var, lr4 lr4Var, huc hucVar, jn jnVar, int i2) {
        this.a = str;
        this.b = i;
        this.c = wmcVar;
        this.o = xl6Var;
        this.E0 = map;
        this.X = n64Var;
        this.Y = qy5Var;
        this.Z = tr4Var;
        this.s0 = lr4Var;
        this.t0 = hucVar;
        this.v0 = jnVar;
        this.w0 = i2;
        td tdVar = new td(10, (byte) 0);
        tdVar.c = null;
        tdVar.b = false;
        tdVar.o = null;
        this.x0 = tdVar;
        this.H0 = new int[0];
        Set set = j1;
        this.I0 = new HashSet(set.size());
        this.J0 = new SparseIntArray(set.size());
        this.G0 = new rn6[0];
        this.Z0 = new boolean[0];
        this.Y0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y0 = arrayList;
        this.z0 = Collections.unmodifiableList(arrayList);
        this.D0 = new ArrayList();
        final int i3 = 0;
        this.A0 = new Runnable(this) { // from class: mn6
            public final /* synthetic */ tn6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        tn6 tn6Var = this.b;
                        tn6Var.N0 = true;
                        tn6Var.A();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.B0 = new Runnable(this) { // from class: mn6
            public final /* synthetic */ tn6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.A();
                        break;
                    default:
                        tn6 tn6Var = this.b;
                        tn6Var.N0 = true;
                        tn6Var.A();
                        break;
                }
            }
        };
        this.C0 = oaf.o(null);
        this.a1 = j;
        this.b1 = j;
    }

    public static sk4 e(int i, int i2) {
        z04.c0("Unmapped track with id " + i + " of type " + i2);
        return new sk4();
    }

    public static qy5 p(qy5 qy5Var, qy5 qy5Var2, boolean z) {
        String strC;
        String strV;
        if (qy5Var == null) {
            return qy5Var2;
        }
        String str = qy5Var2.n;
        int iG = ia9.g(str);
        String str2 = qy5Var.j;
        if (oaf.u(iG, str2) == 1) {
            strV = oaf.v(iG, str2);
            strC = ia9.c(strV);
        } else {
            String strA = ia9.a(str2, str);
            strC = str;
            strV = strA;
        }
        ny5 ny5VarA = qy5Var2.a();
        ny5VarA.a = qy5Var.a;
        ny5VarA.b = qy5Var.b;
        ny5VarA.c = zw6.j(qy5Var.c);
        ny5VarA.d = qy5Var.d;
        ny5VarA.e = qy5Var.e;
        ny5VarA.f = qy5Var.f;
        ny5VarA.g = z ? qy5Var.g : -1;
        ny5VarA.h = z ? qy5Var.h : -1;
        ny5VarA.i = strV;
        if (iG == 2) {
            ny5VarA.s = qy5Var.t;
            ny5VarA.t = qy5Var.u;
            ny5VarA.u = qy5Var.v;
        }
        if (strC != null) {
            ny5VarA.d(strC);
        }
        int i = qy5Var.B;
        if (i != -1 && iG == 1) {
            ny5VarA.A = i;
        }
        f99 f99VarB = qy5Var.k;
        if (f99VarB != null) {
            f99 f99Var = qy5Var2.k;
            if (f99Var != null) {
                f99VarB = f99Var.b(f99VarB);
            }
            ny5VarA.j = f99VarB;
        }
        return new qy5(ny5VarA);
    }

    public static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        int i;
        if (!this.S0 && this.V0 == null && this.N0) {
            int i2 = 0;
            for (rn6 rn6Var : this.G0) {
                if (rn6Var.q() == null) {
                    return;
                }
            }
            tze tzeVar = this.T0;
            if (tzeVar != null) {
                int i3 = tzeVar.a;
                int[] iArr = new int[i3];
                this.V0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        rn6[] rn6VarArr = this.G0;
                        if (i5 < rn6VarArr.length) {
                            qy5 qy5VarQ = rn6VarArr[i5].q();
                            fm9.l(qy5VarQ);
                            qy5 qy5Var = this.T0.a(i4).d[0];
                            String str = qy5Var.n;
                            String str2 = qy5VarQ.n;
                            int iG = ia9.g(str2);
                            if (iG != 3) {
                                if (iG == ia9.g(str)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            } else if (oaf.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || qy5VarQ.G == qy5Var.G)) {
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
                    ((kn6) it.next()).a();
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
                qy5 qy5VarQ2 = this.G0[i6].q();
                fm9.l(qy5VarQ2);
                String str3 = qy5VarQ2.n;
                if (ia9.k(str3)) {
                    i9 = 2;
                } else if (!ia9.h(str3)) {
                    i9 = ia9.j(str3) ? 3 : -2;
                }
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            rze rzeVar = this.o.h;
            int i10 = rzeVar.a;
            this.W0 = -1;
            this.V0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.V0[i11] = i11;
            }
            rze[] rzeVarArr = new rze[length];
            int i12 = 0;
            while (i12 < length) {
                qy5 qy5VarQ3 = this.G0[i12].q();
                fm9.l(qy5VarQ3);
                String str4 = this.a;
                qy5 qy5Var2 = this.Y;
                if (i12 == i7) {
                    qy5[] qy5VarArr = new qy5[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        qy5 qy5VarF = rzeVar.d[i13];
                        if (i8 == 1 && qy5Var2 != null) {
                            qy5VarF = qy5VarF.f(qy5Var2);
                        }
                        qy5VarArr[i13] = i10 == 1 ? qy5VarQ3.f(qy5VarF) : p(qy5VarF, qy5VarQ3, true);
                    }
                    rzeVarArr[i12] = new rze(str4, qy5VarArr);
                    this.W0 = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !ia9.h(qy5VarQ3.n)) {
                        qy5Var2 = null;
                    }
                    StringBuilder sbO = rh4.o(str4, ":muxed:");
                    sbO.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    rzeVarArr[i12] = new rze(sbO.toString(), p(qy5Var2, qy5VarQ3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.T0 = j(rzeVarArr);
            fm9.k(this.U0 == null ? 1 : i14);
            this.U0 = Collections.emptySet();
            this.O0 = true;
            this.c.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [sk4] */
    @Override // defpackage.pa5
    /* renamed from: B */
    public final yze mo6B(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = j1;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.I0;
        SparseIntArray sparseIntArray = this.J0;
        rn6 rn6Var = null;
        if (zContains) {
            fm9.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.H0[i3] = i;
                }
                rn6Var = this.H0[i3] == i ? this.G0[i3] : e(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                rn6[] rn6VarArr = this.G0;
                if (i4 >= rn6VarArr.length) {
                    break;
                }
                if (this.H0[i4] == i) {
                    rn6Var = rn6VarArr[i4];
                    break;
                }
                i4++;
            }
        }
        if (rn6Var == null) {
            if (this.f1) {
                return e(i, i2);
            }
            int length = this.G0.length;
            boolean z = i2 == 1 || i2 == 2;
            rn6Var = new rn6(this.X, this.Z, this.s0, this.E0);
            rn6Var.t = this.a1;
            if (z) {
                rn6Var.I = this.h1;
                rn6Var.z = true;
            }
            long j = this.g1;
            if (rn6Var.F != j) {
                rn6Var.F = j;
                rn6Var.z = true;
            }
            if (this.i1 != null) {
                rn6Var.C = r2.v0;
            }
            rn6Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.H0, i5);
            this.H0 = iArrCopyOf;
            iArrCopyOf[length] = i;
            rn6[] rn6VarArr2 = this.G0;
            int i6 = oaf.a;
            Object[] objArrCopyOf = Arrays.copyOf(rn6VarArr2, rn6VarArr2.length + 1);
            objArrCopyOf[rn6VarArr2.length] = rn6Var;
            this.G0 = (rn6[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.Z0, i5);
            this.Z0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.X0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (y(i2) > y(this.L0)) {
                this.M0 = length;
                this.L0 = i2;
            }
            this.Y0 = Arrays.copyOf(this.Y0, i5);
        }
        if (i2 != 5) {
            return rn6Var;
        }
        if (this.K0 == null) {
            this.K0 = new pn6(rn6Var, this.w0);
        }
        return this.K0;
    }

    @Override // defpackage.do7
    public final b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        boolean zU;
        b11 b11Var;
        int i2;
        j13 j13Var = (j13) go7Var;
        boolean z = j13Var instanceof dm6;
        if (z && !((dm6) j13Var).W0 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).o) == 410 || i2 == 404)) {
            return vq7.X;
        }
        long j3 = j13Var.t0.b;
        Uri uri = j13Var.t0.c;
        yn7 yn7Var = new yn7(j2);
        oaf.h0(j13Var.Z);
        oaf.h0(j13Var.s0);
        wn7 wn7Var = new wn7(i, iOException);
        xl6 xl6Var = this.o;
        ty4 ty4VarN = dy7.n(xl6Var.r);
        this.t0.getClass();
        b11 b11VarO = huc.o(ty4VarN, wn7Var);
        if (b11VarO == null || b11VarO.b != 2) {
            zU = false;
        } else {
            n85 n85Var = xl6Var.r;
            zU = n85Var.u(n85Var.p(xl6Var.h.d(j13Var.o)), b11VarO.c);
        }
        if (zU) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.y0;
                fm9.k(((dm6) arrayList.remove(arrayList.size() - 1)) == j13Var);
                if (arrayList.isEmpty()) {
                    this.b1 = this.a1;
                } else {
                    ((dm6) mqd.m(arrayList)).V0 = true;
                }
            }
            b11Var = vq7.Y;
        } else {
            long jQ = huc.q(wn7Var);
            b11Var = jQ != -9223372036854775807L ? new b11(jQ, 0, 5, false) : vq7.Z;
        }
        b11 b11Var2 = b11Var;
        boolean z2 = !b11Var2.a();
        this.v0.B(yn7Var, j13Var.c, this.b, j13Var.o, j13Var.X, j13Var.Y, j13Var.Z, j13Var.s0, iOException, z2);
        if (z2) {
            this.F0 = null;
        }
        if (zU) {
            if (this.O0) {
                this.c.j(this);
            } else {
                po7 po7Var = new po7();
                po7Var.a = this.a1;
                o(new qo7(po7Var));
            }
        }
        return b11Var2;
    }

    public final void D() throws IOException {
        this.u0.c();
        xl6 xl6Var = this.o;
        BehindLiveWindowException behindLiveWindowException = xl6Var.o;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = xl6Var.p;
        if (uri == null || !xl6Var.t) {
            return;
        }
        gb4 gb4Var = (gb4) xl6Var.g.b.get(uri);
        gb4Var.b.c();
        IOException iOException = gb4Var.u0;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(rze[] rzeVarArr, int... iArr) {
        this.T0 = j(rzeVarArr);
        this.U0 = new HashSet();
        for (int i : iArr) {
            this.U0.add(this.T0.a(i));
        }
        this.W0 = 0;
        Handler handler = this.C0;
        wmc wmcVar = this.c;
        Objects.requireNonNull(wmcVar);
        handler.post(new nn6(0, wmcVar));
        this.O0 = true;
    }

    public final void F() {
        for (rn6 rn6Var : this.G0) {
            rn6Var.y(this.c1);
        }
        this.c1 = false;
    }

    public final boolean G(long j, boolean z) {
        dm6 dm6Var;
        boolean z2;
        this.a1 = j;
        if (z()) {
            this.b1 = j;
            return true;
        }
        boolean z3 = this.o.q;
        ArrayList arrayList = this.y0;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                dm6Var = (dm6) arrayList.get(i);
                if (dm6Var.Z == j) {
                    break;
                }
            }
            dm6Var = null;
        } else {
            dm6Var = null;
        }
        if (this.N0 && !z) {
            int length = this.G0.length;
            for (int i2 = 0; i2 < length; i2++) {
                rn6 rn6Var = this.G0[i2];
                if (!(dm6Var != null ? rn6Var.z(dm6Var.f(i2)) : rn6Var.A(j, false)) && (this.Z0[i2] || !this.X0)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.b1 = j;
        this.e1 = false;
        arrayList.clear();
        vq7 vq7Var = this.u0;
        if (vq7Var.o()) {
            if (this.N0) {
                for (rn6 rn6Var2 : this.G0) {
                    rn6Var2.h();
                }
            }
            vq7Var.l();
        } else {
            vq7Var.o = null;
            F();
        }
        return true;
    }

    @Override // defpackage.pa5
    public final void J(v1d v1dVar) {
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.u0.o();
    }

    @Override // defpackage.io7
    public final void b() {
        for (rn6 rn6Var : this.G0) {
            rn6Var.y(true);
            fr4 fr4Var = rn6Var.h;
            if (fr4Var != null) {
                fr4Var.f(rn6Var.e);
                rn6Var.h = null;
                rn6Var.g = null;
            }
        }
    }

    @Override // defpackage.crc
    public final void c() {
        this.C0.post(this.A0);
    }

    public final void d() {
        fm9.k(this.O0);
        this.T0.getClass();
        this.U0.getClass();
    }

    @Override // defpackage.j6d
    public final long f() {
        if (z()) {
            return this.b1;
        }
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        return x().s0;
    }

    public final tze j(rze[] rzeVarArr) {
        for (int i = 0; i < rzeVarArr.length; i++) {
            rze rzeVar = rzeVarArr[i];
            qy5[] qy5VarArr = new qy5[rzeVar.a];
            for (int i2 = 0; i2 < rzeVar.a; i2++) {
                qy5 qy5Var = rzeVar.d[i2];
                int iD = this.Z.d(qy5Var);
                ny5 ny5VarA = qy5Var.a();
                ny5VarA.J = iD;
                qy5VarArr[i2] = ny5VarA.a();
            }
            rzeVarArr[i] = new rze(rzeVar.b, qy5VarArr);
        }
        return new tze(rzeVarArr);
    }

    @Override // defpackage.do7
    public final void m(go7 go7Var, long j, long j2, boolean z) {
        j13 j13Var = (j13) go7Var;
        this.F0 = null;
        long j3 = j13Var.a;
        Uri uri = j13Var.t0.c;
        yn7 yn7Var = new yn7(j2);
        this.t0.getClass();
        this.v0.x(yn7Var, j13Var.c, this.b, j13Var.o, j13Var.X, j13Var.Y, j13Var.Z, j13Var.s0);
        if (z) {
            return;
        }
        if (z() || this.P0 == 0) {
            F();
        }
        if (this.P0 > 0) {
            this.c.j(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0282 A[PHI: r0
      0x0282: PHI (r0v13 vl6) = (r0v12 vl6), (r0v22 vl6) binds: [B:102:0x024d, B:110:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    @Override // defpackage.j6d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.qo7 r60) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.o(qo7):boolean");
    }

    @Override // defpackage.j6d
    public final long r() {
        long j;
        if (this.e1) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.b1;
        }
        long jMax = this.a1;
        dm6 dm6VarX = x();
        if (!dm6VarX.T0) {
            ArrayList arrayList = this.y0;
            dm6VarX = arrayList.size() > 1 ? (dm6) wg0.f(arrayList, 2) : null;
        }
        if (dm6VarX != null) {
            jMax = Math.max(jMax, dm6VarX.s0);
        }
        if (this.N0) {
            for (rn6 rn6Var : this.G0) {
                synchronized (rn6Var) {
                    j = rn6Var.v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        vq7 vq7Var = this.u0;
        if (vq7Var.n() || z()) {
            return;
        }
        boolean zO = vq7Var.o();
        xl6 xl6Var = this.o;
        List list = this.z0;
        if (zO) {
            this.F0.getClass();
            if (xl6Var.o != null ? false : xl6Var.r.t(j, this.F0, list)) {
                vq7Var.l();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && xl6Var.b((dm6) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            u(size);
        }
        int size2 = (xl6Var.o != null || xl6Var.r.length() < 2) ? list.size() : xl6Var.r.g(j, list);
        if (size2 < this.y0.size()) {
            u(size2);
        }
    }

    public final void u(int i) {
        ArrayList arrayList;
        fm9.k(!this.u0.o());
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
                    dm6 dm6Var = (dm6) arrayList.get(i2);
                    for (int i4 = 0; i4 < this.G0.length; i4++) {
                        if (this.G0[i4].n() > dm6Var.f(i4)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((dm6) arrayList.get(i3)).y0) {
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
        long j = x().s0;
        dm6 dm6Var2 = (dm6) arrayList.get(i2);
        oaf.X(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.G0.length; i5++) {
            this.G0[i5].j(dm6Var2.f(i5));
        }
        if (arrayList.isEmpty()) {
            this.b1 = this.a1;
        } else {
            ((dm6) mqd.m(arrayList)).V0 = true;
        }
        this.e1 = false;
        int i6 = this.L0;
        long j2 = dm6Var2.Z;
        jn jnVar = this.v0;
        jnVar.getClass();
        jnVar.P(new pc8(1, i6, null, 3, null, oaf.h0(j2), oaf.h0(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.do7
    public final void v(go7 go7Var, long j, long j2) {
        j13 j13Var = (j13) go7Var;
        this.F0 = null;
        xl6 xl6Var = this.o;
        xl6Var.getClass();
        if (j13Var instanceof ql6) {
            ql6 ql6Var = (ql6) j13Var;
            xl6Var.n = ql6Var.u0;
            Uri uri = ql6Var.b.a;
            byte[] bArr = ql6Var.w0;
            bArr.getClass();
            wmc wmcVar = xl6Var.j;
            wmcVar.getClass();
            uri.getClass();
        }
        long j3 = j13Var.a;
        Uri uri2 = j13Var.t0.c;
        yn7 yn7Var = new yn7(j2);
        this.t0.getClass();
        this.v0.z(yn7Var, j13Var.c, this.b, j13Var.o, j13Var.X, j13Var.Y, j13Var.Z, j13Var.s0);
        if (this.O0) {
            this.c.j(this);
            return;
        }
        po7 po7Var = new po7();
        po7Var.a = this.a1;
        o(new qo7(po7Var));
    }

    @Override // defpackage.pa5
    public final void w() {
        this.f1 = true;
        this.C0.post(this.B0);
    }

    public final dm6 x() {
        return (dm6) wg0.f(this.y0, 1);
    }

    public final boolean z() {
        return this.b1 != -9223372036854775807L;
    }
}
