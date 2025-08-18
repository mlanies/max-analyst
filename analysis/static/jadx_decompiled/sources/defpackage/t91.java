package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t91 {
    public static final t91 a;
    public static final t91 b;
    public static final /* synthetic */ t91[] c;

    static {
        t91 t91Var = new t91("NONE", 0);
        a = t91Var;
        t91 t91Var2 = new t91("CALL", 1);
        b = t91Var2;
        c = new t91[]{t91Var, t91Var2};
    }

    public static t91 valueOf(String str) {
        return (t91) Enum.valueOf(t91.class, str);
    }

    public static t91[] values() {
        return (t91[]) c.clone();
    }
}
