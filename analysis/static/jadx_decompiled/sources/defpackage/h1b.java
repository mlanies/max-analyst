package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h1b {
    public static final h1b a;
    public static final h1b b;
    public static final /* synthetic */ h1b[] c;

    static {
        h1b h1bVar = new h1b("TOP", 0);
        a = h1bVar;
        h1b h1bVar2 = new h1b("BOTTOM", 1);
        b = h1bVar2;
        c = new h1b[]{h1bVar, h1bVar2};
    }

    public static h1b valueOf(String str) {
        return (h1b) Enum.valueOf(h1b.class, str);
    }

    public static h1b[] values() {
        return (h1b[]) c.clone();
    }
}
