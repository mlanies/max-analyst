package defpackage;

/* loaded from: classes.dex */
public abstract class usc {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        new qi9(0);
    }

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final qi9 b(kpa... kpaVarArr) {
        qi9 qi9Var = new qi9(kpaVarArr.length);
        for (kpa kpaVar : kpaVarArr) {
            qi9Var.k(kpaVar.a, kpaVar.b);
        }
        return qi9Var;
    }

    public static final int c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int d(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int e(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
