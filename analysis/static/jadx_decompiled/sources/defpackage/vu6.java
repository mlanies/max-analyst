package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vu6 {
    public static final vu6 X;
    public static final vu6 Y;
    public static final /* synthetic */ vu6[] Z;
    public static final vu6 a;
    public static final vu6 b;
    public static final vu6 c;
    public static final vu6 o;

    /* JADX INFO: Fake field, exist only in values array */
    vu6 EF0;

    static {
        vu6 vu6Var = new vu6("UNKNOWN", 0);
        vu6 vu6Var2 = new vu6("REQUESTED", 1);
        a = vu6Var2;
        vu6 vu6Var3 = new vu6("INTERMEDIATE_AVAILABLE", 2);
        b = vu6Var3;
        vu6 vu6Var4 = new vu6("SUCCESS", 3);
        c = vu6Var4;
        vu6 vu6Var5 = new vu6("ERROR", 4);
        o = vu6Var5;
        vu6 vu6Var6 = new vu6("EMPTY_EVENT", 5);
        X = vu6Var6;
        vu6 vu6Var7 = new vu6("RELEASED", 6);
        Y = vu6Var7;
        Z = new vu6[]{vu6Var, vu6Var2, vu6Var3, vu6Var4, vu6Var5, vu6Var6, vu6Var7};
        values();
    }

    public static vu6 valueOf(String str) {
        return (vu6) Enum.valueOf(vu6.class, str);
    }

    public static vu6[] values() {
        return (vu6[]) Z.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = uu6.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "released" : "error" : "intermediate_available" : "success" : "requested";
    }
}
