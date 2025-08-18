package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l63 {
    public static final l63 a;
    public static final l63 b;
    public static final l63 c;
    public static final /* synthetic */ l63[] o;

    static {
        l63 l63Var = new l63("LIGHT", 0);
        a = l63Var;
        l63 l63Var2 = new l63("DARK", 1);
        b = l63Var2;
        l63 l63Var3 = new l63("UNIVERSAL", 2);
        c = l63Var3;
        o = new l63[]{l63Var, l63Var2, l63Var3};
    }

    public static l63 valueOf(String str) {
        return (l63) Enum.valueOf(l63.class, str);
    }

    public static l63[] values() {
        return (l63[]) o.clone();
    }
}
