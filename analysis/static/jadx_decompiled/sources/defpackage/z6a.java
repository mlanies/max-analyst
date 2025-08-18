package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z6a {
    public static final z6a X;
    public static final /* synthetic */ z6a[] Y;
    public static final z6a a;
    public static final z6a b;
    public static final z6a c;
    public static final z6a o;

    static {
        z6a z6aVar = new z6a("ACCENT", 0);
        a = z6aVar;
        z6a z6aVar2 = new z6a("NEGATIVE", 1);
        b = z6aVar2;
        z6a z6aVar3 = new z6a("NEUTRAL", 2);
        c = z6aVar3;
        z6a z6aVar4 = new z6a("NEUTRAL_THEMED", 3);
        o = z6aVar4;
        z6a z6aVar5 = new z6a("CONTRAST_STATIC", 4);
        X = z6aVar5;
        Y = new z6a[]{z6aVar, z6aVar2, z6aVar3, z6aVar4, z6aVar5};
    }

    public static z6a valueOf(String str) {
        return (z6a) Enum.valueOf(z6a.class, str);
    }

    public static z6a[] values() {
        return (z6a[]) Y.clone();
    }
}
