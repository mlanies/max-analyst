package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gi1 {
    public static final /* synthetic */ gi1[] a;
    public static final /* synthetic */ v25 b;

    static {
        gi1[] gi1VarArr = {new gi1("LINK", 0), new gi1("CHAT", 1), new gi1("ONE_TO_ONE", 2), new gi1("ACTIVE", 3)};
        a = gi1VarArr;
        b = new v25(gi1VarArr);
    }

    public static gi1 valueOf(String str) {
        return (gi1) Enum.valueOf(gi1.class, str);
    }

    public static gi1[] values() {
        return (gi1[]) a.clone();
    }
}
