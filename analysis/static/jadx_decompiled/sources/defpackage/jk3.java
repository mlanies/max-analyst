package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jk3 {
    public static final jk3 a;
    public static final jk3 b;
    public static final /* synthetic */ jk3[] c;

    static {
        jk3 jk3Var = new jk3("NEUTRAL", 0);
        a = jk3Var;
        jk3 jk3Var2 = new jk3("NEGATIVE_AND_POSITIVE", 1);
        b = jk3Var2;
        c = new jk3[]{jk3Var, jk3Var2};
    }

    public static jk3 valueOf(String str) {
        return (jk3) Enum.valueOf(jk3.class, str);
    }

    public static jk3[] values() {
        return (jk3[]) c.clone();
    }
}
