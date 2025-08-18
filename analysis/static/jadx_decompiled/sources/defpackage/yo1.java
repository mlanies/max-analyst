package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yo1 {
    public static final yo1 X;
    public static final /* synthetic */ yo1[] Y;
    public static final yo1 a;
    public static final yo1 b;
    public static final yo1 c;
    public static final yo1 o;

    static {
        yo1 yo1Var = new yo1("MIDDLE", 0);
        a = yo1Var;
        yo1 yo1Var2 = new yo1("SMALL", 1);
        b = yo1Var2;
        yo1 yo1Var3 = new yo1("PIP", 2);
        c = yo1Var3;
        yo1 yo1Var4 = new yo1("PREVIEW", 3);
        o = yo1Var4;
        yo1 yo1Var5 = new yo1("BIG_AVATAR", 4);
        X = yo1Var5;
        Y = new yo1[]{yo1Var, yo1Var2, yo1Var3, yo1Var4, yo1Var5};
    }

    public static yo1 valueOf(String str) {
        return (yo1) Enum.valueOf(yo1.class, str);
    }

    public static yo1[] values() {
        return (yo1[]) Y.clone();
    }
}
