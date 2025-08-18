package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v82 {
    public static final /* synthetic */ v82[] X;
    public static final v82 a;
    public static final v82 b;
    public static final v82 c;
    public static final v82 o;

    static {
        v82 v82Var = new v82("TITLE", 0);
        a = v82Var;
        v82 v82Var2 = new v82("ICON", 1);
        b = v82Var2;
        v82 v82Var3 = new v82("CHANGE_PARTICIPANT", 2);
        c = v82Var3;
        v82 v82Var4 = new v82("PIN_MESSAGE", 3);
        o = v82Var4;
        X = new v82[]{v82Var, v82Var2, v82Var3, v82Var4};
    }

    public static v82 valueOf(String str) {
        return (v82) Enum.valueOf(v82.class, str);
    }

    public static v82[] values() {
        return (v82[]) X.clone();
    }
}
