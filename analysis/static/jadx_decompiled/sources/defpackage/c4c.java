package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class c4c {
    public final long a;
    public final hdf b;
    public final List c;
    public final List d;
    public final HashMap e = new HashMap();

    public c4c(long j, hdf hdfVar, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = j;
        this.b = hdfVar;
        Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
    }

    public static BigInteger a(String str, a4c a4cVar) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e) {
            a4cVar.logException("RTCStat", "stat.parse", e);
            return null;
        }
    }

    public static long b(String str, a4c a4cVar) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            a4cVar.logException("RTCStat", "stat.parse", e);
            return -1L;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0139 A[LOOP:4: B:74:0x0137->B:75:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a A[PHI: r21
      0x018a: PHI (r21v13 long) = 
      (r21v4 long)
      (r21v5 long)
      (r21v6 long)
      (r21v7 long)
      (r21v8 long)
      (r21v9 long)
      (r21v10 long)
      (r21v11 long)
      (r21v14 long)
     binds: [B:114:0x01f2, B:110:0x01e5, B:106:0x01d8, B:102:0x01cb, B:98:0x01be, B:94:0x01b1, B:90:0x01a4, B:86:0x0195, B:83:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c4c d(defpackage.a4c r61, org.webrtc.StatsReport[] r62) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.d(a4c, org.webrtc.StatsReport[]):c4c");
    }

    public final cz1 c() {
        for (cz1 cz1Var : this.d) {
            if (cz1Var.k) {
                return cz1Var;
            }
        }
        return null;
    }
}
