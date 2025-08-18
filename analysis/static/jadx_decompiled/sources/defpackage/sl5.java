package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sl5 {
    public static final /* synthetic */ v25 X;
    public static final sl5 a;
    public static final sl5 b;
    public static final sl5 c;
    public static final /* synthetic */ sl5[] o;

    static {
        sl5 sl5Var = new sl5("FIT_XY", 0);
        sl5 sl5Var2 = new sl5("FILL", 1);
        a = sl5Var2;
        sl5 sl5Var3 = new sl5("CENTER_INSIDE", 2);
        b = sl5Var3;
        sl5 sl5Var4 = new sl5("CENTER", 3);
        c = sl5Var4;
        sl5[] sl5VarArr = {sl5Var, sl5Var2, sl5Var3, sl5Var4};
        o = sl5VarArr;
        X = new v25(sl5VarArr);
    }

    public static sl5 valueOf(String str) {
        return (sl5) Enum.valueOf(sl5.class, str);
    }

    public static sl5[] values() {
        return (sl5[]) o.clone();
    }
}
