package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bp4 {
    public static final bp4 a;
    public static final bp4 b;
    public static final bp4 c;
    public static final /* synthetic */ bp4[] o;

    static {
        bp4 bp4Var = new bp4("ALWAYS", 0);
        a = bp4Var;
        bp4 bp4Var2 = new bp4("AUTO", 1);
        b = bp4Var2;
        bp4 bp4Var3 = new bp4("NEVER", 2);
        c = bp4Var3;
        o = new bp4[]{bp4Var, bp4Var2, bp4Var3};
    }

    public static bp4 valueOf(String str) {
        return (bp4) Enum.valueOf(bp4.class, str);
    }

    public static bp4[] values() {
        return (bp4[]) o.clone();
    }
}
