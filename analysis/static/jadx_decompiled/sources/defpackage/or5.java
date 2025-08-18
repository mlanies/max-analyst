package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class or5 extends zk0 {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final vae o;

    public or5(vae vaeVar, Object[] objArr) {
        this.a = objArr;
        this.o = vaeVar;
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.c = true;
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.b = this.a.length;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        r12.b = r6;
        r13 = addAndGet(-r8);
     */
    @Override // defpackage.xae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r13) {
        /*
            r12 = this;
            boolean r0 = defpackage.zae.d(r13)
            if (r0 == 0) goto L96
            long r0 = defpackage.ngg.b(r12, r13)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L96
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            java.lang.String r1 = " is null"
            java.lang.String r4 = "The element at index "
            if (r0 != 0) goto L4c
            java.lang.Object[] r13 = r12.a
            int r14 = r13.length
            vae r0 = r12.o
            int r2 = r12.b
        L24:
            if (r2 == r14) goto L43
            boolean r3 = r12.c
            if (r3 == 0) goto L2c
            goto L96
        L2c:
            r3 = r13[r2]
            if (r3 != 0) goto L3d
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = defpackage.wg0.g(r2, r4, r1)
            r12.<init>(r13)
            r0.onError(r12)
            goto L96
        L3d:
            r0.e(r3)
            int r2 = r2 + 1
            goto L24
        L43:
            boolean r12 = r12.c
            if (r12 == 0) goto L48
            goto L96
        L48:
            r0.b()
            goto L96
        L4c:
            java.lang.Object[] r0 = r12.a
            int r5 = r0.length
            int r6 = r12.b
            vae r7 = r12.o
        L53:
            r8 = r2
        L54:
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 == 0) goto L79
            if (r6 == r5) goto L79
            boolean r10 = r12.c
            if (r10 == 0) goto L5f
            goto L96
        L5f:
            r10 = r0[r6]
            if (r10 != 0) goto L70
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = defpackage.wg0.g(r6, r4, r1)
            r12.<init>(r13)
            r7.onError(r12)
            goto L96
        L70:
            r7.e(r10)
            r10 = 1
            long r8 = r8 + r10
            int r6 = r6 + 1
            goto L54
        L79:
            if (r6 != r5) goto L83
            boolean r12 = r12.c
            if (r12 != 0) goto L96
            r7.b()
            goto L96
        L83:
            long r13 = r12.get()
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 != 0) goto L54
            r12.b = r6
            long r13 = -r8
            long r13 = r12.addAndGet(r13)
            int r8 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r8 != 0) goto L53
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or5.j(long):void");
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 1;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }
}
