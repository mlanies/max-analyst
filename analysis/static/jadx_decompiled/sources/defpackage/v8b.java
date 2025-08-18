package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v8b {
    public static final v8b a;
    public static final v8b b;
    public static final /* synthetic */ v8b[] c;

    static {
        v8b v8bVar = new v8b("Gallery", 0);
        a = v8bVar;
        v8b v8bVar2 = new v8b("Permissions", 1);
        b = v8bVar2;
        c = new v8b[]{v8bVar, v8bVar2};
    }

    public static v8b valueOf(String str) {
        return (v8b) Enum.valueOf(v8b.class, str);
    }

    public static v8b[] values() {
        return (v8b[]) c.clone();
    }
}
