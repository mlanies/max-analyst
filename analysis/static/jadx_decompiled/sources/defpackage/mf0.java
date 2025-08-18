package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mf0 {
    public static final mf0 a;
    public static final mf0 b;
    public static final /* synthetic */ mf0[] c;

    static {
        mf0 mf0Var = new mf0("EXPONENTIAL", 0);
        a = mf0Var;
        mf0 mf0Var2 = new mf0("LINEAR", 1);
        b = mf0Var2;
        c = new mf0[]{mf0Var, mf0Var2};
    }

    public static mf0 valueOf(String str) {
        return (mf0) Enum.valueOf(mf0.class, str);
    }

    public static mf0[] values() {
        return (mf0[]) c.clone();
    }
}
