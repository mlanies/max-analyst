package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lk7 {
    public static final lk7 X;
    public static final lk7 Y;
    public static final /* synthetic */ lk7[] Z;
    public static final lk7 a;
    public static final lk7 b;
    public static final lk7 c;
    public static final lk7 o;
    public static final /* synthetic */ v25 s0;

    static {
        lk7 lk7Var = new lk7("URL", 0);
        a = lk7Var;
        lk7 lk7Var2 = new lk7("HASH_TAG", 1);
        b = lk7Var2;
        lk7 lk7Var3 = new lk7("BOT_COMMAND", 2);
        c = lk7Var3;
        lk7 lk7Var4 = new lk7("PROFILE_TAG", 3);
        o = lk7Var4;
        lk7 lk7Var5 = new lk7("MENTION", 4);
        X = lk7Var5;
        lk7 lk7Var6 = new lk7("ML_ENTRY", 5);
        lk7 lk7Var7 = new lk7("MARKDOWN_LINK", 6);
        Y = lk7Var7;
        lk7[] lk7VarArr = {lk7Var, lk7Var2, lk7Var3, lk7Var4, lk7Var5, lk7Var6, lk7Var7};
        Z = lk7VarArr;
        s0 = new v25(lk7VarArr);
    }

    public static lk7 valueOf(String str) {
        return (lk7) Enum.valueOf(lk7.class, str);
    }

    public static lk7[] values() {
        return (lk7[]) Z.clone();
    }
}
