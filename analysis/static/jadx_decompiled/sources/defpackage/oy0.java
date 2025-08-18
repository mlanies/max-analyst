package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oy0 {
    public static final oy0 X;
    public static final oy0 Y;
    public static final /* synthetic */ oy0[] Z;
    public static final oy0 a;
    public static final oy0 b;
    public static final oy0 c;
    public static final oy0 o;

    static {
        oy0 oy0Var = new oy0("REQUIRE_AUTH_TO_JOIN", 0);
        a = oy0Var;
        oy0 oy0Var2 = new oy0("WAITING_HALL", 1);
        b = oy0Var2;
        oy0 oy0Var3 = new oy0("RECURRING", 2);
        c = oy0Var3;
        oy0 oy0Var4 = new oy0("FEEDBACK", 3);
        o = oy0Var4;
        oy0 oy0Var5 = new oy0("AUDIENCE_MODE", 4);
        X = oy0Var5;
        oy0 oy0Var6 = new oy0("ASR", 5);
        Y = oy0Var6;
        Z = new oy0[]{oy0Var, oy0Var2, oy0Var3, oy0Var4, oy0Var5, oy0Var6};
    }

    public static oy0 valueOf(String str) {
        return (oy0) Enum.valueOf(oy0.class, str);
    }

    public static oy0[] values() {
        return (oy0[]) Z.clone();
    }
}
