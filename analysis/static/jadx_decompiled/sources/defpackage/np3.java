package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class np3 {
    public static final np3 a;
    public static final np3 b;
    public static final np3 c;
    public static final /* synthetic */ np3[] o;

    static {
        np3 np3Var = new np3("CUSTOM", 0);
        a = np3Var;
        np3 np3Var2 = new np3("DEVICE", 1);
        np3 np3Var3 = new np3("ONEME", 2);
        b = np3Var3;
        np3 np3Var4 = new np3("UNKNOWN", 3);
        c = np3Var4;
        o = new np3[]{np3Var, np3Var2, np3Var3, np3Var4};
    }

    public static np3 valueOf(String str) {
        return (np3) Enum.valueOf(np3.class, str);
    }

    public static np3[] values() {
        return (np3[]) o.clone();
    }
}
