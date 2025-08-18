package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class mue {
    public static final fue a = new fue();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        int i = oaf.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, hue hueVar, kue kueVar, int i2, boolean z) {
        int i3 = g(i, hueVar, false).c;
        if (n(i3, kueVar, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, kueVar, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mue)) {
            return false;
        }
        mue mueVar = (mue) obj;
        if (mueVar.p() != p() || mueVar.i() != i()) {
            return false;
        }
        kue kueVar = new kue();
        hue hueVar = new hue();
        kue kueVar2 = new kue();
        hue hueVar2 = new hue();
        for (int i = 0; i < p(); i++) {
            if (!n(i, kueVar, 0L).equals(mueVar.n(i, kueVar2, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, hueVar, true).equals(mueVar.g(i2, hueVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != mueVar.a(true) || (iC = c(true)) != mueVar.c(true)) {
            return false;
        }
        while (iA != iC) {
            int iE = e(iA, 0, true);
            if (iE != mueVar.e(iA, 0, true)) {
                return false;
            }
            iA = iE;
        }
        return true;
    }

    public final hue f(int i, hue hueVar) {
        return g(i, hueVar, false);
    }

    public abstract hue g(int i, hue hueVar, boolean z);

    public hue h(Object obj, hue hueVar) {
        return g(b(obj), hueVar, true);
    }

    public int hashCode() {
        kue kueVar = new kue();
        hue hueVar = new hue();
        int iP = p() + 217;
        for (int i = 0; i < p(); i++) {
            iP = (iP * 31) + n(i, kueVar, 0L).hashCode();
        }
        int i2 = i() + (iP * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, hueVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            i2 = (i2 * 31) + iA;
            iA = e(iA, 0, true);
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(kue kueVar, hue hueVar, int i, long j) {
        Pair pairK = k(kueVar, hueVar, i, j, 0L);
        pairK.getClass();
        return pairK;
    }

    public final Pair k(kue kueVar, hue hueVar, int i, long j, long j2) {
        fm9.g(i, p());
        n(i, kueVar, j2);
        if (j == -9223372036854775807L) {
            j = kueVar.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = kueVar.n;
        g(i2, hueVar, false);
        while (i2 < kueVar.o && hueVar.e != j) {
            int i3 = i2 + 1;
            if (g(i3, hueVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, hueVar, true);
        long jMin = j - hueVar.e;
        long j3 = hueVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = hueVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i);

    public abstract kue n(int i, kue kueVar, long j);

    public final void o(int i, kue kueVar) {
        n(i, kueVar, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
