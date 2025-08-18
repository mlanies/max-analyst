package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class aj9 extends f5d implements xi9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(aj9.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public aj9(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : bj9.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r6 = r1.b;
        r0 = r1.c;
        r3.set(r0, r6);
        r6 = new defpackage.ga(r0, 21, r1);
        r0 = r1.a;
        r0.v(r5, r0.resumeMode, new defpackage.vq0(2, r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.f5d.g
            int r1 = r0.get(r6)
            int r2 = r6.a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r6)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r6, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.aj9.h
            r4 = 1
            if (r1 > 0) goto L1e
            r1 = r4
            goto L2b
        L1e:
            int r5 = r1 + (-1)
            boolean r1 = r0.compareAndSet(r6, r1, r5)
            if (r1 == 0) goto L0
            r1 = 0
            r3.set(r6, r1)
            r1 = 0
        L2b:
            e5f r5 = defpackage.e5f.a
            if (r1 == 0) goto L96
            if (r1 == r4) goto L4c
            r6 = 2
            if (r1 == r6) goto L40
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This mutex is already locked by the specified owner: null"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4c:
            kotlin.coroutines.Continuation r7 = defpackage.v3c.u(r7)
            sy1 r7 = defpackage.nu0.o(r7)
            zi9 r1 = new zi9     // Catch: java.lang.Throwable -> L91
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L91
        L59:
            int r4 = r0.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L91
            if (r4 > r2) goto L59
            if (r4 <= 0) goto L7d
            java.lang.Object r6 = r1.b     // Catch: java.lang.Throwable -> L91
            aj9 r0 = r1.c     // Catch: java.lang.Throwable -> L91
            r3.set(r0, r6)     // Catch: java.lang.Throwable -> L91
            ga r6 = new ga     // Catch: java.lang.Throwable -> L91
            r2 = 21
            r6.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> L91
            sy1 r0 = r1.a     // Catch: java.lang.Throwable -> L91
            int r1 = r0.resumeMode     // Catch: java.lang.Throwable -> L91
            vq0 r2 = new vq0     // Catch: java.lang.Throwable -> L91
            r3 = 2
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L91
            r0.v(r5, r1, r2)     // Catch: java.lang.Throwable -> L91
            goto L83
        L7d:
            boolean r4 = r6.b(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L59
        L83:
            java.lang.Object r6 = r7.m()
            tx3 r7 = defpackage.tx3.a
            if (r6 != r7) goto L8c
            goto L8d
        L8c:
            r6 = r5
        L8d:
            if (r6 != r7) goto L96
            r5 = r6
            goto L96
        L91:
            r6 = move-exception
            r7.u()
            throw r6
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj9.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(Object obj) {
        while (Math.max(f5d.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = bj9.a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(c54.u(this));
        sb.append("[isLocked=");
        sb.append(Math.max(f5d.g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
