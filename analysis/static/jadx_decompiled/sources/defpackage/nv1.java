package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nv1 {
    public static final nv1 X;
    public static final /* synthetic */ nv1[] Y;
    public static final nv1 a;
    public static final nv1 b;
    public static final nv1 c;
    public static final nv1 o;

    static {
        nv1 nv1Var = new nv1("UNKNOWN", 0);
        a = nv1Var;
        nv1 nv1Var2 = new nv1("INACTIVE", 1);
        b = nv1Var2;
        nv1 nv1Var3 = new nv1("METERING", 2);
        c = nv1Var3;
        nv1 nv1Var4 = new nv1("CONVERGED", 3);
        o = nv1Var4;
        nv1 nv1Var5 = new nv1("LOCKED", 4);
        X = nv1Var5;
        Y = new nv1[]{nv1Var, nv1Var2, nv1Var3, nv1Var4, nv1Var5};
    }

    public static nv1 valueOf(String str) {
        return (nv1) Enum.valueOf(nv1.class, str);
    }

    public static nv1[] values() {
        return (nv1[]) Y.clone();
    }
}
