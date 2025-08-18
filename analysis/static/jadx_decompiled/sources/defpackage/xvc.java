package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xvc {
    public static final /* synthetic */ xvc[] X;
    public static final xvc a;
    public static final xvc b;
    public static final xvc c;
    public static final xvc o;

    static {
        xvc xvcVar = new xvc("STARTED", 0);
        a = xvcVar;
        xvc xvcVar2 = new xvc("ERROR", 1);
        b = xvcVar2;
        xvc xvcVar3 = new xvc("FINISHED", 2);
        c = xvcVar3;
        xvc xvcVar4 = new xvc("INIT", 3);
        o = xvcVar4;
        X = new xvc[]{xvcVar, xvcVar2, xvcVar3, xvcVar4};
    }

    public static xvc valueOf(String str) {
        return (xvc) Enum.valueOf(xvc.class, str);
    }

    public static xvc[] values() {
        return (xvc[]) X.clone();
    }
}
