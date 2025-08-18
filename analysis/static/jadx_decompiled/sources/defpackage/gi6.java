package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gi6 {
    public static final gi6 a;
    public static final /* synthetic */ gi6[] b;

    static {
        gi6 gi6Var = new gi6("ONE_VIDEO_TIMEOUT", 0);
        a = gi6Var;
        b = new gi6[]{gi6Var};
    }

    public static gi6 valueOf(String str) {
        return (gi6) Enum.valueOf(gi6.class, str);
    }

    public static gi6[] values() {
        return (gi6[]) b.clone();
    }
}
