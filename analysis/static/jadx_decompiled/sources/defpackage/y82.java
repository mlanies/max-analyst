package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y82 {
    public static final y82 a;
    public static final y82 b;
    public static final y82 c;
    public static final /* synthetic */ y82[] o;

    static {
        y82 y82Var = new y82("SOUND", 0);
        a = y82Var;
        y82 y82Var2 = new y82("VIBRATION", 1);
        b = y82Var2;
        y82 y82Var3 = new y82("LED", 2);
        c = y82Var3;
        o = new y82[]{y82Var, y82Var2, y82Var3};
    }

    public static y82 valueOf(String str) {
        return (y82) Enum.valueOf(y82.class, str);
    }

    public static y82[] values() {
        return (y82[]) o.clone();
    }
}
