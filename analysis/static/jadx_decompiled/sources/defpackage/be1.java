package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class be1 {
    public static final be1 a;
    public static final be1 b;
    public static final /* synthetic */ be1[] c;

    /* JADX INFO: Fake field, exist only in values array */
    be1 EF0;

    static {
        be1 be1Var = new be1("UNDEFINE", 0);
        be1 be1Var2 = new be1("MENU", 1);
        a = be1Var2;
        be1 be1Var3 = new be1("RECORD", 2);
        b = be1Var3;
        c = new be1[]{be1Var, be1Var2, be1Var3};
    }

    public static be1 valueOf(String str) {
        return (be1) Enum.valueOf(be1.class, str);
    }

    public static be1[] values() {
        return (be1[]) c.clone();
    }
}
