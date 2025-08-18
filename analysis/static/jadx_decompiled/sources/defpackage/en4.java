package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class en4 {
    public static final en4 X;
    public static final en4 Y;
    public static final en4 Z;
    public static final c32 a;
    public static final en4 b;
    public static final en4 c;
    public static final en4 o;
    public static final en4 s0;
    public static final /* synthetic */ en4[] t0;
    public static final /* synthetic */ v25 u0;

    static {
        en4 en4Var = new en4("SHARE_VIDEO", 0);
        b = en4Var;
        en4 en4Var2 = new en4("DOWNLOAD_VIDEO", 1);
        c = en4Var2;
        en4 en4Var3 = new en4("SHARE_PHOTO", 2);
        o = en4Var3;
        en4 en4Var4 = new en4("DOWNLOAD_PHOTO", 3);
        X = en4Var4;
        en4 en4Var5 = new en4("SHARE_GIF", 4);
        Y = en4Var5;
        en4 en4Var6 = new en4("DOWNLOAD_GIF", 5);
        Z = en4Var6;
        en4 en4Var7 = new en4("SHARE_FILE", 6);
        s0 = en4Var7;
        en4[] en4VarArr = {en4Var, en4Var2, en4Var3, en4Var4, en4Var5, en4Var6, en4Var7};
        t0 = en4VarArr;
        u0 = new v25(en4VarArr);
        a = new c32(10, (byte) 0);
    }

    public static en4 valueOf(String str) {
        return (en4) Enum.valueOf(en4.class, str);
    }

    public static en4[] values() {
        return (en4[]) t0.clone();
    }
}
