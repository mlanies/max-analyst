package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class sc4 {
    public final gaa a;
    public final int b;

    public sc4(gaa gaaVar, int i) {
        this.a = gaaVar;
        this.b = i;
    }

    public final String a(String str) {
        String str2;
        int i = this.b;
        if (i == 1) {
            str2 = "lottie_cache";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "webm_cache";
        }
        return rh4.j(str2, "_", Pattern.compile("\\W+").matcher(str).replaceAll(""));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qm9 b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            gaa r1 = r4.a     // Catch: java.lang.Exception -> L55
            java.io.File r1 = r1.u()     // Catch: java.lang.Exception -> L55
            java.lang.String r4 = r4.a(r5)     // Catch: java.lang.Exception -> L55
            rc4 r5 = new rc4     // Catch: java.lang.Exception -> L55
            r5.<init>()     // Catch: java.lang.Exception -> L55
            java.io.File[] r5 = r1.listFiles(r5)     // Catch: java.lang.Exception -> L55
            if (r5 == 0) goto L55
            int r1 = r5.length     // Catch: java.lang.Exception -> L55
            if (r1 != 0) goto L1a
            goto L55
        L1a:
            r1 = 0
            r5 = r5[r1]     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L4d
            int r3 = r2.length()     // Catch: java.lang.Exception -> L55
            if (r3 != 0) goto L2a
            goto L4d
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L55
            r3.<init>()     // Catch: java.lang.Exception -> L55
            r3.append(r4)     // Catch: java.lang.Exception -> L55
            java.lang.String r4 = "_origname_"
            r3.append(r4)     // Catch: java.lang.Exception -> L55
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L55
            r3 = 6
            int r1 = defpackage.w9e.A0(r2, r4, r1, r1, r3)     // Catch: java.lang.Exception -> L55
            r3 = -1
            if (r1 == r3) goto L4d
            int r4 = r4.length()     // Catch: java.lang.Exception -> L55
            int r1 = r1 + r4
            java.lang.String r4 = r2.substring(r1)     // Catch: java.lang.Exception -> L55
            goto L4e
        L4d:
            r4 = r0
        L4e:
            qm9 r1 = new qm9     // Catch: java.lang.Exception -> L55
            r1.<init>(r5, r4)     // Catch: java.lang.Exception -> L55
            r0 = r1
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc4.b(java.lang.String):qm9");
    }

    public final File c(String str, String str2) {
        String str3;
        String strConcat;
        File fileU = this.a.u();
        String strA = a(str);
        if (str2 == null || str2.length() == 0) {
            int i = this.b;
            if (i == 1) {
                str3 = "json";
            } else {
                if (i != 2) {
                    throw null;
                }
                str3 = "webm";
            }
            strConcat = ".".concat(str3);
        } else {
            strConcat = "_origname_".concat(str2);
        }
        return new File(fileU, au1.g(strA, strConcat));
    }
}
