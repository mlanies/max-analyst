package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h4a {
    public static final h4a a;
    public static final h4a b;
    public static final /* synthetic */ h4a[] c;

    static {
        h4a h4aVar = new h4a("ACCEPT", 0);
        a = h4aVar;
        h4a h4aVar2 = new h4a("DECLINE", 1);
        b = h4aVar2;
        c = new h4a[]{h4aVar, h4aVar2};
    }

    public static h4a valueOf(String str) {
        return (h4a) Enum.valueOf(h4a.class, str);
    }

    public static h4a[] values() {
        return (h4a[]) c.clone();
    }
}
