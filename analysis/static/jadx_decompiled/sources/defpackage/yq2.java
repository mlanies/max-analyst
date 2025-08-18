package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yq2 {
    public static final yq2 X;
    public static final yq2 Y;
    public static final yq2 Z;
    public static final yq2 a;
    public static final yq2 b;
    public static final yq2 c;
    public static final yq2 o;
    public static final yq2 s0;
    public static final yq2 t0;
    public static final /* synthetic */ yq2[] u0;

    static {
        yq2 yq2Var = new yq2("UNBLOCK", 0);
        a = yq2Var;
        yq2 yq2Var2 = new yq2("REMOVE_CHAT", 1);
        b = yq2Var2;
        yq2 yq2Var3 = new yq2("LEAVE_CHAT", 2);
        c = yq2Var3;
        yq2 yq2Var4 = new yq2("JOIN_CHAT", 3);
        o = yq2Var4;
        yq2 yq2Var5 = new yq2("START_BOT", 4);
        X = yq2Var5;
        yq2 yq2Var6 = new yq2("POST_RESTRICTED", 5);
        Y = yq2Var6;
        yq2 yq2Var7 = new yq2("UNMUTE_CHAT", 6);
        Z = yq2Var7;
        yq2 yq2Var8 = new yq2("MUTE_CHAT", 7);
        s0 = yq2Var8;
        yq2 yq2Var9 = new yq2("SUBSCRIBE", 8);
        t0 = yq2Var9;
        u0 = new yq2[]{yq2Var, yq2Var2, yq2Var3, yq2Var4, yq2Var5, yq2Var6, yq2Var7, yq2Var8, yq2Var9};
    }

    public static yq2 valueOf(String str) {
        return (yq2) Enum.valueOf(yq2.class, str);
    }

    public static yq2[] values() {
        return (yq2[]) u0.clone();
    }
}
