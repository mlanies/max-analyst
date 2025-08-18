package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lt0 {
    public static final lt0 a;
    public static final lt0 b;
    public static final /* synthetic */ lt0[] c;

    static {
        lt0 lt0Var = new lt0("ACTIVE", 0);
        a = lt0Var;
        lt0 lt0Var2 = new lt0("INACTIVE", 1);
        b = lt0Var2;
        c = new lt0[]{lt0Var, lt0Var2};
    }

    public static lt0 valueOf(String str) {
        return (lt0) Enum.valueOf(lt0.class, str);
    }

    public static lt0[] values() {
        return (lt0[]) c.clone();
    }
}
