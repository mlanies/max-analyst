package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z10 {
    public static final z10 a;
    public static final z10 b;
    public static final z10 c;
    public static final /* synthetic */ z10[] o;

    static {
        z10 z10Var = new z10("DEFAULT", 0);
        a = z10Var;
        z10 z10Var2 = new z10("PROCESSING", 1);
        b = z10Var2;
        z10 z10Var3 = new z10("PROCESSED", 2);
        c = z10Var3;
        o = new z10[]{z10Var, z10Var2, z10Var3};
    }

    public static z10 valueOf(String str) {
        return (z10) Enum.valueOf(z10.class, str);
    }

    public static z10[] values() {
        return (z10[]) o.clone();
    }
}
