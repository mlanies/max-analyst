package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b7a {
    public static final /* synthetic */ b7a[] X;
    public static final b7a a;
    public static final b7a b;
    public static final b7a c;
    public static final b7a o;

    static {
        b7a b7aVar = new b7a("PRIMARY", 0);
        a = b7aVar;
        b7a b7aVar2 = new b7a("SECONDARY", 1);
        b = b7aVar2;
        b7a b7aVar3 = new b7a("TERTIARY", 2);
        c = b7aVar3;
        b7a b7aVar4 = new b7a("LINK", 3);
        o = b7aVar4;
        X = new b7a[]{b7aVar, b7aVar2, b7aVar3, b7aVar4};
    }

    public static b7a valueOf(String str) {
        return (b7a) Enum.valueOf(b7a.class, str);
    }

    public static b7a[] values() {
        return (b7a[]) X.clone();
    }
}
