package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cv5 {
    public static final /* synthetic */ cv5[] X;
    public static final /* synthetic */ v25 Y;
    public static final c32 b;
    public static final cv5 c;
    public static final cv5 o;
    public final int a;

    static {
        cv5 cv5Var = new cv5("NO_DELETE", 0, 1);
        c = cv5Var;
        cv5 cv5Var2 = new cv5("NO_TITLE_EDIT", 1, 2);
        o = cv5Var2;
        cv5[] cv5VarArr = {cv5Var, cv5Var2};
        X = cv5VarArr;
        Y = new v25(cv5VarArr);
        b = new c32(11, (byte) 0);
    }

    public cv5(String str, int i, int i2) {
        this.a = i2;
    }

    public static cv5 valueOf(String str) {
        return (cv5) Enum.valueOf(cv5.class, str);
    }

    public static cv5[] values() {
        return (cv5[]) X.clone();
    }
}
