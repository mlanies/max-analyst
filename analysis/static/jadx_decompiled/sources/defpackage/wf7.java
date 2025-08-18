package defpackage;

/* loaded from: classes.dex */
public final class wf7 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final oc8 e;
    public final iad f;

    static {
        int i2 = oaf.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public wf7(int i2, long j2, oc8 oc8Var, iad iadVar, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = oc8Var;
        this.f = iadVar;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wf7 a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = defpackage.wf7.g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = defpackage.wf7.h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = defpackage.wf7.i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            oc8 r0 = defpackage.oc8.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = defpackage.wf7.l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            iad r0 = defpackage.iad.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            iad r0 = new iad
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = defpackage.wf7.k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L7f
            r0 = 2
            java.lang.String r8 = defpackage.wf7.j
            if (r9 == r0) goto L81
            r0 = 3
            if (r9 == r0) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L7f
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            android.os.IBinder r10 = r10.getBinder(r8)
            if (r10 != 0) goto L5a
            goto L7f
        L5a:
            zw6 r10 = defpackage.pu0.a(r10)
            ww6 r0 = defpackage.zw6.i()
        L62:
            int r2 = r10.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            tb8 r2 = defpackage.tb8.b(r2)
            r0.a(r2)
            int r1 = r1 + 1
            goto L62
        L7b:
            ffc r2 = r0.j()
        L7f:
            r8 = r2
            goto L8d
        L81:
            android.os.Bundle r10 = r10.getBundle(r8)
            if (r10 != 0) goto L88
            goto L7f
        L88:
            tb8 r2 = defpackage.tb8.b(r10)
            goto L7f
        L8d:
            wf7 r10 = new wf7
            r2 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf7.a(android.os.Bundle):wf7");
    }
}
