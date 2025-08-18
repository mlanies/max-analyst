package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class db9 {
    public static final db9 a;
    public static final db9 b;
    public static final db9 c;
    public static final /* synthetic */ db9[] o;

    static {
        db9 db9Var = new db9("X1", 0);
        a = db9Var;
        db9 db9Var2 = new db9("X1_5", 1);
        b = db9Var2;
        db9 db9Var3 = new db9("X2", 2);
        c = db9Var3;
        o = new db9[]{db9Var, db9Var2, db9Var3};
    }

    public static db9 valueOf(String str) {
        return (db9) Enum.valueOf(db9.class, str);
    }

    public static db9[] values() {
        return (db9[]) o.clone();
    }
}
