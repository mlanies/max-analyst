package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class c04 implements bbe {
    public static final rv0 c;
    public final zw6 a;
    public final long[] b;

    static {
        sm9 sm9Var = sm9.a;
        yv3 yv3Var = new yv3(8);
        sm9Var.getClass();
        c = new rv0(yv3Var, sm9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c04(defpackage.ffc r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r19.<init>()
            int r3 = r20.size()
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r6) goto L4c
            java.lang.Object r3 = defpackage.mqd.o(r20)
            b04 r3 = (defpackage.b04) r3
            long r9 = r3.b
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L22
            r4 = 0
            goto L23
        L22:
            r4 = r9
        L23:
            long r9 = r3.c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            zw6 r3 = r3.a
            if (r7 != 0) goto L38
            ffc r1 = defpackage.zw6.n(r3)
            r0.a = r1
            long[] r1 = new long[r6]
            r1[r2] = r4
            r0.b = r1
            goto L4b
        L38:
            ffc r7 = defpackage.zw6.m()
            ffc r3 = defpackage.zw6.o(r3, r7)
            r0.a = r3
            long r9 = r9 + r4
            long[] r1 = new long[r1]
            r1[r2] = r4
            r1[r6] = r9
            r0.b = r1
        L4b:
            return
        L4c:
            int r3 = r20.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.b = r1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            rv0 r3 = defpackage.c04.c
            r9 = r20
            ffc r3 = defpackage.zw6.r(r3, r9)
            r9 = r2
        L6b:
            int r10 = r3.size()
            if (r2 >= r10) goto Lcf
            java.lang.Object r10 = r3.get(r2)
            b04 r10 = (defpackage.b04) r10
            long r11 = r10.b
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L7f
            r11 = 0
        L7f:
            long r13 = r10.c
            long r15 = r11 + r13
            zw6 r10 = r10.a
            if (r9 == 0) goto Lb1
            long[] r4 = r0.b
            int r5 = r9 + (-1)
            r17 = r4[r5]
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L92
            goto Lb1
        L92:
            if (r4 != 0) goto La4
            java.lang.Object r4 = r1.get(r5)
            zw6 r4 = (defpackage.zw6) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La4
            r1.set(r5, r10)
            goto Lbb
        La4:
            java.lang.String r4 = "Truncating unsupported overlapping cues."
            defpackage.z04.c0(r4)
            long[] r4 = r0.b
            r4[r5] = r11
            r1.set(r5, r10)
            goto Lbb
        Lb1:
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r11
            r1.add(r10)
            r9 = r5
        Lbb:
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lcd
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r15
            ffc r4 = defpackage.zw6.m()
            r1.add(r4)
            r9 = r5
        Lcd:
            int r2 = r2 + r6
            goto L6b
        Lcf:
            zw6 r1 = defpackage.zw6.j(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c04.<init>(ffc):void");
    }

    @Override // defpackage.bbe
    public final int g(long j) {
        int iB = oaf.b(this.b, j, false);
        if (iB < this.a.size()) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.bbe
    public final long i(int i) {
        fm9.f(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.bbe
    public final List p(long j) {
        int iF = oaf.f(this.b, j, false);
        return iF == -1 ? zw6.m() : (zw6) this.a.get(iF);
    }

    @Override // defpackage.bbe
    public final int u() {
        return this.a.size();
    }
}
