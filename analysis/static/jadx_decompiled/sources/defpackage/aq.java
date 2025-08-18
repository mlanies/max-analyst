package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aq {
    public static final /* synthetic */ v25 X;
    public static final aq a;
    public static final aq b;
    public static final aq c;
    public static final /* synthetic */ aq[] o;

    static {
        aq aqVar = new aq("SYSTEM", 0);
        a = aqVar;
        aq aqVar2 = new aq("LIGHT", 1);
        b = aqVar2;
        aq aqVar3 = new aq("DARK", 2);
        c = aqVar3;
        aq[] aqVarArr = {aqVar, aqVar2, aqVar3};
        o = aqVarArr;
        X = new v25(aqVarArr);
    }

    public static aq valueOf(String str) {
        return (aq) Enum.valueOf(aq.class, str);
    }

    public static aq[] values() {
        return (aq[]) o.clone();
    }
}
