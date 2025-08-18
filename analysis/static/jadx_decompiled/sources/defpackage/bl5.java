package defpackage;

/* loaded from: classes2.dex */
public final class bl5 {
    public long a;
    public long b;
    public boolean c = false;
    public final al5 d;

    public bl5(al5 al5Var) {
        if (al5Var != null) {
            this.d = al5Var;
        } else {
            this.d = new ig5(6);
        }
    }

    public static long a(String str) {
        String str2 = null;
        for (String str3 : str.split("\n")) {
            if (str3.startsWith("a=fingerprint")) {
                String[] strArrSplit = str3.split(" ");
                if (strArrSplit.length == 2) {
                    str2 = strArrSplit[1];
                }
            }
        }
        if (str2 == null) {
            return -1L;
        }
        long j = 0;
        for (int iMin = Math.min(7, str2.split(":").length - 1); iMin >= 0; iMin--) {
            j = (j << 8) | Integer.parseInt(r7[iMin], 16);
        }
        return j;
    }
}
