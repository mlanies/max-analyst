package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class hj3 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final oi3 I;
    public final oi3 J;
    public final oi3 K;
    public final oi3 L;
    public final oi3 M;
    public final oi3 N;
    public final oi3 O;
    public final oi3 P;
    public final oi3[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public hj3 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public g12 b;
    public int b0;
    public g12 c;
    public int c0;
    public float d0;
    public float e0;
    public Object f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final hj3[] l0;
    public boolean m;
    public final hj3[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public eo6 d = null;
    public ocf e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public hj3() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        oi3 oi3Var = new oi3(this, 2);
        this.I = oi3Var;
        oi3 oi3Var2 = new oi3(this, 3);
        this.J = oi3Var2;
        oi3 oi3Var3 = new oi3(this, 4);
        this.K = oi3Var3;
        oi3 oi3Var4 = new oi3(this, 5);
        this.L = oi3Var4;
        oi3 oi3Var5 = new oi3(this, 6);
        this.M = oi3Var5;
        oi3 oi3Var6 = new oi3(this, 8);
        this.N = oi3Var6;
        oi3 oi3Var7 = new oi3(this, 9);
        this.O = oi3Var7;
        oi3 oi3Var8 = new oi3(this, 7);
        this.P = oi3Var8;
        this.Q = new oi3[]{oi3Var, oi3Var3, oi3Var2, oi3Var4, oi3Var5, oi3Var8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new hj3[]{null, null};
        this.m0 = new hj3[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(oi3Var);
        arrayList.add(oi3Var2);
        arrayList.add(oi3Var3);
        arrayList.add(oi3Var4);
        arrayList.add(oi3Var6);
        arrayList.add(oi3Var7);
        arrayList.add(oi3Var8);
        arrayList.add(oi3Var5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, oi3 oi3Var) {
        if (oi3Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(oi3Var.f);
        sb.append("'");
        if (oi3Var.h != Integer.MIN_VALUE || oi3Var.g != 0) {
            sb.append(",");
            sb.append(oi3Var.g);
            if (oi3Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(oi3Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        return this.k || (this.I.c && this.K.c);
    }

    public boolean B() {
        return this.l || (this.J.c && this.L.c);
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        hj3 hj3Var = this.T;
        if (hj3Var != null && (hj3Var instanceof ij3)) {
            ((ij3) hj3Var).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((oi3) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oi3 oi3Var = (oi3) arrayList.get(i);
            oi3Var.c = false;
            oi3Var.b = 0;
        }
    }

    public void F(cjg cjgVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        eo6 eo6Var = this.d;
        boolean z3 = z & eo6Var.g;
        ocf ocfVar = this.e;
        boolean z4 = z2 & ocfVar.g;
        int i3 = eo6Var.h.g;
        int i4 = ocfVar.h.g;
        int i5 = eo6Var.i.g;
        int i6 = ocfVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(zh7 zh7Var, boolean z) {
        int i;
        int i2;
        ocf ocfVar;
        eo6 eo6Var;
        oi3 oi3Var = this.I;
        zh7Var.getClass();
        int iN = zh7.n(oi3Var);
        int iN2 = zh7.n(this.J);
        int iN3 = zh7.n(this.K);
        int iN4 = zh7.n(this.L);
        if (z && (eo6Var = this.d) != null) {
            sh4 sh4Var = eo6Var.h;
            if (sh4Var.j) {
                sh4 sh4Var2 = eo6Var.i;
                if (sh4Var2.j) {
                    iN = sh4Var.g;
                    iN3 = sh4Var2.g;
                }
            }
        }
        if (z && (ocfVar = this.e) != null) {
            sh4 sh4Var3 = ocfVar.h;
            if (sh4Var3.j) {
                sh4 sh4Var4 = ocfVar.i;
                if (sh4Var4.j) {
                    iN2 = sh4Var3.g;
                    iN4 = sh4Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(ij3 ij3Var, zh7 zh7Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            v3c.f(ij3Var, zh7Var, this);
            hashSet.remove(this);
            b(zh7Var, ij3Var.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((oi3) it.next()).d.a(ij3Var, zh7Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((oi3) it2.next()).d.a(ij3Var, zh7Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((oi3) it3.next()).d.a(ij3Var, zh7Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((oi3) it4.next()).d.a(ij3Var, zh7Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((oi3) it5.next()).d.a(ij3Var, zh7Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0712  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.zh7 r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj3.b(zh7, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.zh7 r31, boolean r32, boolean r33, boolean r34, boolean r35, defpackage.sud r36, defpackage.sud r37, int r38, boolean r39, defpackage.oi3 r40, defpackage.oi3 r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj3.d(zh7, boolean, boolean, boolean, boolean, sud, sud, int, boolean, oi3, oi3, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, hj3 hj3Var, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, hj3Var, i2, 0);
                    e(4, hj3Var, i2, 0);
                    i(7).a(hj3Var.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, hj3Var, i2, 0);
                        e(5, hj3Var, i2, 0);
                        i(7).a(hj3Var.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            oi3 oi3VarI = i(2);
            oi3 oi3VarI2 = i(4);
            oi3 oi3VarI3 = i(3);
            oi3 oi3VarI4 = i(5);
            boolean z2 = true;
            if ((oi3VarI == null || !oi3VarI.h()) && (oi3VarI2 == null || !oi3VarI2.h())) {
                e(2, hj3Var, 2, 0);
                e(4, hj3Var, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((oi3VarI3 == null || !oi3VarI3.h()) && (oi3VarI4 == null || !oi3VarI4.h())) {
                e(3, hj3Var, 3, 0);
                e(5, hj3Var, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(hj3Var.i(7), 0);
                return;
            } else if (z) {
                i(8).a(hj3Var.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(hj3Var.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            oi3 oi3VarI5 = i(2);
            oi3 oi3VarI6 = hj3Var.i(i2);
            oi3 oi3VarI7 = i(4);
            oi3VarI5.a(oi3VarI6, 0);
            oi3VarI7.a(oi3VarI6, 0);
            i(8).a(oi3VarI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            oi3 oi3VarI8 = hj3Var.i(i2);
            i(3).a(oi3VarI8, 0);
            i(5).a(oi3VarI8, 0);
            i(9).a(oi3VarI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(hj3Var.i(2), 0);
            i(4).a(hj3Var.i(4), 0);
            i(8).a(hj3Var.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(hj3Var.i(3), 0);
            i(5).a(hj3Var.i(5), 0);
            i(9).a(hj3Var.i(i2), 0);
            return;
        }
        oi3 oi3VarI9 = i(i);
        oi3 oi3VarI10 = hj3Var.i(i2);
        if (oi3VarI9.i(oi3VarI10)) {
            if (i == 6) {
                oi3 oi3VarI11 = i(3);
                oi3 oi3VarI12 = i(5);
                if (oi3VarI11 != null) {
                    oi3VarI11.j();
                }
                if (oi3VarI12 != null) {
                    oi3VarI12.j();
                }
            } else if (i == 3 || i == 5) {
                oi3 oi3VarI13 = i(6);
                if (oi3VarI13 != null) {
                    oi3VarI13.j();
                }
                oi3 oi3VarI14 = i(7);
                if (oi3VarI14.f != oi3VarI10) {
                    oi3VarI14.j();
                }
                oi3 oi3VarF = i(i).f();
                oi3 oi3VarI15 = i(9);
                if (oi3VarI15.h()) {
                    oi3VarF.j();
                    oi3VarI15.j();
                }
            } else if (i == 2 || i == 4) {
                oi3 oi3VarI16 = i(7);
                if (oi3VarI16.f != oi3VarI10) {
                    oi3VarI16.j();
                }
                oi3 oi3VarF2 = i(i).f();
                oi3 oi3VarI17 = i(8);
                if (oi3VarI17.h()) {
                    oi3VarF2.j();
                    oi3VarI17.j();
                }
            }
            oi3VarI9.a(oi3VarI10, i3);
        }
    }

    public final void f(oi3 oi3Var, oi3 oi3Var2, int i) {
        if (oi3Var.d == this) {
            e(oi3Var.e, oi3Var2.d, oi3Var2.e, i);
        }
    }

    public final void g(zh7 zh7Var) {
        zh7Var.k(this.I);
        zh7Var.k(this.J);
        zh7Var.k(this.K);
        zh7Var.k(this.L);
        if (this.a0 > 0) {
            zh7Var.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            eo6 eo6Var = new eo6(this);
            eo6Var.h.e = 4;
            eo6Var.i.e = 5;
            eo6Var.f = 0;
            this.d = eo6Var;
        }
        if (this.e == null) {
            ocf ocfVar = new ocf(this);
            sh4 sh4Var = new sh4(ocfVar);
            ocfVar.k = sh4Var;
            ocfVar.l = null;
            ocfVar.h.e = 6;
            ocfVar.i.e = 7;
            sh4Var.e = 8;
            ocfVar.f = 1;
            this.e = ocfVar;
        }
    }

    public oi3 i(int i) {
        switch (au1.s(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(ms2.n(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final hj3 l(int i) {
        oi3 oi3Var;
        oi3 oi3Var2;
        if (i != 0) {
            if (i == 1 && (oi3Var2 = (oi3Var = this.L).f) != null && oi3Var2.f == oi3Var) {
                return oi3Var2.d;
            }
            return null;
        }
        oi3 oi3Var3 = this.K;
        oi3 oi3Var4 = oi3Var3.f;
        if (oi3Var4 == null || oi3Var4.f != oi3Var3) {
            return null;
        }
        return oi3Var4.d;
    }

    public final hj3 m(int i) {
        oi3 oi3Var;
        oi3 oi3Var2;
        if (i != 0) {
            if (i == 1 && (oi3Var2 = (oi3Var = this.J).f) != null && oi3Var2.f == oi3Var) {
                return oi3Var2.d;
            }
            return null;
        }
        oi3 oi3Var3 = this.I;
        oi3 oi3Var4 = oi3Var3.f;
        if (oi3Var4 == null || oi3Var4.f != oi3Var3) {
            return null;
        }
        return oi3Var4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.V;
        int i7 = this.c0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.W;
        int i11 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        hj3 hj3Var = this.T;
        return (hj3Var == null || !(hj3Var instanceof ij3)) ? this.Y : ((ij3) hj3Var).x0 + this.Y;
    }

    public final int s() {
        hj3 hj3Var = this.T;
        return (hj3Var == null || !(hj3Var instanceof ij3)) ? this.Z : ((ij3) hj3Var).y0 + this.Z;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        return ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0)) + (this.M.f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sbL = au1.l("");
        sbL.append(this.h0 != null ? zr6.l(new StringBuilder("id: "), this.h0, " ") : "");
        sbL.append("(");
        sbL.append(this.Y);
        sbL.append(", ");
        sbL.append(this.Z);
        sbL.append(") - (");
        sbL.append(this.U);
        sbL.append(" x ");
        return zr6.j(sbL, this.V, ")");
    }

    public final boolean u(int i, int i2) {
        oi3 oi3Var;
        oi3 oi3Var2;
        oi3 oi3Var3;
        oi3 oi3Var4;
        if (i == 0) {
            oi3 oi3Var5 = this.I;
            oi3 oi3Var6 = oi3Var5.f;
            if (oi3Var6 != null && oi3Var6.c && (oi3Var4 = (oi3Var3 = this.K).f) != null && oi3Var4.c) {
                return (oi3Var4.d() - oi3Var3.e()) - (oi3Var5.e() + oi3Var5.f.d()) >= i2;
            }
        } else {
            oi3 oi3Var7 = this.J;
            oi3 oi3Var8 = oi3Var7.f;
            if (oi3Var8 != null && oi3Var8.c && (oi3Var2 = (oi3Var = this.L).f) != null && oi3Var2.c) {
                return (oi3Var2.d() - oi3Var.e()) - (oi3Var7.e() + oi3Var7.f.d()) >= i2;
            }
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, hj3 hj3Var) {
        i(i).b(hj3Var.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        oi3 oi3Var;
        oi3 oi3Var2;
        int i2 = i * 2;
        oi3[] oi3VarArr = this.Q;
        oi3 oi3Var3 = oi3VarArr[i2];
        oi3 oi3Var4 = oi3Var3.f;
        return (oi3Var4 == null || oi3Var4.f == oi3Var3 || (oi3Var2 = (oi3Var = oi3VarArr[i2 + 1]).f) == null || oi3Var2.f != oi3Var) ? false : true;
    }

    public final boolean x() {
        oi3 oi3Var = this.I;
        oi3 oi3Var2 = oi3Var.f;
        if (oi3Var2 != null && oi3Var2.f == oi3Var) {
            return true;
        }
        oi3 oi3Var3 = this.K;
        oi3 oi3Var4 = oi3Var3.f;
        return oi3Var4 != null && oi3Var4.f == oi3Var3;
    }

    public final boolean y() {
        oi3 oi3Var = this.J;
        oi3 oi3Var2 = oi3Var.f;
        if (oi3Var2 != null && oi3Var2.f == oi3Var) {
            return true;
        }
        oi3 oi3Var3 = this.L;
        oi3 oi3Var4 = oi3Var3.f;
        return oi3Var4 != null && oi3Var4.f == oi3Var3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
