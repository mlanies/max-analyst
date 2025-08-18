package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w8a {
    public static final w8a a;
    public static final /* synthetic */ w8a[] b;

    /* JADX INFO: Fake field, exist only in values array */
    w8a EF0;

    static {
        w8a w8aVar = new w8a("TITLE", 0);
        w8a w8aVar2 = new w8a("SUBTITLE", 1);
        w8a w8aVar3 = new w8a("NONE", 2);
        a = w8aVar3;
        b = new w8a[]{w8aVar, w8aVar2, w8aVar3};
    }

    public static w8a valueOf(String str) {
        return (w8a) Enum.valueOf(w8a.class, str);
    }

    public static w8a[] values() {
        return (w8a[]) b.clone();
    }
}
