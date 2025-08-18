package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e7a {
    public static final e7a a;
    public static final /* synthetic */ e7a[] b;

    static {
        e7a e7aVar = new e7a("IDLE", 0);
        a = e7aVar;
        b = new e7a[]{e7aVar, new e7a("LOADING", 1)};
    }

    public static e7a valueOf(String str) {
        return (e7a) Enum.valueOf(e7a.class, str);
    }

    public static e7a[] values() {
        return (e7a[]) b.clone();
    }
}
