package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gs7 {
    public static final pq9 a;
    public static final gs7 b;
    public static final /* synthetic */ gs7[] c;
    public static final /* synthetic */ v25 o;

    static {
        gs7 gs7Var = new gs7("SEND_ON_ANY_NETWORK", 0);
        b = gs7Var;
        gs7[] gs7VarArr = {gs7Var};
        c = gs7VarArr;
        o = new v25(gs7VarArr);
        a = new pq9();
    }

    public static gs7 valueOf(String str) {
        return (gs7) Enum.valueOf(gs7.class, str);
    }

    public static gs7[] values() {
        return (gs7[]) c.clone();
    }
}
