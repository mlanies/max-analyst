package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bue {
    public static final bue a;
    public static final bue b;
    public static final /* synthetic */ bue[] c;

    static {
        bue bueVar = new bue("UPTIME", 0);
        a = bueVar;
        bue bueVar2 = new bue("REALTIME", 1);
        b = bueVar2;
        c = new bue[]{bueVar, bueVar2};
    }

    public static bue valueOf(String str) {
        return (bue) Enum.valueOf(bue.class, str);
    }

    public static bue[] values() {
        return (bue[]) c.clone();
    }
}
