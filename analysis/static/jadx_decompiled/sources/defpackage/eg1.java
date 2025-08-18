package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class eg1 {
    public static final eg1 a;
    public static final eg1 b;
    public static final eg1 c;
    public static final /* synthetic */ eg1[] o;

    static {
        eg1 eg1Var = new eg1("CREATOR", 0);
        a = eg1Var;
        eg1 eg1Var2 = new eg1("ADMIN", 1);
        b = eg1Var2;
        eg1 eg1Var3 = new eg1("SPEAKER", 2);
        c = eg1Var3;
        o = new eg1[]{eg1Var, eg1Var2, eg1Var3};
    }

    public static eg1 valueOf(String str) {
        return (eg1) Enum.valueOf(eg1.class, str);
    }

    public static eg1[] values() {
        return (eg1[]) o.clone();
    }
}
