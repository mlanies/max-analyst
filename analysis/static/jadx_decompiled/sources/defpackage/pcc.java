package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pcc {
    public static final pcc a;
    public static final pcc b;
    public static final pcc c;
    public static final /* synthetic */ pcc[] o;

    static {
        pcc pccVar = new pcc("NOTHING", 0);
        a = pccVar;
        pcc pccVar2 = new pcc("RECORD", 1);
        b = pccVar2;
        pcc pccVar3 = new pcc("STREAM", 2);
        c = pccVar3;
        o = new pcc[]{pccVar, pccVar2, pccVar3};
    }

    public static pcc valueOf(String str) {
        return (pcc) Enum.valueOf(pcc.class, str);
    }

    public static pcc[] values() {
        return (pcc[]) o.clone();
    }
}
