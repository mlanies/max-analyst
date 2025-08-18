package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lv1 {
    public static final lv1 X;
    public static final lv1 Y;
    public static final /* synthetic */ lv1[] Z;
    public static final lv1 a;
    public static final lv1 b;
    public static final lv1 c;
    public static final lv1 o;

    static {
        lv1 lv1Var = new lv1("UNKNOWN", 0);
        a = lv1Var;
        lv1 lv1Var2 = new lv1("INACTIVE", 1);
        b = lv1Var2;
        lv1 lv1Var3 = new lv1("SEARCHING", 2);
        c = lv1Var3;
        lv1 lv1Var4 = new lv1("FLASH_REQUIRED", 3);
        o = lv1Var4;
        lv1 lv1Var5 = new lv1("CONVERGED", 4);
        X = lv1Var5;
        lv1 lv1Var6 = new lv1("LOCKED", 5);
        Y = lv1Var6;
        Z = new lv1[]{lv1Var, lv1Var2, lv1Var3, lv1Var4, lv1Var5, lv1Var6};
    }

    public static lv1 valueOf(String str) {
        return (lv1) Enum.valueOf(lv1.class, str);
    }

    public static lv1[] values() {
        return (lv1[]) Z.clone();
    }
}
