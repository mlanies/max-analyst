package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ao9 {
    public static final ao9 a;
    public static final ao9 b;
    public static final ao9 c;
    public static final /* synthetic */ ao9[] o;

    static {
        ao9 ao9Var = new ao9("GOOD", 0);
        a = ao9Var;
        ao9 ao9Var2 = new ao9("MEDIUM", 1);
        b = ao9Var2;
        ao9 ao9Var3 = new ao9("BAD", 2);
        c = ao9Var3;
        o = new ao9[]{ao9Var, ao9Var2, ao9Var3};
    }

    public static ao9 valueOf(String str) {
        return (ao9) Enum.valueOf(ao9.class, str);
    }

    public static ao9[] values() {
        return (ao9[]) o.clone();
    }
}
