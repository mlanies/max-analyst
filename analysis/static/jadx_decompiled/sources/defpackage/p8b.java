package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p8b {
    public static final p8b a;
    public static final p8b b;
    public static final /* synthetic */ p8b[] c;

    static {
        p8b p8bVar = new p8b("IDLE", 0);
        a = p8bVar;
        p8b p8bVar2 = new p8b("STREAMING", 1);
        b = p8bVar2;
        c = new p8b[]{p8bVar, p8bVar2};
    }

    public static p8b valueOf(String str) {
        return (p8b) Enum.valueOf(p8b.class, str);
    }

    public static p8b[] values() {
        return (p8b[]) c.clone();
    }
}
