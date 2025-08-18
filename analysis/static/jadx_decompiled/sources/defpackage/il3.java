package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class il3 {
    public static final /* synthetic */ il3[] X;
    public static final il3 a;
    public static final il3 b;
    public static final il3 c;
    public static final il3 o;

    static {
        il3 il3Var = new il3("CUSTOM", 0);
        a = il3Var;
        il3 il3Var2 = new il3("DEVICE", 1);
        b = il3Var2;
        il3 il3Var3 = new il3("ONEME", 2);
        c = il3Var3;
        il3 il3Var4 = new il3("UNKNOWN", 3);
        o = il3Var4;
        X = new il3[]{il3Var, il3Var2, il3Var3, il3Var4};
    }

    public static il3 valueOf(String str) {
        return (il3) Enum.valueOf(il3.class, str);
    }

    public static il3[] values() {
        return (il3[]) X.clone();
    }
}
