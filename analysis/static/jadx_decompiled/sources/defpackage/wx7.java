package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wx7 {
    public static final wx7 a;
    public static final wx7 b;
    public static final wx7 c;
    public static final /* synthetic */ wx7[] o;

    static {
        wx7 wx7Var = new wx7("LOCAL", 0);
        a = wx7Var;
        wx7 wx7Var2 = new wx7("GLOBAL", 1);
        b = wx7Var2;
        wx7 wx7Var3 = new wx7("MESSAGES", 2);
        c = wx7Var3;
        o = new wx7[]{wx7Var, wx7Var2, wx7Var3};
    }

    public static wx7 valueOf(String str) {
        return (wx7) Enum.valueOf(wx7.class, str);
    }

    public static wx7[] values() {
        return (wx7[]) o.clone();
    }
}
