package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rn9 {
    public static final SparseArray a;
    public static final /* synthetic */ rn9[] b;

    /* JADX INFO: Fake field, exist only in values array */
    rn9 EF15;

    static {
        rn9 rn9Var = new rn9("MOBILE", 0);
        rn9 rn9Var2 = new rn9("WIFI", 1);
        rn9 rn9Var3 = new rn9("MOBILE_MMS", 2);
        rn9 rn9Var4 = new rn9("MOBILE_SUPL", 3);
        rn9 rn9Var5 = new rn9("MOBILE_DUN", 4);
        rn9 rn9Var6 = new rn9("MOBILE_HIPRI", 5);
        rn9 rn9Var7 = new rn9("WIMAX", 6);
        rn9 rn9Var8 = new rn9("BLUETOOTH", 7);
        rn9 rn9Var9 = new rn9("DUMMY", 8);
        rn9 rn9Var10 = new rn9("ETHERNET", 9);
        rn9 rn9Var11 = new rn9("MOBILE_FOTA", 10);
        rn9 rn9Var12 = new rn9("MOBILE_IMS", 11);
        rn9 rn9Var13 = new rn9("MOBILE_CBS", 12);
        rn9 rn9Var14 = new rn9("WIFI_P2P", 13);
        rn9 rn9Var15 = new rn9("MOBILE_IA", 14);
        rn9 rn9Var16 = new rn9("MOBILE_EMERGENCY", 15);
        rn9 rn9Var17 = new rn9("PROXY", 16);
        rn9 rn9Var18 = new rn9("VPN", 17);
        rn9 rn9Var19 = new rn9("NONE", 18);
        b = new rn9[]{rn9Var, rn9Var2, rn9Var3, rn9Var4, rn9Var5, rn9Var6, rn9Var7, rn9Var8, rn9Var9, rn9Var10, rn9Var11, rn9Var12, rn9Var13, rn9Var14, rn9Var15, rn9Var16, rn9Var17, rn9Var18, rn9Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, rn9Var);
        sparseArray.put(1, rn9Var2);
        sparseArray.put(2, rn9Var3);
        sparseArray.put(3, rn9Var4);
        sparseArray.put(4, rn9Var5);
        sparseArray.put(5, rn9Var6);
        sparseArray.put(6, rn9Var7);
        sparseArray.put(7, rn9Var8);
        sparseArray.put(8, rn9Var9);
        sparseArray.put(9, rn9Var10);
        sparseArray.put(10, rn9Var11);
        sparseArray.put(11, rn9Var12);
        sparseArray.put(12, rn9Var13);
        sparseArray.put(13, rn9Var14);
        sparseArray.put(14, rn9Var15);
        sparseArray.put(15, rn9Var16);
        sparseArray.put(16, rn9Var17);
        sparseArray.put(17, rn9Var18);
        sparseArray.put(-1, rn9Var19);
    }

    public static rn9 valueOf(String str) {
        return (rn9) Enum.valueOf(rn9.class, str);
    }

    public static rn9[] values() {
        return (rn9[]) b.clone();
    }
}
