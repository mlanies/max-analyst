package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ux6 {
    public static final ux6 X;
    public static final ux6 Y;
    public static final ux6 Z;
    public static final ux6 b;
    public static final ux6 c;
    public static final ux6 o;
    public static final ux6 s0;
    public static final ux6 t0;
    public static final /* synthetic */ ux6[] u0;
    public static final /* synthetic */ v25 v0;
    public final String a;

    static {
        ux6 ux6Var = new ux6("SEND_5_MESSAGES", 0, "messageSent");
        b = ux6Var;
        ux6 ux6Var2 = new ux6("CREATE_FOLDER", 1, "folderCreated");
        c = ux6Var2;
        ux6 ux6Var3 = new ux6("SEND_AUDIO_MESSAGE", 2, "voiceMessageSent");
        o = ux6Var3;
        ux6 ux6Var4 = new ux6("ADD_2_REACTIONS", 3, "reactionSet");
        X = ux6Var4;
        ux6 ux6Var5 = new ux6("SEND_3_STICKERS", 4, "stickerSent");
        Y = ux6Var5;
        ux6 ux6Var6 = new ux6("CREATE_2_GROUP_CHATS", 5, "groupChatCreated");
        Z = ux6Var6;
        ux6 ux6Var7 = new ux6("MADE_2_PIN", 6, "pinMade");
        s0 = ux6Var7;
        ux6 ux6Var8 = new ux6("PARTICIPATED_IN_CALL", 7, "callMade");
        t0 = ux6Var8;
        ux6[] ux6VarArr = {ux6Var, ux6Var2, ux6Var3, ux6Var4, ux6Var5, ux6Var6, ux6Var7, ux6Var8};
        u0 = ux6VarArr;
        v0 = new v25(ux6VarArr);
    }

    public ux6(String str, int i, String str2) {
        this.a = str2;
    }

    public static ux6 valueOf(String str) {
        return (ux6) Enum.valueOf(ux6.class, str);
    }

    public static ux6[] values() {
        return (ux6[]) u0.clone();
    }
}
