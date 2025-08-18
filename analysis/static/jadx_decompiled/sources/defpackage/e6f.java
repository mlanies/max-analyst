package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e6f {
    public static final e6f a;
    public static final e6f b;
    public static final /* synthetic */ e6f[] c;

    static {
        e6f e6fVar = new e6f("UNKNOWN", 0);
        a = e6fVar;
        e6f e6fVar2 = new e6f("NOT_ENOUGH_VIDEO_TRACKS", 1);
        b = e6fVar2;
        c = new e6f[]{e6fVar, e6fVar2};
    }

    public static e6f valueOf(String str) {
        return (e6f) Enum.valueOf(e6f.class, str);
    }

    public static e6f[] values() {
        return (e6f[]) c.clone();
    }
}
