package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wkb {
    public static final oz7 a;
    public static final wkb b;
    public static final /* synthetic */ wkb[] c;
    public static final /* synthetic */ v25 o;

    static {
        wkb wkbVar = new wkb("ESIA_CONNECTION", 0);
        b = wkbVar;
        wkb[] wkbVarArr = {wkbVar};
        c = wkbVarArr;
        o = new v25(wkbVarArr);
        a = new oz7();
    }

    public static wkb valueOf(String str) {
        return (wkb) Enum.valueOf(wkb.class, str);
    }

    public static wkb[] values() {
        return (wkb[]) c.clone();
    }
}
