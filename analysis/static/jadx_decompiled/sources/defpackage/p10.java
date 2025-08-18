package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p10 {
    public static final p10 X;
    public static final p10 Y;
    public static final p10 Z;
    public static final p10 a;
    public static final p10 b;
    public static final p10 c;
    public static final p10 o;
    public static final p10 s0;
    public static final p10 t0;
    public static final p10 u0;
    public static final p10 v0;
    public static final /* synthetic */ p10[] w0;

    static {
        p10 p10Var = new p10("UNKNOWN", 0);
        a = p10Var;
        p10 p10Var2 = new p10("NEW", 1);
        b = p10Var2;
        p10 p10Var3 = new p10("ADD", 2);
        c = p10Var3;
        p10 p10Var4 = new p10("REMOVE", 3);
        o = p10Var4;
        p10 p10Var5 = new p10("LEAVE", 4);
        X = p10Var5;
        p10 p10Var6 = new p10("TITLE", 5);
        Y = p10Var6;
        p10 p10Var7 = new p10("ICON", 6);
        Z = p10Var7;
        p10 p10Var8 = new p10("SYSTEM", 7);
        s0 = p10Var8;
        p10 p10Var9 = new p10("JOIN_BY_LINK", 8);
        t0 = p10Var9;
        p10 p10Var10 = new p10("PIN", 9);
        u0 = p10Var10;
        p10 p10Var11 = new p10("BOT_STARTED", 10);
        v0 = p10Var11;
        w0 = new p10[]{p10Var, p10Var2, p10Var3, p10Var4, p10Var5, p10Var6, p10Var7, p10Var8, p10Var9, p10Var10, p10Var11};
    }

    public static p10 valueOf(String str) {
        return (p10) Enum.valueOf(p10.class, str);
    }

    public static p10[] values() {
        return (p10[]) w0.clone();
    }
}
