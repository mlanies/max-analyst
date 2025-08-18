package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ol3 {
    public static final ol3 a;
    public static final ol3 b;
    public static final /* synthetic */ ol3[] c;

    static {
        ol3 ol3Var = new ol3("USER_LIST", 0);
        a = ol3Var;
        ol3 ol3Var2 = new ol3("EXTERNAL", 1);
        b = ol3Var2;
        c = new ol3[]{ol3Var, ol3Var2};
    }

    public static ol3 valueOf(String str) {
        return (ol3) Enum.valueOf(ol3.class, str);
    }

    public static ol3[] values() {
        return (ol3[]) c.clone();
    }
}
