package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class id9 {
    public static final id9 a;
    public static final id9 b;
    public static final /* synthetic */ id9[] c;

    static {
        id9 id9Var = new id9("MOVIE", 0);
        a = id9Var;
        id9 id9Var2 = new id9("STREAM", 1);
        b = id9Var2;
        c = new id9[]{id9Var, id9Var2};
    }

    public static id9 valueOf(String str) {
        return (id9) Enum.valueOf(id9.class, str);
    }

    public static id9[] values() {
        return (id9[]) c.clone();
    }
}
