package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n91 {
    public static final n91 a;
    public static final n91 b;
    public static final n91 c;
    public static final /* synthetic */ n91[] o;

    static {
        n91 n91Var = new n91("CALLING", 0);
        a = n91Var;
        n91 n91Var2 = new n91("ACTIVE", 1);
        b = n91Var2;
        n91 n91Var3 = new n91("NO_CONNECTION", 2);
        c = n91Var3;
        o = new n91[]{n91Var, n91Var2, n91Var3};
    }

    public static n91 valueOf(String str) {
        return (n91) Enum.valueOf(n91.class, str);
    }

    public static n91[] values() {
        return (n91[]) o.clone();
    }
}
