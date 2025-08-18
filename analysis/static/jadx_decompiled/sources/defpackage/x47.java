package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x47 {
    public static final x47 a;
    public static final x47 b;
    public static final x47 c;
    public static final /* synthetic */ x47[] o;

    static {
        x47 x47Var = new x47("INVITE_BY_PHONE", 0);
        a = x47Var;
        x47 x47Var2 = new x47("INVITE_BY_QR", 1);
        b = x47Var2;
        x47 x47Var3 = new x47("INVITE_BY_LINK", 2);
        c = x47Var3;
        o = new x47[]{x47Var, x47Var2, x47Var3};
    }

    public static x47 valueOf(String str) {
        return (x47) Enum.valueOf(x47.class, str);
    }

    public static x47[] values() {
        return (x47[]) o.clone();
    }
}
