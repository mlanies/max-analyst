package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n33 {
    public static final n33 a;
    public static final /* synthetic */ n33[] b;

    /* JADX INFO: Fake field, exist only in values array */
    n33 EF0;

    static {
        n33 n33Var = new n33("UNKNOWN", 0);
        n33 n33Var2 = new n33("ANDROID_FIREBASE", 1);
        a = n33Var2;
        b = new n33[]{n33Var, n33Var2};
    }

    public static n33 valueOf(String str) {
        return (n33) Enum.valueOf(n33.class, str);
    }

    public static n33[] values() {
        return (n33[]) b.clone();
    }
}
