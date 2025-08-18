package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vi4 {
    public static final vi4 X;
    public static final /* synthetic */ vi4[] Y;
    public static final int[] a;
    public static volatile vi4 b;
    public static final vi4 c;
    public static final vi4 o;

    static {
        vi4 vi4Var = new vi4("LOW", 0);
        c = vi4Var;
        vi4 vi4Var2 = new vi4("AVERAGE", 1);
        o = vi4Var2;
        vi4 vi4Var3 = new vi4("HIGH", 2);
        X = vi4Var3;
        Y = new vi4[]{vi4Var, vi4Var2, vi4Var3};
        a = new int[]{-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};
    }

    public static vi4 valueOf(String str) {
        return (vi4) Enum.valueOf(vi4.class, str);
    }

    public static vi4[] values() {
        return (vi4[]) Y.clone();
    }
}
