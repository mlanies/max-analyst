package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nl3 {
    public static final nl3 a;
    public static final nl3 b;
    public static final /* synthetic */ nl3[] c;

    static {
        nl3 nl3Var = new nl3("BLOCKED", 0);
        a = nl3Var;
        nl3 nl3Var2 = new nl3("REMOVED", 1);
        b = nl3Var2;
        c = new nl3[]{nl3Var, nl3Var2};
    }

    public static nl3 valueOf(String str) {
        return (nl3) Enum.valueOf(nl3.class, str);
    }

    public static nl3[] values() {
        return (nl3[]) c.clone();
    }
}
