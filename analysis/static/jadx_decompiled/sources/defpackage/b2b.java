package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b2b {
    public static final crd b;
    public static final /* synthetic */ b2b[] c;
    public static final /* synthetic */ v25 o;
    public final int a;

    static {
        b2b[] b2bVarArr = {new b2b("CALL", 0, 1), new b2b("VIDEO", 1, 2)};
        c = b2bVarArr;
        o = new v25(b2bVarArr);
        b = new crd();
    }

    public b2b(String str, int i, int i2) {
        this.a = i2;
    }

    public static b2b valueOf(String str) {
        return (b2b) Enum.valueOf(b2b.class, str);
    }

    public static b2b[] values() {
        return (b2b[]) c.clone();
    }
}
