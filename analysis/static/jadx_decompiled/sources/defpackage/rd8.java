package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rd8 {
    public static final /* synthetic */ rd8[] X;
    public static final rd8 a;
    public static final rd8 b;
    public static final rd8 c;
    public static final rd8 o;

    static {
        rd8 rd8Var = new rd8("UNMUTED", 0);
        a = rd8Var;
        rd8 rd8Var2 = new rd8("UNMUTED_BUT_MUTED_ONCE", 1);
        b = rd8Var2;
        rd8 rd8Var3 = new rd8("MUTED_PERMANENT", 2);
        c = rd8Var3;
        rd8 rd8Var4 = new rd8("MUTED_PERMANENT_BUT_UNMUTED_ONCE", 3);
        o = rd8Var4;
        X = new rd8[]{rd8Var, rd8Var2, rd8Var3, rd8Var4};
    }

    public static rd8 valueOf(String str) {
        return (rd8) Enum.valueOf(rd8.class, str);
    }

    public static rd8[] values() {
        return (rd8[]) X.clone();
    }
}
