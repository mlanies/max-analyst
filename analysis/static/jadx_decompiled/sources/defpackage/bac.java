package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bac {
    public static final bac a;
    public static final bac b;
    public static final /* synthetic */ bac[] c;

    static {
        bac bacVar = new bac("VIDEO_MSG", 0);
        a = bacVar;
        bac bacVar2 = new bac("AUDIO_MSG", 1);
        b = bacVar2;
        c = new bac[]{bacVar, bacVar2};
    }

    public static bac valueOf(String str) {
        return (bac) Enum.valueOf(bac.class, str);
    }

    public static bac[] values() {
        return (bac[]) c.clone();
    }
}
