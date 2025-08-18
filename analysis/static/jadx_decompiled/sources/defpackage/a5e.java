package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a5e {
    public static final a5e X;
    public static final /* synthetic */ a5e[] Y;
    public static final /* synthetic */ v25 Z;
    public static final dp3 b;
    public static final a5e c;
    public static final a5e o;
    public final String a;

    static {
        a5e a5eVar = new a5e("RECENT", 0, "recent");
        c = a5eVar;
        a5e a5eVar2 = new a5e("FAVORITE", 1, "favorite");
        o = a5eVar2;
        a5e a5eVar3 = new a5e("SET", 2, "set");
        X = a5eVar3;
        a5e[] a5eVarArr = {a5eVar, a5eVar2, a5eVar3};
        Y = a5eVarArr;
        Z = new v25(a5eVarArr);
        b = new dp3();
    }

    public a5e(String str, int i, String str2) {
        this.a = str2;
    }

    public static a5e valueOf(String str) {
        return (a5e) Enum.valueOf(a5e.class, str);
    }

    public static a5e[] values() {
        return (a5e[]) Y.clone();
    }
}
