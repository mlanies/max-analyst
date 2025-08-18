package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p25 {
    public static final p25 a;
    public static final p25 b;
    public static final /* synthetic */ p25[] c;

    static {
        p25 p25Var = new p25("SUCCESS", 0);
        a = p25Var;
        p25 p25Var2 = new p25("FAILURE", 1);
        b = p25Var2;
        c = new p25[]{p25Var, p25Var2};
    }

    public static p25 valueOf(String str) {
        return (p25) Enum.valueOf(p25.class, str);
    }

    public static p25[] values() {
        return (p25[]) c.clone();
    }
}
