package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uo3 {
    public static final uo3 a;
    public static final uo3 b;
    public static final /* synthetic */ uo3[] c;

    static {
        uo3 uo3Var = new uo3("CALL", 0);
        a = uo3Var;
        uo3 uo3Var2 = new uo3("CONTACT", 1);
        b = uo3Var2;
        c = new uo3[]{uo3Var, uo3Var2};
    }

    public static uo3 valueOf(String str) {
        return (uo3) Enum.valueOf(uo3.class, str);
    }

    public static uo3[] values() {
        return (uo3[]) c.clone();
    }
}
