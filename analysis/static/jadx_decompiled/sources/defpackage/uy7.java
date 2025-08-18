package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uy7 {
    public static final /* synthetic */ uy7[] X;
    public static final uy7 a;
    public static final uy7 b;
    public static final uy7 c;
    public static final uy7 o;

    static {
        uy7 uy7Var = new uy7("ACTIVE_SMALL", 0);
        a = uy7Var;
        uy7 uy7Var2 = new uy7("ACTIVE_BIG", 1);
        b = uy7Var2;
        uy7 uy7Var3 = new uy7("PASSIVE_SMALL", 2);
        c = uy7Var3;
        uy7 uy7Var4 = new uy7("PASSIVE_BIG", 3);
        o = uy7Var4;
        X = new uy7[]{uy7Var, uy7Var2, uy7Var3, uy7Var4};
    }

    public static uy7 valueOf(String str) {
        return (uy7) Enum.valueOf(uy7.class, str);
    }

    public static uy7[] values() {
        return (uy7[]) X.clone();
    }
}
