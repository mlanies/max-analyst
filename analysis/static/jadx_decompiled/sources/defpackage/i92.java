package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i92 {
    public static final i92 X;
    public static final i92 Y;
    public static final i92 Z;
    public static final i92 a;
    public static final i92 b;
    public static final i92 c;
    public static final i92 o;
    public static final /* synthetic */ i92[] s0;

    static {
        i92 i92Var = new i92("ACTIVE", 0);
        a = i92Var;
        i92 i92Var2 = new i92("LEFT", 1);
        b = i92Var2;
        i92 i92Var3 = new i92("LEAVING", 2);
        c = i92Var3;
        i92 i92Var4 = new i92("REMOVED", 3);
        o = i92Var4;
        i92 i92Var5 = new i92("REMOVING", 4);
        X = i92Var5;
        i92 i92Var6 = new i92("CLOSED", 5);
        Y = i92Var6;
        i92 i92Var7 = new i92("HIDDEN", 6);
        Z = i92Var7;
        s0 = new i92[]{i92Var, i92Var2, i92Var3, i92Var4, i92Var5, i92Var6, i92Var7};
    }

    public static i92 valueOf(String str) {
        return (i92) Enum.valueOf(i92.class, str);
    }

    public static i92[] values() {
        return (i92[]) s0.clone();
    }
}
