package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ml2 {
    public static final ml2 X;
    public static final /* synthetic */ ml2[] Y;
    public static final /* synthetic */ v25 Z;
    public static final ml2 a;
    public static final ml2 b;
    public static final ml2 c;
    public static final ml2 o;

    static {
        ml2 ml2Var = new ml2("NONE", 0);
        a = ml2Var;
        ml2 ml2Var2 = new ml2("IN_PROGRESS", 1);
        b = ml2Var2;
        ml2 ml2Var3 = new ml2("SENT", 2);
        c = ml2Var3;
        ml2 ml2Var4 = new ml2("READ", 3);
        o = ml2Var4;
        ml2 ml2Var5 = new ml2("ERROR", 4);
        X = ml2Var5;
        ml2[] ml2VarArr = {ml2Var, ml2Var2, ml2Var3, ml2Var4, ml2Var5};
        Y = ml2VarArr;
        Z = new v25(ml2VarArr);
    }

    public static ml2 valueOf(String str) {
        return (ml2) Enum.valueOf(ml2.class, str);
    }

    public static ml2[] values() {
        return (ml2[]) Y.clone();
    }
}
