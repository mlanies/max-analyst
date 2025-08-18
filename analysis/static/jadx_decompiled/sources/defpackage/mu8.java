package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class mu8 {
    public static final mu8 X;
    public static final mu8 Y;
    public static final mu8 Z;
    public static final mu8 a;
    public static final mu8 b;
    public static final mu8 c;
    public static final mu8 o;
    public static final mu8 s0;
    public static final mu8 t0;
    public static final mu8 u0;
    public static final mu8 v0;
    public static final /* synthetic */ mu8[] w0;

    static {
        mu8 mu8Var = new mu8("USER_MENTION", 0);
        a = mu8Var;
        mu8 mu8Var2 = new mu8("GROUP_MENTION", 1);
        b = mu8Var2;
        mu8 mu8Var3 = new mu8("MONOSPACED", 2);
        c = mu8Var3;
        mu8 mu8Var4 = new mu8("STRONG", 3);
        o = mu8Var4;
        mu8 mu8Var5 = new mu8("EMPHASIZED", 4);
        X = mu8Var5;
        mu8 mu8Var6 = new mu8("LINK", 5);
        Y = mu8Var6;
        mu8 mu8Var7 = new mu8("STRIKETHROUGH", 6);
        Z = mu8Var7;
        mu8 mu8Var8 = new mu8("CODE", 7);
        s0 = mu8Var8;
        mu8 mu8Var9 = new mu8("UNDERLINE", 8);
        t0 = mu8Var9;
        mu8 mu8Var10 = new mu8("HEADING", 9);
        u0 = mu8Var10;
        mu8 mu8Var11 = new mu8("ANIMOJI", 10);
        v0 = mu8Var11;
        w0 = new mu8[]{mu8Var, mu8Var2, mu8Var3, mu8Var4, mu8Var5, mu8Var6, mu8Var7, mu8Var8, mu8Var9, mu8Var10, mu8Var11};
    }

    public static mu8 valueOf(String str) {
        return (mu8) Enum.valueOf(mu8.class, str);
    }

    public static mu8[] values() {
        return (mu8[]) w0.clone();
    }
}
