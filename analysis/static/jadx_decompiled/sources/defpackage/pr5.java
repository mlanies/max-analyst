package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pr5 extends zk0 {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final vae o;

    public pr5(vae vaeVar, Iterator it) {
        this.a = it;
        this.o = vaeVar;
    }

    public final void a() {
        Iterator it = this.a;
        vae vaeVar = this.o;
        while (!this.b) {
            try {
                Object next = it.next();
                if (this.b) {
                    return;
                }
                if (next == null) {
                    vaeVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                vaeVar.e(next);
                if (this.b) {
                    return;
                }
                try {
                    if (!it.hasNext()) {
                        if (this.b) {
                            return;
                        }
                        vaeVar.b();
                        return;
                    }
                } catch (Throwable th) {
                    c37.B(th);
                    vaeVar.onError(th);
                    return;
                }
            } catch (Throwable th2) {
                c37.B(th2);
                vaeVar.onError(th2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        r9 = addAndGet(-r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9) {
        /*
            r8 = this;
            java.util.Iterator r0 = r8.a
            vae r1 = r8.o
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L50
            boolean r6 = r8.b
            if (r6 == 0) goto L10
            return
        L10:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
            boolean r7 = r8.b
            if (r7 == 0) goto L19
            return
        L19:
            if (r6 != 0) goto L26
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Iterator.next() returned a null value"
            r8.<init>(r9)
            r1.onError(r8)
            return
        L26:
            r1.e(r6)
            boolean r6 = r8.b
            if (r6 == 0) goto L2e
            return
        L2e:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L3c
            boolean r8 = r8.b
            if (r8 != 0) goto L3b
            r1.b()
        L3b:
            return
        L3c:
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L40:
            r8 = move-exception
            defpackage.c37.B(r8)
            r1.onError(r8)
            return
        L48:
            r8 = move-exception
            defpackage.c37.B(r8)
            r1.onError(r8)
            return
        L50:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr5.b(long):void");
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.b = true;
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.a = null;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        Iterator it = this.a;
        if (it == null) {
            return true;
        }
        if (!this.c || it.hasNext()) {
            return false;
        }
        this.a = null;
        return true;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j) && ngg.b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                a();
            } else {
                b(j);
            }
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 1;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        Objects.requireNonNull(next, "Iterator.next() returned a null value");
        return next;
    }
}
