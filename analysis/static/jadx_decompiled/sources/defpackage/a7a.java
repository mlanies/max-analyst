package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a7a {
    public static final a7a a;
    public static final a7a b;
    public static final a7a c;
    public static final /* synthetic */ a7a[] o;

    static {
        a7a a7aVar = new a7a("STANDARD", 0);
        a = a7aVar;
        a7a a7aVar2 = new a7a("ICON", 1);
        b = a7aVar2;
        a7a a7aVar3 = new a7a("PROGRESS_BAR", 2);
        c = a7aVar3;
        o = new a7a[]{a7aVar, a7aVar2, a7aVar3};
    }

    public static a7a valueOf(String str) {
        return (a7a) Enum.valueOf(a7a.class, str);
    }

    public static a7a[] values() {
        return (a7a[]) o.clone();
    }
}
