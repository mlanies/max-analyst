package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a9b {
    public static final a9b a;
    public static final a9b b;
    public static final a9b c;
    public static final /* synthetic */ a9b[] o;

    static {
        a9b a9bVar = new a9b("LOW", 0);
        a = a9bVar;
        a9b a9bVar2 = new a9b("MEDIUM", 1);
        b = a9bVar2;
        a9b a9bVar3 = new a9b("HIGH", 2);
        c = a9bVar3;
        o = new a9b[]{a9bVar, a9bVar2, a9bVar3};
    }

    public static a9b valueOf(String str) {
        return (a9b) Enum.valueOf(a9b.class, str);
    }

    public static a9b[] values() {
        return (a9b[]) o.clone();
    }
}
