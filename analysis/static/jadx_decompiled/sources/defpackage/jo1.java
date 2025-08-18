package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jo1 {
    public static final jo1 a;
    public static final jo1 b;
    public static final /* synthetic */ jo1[] c;

    static {
        jo1 jo1Var = new jo1("NEGATIVE_POSITIVE", 0);
        a = jo1Var;
        jo1 jo1Var2 = new jo1("NEUTRAL_POSITIVE", 1);
        b = jo1Var2;
        c = new jo1[]{jo1Var, jo1Var2};
    }

    public static jo1 valueOf(String str) {
        return (jo1) Enum.valueOf(jo1.class, str);
    }

    public static jo1[] values() {
        return (jo1[]) c.clone();
    }
}
