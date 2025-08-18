package defpackage;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class tld {
    public static final IdentityHashMap d = new IdentityHashMap();
    public Object a;
    public int b;
    public final pic c;

    public tld(Object obj, pic picVar, boolean z) {
        obj.getClass();
        this.a = obj;
        this.c = picVar;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L66
            int r0 = r4.b     // Catch: java.lang.Throwable -> L74
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L6e
            if (r0 <= 0) goto L11
            r1 = r2
        L11:
            if (r1 == 0) goto L68
            int r0 = r4.b     // Catch: java.lang.Throwable -> L66
            int r0 = r0 - r2
            r4.b = r0     // Catch: java.lang.Throwable -> L66
            monitor-exit(r4)
            if (r0 != 0) goto L65
            monitor-enter(r4)
            java.lang.Object r0 = r4.a     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r4.a = r1     // Catch: java.lang.Throwable -> L62
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L65
            pic r4 = r4.c
            if (r4 == 0) goto L2b
            r4.e(r0)
        L2b:
            java.util.IdentityHashMap r4 = defpackage.tld.d
            monitor-enter(r4)
            java.lang.Object r1 = r4.get(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L48
            java.lang.String r1 = "SharedReference"
            java.lang.String r2 = "No entry in sLiveObjects for value of type %s"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L46
            defpackage.ta5.n(r1, r2, r0)     // Catch: java.lang.Throwable -> L46
            goto L5e
        L46:
            r0 = move-exception
            goto L60
        L48:
            int r3 = r1.intValue()     // Catch: java.lang.Throwable -> L46
            if (r3 != r2) goto L52
            r4.remove(r0)     // Catch: java.lang.Throwable -> L46
            goto L5e
        L52:
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L46
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L46
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L46
        L5e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            goto L65
        L60:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r0
        L62:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L62
            throw r0
        L65:
            return
        L66:
            r0 = move-exception
            goto L77
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L6e:
            com.facebook.common.references.SharedReference$NullReferenceException r0 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch: java.lang.Throwable -> L66
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L74:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L66
        L77:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tld.a():void");
    }

    public final synchronized Object b() {
        return this.a;
    }
}
