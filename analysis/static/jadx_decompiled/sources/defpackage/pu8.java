package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pu8 {
    public static final pu8 X;
    public static final pu8 Y;
    public static final pu8 Z;
    public static final pu8 a;
    public static final pu8 b;
    public static final pu8 c;
    public static final pu8 o;
    public static final pu8 s0;
    public static final pu8 t0;
    public static final pu8 u0;
    public static final pu8 v0;
    public static final pu8 w0;
    public static final /* synthetic */ pu8[] x0;

    static {
        pu8 pu8Var = new pu8("UNKNOWN", 0);
        a = pu8Var;
        pu8 pu8Var2 = new pu8("USER_MENTION", 1);
        b = pu8Var2;
        pu8 pu8Var3 = new pu8("GROUP_MENTION", 2);
        c = pu8Var3;
        pu8 pu8Var4 = new pu8("MONOSPACED", 3);
        o = pu8Var4;
        pu8 pu8Var5 = new pu8("STRONG", 4);
        X = pu8Var5;
        pu8 pu8Var6 = new pu8("EMPHASIZED", 5);
        Y = pu8Var6;
        pu8 pu8Var7 = new pu8("LINK", 6);
        Z = pu8Var7;
        pu8 pu8Var8 = new pu8("STRIKETHROUGH", 7);
        s0 = pu8Var8;
        pu8 pu8Var9 = new pu8("UNDERLINE", 8);
        t0 = pu8Var9;
        pu8 pu8Var10 = new pu8("HEADING", 9);
        u0 = pu8Var10;
        pu8 pu8Var11 = new pu8("CODE", 10);
        v0 = pu8Var11;
        pu8 pu8Var12 = new pu8("ANIMOJI", 11);
        w0 = pu8Var12;
        x0 = new pu8[]{pu8Var, pu8Var2, pu8Var3, pu8Var4, pu8Var5, pu8Var6, pu8Var7, pu8Var8, pu8Var9, pu8Var10, pu8Var11, pu8Var12};
    }

    public static pu8 valueOf(String str) {
        return (pu8) Enum.valueOf(pu8.class, str);
    }

    public static pu8[] values() {
        return (pu8[]) x0.clone();
    }
}
