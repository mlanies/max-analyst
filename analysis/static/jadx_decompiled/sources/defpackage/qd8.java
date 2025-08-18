package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qd8 {
    public static final /* synthetic */ qd8[] X;
    public static final qd8 a;
    public static final qd8 b;
    public static final qd8 c;
    public static final qd8 o;

    static {
        qd8 qd8Var = new qd8("AUDIO", 0);
        a = qd8Var;
        qd8 qd8Var2 = new qd8("VIDEO", 1);
        b = qd8Var2;
        qd8 qd8Var3 = new qd8("SCREEN_SHARING", 2);
        c = qd8Var3;
        qd8 qd8Var4 = new qd8("MOVIE_SHARING", 3);
        o = qd8Var4;
        X = new qd8[]{qd8Var, qd8Var2, qd8Var3, qd8Var4};
    }

    public static qd8 valueOf(String str) {
        return (qd8) Enum.valueOf(qd8.class, str);
    }

    public static qd8[] values() {
        return (qd8[]) X.clone();
    }
}
