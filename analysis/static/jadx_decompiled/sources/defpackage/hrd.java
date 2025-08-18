package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class hrd extends lue {
    public static final Object y0 = new Object();
    public final long X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final Object v0;
    public final rb8 w0;
    public final gb8 x0;

    static {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        List listEmptyList = Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new kb8(uri, null, listEmptyList, ffcVar2);
        }
        za8Var.b();
        fd8 fd8Var = fd8.S0;
    }

    public hrd(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, pq9 pq9Var, rb8 rb8Var, gb8 gb8Var) {
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = j6;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = z3;
        this.v0 = pq9Var;
        rb8Var.getClass();
        this.w0 = rb8Var;
        this.x0 = gb8Var;
    }

    @Override // defpackage.lue
    public final int b(Object obj) {
        return y0.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        np8.e(i, 1);
        Object obj = z ? y0 : null;
        long j = -this.Y;
        gueVar.getClass();
        gueVar.h(null, obj, 0, this.o, j, r8.Y, false);
        return gueVar;
    }

    @Override // defpackage.lue
    public final int i() {
        return 1;
    }

    @Override // defpackage.lue
    public final Object m(int i) {
        np8.e(i, 1);
        return y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jue n(int r25, defpackage.jue r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.np8.e(r2, r1)
            long r1 = r0.Z
            boolean r14 = r0.t0
            if (r14 == 0) goto L2d
            boolean r3 = r0.u0
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.X
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = defpackage.jue.C0
            long r1 = r0.X
            r18 = r1
            r20 = 0
            rb8 r5 = r0.w0
            java.lang.Object r6 = r0.v0
            long r7 = r0.b
            long r9 = r0.c
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.s0
            gb8 r15 = r0.x0
            r21 = 0
            long r0 = r0.Y
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrd.n(int, jue, long):jue");
    }

    @Override // defpackage.lue
    public final int p() {
        return 1;
    }
}
