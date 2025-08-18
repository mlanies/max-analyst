package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xdf {
    public static final /* synthetic */ xdf[] X;
    public static final /* synthetic */ v25 Y;
    public static final xdf b;
    public static final xdf c;
    public static final xdf o;
    public final mqb a;

    static {
        xdf xdfVar = new xdf("WITHOUT_COMPRESS", 0, mqb.P_1080);
        b = xdfVar;
        xdf xdfVar2 = new xdf("OPTIMAL", 1, mqb.P_720);
        c = xdfVar2;
        xdf xdfVar3 = new xdf("MAXIMUM", 2, mqb.P_480);
        o = xdfVar3;
        xdf[] xdfVarArr = {xdfVar, xdfVar2, xdfVar3};
        X = xdfVarArr;
        Y = new v25(xdfVarArr);
    }

    public xdf(String str, int i, mqb mqbVar) {
        this.a = mqbVar;
    }

    public static xdf valueOf(String str) {
        return (xdf) Enum.valueOf(xdf.class, str);
    }

    public static xdf[] values() {
        return (xdf[]) X.clone();
    }
}
