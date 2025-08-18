package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vx3 {
    public static final /* synthetic */ vx3[] X;
    public static final vx3 a;
    public static final vx3 b;
    public static final vx3 c;
    public static final vx3 o;

    static {
        vx3 vx3Var = new vx3("DEFAULT", 0);
        a = vx3Var;
        vx3 vx3Var2 = new vx3("LAZY", 1);
        b = vx3Var2;
        vx3 vx3Var3 = new vx3("ATOMIC", 2);
        c = vx3Var3;
        vx3 vx3Var4 = new vx3("UNDISPATCHED", 3);
        o = vx3Var4;
        X = new vx3[]{vx3Var, vx3Var2, vx3Var3, vx3Var4};
    }

    public static vx3 valueOf(String str) {
        return (vx3) Enum.valueOf(vx3.class, str);
    }

    public static vx3[] values() {
        return (vx3[]) X.clone();
    }
}
