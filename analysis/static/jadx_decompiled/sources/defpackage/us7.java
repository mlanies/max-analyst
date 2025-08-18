package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class us7 {
    public static final us7 X;
    public static final us7 Y;
    public static final us7 Z;
    public static final qq9 c;
    public static final us7 o;
    public static final us7 s0;
    public static final us7 t0;
    public static final /* synthetic */ us7[] u0;
    public static final /* synthetic */ v25 v0;
    public final int a;
    public final char b;

    static {
        us7 us7Var = new us7('V', 0, 2, "VERBOSE");
        o = us7Var;
        us7 us7Var2 = new us7('D', 1, 3, "DEBUG");
        X = us7Var2;
        us7 us7Var3 = new us7('I', 2, 4, "INFO");
        Y = us7Var3;
        us7 us7Var4 = new us7('W', 3, 5, "WARN");
        Z = us7Var4;
        us7 us7Var5 = new us7('E', 4, 6, "ERROR");
        s0 = us7Var5;
        us7 us7Var6 = new us7('A', 5, 7, "ASSERT");
        t0 = us7Var6;
        us7[] us7VarArr = {us7Var, us7Var2, us7Var3, us7Var4, us7Var5, us7Var6};
        u0 = us7VarArr;
        v0 = new v25(us7VarArr);
        c = new qq9();
    }

    public us7(char c2, int i, int i2, String str) {
        this.a = i2;
        this.b = c2;
    }

    public static us7 valueOf(String str) {
        return (us7) Enum.valueOf(us7.class, str);
    }

    public static us7[] values() {
        return (us7[]) u0.clone();
    }
}
