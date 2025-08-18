package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l76 {
    public static final l76 a;
    public static final l76 b;
    public static final l76 c;
    public static final /* synthetic */ l76[] o;

    static {
        l76 l76Var = new l76("UNKNOWN", 0);
        a = l76Var;
        l76 l76Var2 = new l76("DEFAULT", 1);
        b = l76Var2;
        l76 l76Var3 = new l76("YUV", 2);
        c = l76Var3;
        o = new l76[]{l76Var, l76Var2, l76Var3};
    }

    public static l76 valueOf(String str) {
        return (l76) Enum.valueOf(l76.class, str);
    }

    public static l76[] values() {
        return (l76[]) o.clone();
    }
}
