package defpackage;

/* loaded from: classes.dex */
public abstract class zo6 {
    public static final aw0 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        aw0 aw0Var = new aw0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(a52.a));
        aw0Var.b = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        a = aw0Var;
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = naf.h("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = strArr2[i2] + ((Object) "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + "|" + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append("|");
            strArr3[i6 | 8] = zr6.l(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            java.lang.String[] r0 = defpackage.zo6.b
            int r1 = r0.length
            if (r7 >= r1) goto L8
            r0 = r0[r7]
            goto L16
        L8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = defpackage.naf.h(r1, r0)
        L16:
            if (r8 != 0) goto L1b
            java.lang.String r7 = ""
            goto L66
        L1b:
            r1 = 2
            java.lang.String[] r2 = defpackage.zo6.d
            if (r7 == r1) goto L64
            r1 = 3
            if (r7 == r1) goto L64
            r1 = 4
            if (r7 == r1) goto L5b
            r1 = 6
            if (r7 == r1) goto L5b
            r1 = 7
            if (r7 == r1) goto L64
            r1 = 8
            if (r7 == r1) goto L64
            java.lang.String[] r1 = defpackage.zo6.c
            int r3 = r1.length
            if (r8 >= r3) goto L38
            r1 = r1[r8]
            goto L3a
        L38:
            r1 = r2[r8]
        L3a:
            r2 = 5
            if (r7 != r2) goto L4a
            r2 = r8 & 4
            if (r2 == 0) goto L4a
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r8 = "HEADERS"
            java.lang.String r7 = defpackage.eae.n0(r1, r8, r7)
            goto L66
        L4a:
            if (r7 != 0) goto L59
            r7 = r8 & 32
            if (r7 == 0) goto L59
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r8 = "PRIORITY"
            java.lang.String r7 = defpackage.eae.n0(r1, r8, r7)
            goto L66
        L59:
            r7 = r1
            goto L66
        L5b:
            r7 = 1
            if (r8 != r7) goto L61
            java.lang.String r7 = "ACK"
            goto L66
        L61:
            r7 = r2[r8]
            goto L66
        L64:
            r7 = r2[r8]
        L66:
            if (r4 == 0) goto L6b
            java.lang.String r4 = "<<"
            goto L6d
        L6b:
            java.lang.String r4 = ">>"
        L6d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = defpackage.naf.h(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo6.a(boolean, int, int, int, int):java.lang.String");
    }
}
