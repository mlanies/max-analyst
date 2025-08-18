package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j4a {
    public static final j4a a;
    public static final /* synthetic */ j4a[] b;

    static {
        j4a j4aVar = new j4a("DISABLED", 0);
        a = j4aVar;
        b = new j4a[]{j4aVar, new j4a("SOFT", 1), new j4a("HARD", 2)};
    }

    public static j4a valueOf(String str) {
        return (j4a) Enum.valueOf(j4a.class, str);
    }

    public static j4a[] values() {
        return (j4a[]) b.clone();
    }
}
