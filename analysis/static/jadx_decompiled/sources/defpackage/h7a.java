package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h7a {
    public static final h7a a;
    public static final h7a b;
    public static final /* synthetic */ h7a[] c;

    static {
        h7a h7aVar = new h7a("ICON", 0);
        a = h7aVar;
        h7a h7aVar2 = new h7a("ICON_WITH_TEXT", 1);
        b = h7aVar2;
        c = new h7a[]{h7aVar, h7aVar2};
    }

    public static h7a valueOf(String str) {
        return (h7a) Enum.valueOf(h7a.class, str);
    }

    public static h7a[] values() {
        return (h7a[]) c.clone();
    }
}
