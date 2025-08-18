package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l62 {
    public static final l62 X;
    public static final /* synthetic */ l62[] Y;
    public static final l62 a;
    public static final l62 b;
    public static final l62 c;
    public static final l62 o;

    static {
        l62 l62Var = new l62("NONE", 0);
        a = l62Var;
        l62 l62Var2 = new l62("IN_PROGRESS", 1);
        b = l62Var2;
        l62 l62Var3 = new l62("SENT", 2);
        c = l62Var3;
        l62 l62Var4 = new l62("READ", 3);
        o = l62Var4;
        l62 l62Var5 = new l62("ERROR", 4);
        X = l62Var5;
        Y = new l62[]{l62Var, l62Var2, l62Var3, l62Var4, l62Var5};
    }

    public static l62 valueOf(String str) {
        return (l62) Enum.valueOf(l62.class, str);
    }

    public static l62[] values() {
        return (l62[]) Y.clone();
    }
}
