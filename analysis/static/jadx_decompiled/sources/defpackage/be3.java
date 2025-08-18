package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class be3 {
    public static final /* synthetic */ be3[] X;
    public static final be3 a;
    public static final be3 b;
    public static final be3 c;
    public static final be3 o;

    static {
        be3 be3Var = new be3("ALWAYS_OVERRIDE", 0);
        a = be3Var;
        be3 be3Var2 = new be3("HIGH_PRIORITY_REQUIRED", 1);
        b = be3Var2;
        be3 be3Var3 = new be3("REQUIRED", 2);
        c = be3Var3;
        be3 be3Var4 = new be3("OPTIONAL", 3);
        o = be3Var4;
        X = new be3[]{be3Var, be3Var2, be3Var3, be3Var4};
    }

    public static be3 valueOf(String str) {
        return (be3) Enum.valueOf(be3.class, str);
    }

    public static be3[] values() {
        return (be3[]) X.clone();
    }
}
