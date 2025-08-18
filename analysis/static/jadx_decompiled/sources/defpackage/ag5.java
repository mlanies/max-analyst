package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ag5 {
    public static final /* synthetic */ ag5[] a = {new ag5("ALREADY_DOWNLOADING", 0), new ag5("FILE_IS_NULL", 1), new ag5("INTERRUPTED", 2), new ag5("FAIL", 3), new ag5("CANCELLED", 4), new ag5("MAX_FAIL_COUNT", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    ag5 EF5;

    public static ag5 valueOf(String str) {
        return (ag5) Enum.valueOf(ag5.class, str);
    }

    public static ag5[] values() {
        return (ag5[]) a.clone();
    }
}
