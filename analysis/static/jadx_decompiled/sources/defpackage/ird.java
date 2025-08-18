package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ird extends mue {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final tb8 o;
    public final hb8 p;

    static {
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        Uri uri = Uri.EMPTY;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        if (uri != null) {
            new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
        }
        za8Var.c();
        fb8Var.a();
        gd8 gd8Var = gd8.J;
    }

    public ird(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, qq9 qq9Var, tb8 tb8Var, hb8 hb8Var) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = qq9Var;
        tb8Var.getClass();
        this.o = tb8Var;
        this.p = hb8Var;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        fm9.g(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        hueVar.getClass();
        hueVar.j(null, obj, 0, this.g, j, s8.g, false);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return 1;
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        fm9.g(i, 1);
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kue n(int r25, defpackage.kue r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.fm9.g(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L2d
            boolean r3 = r0.m
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.h
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
            java.lang.Object r4 = defpackage.kue.q
            long r1 = r0.h
            r18 = r1
            r20 = 0
            tb8 r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.e
            long r9 = r0.f
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.k
            hb8 r15 = r0.p
            r21 = 0
            long r0 = r0.i
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ird.n(int, kue, long):kue");
    }

    @Override // defpackage.mue
    public final int p() {
        return 1;
    }
}
