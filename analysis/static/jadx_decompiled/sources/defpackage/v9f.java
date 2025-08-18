package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v9f {
    public static final /* synthetic */ v9f[] X;
    public static final v9f a;
    public static final v9f b;
    public static final v9f c;
    public static final v9f o;

    static {
        v9f v9fVar = new v9f("ALL", 0);
        a = v9fVar;
        v9f v9fVar2 = new v9f("USER_FOLDER", 1);
        b = v9fVar2;
        v9f v9fVar3 = new v9f("CREATE_FOLDER", 2);
        c = v9fVar3;
        v9f v9fVar4 = new v9f("RECOMMENDED_FOLDER", 3);
        o = v9fVar4;
        X = new v9f[]{v9fVar, v9fVar2, v9fVar3, v9fVar4};
    }

    public static v9f valueOf(String str) {
        return (v9f) Enum.valueOf(v9f.class, str);
    }

    public static v9f[] values() {
        return (v9f[]) X.clone();
    }
}
