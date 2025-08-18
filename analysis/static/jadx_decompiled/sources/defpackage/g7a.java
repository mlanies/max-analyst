package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g7a {
    public static final g7a a;
    public static final g7a b;
    public static final /* synthetic */ g7a[] c;

    static {
        g7a g7aVar = new g7a("PRIMARY", 0);
        a = g7aVar;
        g7a g7aVar2 = new g7a("SECONDARY", 1);
        b = g7aVar2;
        c = new g7a[]{g7aVar, g7aVar2};
    }

    public static g7a valueOf(String str) {
        return (g7a) Enum.valueOf(g7a.class, str);
    }

    public static g7a[] values() {
        return (g7a[]) c.clone();
    }
}
