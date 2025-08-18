package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lr0 {
    public static final lr0 a;
    public static final lr0 b;
    public static final lr0 c;
    public static final /* synthetic */ lr0[] o;

    static {
        lr0 lr0Var = new lr0("INPUT", 0);
        a = lr0Var;
        lr0 lr0Var2 = new lr0("SEARCH", 1);
        b = lr0Var2;
        lr0 lr0Var3 = new lr0("CHAT_STATUS", 2);
        c = lr0Var3;
        o = new lr0[]{lr0Var, lr0Var2, lr0Var3};
    }

    public static lr0 valueOf(String str) {
        return (lr0) Enum.valueOf(lr0.class, str);
    }

    public static lr0[] values() {
        return (lr0[]) o.clone();
    }
}
