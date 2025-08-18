package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ko1 {
    public static final /* synthetic */ ko1[] X;
    public static final ko1 a;
    public static final ko1 b;
    public static final ko1 c;
    public static final ko1 o;

    static {
        ko1 ko1Var = new ko1("ACTIVE", 0);
        a = ko1Var;
        ko1 ko1Var2 = new ko1("CALLING", 1);
        b = ko1Var2;
        ko1 ko1Var3 = new ko1("NO_CONNECTION", 2);
        c = ko1Var3;
        ko1 ko1Var4 = new ko1("NONE", 3);
        o = ko1Var4;
        X = new ko1[]{ko1Var, ko1Var2, ko1Var3, ko1Var4};
    }

    public static ko1 valueOf(String str) {
        return (ko1) Enum.valueOf(ko1.class, str);
    }

    public static ko1[] values() {
        return (ko1[]) X.clone();
    }
}
