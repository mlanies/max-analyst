package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kk0 {
    public static final kk0 X;
    public static final /* synthetic */ kk0[] Y;
    public static final kk0 a;
    public static final kk0 b;
    public static final kk0 c;
    public static final kk0 o;

    static {
        kk0 kk0Var = new kk0("SMALLEST", 0);
        a = kk0Var;
        kk0 kk0Var2 = new kk0("SMALL", 1);
        b = kk0Var2;
        kk0 kk0Var3 = new kk0("MEDIUM", 2);
        c = kk0Var3;
        kk0 kk0Var4 = new kk0("BIG", 3);
        o = kk0Var4;
        kk0 kk0Var5 = new kk0("MAX", 4);
        X = kk0Var5;
        Y = new kk0[]{kk0Var, kk0Var2, kk0Var3, kk0Var4, kk0Var5};
    }

    public static kk0 valueOf(String str) {
        return (kk0) Enum.valueOf(kk0.class, str);
    }

    public static kk0[] values() {
        return (kk0[]) Y.clone();
    }
}
