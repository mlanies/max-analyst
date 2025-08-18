package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jna {
    public static final jna a;
    public static final jna b;
    public static final /* synthetic */ jna[] c;

    static {
        jna jnaVar = new jna("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = jnaVar;
        jna jnaVar2 = new jna("DROP_WORK_REQUEST", 1);
        b = jnaVar2;
        c = new jna[]{jnaVar, jnaVar2};
    }

    public static jna valueOf(String str) {
        return (jna) Enum.valueOf(jna.class, str);
    }

    public static jna[] values() {
        return (jna[]) c.clone();
    }
}
