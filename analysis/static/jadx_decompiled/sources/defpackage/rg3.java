package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rg3 {
    public static final rg3 a;
    public static final rg3 b;
    public static final /* synthetic */ rg3[] c;

    static {
        rg3 rg3Var = new rg3("POSITIVE", 0);
        a = rg3Var;
        rg3 rg3Var2 = new rg3("NEGATIVE", 1);
        b = rg3Var2;
        c = new rg3[]{rg3Var, rg3Var2};
    }

    public static rg3 valueOf(String str) {
        return (rg3) Enum.valueOf(rg3.class, str);
    }

    public static rg3[] values() {
        return (rg3[]) c.clone();
    }
}
