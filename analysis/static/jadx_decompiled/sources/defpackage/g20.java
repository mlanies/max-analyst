package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g20 {
    public static final g20 X;
    public static final g20 Y;
    public static final g20 Z;
    public static final g20 a;
    public static final g20 b;
    public static final g20 c;
    public static final g20 o;
    public static final g20 s0;
    public static final g20 t0;
    public static final g20 u0;
    public static final g20 v0;
    public static final g20 w0;
    public static final g20 x0;
    public static final g20 y0;
    public static final /* synthetic */ g20[] z0;

    static {
        g20 g20Var = new g20("UNKNOWN", 0);
        a = g20Var;
        g20 g20Var2 = new g20("CONTROL", 1);
        b = g20Var2;
        g20 g20Var3 = new g20("PHOTO", 2);
        c = g20Var3;
        g20 g20Var4 = new g20("VIDEO", 3);
        o = g20Var4;
        g20 g20Var5 = new g20("AUDIO", 4);
        X = g20Var5;
        g20 g20Var6 = new g20("STICKER", 5);
        Y = g20Var6;
        g20 g20Var7 = new g20("SHARE", 6);
        Z = g20Var7;
        g20 g20Var8 = new g20("CALL", 7);
        s0 = g20Var8;
        g20 g20Var9 = new g20("APP", 8);
        t0 = g20Var9;
        g20 g20Var10 = new g20("FILE", 9);
        u0 = g20Var10;
        g20 g20Var11 = new g20("CONTACT", 10);
        v0 = g20Var11;
        g20 g20Var12 = new g20("PRESENT", 11);
        w0 = g20Var12;
        g20 g20Var13 = new g20("LOCATION", 12);
        x0 = g20Var13;
        g20 g20Var14 = new g20("WIDGET", 13);
        y0 = g20Var14;
        z0 = new g20[]{g20Var, g20Var2, g20Var3, g20Var4, g20Var5, g20Var6, g20Var7, g20Var8, g20Var9, g20Var10, g20Var11, g20Var12, g20Var13, g20Var14};
    }

    public static g20 valueOf(String str) {
        return (g20) Enum.valueOf(g20.class, str);
    }

    public static g20[] values() {
        return (g20[]) z0.clone();
    }
}
