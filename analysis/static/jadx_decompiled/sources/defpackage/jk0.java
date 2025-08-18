package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jk0 {
    public static final jk0 a;
    public static final jk0 b;
    public static final /* synthetic */ jk0[] c;

    static {
        jk0 jk0Var = new jk0("SQUARE", 0);
        a = jk0Var;
        jk0 jk0Var2 = new jk0("ORIGINAL", 1);
        b = jk0Var2;
        c = new jk0[]{jk0Var, jk0Var2};
    }

    public static jk0 valueOf(String str) {
        return (jk0) Enum.valueOf(jk0.class, str);
    }

    public static jk0[] values() {
        return (jk0[]) c.clone();
    }
}
