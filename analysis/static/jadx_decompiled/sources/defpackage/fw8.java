package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fw8 {
    public static final fw8 X;
    public static final fw8 Y;
    public static final /* synthetic */ fw8[] Z;
    public static final fw8 a;
    public static final fw8 b;
    public static final fw8 c;
    public static final fw8 o;

    static {
        fw8 fw8Var = new fw8("SIMPLE", 0);
        a = fw8Var;
        fw8 fw8Var2 = new fw8("CONTACT", 1);
        b = fw8Var2;
        fw8 fw8Var3 = new fw8("MEDIA", 2);
        c = fw8Var3;
        fw8 fw8Var4 = new fw8("SIMPLE_FORWARD", 3);
        o = fw8Var4;
        fw8 fw8Var5 = new fw8("MEDIA_FORWARD", 4);
        X = fw8Var5;
        fw8 fw8Var6 = new fw8("FORWARD", 5);
        Y = fw8Var6;
        Z = new fw8[]{fw8Var, fw8Var2, fw8Var3, fw8Var4, fw8Var5, fw8Var6};
    }

    public static fw8 valueOf(String str) {
        return (fw8) Enum.valueOf(fw8.class, str);
    }

    public static fw8[] values() {
        return (fw8[]) Z.clone();
    }
}
