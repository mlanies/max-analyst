package defpackage;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class msf implements zl4, am4 {
    public final hc3 a = new hc3();
    public final HashSet b = new HashSet();

    @Override // defpackage.am4
    public final synchronized boolean a(zl4 zl4Var) {
        boolean zA;
        nsf nsfVar = new nsf(zl4Var);
        zA = this.a.a(nsfVar);
        if (zA) {
            this.b.add(nsfVar);
        }
        return zA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r2.remove();
        r0 = r1.b(r3);
     */
    @Override // defpackage.am4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b(defpackage.zl4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            hc3 r1 = r5.a     // Catch: java.lang.Throwable -> L2a
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.HashSet r2 = r5.b     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            nsf r3 = (defpackage.nsf) r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L2a
            zl4 r4 = (defpackage.zl4) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 != r6) goto Ld
            r2.remove()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r1.b(r3)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r5)
            return r0
        L2a:
            r6 = move-exception
            java.lang.String r1 = "msf"
            java.lang.String r2 = "delete: failed"
            defpackage.hm9.p(r1, r2, r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)
            return r0
        L34:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msf.b(zl4):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r2.remove();
        r0 = r1.c(r3);
     */
    @Override // defpackage.am4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean c(defpackage.zl4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            hc3 r1 = r5.a     // Catch: java.lang.Throwable -> L2a
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.HashSet r2 = r5.b     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2a
            nsf r3 = (defpackage.nsf) r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L2a
            zl4 r4 = (defpackage.zl4) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 != r6) goto Ld
            r2.remove()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r1.c(r3)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r5)
            return r0
        L2a:
            r6 = move-exception
            java.lang.String r1 = "msf"
            java.lang.String r2 = "delete: failed"
            defpackage.hm9.p(r1, r2, r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)
            return r0
        L34:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msf.c(zl4):boolean");
    }

    public final synchronized void d() {
        this.a.d();
        this.b.clear();
    }

    @Override // defpackage.zl4
    public final synchronized void g() {
        this.a.g();
        this.b.clear();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.a.b;
    }
}
