package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vld {
    public static final vld a;
    public static final /* synthetic */ vld[] b;

    static {
        vld vldVar = new vld("START", 0);
        a = vldVar;
        b = new vld[]{vldVar, new vld("STOP", 1), new vld("STOP_AND_RESET_REPLAY_CACHE", 2)};
    }

    public static vld valueOf(String str) {
        return (vld) Enum.valueOf(vld.class, str);
    }

    public static vld[] values() {
        return (vld[]) b.clone();
    }
}
