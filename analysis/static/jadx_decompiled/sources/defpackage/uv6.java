package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uv6 {
    public static final uv6 a;
    public static final uv6 b;
    public static final uv6 c;
    public static final /* synthetic */ uv6[] o;

    static {
        uv6 uv6Var = new uv6("SMALL", 0);
        a = uv6Var;
        uv6 uv6Var2 = new uv6("DEFAULT", 1);
        b = uv6Var2;
        uv6 uv6Var3 = new uv6("DYNAMIC", 2);
        c = uv6Var3;
        o = new uv6[]{uv6Var, uv6Var2, uv6Var3};
    }

    public static uv6 valueOf(String str) {
        return (uv6) Enum.valueOf(uv6.class, str);
    }

    public static uv6[] values() {
        return (uv6[]) o.clone();
    }
}
