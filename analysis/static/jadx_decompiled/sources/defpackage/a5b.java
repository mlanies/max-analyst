package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a5b extends lue {
    public final int X;
    public final int[] Y;
    public final int[] Z;
    public final int b;
    public final cod c;
    public final int o;
    public final lue[] s0;
    public final Object[] t0;
    public final HashMap u0;

    public a5b(Collection collection, cod codVar) {
        this.c = codVar;
        this.b = codVar.b.length;
        int size = collection.size();
        this.Y = new int[size];
        this.Z = new int[size];
        this.s0 = new lue[size];
        this.t0 = new Object[size];
        this.u0 = new HashMap();
        Iterator it = collection.iterator();
        int iP = 0;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            jk8 jk8Var = (jk8) it.next();
            this.s0[i2] = jk8Var.b();
            this.Z[i2] = iP;
            this.Y[i2] = i;
            iP += this.s0[i2].p();
            i += this.s0[i2].i();
            this.t0[i2] = jk8Var.a();
            this.u0.put(this.t0[i2], Integer.valueOf(i2));
            i2++;
        }
        this.o = iP;
        this.X = i;
    }

    @Override // defpackage.lue
    public final int a(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int iR = 0;
        if (z) {
            int[] iArr = this.c.b;
            iR = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            lue[] lueVarArr = this.s0;
            if (!lueVarArr[iR].q()) {
                return lueVarArr[iR].a(z) + this.Z[iR];
            }
            iR = r(iR, z);
        } while (iR != -1);
        return -1;
    }

    @Override // defpackage.lue
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u0.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iB = this.s0[iIntValue].b(obj3)) == -1) {
            return -1;
        }
        return this.Y[iIntValue] + iB;
    }

    @Override // defpackage.lue
    public final int c(boolean z) {
        int iS;
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.c.b;
            iS = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iS = i - 1;
        }
        do {
            lue[] lueVarArr = this.s0;
            if (!lueVarArr[iS].q()) {
                return lueVarArr[iS].c(z) + this.Z[iS];
            }
            iS = s(iS, z);
        } while (iS != -1);
        return -1;
    }

    @Override // defpackage.lue
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int iC = maf.c(i + 1, iArr);
        int i3 = iArr[iC];
        lue[] lueVarArr = this.s0;
        int iE = lueVarArr[iC].e(i - i3, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iR = r(iC, z);
        while (iR != -1 && lueVarArr[iR].q()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return lueVarArr[iR].a(z) + iArr[iR];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        int[] iArr = this.Y;
        int iC = maf.c(i + 1, iArr);
        int i2 = this.Z[iC];
        this.s0[iC].g(i - iArr[iC], gueVar, z);
        gueVar.c += i2;
        if (z) {
            Object obj = this.t0[iC];
            Object obj2 = gueVar.b;
            obj2.getClass();
            gueVar.b = Pair.create(obj, obj2);
        }
        return gueVar;
    }

    @Override // defpackage.lue
    public final gue h(Object obj, gue gueVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u0.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.Z[iIntValue];
        this.s0[iIntValue].h(obj3, gueVar);
        gueVar.c += i;
        gueVar.b = obj;
        return gueVar;
    }

    @Override // defpackage.lue
    public final int i() {
        return this.X;
    }

    @Override // defpackage.lue
    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.Z;
        int iC = maf.c(i + 1, iArr);
        int i3 = iArr[iC];
        lue[] lueVarArr = this.s0;
        int iL = lueVarArr[iC].l(i - i3, i2 == 2 ? 0 : i2, z);
        if (iL != -1) {
            return i3 + iL;
        }
        int iS = s(iC, z);
        while (iS != -1 && lueVarArr[iS].q()) {
            iS = s(iS, z);
        }
        if (iS != -1) {
            return lueVarArr[iS].c(z) + iArr[iS];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.lue
    public final Object m(int i) {
        int[] iArr = this.Y;
        int iC = maf.c(i + 1, iArr);
        return Pair.create(this.t0[iC], this.s0[iC].m(i - iArr[iC]));
    }

    @Override // defpackage.lue
    public final jue n(int i, jue jueVar, long j) {
        int[] iArr = this.Z;
        int iC = maf.c(i + 1, iArr);
        int i2 = iArr[iC];
        int i3 = this.Y[iC];
        this.s0[iC].n(i - i2, jueVar, j);
        Object objCreate = this.t0[iC];
        if (!jue.C0.equals(jueVar.a)) {
            objCreate = Pair.create(objCreate, jueVar.a);
        }
        jueVar.a = objCreate;
        jueVar.z0 += i3;
        jueVar.A0 += i3;
        return jueVar;
    }

    @Override // defpackage.lue
    public final int p() {
        return this.o;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        cod codVar = this.c;
        int i2 = codVar.c[i] + 1;
        int[] iArr = codVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int s(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        cod codVar = this.c;
        int i2 = codVar.c[i] - 1;
        if (i2 >= 0) {
            return codVar.b[i2];
        }
        return -1;
    }
}
