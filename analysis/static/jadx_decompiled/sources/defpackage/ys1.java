package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ys1 implements at1 {
    public static final ys1 a;
    public static final /* synthetic */ ys1[] b;

    static {
        ys1 ys1Var = new ys1("CALL_BY_LINK", 0);
        a = ys1Var;
        b = new ys1[]{ys1Var};
    }

    public static ys1 valueOf(String str) {
        return (ys1) Enum.valueOf(ys1.class, str);
    }

    public static ys1[] values() {
        return (ys1[]) b.clone();
    }

    @Override // defpackage.at1
    public final String a() {
        return "CALL_BY_LINK";
    }
}
