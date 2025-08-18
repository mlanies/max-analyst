package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vi5 {
    public static final /* synthetic */ vi5[] X;
    public static final vi5 a;
    public static final vi5 b;
    public static final vi5 c;
    public static final vi5 o;

    static {
        vi5 vi5Var = new vi5("PresentArrow", 0);
        a = vi5Var;
        vi5 vi5Var2 = new vi5("ArrowToProgress", 1);
        b = vi5Var2;
        vi5 vi5Var3 = new vi5("ProgressToArrow", 2);
        c = vi5Var3;
        vi5 vi5Var4 = new vi5("ProgressSpinning", 3);
        o = vi5Var4;
        X = new vi5[]{vi5Var, vi5Var2, vi5Var3, vi5Var4};
    }

    public static vi5 valueOf(String str) {
        return (vi5) Enum.valueOf(vi5.class, str);
    }

    public static vi5[] values() {
        return (vi5[]) X.clone();
    }
}
