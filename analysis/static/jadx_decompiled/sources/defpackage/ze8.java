package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ze8 {
    public static final /* synthetic */ ze8[] X;
    public static final ze8 a;
    public static final ze8 b;
    public static final ze8 c;
    public static final ze8 o;

    static {
        ze8 ze8Var = new ze8("GIF", 0);
        a = ze8Var;
        ze8 ze8Var2 = new ze8("STICKER", 1);
        b = ze8Var2;
        ze8 ze8Var3 = new ze8("VIDEO", 2);
        c = ze8Var3;
        ze8 ze8Var4 = new ze8("PIP", 3);
        o = ze8Var4;
        X = new ze8[]{ze8Var, ze8Var2, ze8Var3, ze8Var4};
    }

    public static ze8 valueOf(String str) {
        return (ze8) Enum.valueOf(ze8.class, str);
    }

    public static ze8[] values() {
        return (ze8[]) X.clone();
    }
}
