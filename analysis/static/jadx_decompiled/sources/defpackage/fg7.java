package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fg7 {
    public static final fg7 X;
    public static final /* synthetic */ fg7[] Y;
    public static final fg7 a;
    public static final fg7 b;
    public static final fg7 c;
    public static final fg7 o;

    static {
        fg7 fg7Var = new fg7("DESTROYED", 0);
        a = fg7Var;
        fg7 fg7Var2 = new fg7("INITIALIZED", 1);
        b = fg7Var2;
        fg7 fg7Var3 = new fg7("CREATED", 2);
        c = fg7Var3;
        fg7 fg7Var4 = new fg7("STARTED", 3);
        o = fg7Var4;
        fg7 fg7Var5 = new fg7("RESUMED", 4);
        X = fg7Var5;
        Y = new fg7[]{fg7Var, fg7Var2, fg7Var3, fg7Var4, fg7Var5};
    }

    public static fg7 valueOf(String str) {
        return (fg7) Enum.valueOf(fg7.class, str);
    }

    public static fg7[] values() {
        return (fg7[]) Y.clone();
    }

    public final boolean a(fg7 fg7Var) {
        return compareTo(fg7Var) >= 0;
    }
}
