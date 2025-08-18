package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g52 {
    public static final g52 A0;
    public static final g52 B0;
    public static final g52 C0;
    public static final g52 D0;
    public static final g52 E0;
    public static final g52 F0;
    public static final /* synthetic */ g52[] G0;
    public static final g52 X;
    public static final g52 Y;
    public static final g52 Z;
    public static final g52 a;
    public static final g52 b;
    public static final g52 c;
    public static final g52 o;
    public static final g52 s0;
    public static final g52 t0;
    public static final g52 u0;
    public static final g52 v0;
    public static final g52 w0;
    public static final g52 x0;
    public static final g52 y0;
    public static final g52 z0;

    static {
        g52 g52Var = new g52("ADD_TO_FOLDER", 0);
        a = g52Var;
        g52 g52Var2 = new g52("REMOVE_FROM_FOLDER", 1);
        b = g52Var2;
        g52 g52Var3 = new g52("ADD_FAVORITE", 2);
        c = g52Var3;
        g52 g52Var4 = new g52("REMOVE_FAVORITE", 3);
        o = g52Var4;
        g52 g52Var5 = new g52("MARK_AS_UNREAD", 4);
        X = g52Var5;
        g52 g52Var6 = new g52("MARK_AS_READ", 5);
        Y = g52Var6;
        g52 g52Var7 = new g52("MUTE", 6);
        Z = g52Var7;
        g52 g52Var8 = new g52("UNMUTE", 7);
        s0 = g52Var8;
        g52 g52Var9 = new g52("LEAVE_CHAT", 8);
        t0 = g52Var9;
        g52 g52Var10 = new g52("LEAVE_CHANNEL", 9);
        u0 = g52Var10;
        g52 g52Var11 = new g52("UNSUBSCRIBE_CHANNEL", 10);
        v0 = g52Var11;
        g52 g52Var12 = new g52("DELETE_CHANNEL", 11);
        w0 = g52Var12;
        g52 g52Var13 = new g52("DELETE_FOR_ALL", 12);
        x0 = g52Var13;
        g52 g52Var14 = new g52("DELETE_CHAT", 13);
        y0 = g52Var14;
        g52 g52Var15 = new g52("BLOCK", 14);
        z0 = g52Var15;
        g52 g52Var16 = new g52("SELECT", 15);
        A0 = g52Var16;
        g52 g52Var17 = new g52("REPORT", 16);
        B0 = g52Var17;
        g52 g52Var18 = new g52("CLEAR_HISTORY", 17);
        C0 = g52Var18;
        g52 g52Var19 = new g52("SUSPEND_BOT", 18);
        D0 = g52Var19;
        g52 g52Var20 = new g52("SUSPEND_AND_DELETE_BOT", 19);
        E0 = g52Var20;
        g52 g52Var21 = new g52("CLEAR_SAVED_MESSAGES", 20);
        F0 = g52Var21;
        G0 = new g52[]{g52Var, g52Var2, g52Var3, g52Var4, g52Var5, g52Var6, g52Var7, g52Var8, g52Var9, g52Var10, g52Var11, g52Var12, g52Var13, g52Var14, g52Var15, g52Var16, g52Var17, g52Var18, g52Var19, g52Var20, g52Var21};
    }

    public static g52 valueOf(String str) {
        return (g52) Enum.valueOf(g52.class, str);
    }

    public static g52[] values() {
        return (g52[]) G0.clone();
    }
}
