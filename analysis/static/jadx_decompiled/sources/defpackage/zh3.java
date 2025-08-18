package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zh3 implements Comparable {
    public static final zh3 X;
    public static final zh3 Y;
    public static final /* synthetic */ zh3[] Z;
    public static final b46 a;
    public static final zh3 b;
    public static final zh3 c;
    public static final zh3 o;
    public static final /* synthetic */ v25 s0;

    static {
        zh3 zh3Var = new zh3("TYPE_UNKNOWN", 0);
        b = zh3Var;
        zh3 zh3Var2 = new zh3("TYPE_WIFI", 1);
        c = zh3Var2;
        zh3 zh3Var3 = new zh3("TYPE_MOBILE_SLOW", 2);
        o = zh3Var3;
        zh3 zh3Var4 = new zh3("TYPE_MOBILE_NORMAL", 3);
        X = zh3Var4;
        zh3 zh3Var5 = new zh3("TYPE_MOBILE_FAST", 4);
        Y = zh3Var5;
        zh3[] zh3VarArr = {zh3Var, zh3Var2, zh3Var3, zh3Var4, zh3Var5};
        Z = zh3VarArr;
        s0 = new v25(zh3VarArr);
        a = new b46();
    }

    public static zh3 valueOf(String str) {
        return (zh3) Enum.valueOf(zh3.class, str);
    }

    public static zh3[] values() {
        return (zh3[]) Z.clone();
    }

    public final String a() {
        a.getClass();
        int i = yh3.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "4G" : "3G" : "2G" : "WIFI";
    }
}
