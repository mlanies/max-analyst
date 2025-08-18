package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tu3 {
    public static final tu3 a;
    public static final tu3 b;
    public static final /* synthetic */ tu3[] c;

    static {
        tu3 tu3Var = new tu3("RELEASE_DETACH", 0);
        a = tu3Var;
        tu3 tu3Var2 = new tu3("RETAIN_DETACH", 1);
        b = tu3Var2;
        c = new tu3[]{tu3Var, tu3Var2};
    }

    public static tu3 valueOf(String str) {
        return (tu3) Enum.valueOf(tu3.class, str);
    }

    public static tu3[] values() {
        return (tu3[]) c.clone();
    }
}
