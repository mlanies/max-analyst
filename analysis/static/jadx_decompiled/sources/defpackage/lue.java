package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class lue implements su0 {
    public static final eue a = new eue();

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

    public final int d(int i, gue gueVar, jue jueVar, int i2, boolean z) {
        int i3 = g(i, gueVar, false).c;
        if (n(i3, jueVar, 0L).A0 != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return n(iE, jueVar, 0L).z0;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lue)) {
            return false;
        }
        lue lueVar = (lue) obj;
        if (lueVar.p() != p() || lueVar.i() != i()) {
            return false;
        }
        jue jueVar = new jue();
        gue gueVar = new gue();
        jue jueVar2 = new jue();
        gue gueVar2 = new gue();
        for (int i = 0; i < p(); i++) {
            if (!n(i, jueVar, 0L).equals(lueVar.n(i, jueVar2, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, gueVar, true).equals(lueVar.g(i2, gueVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final gue f(int i, gue gueVar) {
        return g(i, gueVar, false);
    }

    public abstract gue g(int i, gue gueVar, boolean z);

    public gue h(Object obj, gue gueVar) {
        return g(b(obj), gueVar, true);
    }

    public final int hashCode() {
        jue jueVar = new jue();
        gue gueVar = new gue();
        int iP = p() + 217;
        for (int i = 0; i < p(); i++) {
            iP = (iP * 31) + n(i, jueVar, 0L).hashCode();
        }
        int i2 = i() + (iP * 31);
        for (int i3 = 0; i3 < i(); i3++) {
            i2 = (i2 * 31) + g(i3, gueVar, true).hashCode();
        }
        return i2;
    }

    public abstract int i();

    public final Pair j(jue jueVar, gue gueVar, int i, long j) {
        Pair pairK = k(jueVar, gueVar, i, j, 0L);
        pairK.getClass();
        return pairK;
    }

    public final Pair k(jue jueVar, gue gueVar, int i, long j, long j2) {
        np8.e(i, p());
        n(i, jueVar, j2);
        if (j == -9223372036854775807L) {
            j = jueVar.x0;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = jueVar.z0;
        g(i2, gueVar, false);
        while (i2 < jueVar.A0 && gueVar.X != j) {
            int i3 = i2 + 1;
            if (g(i3, gueVar, false).X > j) {
                break;
            }
            i2 = i3;
        }
        g(i2, gueVar, true);
        long jMin = j - gueVar.X;
        long j3 = gueVar.o;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = gueVar.b;
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

    public abstract jue n(int i, jue jueVar, long j);

    public final void o(int i, jue jueVar) {
        n(i, jueVar, 0L);
    }

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
