package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dj1 {
    public static final dj1 a;
    public static final dj1 b;
    public static final /* synthetic */ dj1[] c;

    static {
        dj1 dj1Var = new dj1("LOW", 0);
        a = dj1Var;
        dj1 dj1Var2 = new dj1("MIDDLE", 1);
        b = dj1Var2;
        c = new dj1[]{dj1Var, dj1Var2, new dj1("HIGH", 2)};
    }

    public static dj1 valueOf(String str) {
        return (dj1) Enum.valueOf(dj1.class, str);
    }

    public static dj1[] values() {
        return (dj1[]) c.clone();
    }
}
