package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nv2 {
    public static final nv2 X;
    public static final /* synthetic */ nv2[] Y;
    public static final nv2 a;
    public static final nv2 b;
    public static final nv2 c;
    public static final nv2 o;

    static {
        nv2 nv2Var = new nv2("LOADING", 0);
        a = nv2Var;
        nv2 nv2Var2 = new nv2("LOADING_NEXT_PAGE", 1);
        b = nv2Var2;
        nv2 nv2Var3 = new nv2("IDLE_SEARCH", 2);
        c = nv2Var3;
        nv2 nv2Var4 = new nv2("SEARCH_RESULT", 3);
        o = nv2Var4;
        nv2 nv2Var5 = new nv2("EMPTY_SEARCH_RESULT", 4);
        X = nv2Var5;
        Y = new nv2[]{nv2Var, nv2Var2, nv2Var3, nv2Var4, nv2Var5};
    }

    public static nv2 valueOf(String str) {
        return (nv2) Enum.valueOf(nv2.class, str);
    }

    public static nv2[] values() {
        return (nv2[]) Y.clone();
    }
}
