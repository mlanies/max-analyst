package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oa2 {
    public static final oa2 a;
    public static final oa2 b;
    public static final /* synthetic */ oa2[] c;

    static {
        oa2 oa2Var = new oa2("ACCEPT_ALL", 0);
        a = oa2Var;
        oa2 oa2Var2 = new oa2("FORWARDABLE", 1);
        b = oa2Var2;
        c = new oa2[]{oa2Var, oa2Var2};
    }

    public static oa2 valueOf(String str) {
        return (oa2) Enum.valueOf(oa2.class, str);
    }

    public static oa2[] values() {
        return (oa2[]) c.clone();
    }
}
