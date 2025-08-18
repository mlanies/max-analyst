package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n00 {
    public static final n00 a;
    public static final n00 b;
    public static final /* synthetic */ n00[] c;

    static {
        n00 n00Var = new n00("Media", 0);
        a = n00Var;
        n00 n00Var2 = new n00("Files", 1);
        b = n00Var2;
        c = new n00[]{n00Var, n00Var2};
    }

    public static n00 valueOf(String str) {
        return (n00) Enum.valueOf(n00.class, str);
    }

    public static n00[] values() {
        return (n00[]) c.clone();
    }
}
