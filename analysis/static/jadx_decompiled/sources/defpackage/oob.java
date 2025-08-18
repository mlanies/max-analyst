package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oob {
    public static final oob a;
    public static final /* synthetic */ oob[] b;

    static {
        oob oobVar = new oob("DEFAULT", 0);
        a = oobVar;
        b = new oob[]{oobVar, new oob("SIGNED", 1), new oob("FIXED", 2)};
    }

    public static oob valueOf(String str) {
        return (oob) Enum.valueOf(oob.class, str);
    }

    public static oob[] values() {
        return (oob[]) b.clone();
    }
}
