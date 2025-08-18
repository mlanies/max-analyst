package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gv1 {
    public static final gv1 a;
    public static final gv1 b;
    public static final gv1 c;
    public static final /* synthetic */ gv1[] o;

    static {
        gv1 gv1Var = new gv1("OFF", 0);
        a = gv1Var;
        gv1 gv1Var2 = new gv1("ON", 1);
        b = gv1Var2;
        gv1 gv1Var3 = new gv1("AUTO", 2);
        c = gv1Var3;
        o = new gv1[]{gv1Var, gv1Var2, gv1Var3, new gv1("TORCH", 3)};
    }

    public static gv1 valueOf(String str) {
        return (gv1) Enum.valueOf(gv1.class, str);
    }

    public static gv1[] values() {
        return (gv1[]) o.clone();
    }
}
