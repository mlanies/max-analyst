package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ug1 {
    public static final ug1 a;
    public static final ug1 b;
    public static final ug1 c;
    public static final /* synthetic */ ug1[] o;

    static {
        ug1 ug1Var = new ug1("NONE", 0);
        a = ug1Var;
        ug1 ug1Var2 = new ug1("LOCAL", 1);
        b = ug1Var2;
        ug1 ug1Var3 = new ug1("APPLICATION", 2);
        c = ug1Var3;
        o = new ug1[]{ug1Var, ug1Var2, ug1Var3};
    }

    public static ug1 valueOf(String str) {
        return (ug1) Enum.valueOf(ug1.class, str);
    }

    public static ug1[] values() {
        return (ug1[]) o.clone();
    }
}
