package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b5b extends mue {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final dod f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final mue[] k;
    public final Object[] l;
    public final HashMap m;

    public b5b(mue[] mueVarArr, Object[] objArr, dod dodVar) {
        this.f = dodVar;
        this.e = dodVar.b.length;
        int length = mueVarArr.length;
        this.k = mueVarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = mueVarArr.length;
        int i = 0;
        int iP = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            mue mueVar = mueVarArr[i];
            this.k[i3] = mueVar;
            this.j[i3] = iP;
            this.i[i3] = i2;
            iP += mueVar.p();
            i2 += this.k[i3].i();
            this.m.put(objArr[i3], Integer.valueOf(i3));
            i++;
            i3++;
        }
        this.g = iP;
        this.h = i2;
    }

    @Override // defpackage.mue
    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int iR = 0;
        if (z) {
            int[] iArr = this.f.b;
            iR = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            mue[] mueVarArr = this.k;
            if (!mueVarArr[iR].q()) {
                return mueVarArr[iR].a(z) + this.j[iR];
            }
            iR = r(iR, z);
        } while (iR != -1);
        return -1;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iB = this.k[iIntValue].b(obj3)) == -1) {
            return -1;
        }
        return this.i[iIntValue] + iB;
    }

    @Override // defpackage.mue
    public final int c(boolean z) {
        int iS;
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.f.b;
            iS = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iS = i - 1;
        }
        do {
            mue[] mueVarArr = this.k;
            if (!mueVarArr[iS].q()) {
                return mueVarArr[iS].c(z) + this.j[iS];
            }
            iS = s(iS, z);
        } while (iS != -1);
        return -1;
    }

    @Override // defpackage.mue
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = oaf.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        mue[] mueVarArr = this.k;
        int iE2 = mueVarArr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iR = r(iE, z);
        while (iR != -1 && mueVarArr[iR].q()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return mueVarArr[iR].a(z) + iArr[iR];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        int[] iArr = this.i;
        int iE = oaf.e(iArr, i + 1, false, false);
        int i2 = this.j[iE];
        this.k[iE].g(i - iArr[iE], hueVar, z);
        hueVar.c += i2;
        if (z) {
            Object obj = this.l[iE];
            Object obj2 = hueVar.b;
            obj2.getClass();
            hueVar.b = Pair.create(obj, obj2);
        }
        return hueVar;
    }

    @Override // defpackage.mue
    public final hue h(Object obj, hue hueVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.j[iIntValue];
        this.k[iIntValue].h(obj3, hueVar);
        hueVar.c += i;
        hueVar.b = obj;
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return this.h;
    }

    @Override // defpackage.mue
    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iE = oaf.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        mue[] mueVarArr = this.k;
        int iL = mueVarArr[iE].l(i - i3, i2 != 2 ? i2 : 0, z);
        if (iL != -1) {
            return i3 + iL;
        }
        int iS = s(iE, z);
        while (iS != -1 && mueVarArr[iS].q()) {
            iS = s(iS, z);
        }
        if (iS != -1) {
            return mueVarArr[iS].c(z) + iArr[iS];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        int[] iArr = this.i;
        int iE = oaf.e(iArr, i + 1, false, false);
        return Pair.create(this.l[iE], this.k[iE].m(i - iArr[iE]));
    }

    @Override // defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        int[] iArr = this.j;
        int iE = oaf.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.i[iE];
        this.k[iE].n(i - i2, kueVar, j);
        Object objCreate = this.l[iE];
        if (!kue.q.equals(kueVar.a)) {
            objCreate = Pair.create(objCreate, kueVar.a);
        }
        kueVar.a = objCreate;
        kueVar.n += i3;
        kueVar.o += i3;
        return kueVar;
    }

    @Override // defpackage.mue
    public final int p() {
        return this.g;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        dod dodVar = this.f;
        int i2 = dodVar.c[i] + 1;
        int[] iArr = dodVar.b;
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
        dod dodVar = this.f;
        int i2 = dodVar.c[i] - 1;
        if (i2 >= 0) {
            return dodVar.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b5b(Collection collection, dod dodVar) {
        mue[] mueVarArr = new mue[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            mueVarArr[i2] = ((kk8) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((kk8) it2.next()).a();
            i++;
        }
        this(mueVarArr, objArr, dodVar);
    }
}
