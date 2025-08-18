package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d20 {
    public static final d20 X;
    public static final /* synthetic */ d20[] Y;
    public static final d20 a;
    public static final d20 b;
    public static final d20 c;
    public static final d20 o;

    static {
        d20 d20Var = new d20("NOT_LOADED", 0);
        a = d20Var;
        d20 d20Var2 = new d20("CANCELLED", 1);
        b = d20Var2;
        d20 d20Var3 = new d20("LOADED", 2);
        c = d20Var3;
        d20 d20Var4 = new d20("ERROR", 3);
        o = d20Var4;
        d20 d20Var5 = new d20("LOADING", 4);
        X = d20Var5;
        Y = new d20[]{d20Var, d20Var2, d20Var3, d20Var4, d20Var5};
    }

    public static d20 valueOf(String str) {
        return (d20) Enum.valueOf(d20.class, str);
    }

    public static d20[] values() {
        return (d20[]) Y.clone();
    }

    public final boolean a() {
        return this == b;
    }

    public final boolean b() {
        return this == o;
    }

    public final boolean c() {
        return this == c;
    }

    public final boolean d() {
        return this == X;
    }

    public final boolean e() {
        return this == a;
    }
}
