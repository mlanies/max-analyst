package defpackage;

import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class zc4 {
    public static final xc3 h = new xc3(2);
    public static final Random i = new Random();
    public kd8 d;
    public String f;
    public final kue a = new kue();
    public final hue b = new hue();
    public final HashMap c = new HashMap();
    public mue e = mue.a;
    public long g = -1;

    public final void a(yc4 yc4Var) {
        long j = yc4Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yc4 b(int r16, defpackage.yj8 r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L15:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r4.next()
            yc4 r8 = (defpackage.yc4) r8
            long r9 = r8.c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            int r9 = r8.b
            if (r1 != r9) goto L51
            if (r2 == 0) goto L51
            zc4 r9 = r8.g
            java.util.HashMap r10 = r9.c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            yc4 r10 = (defpackage.yc4) r10
            if (r10 == 0) goto L44
            long r13 = r10.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L44
            goto L49
        L44:
            long r9 = r9.g
            r13 = 1
            long r13 = r13 + r9
        L49:
            long r9 = r2.d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L51
            r8.c = r9
        L51:
            yj8 r9 = r8.d
            if (r2 != 0) goto L5a
            int r10 = r8.b
            if (r1 != r10) goto L15
            goto L7d
        L5a:
            long r13 = r2.d
            if (r9 != 0) goto L6b
            boolean r10 = r17.b()
            if (r10 != 0) goto L15
            long r11 = r8.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L15
            goto L7d
        L6b:
            long r10 = r9.d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L15
            int r10 = r2.b
            int r11 = r9.b
            if (r10 != r11) goto L15
            int r10 = r2.c
            int r11 = r9.c
            if (r10 != r11) goto L15
        L7d:
            long r10 = r8.c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L97
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8a
            goto L97
        L8a:
            if (r12 != 0) goto L15
            int r10 = defpackage.oaf.a
            yj8 r10 = r5.d
            if (r10 == 0) goto L15
            if (r9 == 0) goto L15
            r5 = r8
            goto L15
        L97:
            r5 = r8
            r6 = r10
            goto L15
        L9b:
            if (r5 != 0) goto Lad
            xc3 r4 = defpackage.zc4.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            yc4 r5 = new yc4
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc4.b(int, yj8):yc4");
    }

    public final synchronized String c(mue mueVar, yj8 yj8Var) {
        return b(mueVar.h(yj8Var.a, this.b).c, yj8Var).a;
    }

    public final void d(fd fdVar) {
        yj8 yj8Var;
        boolean zQ = fdVar.b.q();
        HashMap map = this.c;
        if (zQ) {
            String str = this.f;
            if (str != null) {
                yc4 yc4Var = (yc4) map.get(str);
                yc4Var.getClass();
                a(yc4Var);
                return;
            }
            return;
        }
        yc4 yc4Var2 = (yc4) map.get(this.f);
        int i2 = fdVar.c;
        yj8 yj8Var2 = fdVar.d;
        this.f = b(i2, yj8Var2).a;
        e(fdVar);
        if (yj8Var2 == null || !yj8Var2.b()) {
            return;
        }
        long j = yj8Var2.d;
        if (yc4Var2 != null && yc4Var2.c == j && (yj8Var = yc4Var2.d) != null && yj8Var.b == yj8Var2.b && yj8Var.c == yj8Var2.c) {
            return;
        }
        b(i2, new yj8(j, yj8Var2.a));
        this.d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc, B:49:0x00d9, B:52:0x00e0), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.fd r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc4.e(fd):void");
    }
}
