package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q9f {
    public static final q9f X;
    public static final q9f Y;
    public static final /* synthetic */ q9f[] Z;
    public static final q9f a;
    public static final q9f b;
    public static final q9f c;
    public static final q9f o;

    static {
        q9f q9fVar = new q9f("IMAGE_CAPTURE", 0);
        a = q9fVar;
        q9f q9fVar2 = new q9f("PREVIEW", 1);
        b = q9fVar2;
        q9f q9fVar3 = new q9f("IMAGE_ANALYSIS", 2);
        c = q9fVar3;
        q9f q9fVar4 = new q9f("VIDEO_CAPTURE", 3);
        o = q9fVar4;
        q9f q9fVar5 = new q9f("STREAM_SHARING", 4);
        X = q9fVar5;
        q9f q9fVar6 = new q9f("METERING_REPEATING", 5);
        Y = q9fVar6;
        Z = new q9f[]{q9fVar, q9fVar2, q9fVar3, q9fVar4, q9fVar5, q9fVar6};
    }

    public static q9f valueOf(String str) {
        return (q9f) Enum.valueOf(q9f.class, str);
    }

    public static q9f[] values() {
        return (q9f[]) Z.clone();
    }
}
