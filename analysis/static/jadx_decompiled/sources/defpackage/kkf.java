package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kkf {
    public static final /* synthetic */ kkf[] a = {new kkf("LOWEST", 0), new kkf("HIGHEST", 1), new kkf("MAX_QVGA", 2), new kkf("MAX_480P", 3), new kkf("MAX_720P", 4), new kkf("MAX_1080P", 5), new kkf("MAX_2160P", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    kkf EF5;

    public static kkf valueOf(String str) {
        return (kkf) Enum.valueOf(kkf.class, str);
    }

    public static kkf[] values() {
        return (kkf[]) a.clone();
    }
}
