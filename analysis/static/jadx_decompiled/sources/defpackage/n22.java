package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n22 {
    public static final /* synthetic */ v25 X;
    public static final qx7 a;
    public static final n22 b;
    public static final n22 c;
    public static final /* synthetic */ n22[] o;

    static {
        n22 n22Var = new n22("PUBLIC", 0);
        b = n22Var;
        n22 n22Var2 = new n22("PRIVATE", 1);
        c = n22Var2;
        n22[] n22VarArr = {n22Var, n22Var2};
        o = n22VarArr;
        X = new v25(n22VarArr);
        a = new qx7(8);
    }

    public static n22 valueOf(String str) {
        return (n22) Enum.valueOf(n22.class, str);
    }

    public static n22[] values() {
        return (n22[]) o.clone();
    }
}
