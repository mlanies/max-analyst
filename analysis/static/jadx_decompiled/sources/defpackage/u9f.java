package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u9f {
    public static final /* synthetic */ u9f[] X;
    public static final u9f a;
    public static final u9f b;
    public static final u9f c;
    public static final u9f o;

    static {
        u9f u9fVar = new u9f("ENABLED", 0);
        a = u9fVar;
        u9f u9fVar2 = new u9f("DISABLED", 1);
        b = u9fVar2;
        u9f u9fVar3 = new u9f("USER_IGNORED", 2);
        c = u9fVar3;
        u9f u9fVar4 = new u9f("UNKNOWN", 3);
        o = u9fVar4;
        X = new u9f[]{u9fVar, u9fVar2, u9fVar3, u9fVar4};
    }

    public static u9f valueOf(String str) {
        return (u9f) Enum.valueOf(u9f.class, str);
    }

    public static u9f[] values() {
        return (u9f[]) X.clone();
    }
}
