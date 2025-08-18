package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class tf3 {
    public static final tf3 a;
    public static final tf3 b;
    public static final tf3 c;
    public static final /* synthetic */ tf3[] o;

    static {
        tf3 tf3Var = new tf3("DEFAULT", 0);
        a = tf3Var;
        tf3 tf3Var2 = new tf3("SUCCESS", 1);
        b = tf3Var2;
        tf3 tf3Var3 = new tf3("ERROR", 2);
        c = tf3Var3;
        o = new tf3[]{tf3Var, tf3Var2, tf3Var3};
    }

    public static tf3 valueOf(String str) {
        return (tf3) Enum.valueOf(tf3.class, str);
    }

    public static tf3[] values() {
        return (tf3[]) o.clone();
    }
}
