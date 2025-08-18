package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x9a {
    public static final x9a X;
    public static final /* synthetic */ x9a[] Y;
    public static final x9a a;
    public static final x9a b;
    public static final x9a c;
    public static final x9a o;

    static {
        x9a x9aVar = new x9a("Themed", 0);
        a = x9aVar;
        x9a x9aVar2 = new x9a("ContrastPinned", 1);
        b = x9aVar2;
        x9a x9aVar3 = new x9a("NeutralStack", 2);
        c = x9aVar3;
        x9a x9aVar4 = new x9a("AccentRed", 3);
        o = x9aVar4;
        x9a x9aVar5 = new x9a("Contrast", 4);
        X = x9aVar5;
        Y = new x9a[]{x9aVar, x9aVar2, x9aVar3, x9aVar4, x9aVar5};
    }

    public static x9a valueOf(String str) {
        return (x9a) Enum.valueOf(x9a.class, str);
    }

    public static x9a[] values() {
        return (x9a[]) Y.clone();
    }
}
