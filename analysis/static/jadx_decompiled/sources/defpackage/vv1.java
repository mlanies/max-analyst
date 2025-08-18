package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vv1 {
    public static final /* synthetic */ vv1[] X;
    public static final vv1 a;
    public static final vv1 b;
    public static final vv1 c;
    public static final vv1 o;

    static {
        vv1 vv1Var = new vv1("PhotoDefault", 0);
        a = vv1Var;
        vv1 vv1Var2 = new vv1("PhotoTaking", 1);
        b = vv1Var2;
        vv1 vv1Var3 = new vv1("VideoDefault", 2);
        c = vv1Var3;
        vv1 vv1Var4 = new vv1("VideoRecording", 3);
        o = vv1Var4;
        X = new vv1[]{vv1Var, vv1Var2, vv1Var3, vv1Var4};
    }

    public static vv1 valueOf(String str) {
        return (vv1) Enum.valueOf(vv1.class, str);
    }

    public static vv1[] values() {
        return (vv1[]) X.clone();
    }
}
