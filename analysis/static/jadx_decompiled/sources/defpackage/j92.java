package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j92 {
    public static final /* synthetic */ j92[] X;
    public static final j92 a;
    public static final j92 b;
    public static final j92 c;
    public static final j92 o;

    static {
        j92 j92Var = new j92("DIALOG", 0);
        a = j92Var;
        j92 j92Var2 = new j92("CHAT", 1);
        b = j92Var2;
        j92 j92Var3 = new j92("CHANNEL", 2);
        c = j92Var3;
        j92 j92Var4 = new j92("GROUP_CHAT", 3);
        o = j92Var4;
        X = new j92[]{j92Var, j92Var2, j92Var3, j92Var4};
    }

    public static j92 valueOf(String str) {
        return (j92) Enum.valueOf(j92.class, str);
    }

    public static j92[] values() {
        return (j92[]) X.clone();
    }
}
