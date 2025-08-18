package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u61 {
    public static final /* synthetic */ u61[] X;
    public static final u61 a;
    public static final u61 b;
    public static final u61 c;
    public static final u61 o;

    static {
        u61 u61Var = new u61("ADD_PARTICIPANT", 0);
        a = u61Var;
        u61 u61Var2 = new u61("RECORD", 1);
        b = u61Var2;
        u61 u61Var3 = new u61("MOVIE_SHARE", 2);
        c = u61Var3;
        u61 u61Var4 = new u61("ASR_RECORD", 3);
        o = u61Var4;
        X = new u61[]{u61Var, u61Var2, u61Var3, u61Var4};
    }

    public static u61 valueOf(String str) {
        return (u61) Enum.valueOf(u61.class, str);
    }

    public static u61[] values() {
        return (u61[]) X.clone();
    }
}
