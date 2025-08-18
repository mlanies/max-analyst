package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tx3 {
    public static final tx3 a;
    public static final tx3 b;
    public static final tx3 c;
    public static final /* synthetic */ tx3[] o;

    static {
        tx3 tx3Var = new tx3("COROUTINE_SUSPENDED", 0);
        a = tx3Var;
        tx3 tx3Var2 = new tx3("UNDECIDED", 1);
        b = tx3Var2;
        tx3 tx3Var3 = new tx3("RESUMED", 2);
        c = tx3Var3;
        o = new tx3[]{tx3Var, tx3Var2, tx3Var3};
    }

    public static tx3 valueOf(String str) {
        return (tx3) Enum.valueOf(tx3.class, str);
    }

    public static tx3[] values() {
        return (tx3[]) o.clone();
    }
}
