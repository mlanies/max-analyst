package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bq {
    public static final /* synthetic */ v25 X;
    public static final bq a;
    public static final bq b;
    public static final bq c;
    public static final /* synthetic */ bq[] o;

    static {
        bq bqVar = new bq("SYSTEM", 0);
        a = bqVar;
        bq bqVar2 = new bq("LIGHT", 1);
        b = bqVar2;
        bq bqVar3 = new bq("DARK", 2);
        c = bqVar3;
        bq[] bqVarArr = {bqVar, bqVar2, bqVar3};
        o = bqVarArr;
        X = new v25(bqVarArr);
    }

    public static bq valueOf(String str) {
        return (bq) Enum.valueOf(bq.class, str);
    }

    public static bq[] values() {
        return (bq[]) o.clone();
    }
}
