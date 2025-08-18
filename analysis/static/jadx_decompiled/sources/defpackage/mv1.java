package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mv1 {
    public static final mv1 X;
    public static final mv1 Y;
    public static final mv1 Z;
    public static final mv1 a;
    public static final mv1 b;
    public static final mv1 c;
    public static final mv1 o;
    public static final /* synthetic */ mv1[] s0;

    static {
        mv1 mv1Var = new mv1("UNKNOWN", 0);
        a = mv1Var;
        mv1 mv1Var2 = new mv1("INACTIVE", 1);
        b = mv1Var2;
        mv1 mv1Var3 = new mv1("SCANNING", 2);
        c = mv1Var3;
        mv1 mv1Var4 = new mv1("PASSIVE_FOCUSED", 3);
        o = mv1Var4;
        mv1 mv1Var5 = new mv1("PASSIVE_NOT_FOCUSED", 4);
        X = mv1Var5;
        mv1 mv1Var6 = new mv1("LOCKED_FOCUSED", 5);
        Y = mv1Var6;
        mv1 mv1Var7 = new mv1("LOCKED_NOT_FOCUSED", 6);
        Z = mv1Var7;
        s0 = new mv1[]{mv1Var, mv1Var2, mv1Var3, mv1Var4, mv1Var5, mv1Var6, mv1Var7};
    }

    public static mv1 valueOf(String str) {
        return (mv1) Enum.valueOf(mv1.class, str);
    }

    public static mv1[] values() {
        return (mv1[]) s0.clone();
    }
}
