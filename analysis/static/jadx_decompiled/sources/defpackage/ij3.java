package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ij3 extends hj3 {
    public int A0;
    public f12[] B0;
    public f12[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final xk0 L0;
    public ArrayList q0 = new ArrayList();
    public final adb r0;
    public final qh4 s0;
    public int t0;
    public dob u0;
    public boolean v0;
    public final zh7 w0;
    public int x0;
    public int y0;
    public int z0;

    public ij3() {
        adb adbVar = new adb();
        adbVar.a = new ArrayList();
        adbVar.b = new xk0(0);
        adbVar.c = this;
        this.r0 = adbVar;
        qh4 qh4Var = new qh4();
        qh4Var.a = true;
        qh4Var.b = true;
        qh4Var.e = new ArrayList();
        new ArrayList();
        qh4Var.g = null;
        qh4Var.h = new xk0(0);
        qh4Var.f = new ArrayList();
        qh4Var.c = this;
        qh4Var.d = this;
        this.s0 = qh4Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new zh7();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new f12[4];
        this.C0 = new f12[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new xk0(0);
    }

    public static void V(hj3 hj3Var, dob dobVar, xk0 xk0Var) {
        int i;
        int i2;
        if (dobVar == null) {
            return;
        }
        if (hj3Var.g0 == 8 || (hj3Var instanceof fh6) || (hj3Var instanceof nh0)) {
            xk0Var.g = 0;
            xk0Var.h = 0;
            return;
        }
        int[] iArr = hj3Var.p0;
        xk0Var.b = iArr[0];
        xk0Var.d = iArr[1];
        xk0Var.e = hj3Var.q();
        xk0Var.f = hj3Var.k();
        xk0Var.k = false;
        xk0Var.j = 0;
        boolean z = xk0Var.b == 3;
        boolean z2 = xk0Var.d == 3;
        boolean z3 = z && hj3Var.W > 0.0f;
        boolean z4 = z2 && hj3Var.W > 0.0f;
        if (z && hj3Var.t(0) && hj3Var.r == 0 && !z3) {
            xk0Var.b = 2;
            if (z2 && hj3Var.s == 0) {
                xk0Var.b = 1;
            }
            z = false;
        }
        if (z2 && hj3Var.t(1) && hj3Var.s == 0 && !z4) {
            xk0Var.d = 2;
            if (z && hj3Var.r == 0) {
                xk0Var.d = 1;
            }
            z2 = false;
        }
        if (hj3Var.A()) {
            xk0Var.b = 1;
            z = false;
        }
        if (hj3Var.B()) {
            xk0Var.d = 1;
            z2 = false;
        }
        int[] iArr2 = hj3Var.t;
        if (z3) {
            if (iArr2[0] == 4) {
                xk0Var.b = 1;
            } else if (!z2) {
                if (xk0Var.d == 1) {
                    i2 = xk0Var.f;
                } else {
                    xk0Var.b = 2;
                    dobVar.c(hj3Var, xk0Var);
                    i2 = xk0Var.h;
                }
                xk0Var.b = 1;
                xk0Var.e = (int) (hj3Var.W * i2);
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                xk0Var.d = 1;
            } else if (!z) {
                if (xk0Var.b == 1) {
                    i = xk0Var.e;
                } else {
                    xk0Var.d = 2;
                    dobVar.c(hj3Var, xk0Var);
                    i = xk0Var.g;
                }
                xk0Var.d = 1;
                if (hj3Var.X == -1) {
                    xk0Var.f = (int) (i / hj3Var.W);
                } else {
                    xk0Var.f = (int) (hj3Var.W * i);
                }
            }
        }
        dobVar.c(hj3Var, xk0Var);
        hj3Var.O(xk0Var.g);
        hj3Var.L(xk0Var.h);
        hj3Var.E = xk0Var.c;
        hj3Var.I(xk0Var.i);
        xk0Var.j = 0;
    }

    @Override // defpackage.hj3
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        X();
    }

    @Override // defpackage.hj3
    public final void F(cjg cjgVar) {
        super.F(cjgVar);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((hj3) this.q0.get(i)).F(cjgVar);
        }
    }

    @Override // defpackage.hj3
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((hj3) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(hj3 hj3Var, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            f12[] f12VarArr = this.C0;
            if (i2 >= f12VarArr.length) {
                this.C0 = (f12[]) Arrays.copyOf(f12VarArr, f12VarArr.length * 2);
            }
            f12[] f12VarArr2 = this.C0;
            int i3 = this.z0;
            f12VarArr2[i3] = new f12(hj3Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            f12[] f12VarArr3 = this.B0;
            if (i4 >= f12VarArr3.length) {
                this.B0 = (f12[]) Arrays.copyOf(f12VarArr3, f12VarArr3.length * 2);
            }
            f12[] f12VarArr4 = this.B0;
            int i5 = this.A0;
            f12VarArr4[i5] = new f12(hj3Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(zh7 zh7Var) {
        boolean zW = W(64);
        b(zh7Var, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            hj3 hj3Var = (hj3) this.q0.get(i);
            boolean[] zArr = hj3Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (hj3Var instanceof nh0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                hj3 hj3Var2 = (hj3) this.q0.get(i2);
                if (hj3Var2 instanceof nh0) {
                    nh0 nh0Var = (nh0) hj3Var2;
                    for (int i3 = 0; i3 < nh0Var.r0; i3++) {
                        hj3 hj3Var3 = nh0Var.q0[i3];
                        if (nh0Var.t0 || hj3Var3.c()) {
                            int i4 = nh0Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                hj3Var3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                hj3Var3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            hj3 hj3Var4 = (hj3) this.q0.get(i5);
            hj3Var4.getClass();
            boolean z2 = hj3Var4 instanceof nn5;
            if (z2 || (hj3Var4 instanceof fh6)) {
                if (z2) {
                    hashSet.add(hj3Var4);
                } else {
                    hj3Var4.b(zh7Var, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nn5 nn5Var = (nn5) ((hj3) it.next());
                for (int i6 = 0; i6 < nn5Var.r0; i6++) {
                    if (hashSet.contains(nn5Var.q0[i6])) {
                        nn5Var.b(zh7Var, zW);
                        hashSet.remove(nn5Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((hj3) it2.next()).b(zh7Var, zW);
                }
                hashSet.clear();
            }
        }
        if (zh7.p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                hj3 hj3Var5 = (hj3) this.q0.get(i7);
                hj3Var5.getClass();
                if (!(hj3Var5 instanceof nn5) && !(hj3Var5 instanceof fh6)) {
                    hashSet2.add(hj3Var5);
                }
            }
            a(this, zh7Var, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                hj3 hj3Var6 = (hj3) it3.next();
                v3c.f(this, zh7Var, hj3Var6);
                hj3Var6.b(zh7Var, zW);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                hj3 hj3Var7 = (hj3) this.q0.get(i8);
                if (hj3Var7 instanceof ij3) {
                    int[] iArr = hj3Var7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        hj3Var7.M(1);
                    }
                    if (i10 == 2) {
                        hj3Var7.N(1);
                    }
                    hj3Var7.b(zh7Var, zW);
                    if (i9 == 2) {
                        hj3Var7.M(i9);
                    }
                    if (i10 == 2) {
                        hj3Var7.N(i10);
                    }
                } else {
                    v3c.f(this, zh7Var, hj3Var7);
                    if (!(hj3Var7 instanceof nn5) && !(hj3Var7 instanceof fh6)) {
                        hj3Var7.b(zh7Var, zW);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            i24.a(this, zh7Var, null, 0);
        }
        if (this.A0 > 0) {
            i24.a(this, zh7Var, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        qh4 qh4Var = this.s0;
        ij3 ij3Var = (ij3) qh4Var.c;
        boolean z3 = false;
        int iJ = ij3Var.j(0);
        int iJ2 = ij3Var.j(1);
        int iR = ij3Var.r();
        int iS = ij3Var.s();
        ArrayList arrayList = (ArrayList) qh4Var.e;
        if (z && (iJ == 2 || iJ2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r5g r5gVar = (r5g) it.next();
                if (r5gVar.f == i && !r5gVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    ij3Var.M(1);
                    ij3Var.O(qh4Var.d(ij3Var, 0));
                    ij3Var.d.e.d(ij3Var.q());
                }
            } else if (z && iJ2 == 2) {
                ij3Var.N(1);
                ij3Var.L(qh4Var.d(ij3Var, 1));
                ij3Var.e.e.d(ij3Var.k());
            }
        }
        int[] iArr = ij3Var.p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iQ = ij3Var.q() + iR;
                ij3Var.d.i.d(iQ);
                ij3Var.d.e.d(iQ - iR);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = ij3Var.k() + iS;
                ij3Var.e.i.d(iK);
                ij3Var.e.e.d(iK - iS);
                z2 = true;
            }
            z2 = false;
        }
        qh4Var.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            r5g r5gVar2 = (r5g) it2.next();
            if (r5gVar2.f == i && (r5gVar2.b != ij3Var || r5gVar2.g)) {
                r5gVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            r5g r5gVar3 = (r5g) it3.next();
            if (r5gVar3.f == i && (z2 || r5gVar3.b != ij3Var)) {
                if (!r5gVar3.h.j || !r5gVar3.i.j || (!(r5gVar3 instanceof g12) && !r5gVar3.e.j)) {
                    break;
                }
            }
        }
        ij3Var.M(iJ);
        ij3Var.N(iJ2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0676 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0819 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0825 A[LOOP:14: B:499:0x0823->B:500:0x0825, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 2315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij3.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    public final void X() {
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.hj3
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((hj3) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
