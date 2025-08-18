package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class oe0 {
    public static final /* synthetic */ oe0[] c;
    public static final /* synthetic */ v25 o;
    public final String a;
    public final boolean b;

    static {
        oe0[] oe0VarArr = {new oe0("LIGHT", 0, "Light", false), new oe0("DARK", 1, "Dark", true)};
        c = oe0VarArr;
        o = new v25(oe0VarArr);
    }

    public oe0(String str, int i, String str2, boolean z) {
        this.a = str2;
        this.b = z;
    }

    public static oe0 valueOf(String str) {
        return (oe0) Enum.valueOf(oe0.class, str);
    }

    public static oe0[] values() {
        return (oe0[]) c.clone();
    }
}
