package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class iv8 {
    public static final iv8 a;
    public static final iv8 b;
    public static final iv8 c;
    public static final /* synthetic */ iv8[] o;

    static {
        iv8 iv8Var = new iv8("DISABLED", 0);
        a = iv8Var;
        iv8 iv8Var2 = new iv8("EXPANDED", 1);
        b = iv8Var2;
        iv8 iv8Var3 = new iv8("COLLAPSED", 2);
        c = iv8Var3;
        o = new iv8[]{iv8Var, iv8Var2, iv8Var3};
    }

    public static iv8 valueOf(String str) {
        return (iv8) Enum.valueOf(iv8.class, str);
    }

    public static iv8[] values() {
        return (iv8[]) o.clone();
    }
}
