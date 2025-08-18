package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p0b {
    public static final p0b a;
    public static final p0b b;
    public static final /* synthetic */ p0b[] c;

    static {
        p0b p0bVar = new p0b("COVER", 0);
        a = p0bVar;
        p0b p0bVar2 = new p0b("FIT", 1);
        b = p0bVar2;
        c = new p0b[]{p0bVar, p0bVar2};
    }

    public static p0b valueOf(String str) {
        return (p0b) Enum.valueOf(p0b.class, str);
    }

    public static p0b[] values() {
        return (p0b[]) c.clone();
    }
}
