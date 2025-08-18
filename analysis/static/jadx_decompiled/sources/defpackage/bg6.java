package defpackage;

import android.util.Pair;
import android.util.Printer;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.messages.views.widgets.ContextMenuGridLayout;

/* loaded from: classes.dex */
public final class bg6 {
    public final boolean a;
    public nw4 d;
    public nw4 f;
    public nw4 h;
    public int[] j;
    public int[] l;
    public zf6[] n;
    public int[] p;
    public boolean r;
    public int[] t;
    public final /* synthetic */ hg6 x;
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public boolean e = false;
    public boolean g = false;
    public boolean i = false;
    public boolean k = false;
    public boolean m = false;
    public boolean o = false;
    public boolean q = false;
    public boolean s = false;
    public boolean u = true;
    public final fg6 v = new fg6(0);
    public final fg6 w = new fg6(-100000);

    public bg6(ContextMenuGridLayout contextMenuGridLayout, boolean z) {
        this.x = contextMenuGridLayout;
        this.a = z;
    }

    public static void k(ArrayList arrayList, dg6 dg6Var, fg6 fg6Var, boolean z) {
        if (dg6Var.a() == 0) {
            return;
        }
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((zf6) it.next()).a.equals(dg6Var)) {
                    return;
                }
            }
        }
        arrayList.add(new zf6(dg6Var, fg6Var));
    }

    public static boolean n(int[] iArr, zf6 zf6Var) {
        if (!zf6Var.c) {
            return false;
        }
        dg6 dg6Var = zf6Var.a;
        int i = dg6Var.a;
        int i2 = iArr[i] + zf6Var.b.a;
        int i3 = dg6Var.b;
        if (i2 <= iArr[i3]) {
            return false;
        }
        iArr[i3] = i2;
        return true;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb;
        String str = this.a ? "x" : "y";
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            zf6 zf6Var = (zf6) it.next();
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            dg6 dg6Var = zf6Var.a;
            int i = dg6Var.a;
            int i2 = zf6Var.b.a;
            int i3 = dg6Var.b;
            if (i < i3) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i3);
                sb.append("-");
                sb.append(str);
                sb.append(i);
                sb.append(">=");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append("-");
                sb.append(str);
                sb.append(i3);
                sb.append("<=");
                i2 = -i2;
            }
            sb.append(i2);
            sb2.append(sb.toString());
        }
        return sb2.toString();
    }

    public final void b(nw4 nw4Var, boolean z) {
        for (fg6 fg6Var : (fg6[]) ((Object[]) nw4Var.o)) {
            fg6Var.a = Integer.MIN_VALUE;
        }
        cg6[] cg6VarArr = (cg6[]) ((Object[]) g().o);
        for (int i = 0; i < cg6VarArr.length; i++) {
            int iD = cg6VarArr[i].d(z);
            fg6 fg6Var2 = (fg6) ((Object[]) nw4Var.o)[((int[]) nw4Var.b)[i]];
            int i2 = fg6Var2.a;
            if (!z) {
                iD = -iD;
            }
            fg6Var2.a = Math.max(i2, iD);
        }
    }

    public final void c(boolean z) {
        int[] iArr = z ? this.j : this.l;
        hg6 hg6Var = this.x;
        int childCount = hg6Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = hg6Var.getChildAt(i);
            if (childAt.getVisibility() != 8) {
                eg6 eg6Var = (eg6) childAt.getLayoutParams();
                boolean z2 = this.a;
                dg6 dg6Var = (z2 ? eg6Var.b : eg6Var.a).b;
                int i2 = z ? dg6Var.a : dg6Var.b;
                iArr[i2] = Math.max(iArr[i2], hg6Var.f(childAt, z2, z));
            }
        }
    }

    public final nw4 d(boolean z) {
        dg6 dg6Var;
        ag6 ag6Var = new ag6(dg6.class, fg6.class);
        gg6[] gg6VarArr = (gg6[]) ((Object[]) g().c);
        int length = gg6VarArr.length;
        for (int i = 0; i < length; i++) {
            if (z) {
                dg6Var = gg6VarArr[i].b;
            } else {
                dg6 dg6Var2 = gg6VarArr[i].b;
                dg6Var = new dg6(dg6Var2.b, dg6Var2.a);
            }
            fg6 fg6Var = new fg6();
            fg6Var.a = Integer.MIN_VALUE;
            ag6Var.add(Pair.create(dg6Var, fg6Var));
        }
        return ag6Var.a();
    }

    public final zf6[] e() {
        if (this.n == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            nw4 nw4Var = this.f;
            int i = 0;
            while (true) {
                dg6[] dg6VarArr = (dg6[]) ((Object[]) nw4Var.c);
                if (i >= dg6VarArr.length) {
                    break;
                }
                k(arrayList, dg6VarArr[i], ((fg6[]) ((Object[]) nw4Var.o))[i], false);
                i++;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            nw4 nw4Var2 = this.h;
            int i2 = 0;
            while (true) {
                dg6[] dg6VarArr2 = (dg6[]) ((Object[]) nw4Var2.c);
                if (i2 >= dg6VarArr2.length) {
                    break;
                }
                k(arrayList2, dg6VarArr2[i2], ((fg6[]) ((Object[]) nw4Var2.o))[i2], false);
                i2++;
            }
            if (this.u) {
                int i3 = 0;
                while (i3 < f()) {
                    int i4 = i3 + 1;
                    k(arrayList, new dg6(i3, i4), new fg6(0), true);
                    i3 = i4;
                }
            }
            int iF = f();
            k(arrayList, new dg6(0, iF), this.v, false);
            k(arrayList2, new dg6(iF, 0), this.w, false);
            zf6[] zf6VarArrR = r(arrayList);
            zf6[] zf6VarArrR2 = r(arrayList2);
            Object[] objArr = (Object[]) Array.newInstance(zf6VarArrR.getClass().getComponentType(), zf6VarArrR.length + zf6VarArrR2.length);
            System.arraycopy(zf6VarArrR, 0, objArr, 0, zf6VarArrR.length);
            System.arraycopy(zf6VarArrR2, 0, objArr, zf6VarArrR.length, zf6VarArrR2.length);
            this.n = (zf6[]) objArr;
        }
        if (!this.o) {
            if (this.f == null) {
                this.f = d(true);
            }
            if (!this.g) {
                b(this.f, true);
                this.g = true;
            }
            if (this.h == null) {
                this.h = d(false);
            }
            if (!this.i) {
                b(this.h, false);
                this.i = true;
            }
            this.o = true;
        }
        return this.n;
    }

    public final int f() {
        return Math.max(this.b, i());
    }

    public final nw4 g() {
        int iE;
        int i;
        nw4 nw4Var = this.d;
        boolean z = this.a;
        hg6 hg6Var = this.x;
        if (nw4Var == null) {
            ag6 ag6Var = new ag6(gg6.class, cg6.class);
            int childCount = hg6Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                eg6 eg6Var = (eg6) hg6Var.getChildAt(i2).getLayoutParams();
                gg6 gg6Var = z ? eg6Var.b : eg6Var.a;
                ag6Var.add(Pair.create(gg6Var, gg6Var.a(z).o()));
            }
            this.d = ag6Var.a();
        }
        if (!this.e) {
            for (cg6 cg6Var : (cg6[]) ((Object[]) this.d.o)) {
                cg6Var.c();
            }
            int childCount2 = hg6Var.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt = hg6Var.getChildAt(i3);
                eg6 eg6Var2 = (eg6) childAt.getLayoutParams();
                gg6 gg6Var2 = z ? eg6Var2.b : eg6Var2.a;
                if (childAt.getVisibility() == 8) {
                    iE = 0;
                } else {
                    iE = hg6Var.e(childAt, z, false) + hg6Var.e(childAt, z, true) + (z ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight());
                }
                if (gg6Var2.d == 0.0f) {
                    i = 0;
                } else {
                    if (this.t == null) {
                        this.t = new int[hg6Var.getChildCount()];
                    }
                    i = this.t[i3];
                }
                int i4 = iE + i;
                nw4 nw4Var2 = this.d;
                cg6 cg6Var2 = (cg6) ((Object[]) nw4Var2.o)[((int[]) nw4Var2.b)[i3]];
                cg6Var2.c = ((gg6Var2.c == hg6.F0 && gg6Var2.d == 0.0f) ? 0 : 2) & cg6Var2.c;
                int iL = gg6Var2.a(z).l(childAt, i4, hg6Var.getLayoutMode());
                cg6Var2.b(iL, i4 - iL);
            }
            this.e = true;
        }
        return this.d;
    }

    public final int[] h() {
        boolean z;
        if (this.p == null) {
            this.p = new int[f() + 1];
        }
        if (!this.q) {
            int[] iArr = this.p;
            boolean z2 = this.s;
            hg6 hg6Var = this.x;
            float f = 0.0f;
            boolean z3 = this.a;
            if (!z2) {
                int childCount = hg6Var.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z = false;
                        break;
                    }
                    View childAt = hg6Var.getChildAt(i);
                    if (childAt.getVisibility() != 8) {
                        eg6 eg6Var = (eg6) childAt.getLayoutParams();
                        if ((z3 ? eg6Var.b : eg6Var.a).d != 0.0f) {
                            z = true;
                            break;
                        }
                    }
                    i++;
                }
                this.r = z;
                this.s = true;
            }
            if (this.r) {
                if (this.t == null) {
                    this.t = new int[hg6Var.getChildCount()];
                }
                Arrays.fill(this.t, 0);
                q(e(), iArr, true);
                int childCount2 = (hg6Var.getChildCount() * this.v.a) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = hg6Var.getChildCount();
                    for (int i2 = 0; i2 < childCount3; i2++) {
                        View childAt2 = hg6Var.getChildAt(i2);
                        if (childAt2.getVisibility() != 8) {
                            eg6 eg6Var2 = (eg6) childAt2.getLayoutParams();
                            f += (z3 ? eg6Var2.b : eg6Var2.a).d;
                        }
                    }
                    int i3 = -1;
                    boolean z4 = true;
                    int i4 = 0;
                    while (i4 < childCount2) {
                        int i5 = (int) ((i4 + childCount2) / 2);
                        m();
                        p(i5, f);
                        boolean zQ = q(e(), iArr, false);
                        if (zQ) {
                            i4 = i5 + 1;
                            i3 = i5;
                        } else {
                            childCount2 = i5;
                        }
                        z4 = zQ;
                    }
                    if (i3 > 0 && !z4) {
                        m();
                        p(i3, f);
                        q(e(), iArr, true);
                    }
                }
            } else {
                q(e(), iArr, true);
            }
            if (!this.u) {
                int i6 = iArr[0];
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    iArr[i7] = iArr[i7] - i6;
                }
            }
            this.q = true;
        }
        return this.p;
    }

    public final int i() {
        if (this.c == Integer.MIN_VALUE) {
            hg6 hg6Var = this.x;
            int childCount = hg6Var.getChildCount();
            int iMax = -1;
            for (int i = 0; i < childCount; i++) {
                eg6 eg6Var = (eg6) hg6Var.getChildAt(i).getLayoutParams();
                dg6 dg6Var = (this.a ? eg6Var.b : eg6Var.a).b;
                iMax = Math.max(Math.max(Math.max(iMax, dg6Var.a), dg6Var.b), dg6Var.a());
            }
            this.c = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
        }
        return this.c;
    }

    public final int j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            this.v.a = 0;
            this.w.a = -size;
            this.q = false;
            return h()[f()];
        }
        if (mode == 0) {
            this.v.a = 0;
            this.w.a = -100000;
            this.q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        this.v.a = size;
        this.w.a = -size;
        this.q = false;
        return h()[f()];
    }

    public final void l() {
        this.c = Integer.MIN_VALUE;
        this.d = null;
        this.f = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.n = null;
        this.p = null;
        this.t = null;
        this.s = false;
        m();
    }

    public final void m() {
        this.e = false;
        this.g = false;
        this.i = false;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
    }

    public final void o(int i) {
        if (i == Integer.MIN_VALUE || i >= i()) {
            this.b = i;
        } else {
            hg6.g((this.a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void p(int i, float f) {
        Arrays.fill(this.t, 0);
        hg6 hg6Var = this.x;
        int childCount = hg6Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = hg6Var.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                eg6 eg6Var = (eg6) childAt.getLayoutParams();
                float f2 = (this.a ? eg6Var.b : eg6Var.a).d;
                if (f2 != 0.0f) {
                    int iRound = Math.round((i * f2) / f);
                    this.t[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }
    }

    public final boolean q(zf6[] zf6VarArr, int[] iArr, boolean z) {
        String str = this.a ? "horizontal" : "vertical";
        int iF = f() + 1;
        boolean[] zArr = null;
        for (int i = 0; i < zf6VarArr.length; i++) {
            Arrays.fill(iArr, 0);
            for (int i2 = 0; i2 < iF; i2++) {
                boolean zN = false;
                for (zf6 zf6Var : zf6VarArr) {
                    zN |= n(iArr, zf6Var);
                }
                if (!zN) {
                    if (zArr != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < zf6VarArr.length; i3++) {
                            zf6 zf6Var2 = zf6VarArr[i3];
                            if (zArr[i3]) {
                                arrayList.add(zf6Var2);
                            }
                            if (!zf6Var2.c) {
                                arrayList2.add(zf6Var2);
                            }
                        }
                        Printer printer = this.x.v0;
                        StringBuilder sbO = rh4.o(str, " constraints: ");
                        sbO.append(a(arrayList));
                        sbO.append(" are inconsistent; permanently removing: ");
                        sbO.append(a(arrayList2));
                        sbO.append(". ");
                        printer.println(sbO.toString());
                    }
                    return true;
                }
            }
            if (!z) {
                return false;
            }
            boolean[] zArr2 = new boolean[zf6VarArr.length];
            for (int i4 = 0; i4 < iF; i4++) {
                int length = zf6VarArr.length;
                for (int i5 = 0; i5 < length; i5++) {
                    zArr2[i5] = zArr2[i5] | n(iArr, zf6VarArr[i5]);
                }
            }
            if (i == 0) {
                zArr = zArr2;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= zf6VarArr.length) {
                    break;
                }
                if (zArr2[i6]) {
                    zf6 zf6Var3 = zf6VarArr[i6];
                    dg6 dg6Var = zf6Var3.a;
                    if (dg6Var.a >= dg6Var.b) {
                        zf6Var3.c = false;
                        break;
                    }
                }
                i6++;
            }
        }
        return true;
    }

    public final zf6[] r(ArrayList arrayList) {
        l0f l0fVar = new l0f(this, (zf6[]) arrayList.toArray(new zf6[arrayList.size()]));
        int length = ((zf6[][]) l0fVar.X).length;
        for (int i = 0; i < length; i++) {
            l0fVar.Z(i);
        }
        return (zf6[]) l0fVar.o;
    }
}
