package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qn9 {
    public static final SparseArray a;
    public static final /* synthetic */ qn9[] b;

    /* JADX INFO: Fake field, exist only in values array */
    qn9 EF15;

    static {
        qn9 qn9Var = new qn9("UNKNOWN_MOBILE_SUBTYPE", 0);
        qn9 qn9Var2 = new qn9("GPRS", 1);
        qn9 qn9Var3 = new qn9("EDGE", 2);
        qn9 qn9Var4 = new qn9("UMTS", 3);
        qn9 qn9Var5 = new qn9("CDMA", 4);
        qn9 qn9Var6 = new qn9("EVDO_0", 5);
        qn9 qn9Var7 = new qn9("EVDO_A", 6);
        qn9 qn9Var8 = new qn9("RTT", 7);
        qn9 qn9Var9 = new qn9("HSDPA", 8);
        qn9 qn9Var10 = new qn9("HSUPA", 9);
        qn9 qn9Var11 = new qn9("HSPA", 10);
        qn9 qn9Var12 = new qn9("IDEN", 11);
        qn9 qn9Var13 = new qn9("EVDO_B", 12);
        qn9 qn9Var14 = new qn9("LTE", 13);
        qn9 qn9Var15 = new qn9("EHRPD", 14);
        qn9 qn9Var16 = new qn9("HSPAP", 15);
        qn9 qn9Var17 = new qn9("GSM", 16);
        qn9 qn9Var18 = new qn9("TD_SCDMA", 17);
        qn9 qn9Var19 = new qn9("IWLAN", 18);
        qn9 qn9Var20 = new qn9("LTE_CA", 19);
        b = new qn9[]{qn9Var, qn9Var2, qn9Var3, qn9Var4, qn9Var5, qn9Var6, qn9Var7, qn9Var8, qn9Var9, qn9Var10, qn9Var11, qn9Var12, qn9Var13, qn9Var14, qn9Var15, qn9Var16, qn9Var17, qn9Var18, qn9Var19, qn9Var20, new qn9("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, qn9Var);
        sparseArray.put(1, qn9Var2);
        sparseArray.put(2, qn9Var3);
        sparseArray.put(3, qn9Var4);
        sparseArray.put(4, qn9Var5);
        sparseArray.put(5, qn9Var6);
        sparseArray.put(6, qn9Var7);
        sparseArray.put(7, qn9Var8);
        sparseArray.put(8, qn9Var9);
        sparseArray.put(9, qn9Var10);
        sparseArray.put(10, qn9Var11);
        sparseArray.put(11, qn9Var12);
        sparseArray.put(12, qn9Var13);
        sparseArray.put(13, qn9Var14);
        sparseArray.put(14, qn9Var15);
        sparseArray.put(15, qn9Var16);
        sparseArray.put(16, qn9Var17);
        sparseArray.put(17, qn9Var18);
        sparseArray.put(18, qn9Var19);
        sparseArray.put(19, qn9Var20);
    }

    public static qn9 valueOf(String str) {
        return (qn9) Enum.valueOf(qn9.class, str);
    }

    public static qn9[] values() {
        return (qn9[]) b.clone();
    }
}
