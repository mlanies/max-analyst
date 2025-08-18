package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class du4 {
    public static final du4 X;
    public static final du4 Y;
    public static final /* synthetic */ du4[] Z;
    public static final du4 a;
    public static final du4 b;
    public static final du4 c;
    public static final du4 o;

    static {
        du4 du4Var = new du4("MEDIUM", 0);
        a = du4Var;
        du4 du4Var2 = new du4("LARGE", 1);
        b = du4Var2;
        du4 du4Var3 = new du4("XLARGE", 2);
        c = du4Var3;
        du4 du4Var4 = new du4("XXLARGE", 3);
        o = du4Var4;
        du4 du4Var5 = new du4("XXXLARGE", 4);
        X = du4Var5;
        du4 du4Var6 = new du4("XXXXLARGE", 5);
        Y = du4Var6;
        Z = new du4[]{du4Var, du4Var2, du4Var3, du4Var4, du4Var5, du4Var6};
    }

    public static du4 valueOf(String str) {
        return (du4) Enum.valueOf(du4.class, str);
    }

    public static du4[] values() {
        return (du4[]) Z.clone();
    }
}
