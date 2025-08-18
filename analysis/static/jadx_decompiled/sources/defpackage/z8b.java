package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z8b {
    public static final z8b a;
    public static final z8b b;
    public static final z8b c;
    public static final /* synthetic */ z8b[] o;

    static {
        z8b z8bVar = new z8b("DEFAULT", 0);
        a = z8bVar;
        z8b z8bVar2 = new z8b("VERY_LOW", 1);
        b = z8bVar2;
        z8b z8bVar3 = new z8b("HIGHEST", 2);
        c = z8bVar3;
        o = new z8b[]{z8bVar, z8bVar2, z8bVar3};
    }

    public static z8b valueOf(String str) {
        return (z8b) Enum.valueOf(z8b.class, str);
    }

    public static z8b[] values() {
        return (z8b[]) o.clone();
    }
}
