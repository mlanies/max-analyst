package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gl1 {
    public static final /* synthetic */ gl1[] X;
    public static final /* synthetic */ v25 Y;
    public static final gl1 a;
    public static final gl1 b;
    public static final gl1 c;
    public static final gl1 o;

    static {
        gl1 gl1Var = new gl1("CALL", 0);
        a = gl1Var;
        gl1 gl1Var2 = new gl1("STOP", 1);
        b = gl1Var2;
        gl1 gl1Var3 = new gl1("UPDATE_ACTIVE_NOTIFICATION", 2);
        gl1 gl1Var4 = new gl1("RESTART_FOREGROUND", 3);
        c = gl1Var4;
        gl1 gl1Var5 = new gl1("UPDATE_INCOMING_NOTIFICATION", 4);
        gl1 gl1Var6 = new gl1("RESTART_FOREGROUND_SCREENSHARING", 5);
        o = gl1Var6;
        gl1[] gl1VarArr = {gl1Var, gl1Var2, gl1Var3, gl1Var4, gl1Var5, gl1Var6};
        X = gl1VarArr;
        Y = new v25(gl1VarArr);
    }

    public static gl1 valueOf(String str) {
        return (gl1) Enum.valueOf(gl1.class, str);
    }

    public static gl1[] values() {
        return (gl1[]) X.clone();
    }
}
