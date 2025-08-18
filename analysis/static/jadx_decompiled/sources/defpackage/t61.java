package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t61 {
    public static final t61 a;
    public static final t61 b;
    public static final t61 c;
    public static final /* synthetic */ t61[] o;

    /* JADX INFO: Fake field, exist only in values array */
    t61 EF0;

    static {
        t61 t61Var = new t61("FEASIBLE", 0);
        t61 t61Var2 = new t61("CALLER_IS_BLOCKED", 1);
        t61 t61Var3 = new t61("NOT_FRIENDS", 2);
        t61 t61Var4 = new t61("CALLEE_IS_OFFLINE", 3);
        t61 t61Var5 = new t61("UNKNOWN_ERROR", 4);
        a = t61Var5;
        t61 t61Var6 = new t61("UNSUPPORTED", 5);
        b = t61Var6;
        t61 t61Var7 = new t61("OLD_VERSION", 6);
        c = t61Var7;
        o = new t61[]{t61Var, t61Var2, t61Var3, t61Var4, t61Var5, t61Var6, t61Var7};
    }

    public static t61 valueOf(String str) {
        return (t61) Enum.valueOf(t61.class, str);
    }

    public static t61[] values() {
        return (t61[]) o.clone();
    }
}
