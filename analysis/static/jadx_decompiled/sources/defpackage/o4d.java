package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o4d {
    public static final o4d a;
    public static final o4d b;
    public static final /* synthetic */ o4d[] c;

    static {
        o4d o4dVar = new o4d("START", 0);
        a = o4dVar;
        o4d o4dVar2 = new o4d("FINISH", 1);
        b = o4dVar2;
        c = new o4d[]{o4dVar, o4dVar2};
    }

    public static o4d valueOf(String str) {
        return (o4d) Enum.valueOf(o4d.class, str);
    }

    public static o4d[] values() {
        return (o4d[]) c.clone();
    }
}
