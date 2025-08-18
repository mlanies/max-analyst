package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pf0 {
    public static final pf0 X;
    public static final /* synthetic */ pf0[] Y;
    public static final pf0 a;
    public static final pf0 b;
    public static final pf0 c;
    public static final pf0 o;

    static {
        pf0 pf0Var = new pf0("REMOTE", 0);
        a = pf0Var;
        pf0 pf0Var2 = new pf0("LOCAL_RTT", 1);
        b = pf0Var2;
        pf0 pf0Var3 = new pf0("LOCAL_LOSS", 2);
        c = pf0Var3;
        pf0 pf0Var4 = new pf0("REMOTE_RTT", 3);
        o = pf0Var4;
        pf0 pf0Var5 = new pf0("REMOTE_LOSS", 4);
        X = pf0Var5;
        Y = new pf0[]{pf0Var, pf0Var2, pf0Var3, pf0Var4, pf0Var5};
    }

    public static pf0 valueOf(String str) {
        return (pf0) Enum.valueOf(pf0.class, str);
    }

    public static pf0[] values() {
        return (pf0[]) Y.clone();
    }
}
