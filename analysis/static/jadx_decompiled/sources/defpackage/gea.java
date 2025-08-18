package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gea {
    public static final gea a;
    public static final /* synthetic */ gea[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gea EF0;

    static {
        gea geaVar = new gea("SMALL", 0);
        gea geaVar2 = new gea("MEDIUM", 1);
        a = geaVar2;
        b = new gea[]{geaVar, geaVar2};
    }

    public static gea valueOf(String str) {
        return (gea) Enum.valueOf(gea.class, str);
    }

    public static gea[] values() {
        return (gea[]) b.clone();
    }
}
