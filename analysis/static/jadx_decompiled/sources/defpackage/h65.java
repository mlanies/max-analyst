package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h65 {
    public static final /* synthetic */ h65[] X;
    public static final h65 a;
    public static final h65 b;
    public static final h65 c;
    public static final h65 o;

    static {
        h65 h65Var = new h65("REPLACE", 0);
        a = h65Var;
        h65 h65Var2 = new h65("KEEP", 1);
        b = h65Var2;
        h65 h65Var3 = new h65("APPEND", 2);
        c = h65Var3;
        h65 h65Var4 = new h65("APPEND_OR_REPLACE", 3);
        o = h65Var4;
        X = new h65[]{h65Var, h65Var2, h65Var3, h65Var4};
    }

    public static h65 valueOf(String str) {
        return (h65) Enum.valueOf(h65.class, str);
    }

    public static h65[] values() {
        return (h65[]) X.clone();
    }
}
