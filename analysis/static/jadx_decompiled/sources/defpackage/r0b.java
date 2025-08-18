package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r0b {
    public static final r0b a;
    public static final r0b b;
    public static final /* synthetic */ r0b[] c;

    static {
        r0b r0bVar = new r0b("COVER", 0);
        a = r0bVar;
        r0b r0bVar2 = new r0b("FIT", 1);
        b = r0bVar2;
        c = new r0b[]{r0bVar, r0bVar2};
    }

    public static r0b valueOf(String str) {
        return (r0b) Enum.valueOf(r0b.class, str);
    }

    public static r0b[] values() {
        return (r0b[]) c.clone();
    }
}
