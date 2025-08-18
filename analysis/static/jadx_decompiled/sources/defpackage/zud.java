package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zud {
    public static final zud X;
    public static final zud Y;
    public static final zud Z;
    public static final huc b;
    public static final zud c;
    public static final zud o;
    public static final /* synthetic */ zud[] s0;
    public static final /* synthetic */ v25 t0;
    public final int a;

    static {
        zud zudVar = new zud("DIALOG_USER_ID", 0, 1);
        c = zudVar;
        zud zudVar2 = new zud("DIALOG_BOT_ID", 1, 2);
        o = zudVar2;
        zud zudVar3 = new zud("CHAT_ID", 2, 3);
        X = zudVar3;
        zud zudVar4 = new zud("CHANNEL_ID", 3, 4);
        zud zudVar5 = new zud("FOLDER_ID", 4, 5);
        Y = zudVar5;
        zud zudVar6 = new zud("WEBAPP_ID", 5, 6);
        Z = zudVar6;
        zud[] zudVarArr = {zudVar, zudVar2, zudVar3, zudVar4, zudVar5, zudVar6};
        s0 = zudVarArr;
        t0 = new v25(zudVarArr);
        b = new huc();
    }

    public zud(String str, int i, int i2) {
        this.a = i2;
    }

    public static zud valueOf(String str) {
        return (zud) Enum.valueOf(zud.class, str);
    }

    public static zud[] values() {
        return (zud[]) s0.clone();
    }
}
