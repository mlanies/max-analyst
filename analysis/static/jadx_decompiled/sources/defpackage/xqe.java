package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xqe {
    public static final /* synthetic */ xqe[] X;
    public static final xqe a;
    public static final xqe b;
    public static final xqe c;
    public static final xqe o;

    static {
        xqe xqeVar = new xqe("PHOTO", 0);
        a = xqeVar;
        xqe xqeVar2 = new xqe("GIF", 1);
        b = xqeVar2;
        xqe xqeVar3 = new xqe("VIDEO", 2);
        c = xqeVar3;
        xqe xqeVar4 = new xqe("AUDIO", 3);
        o = xqeVar4;
        X = new xqe[]{xqeVar, xqeVar2, xqeVar3, xqeVar4};
    }

    public static xqe valueOf(String str) {
        return (xqe) Enum.valueOf(xqe.class, str);
    }

    public static xqe[] values() {
        return (xqe[]) X.clone();
    }
}
