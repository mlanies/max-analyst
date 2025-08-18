package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c7a {
    public static final c7a a;
    public static final c7a b;
    public static final c7a c;
    public static final /* synthetic */ c7a[] o;

    static {
        c7a c7aVar = new c7a("SMALL", 0);
        a = c7aVar;
        c7a c7aVar2 = new c7a("MEDIUM", 1);
        b = c7aVar2;
        c7a c7aVar3 = new c7a("LARGE", 2);
        c = c7aVar3;
        o = new c7a[]{c7aVar, c7aVar2, c7aVar3};
    }

    public static c7a valueOf(String str) {
        return (c7a) Enum.valueOf(c7a.class, str);
    }

    public static c7a[] values() {
        return (c7a[]) o.clone();
    }
}
