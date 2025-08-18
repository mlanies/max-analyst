package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rr5 implements qj3 {
    public static final rr5 a;
    public static final /* synthetic */ rr5[] b;

    static {
        rr5 rr5Var = new rr5("INSTANCE", 0);
        a = rr5Var;
        b = new rr5[]{rr5Var};
    }

    public static rr5 valueOf(String str) {
        return (rr5) Enum.valueOf(rr5.class, str);
    }

    public static rr5[] values() {
        return (rr5[]) b.clone();
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        ((xae) obj).j(Long.MAX_VALUE);
    }
}
