package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class j42 extends Segment {
    public final zt0 a;
    public final /* synthetic */ AtomicReferenceArray b;

    public j42(long j, j42 j42Var, zt0 zt0Var, int i) {
        super(j, j42Var, i);
        this.a = zt0Var;
        this.b = new AtomicReferenceArray(bu0.b * 2);
    }

    public final boolean a(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object c(int i) {
        return this.b.get((i * 2) + 1);
    }

    public final void d(int i, boolean z) {
        if (z) {
            this.a.J((this.id * bu0.b) + i);
        }
        onSlotCleaned();
    }

    public final void e(int i, Object obj) {
        this.b.set(i * 2, obj);
    }

    public final void f(int i, Object obj) {
        this.b.set((i * 2) + 1, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return bu0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        e(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        r5 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r5, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCancellation(int r6, java.lang.Throwable r7, defpackage.lx3 r8) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            int r7 = defpackage.bu0.b
            if (r6 < r7) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r6 = r6 - r7
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r5.b
            int r1 = r6 * 2
            java.lang.Object r7 = r7.get(r1)
        L12:
            java.lang.Object r1 = r5.c(r6)
            boolean r2 = r1 instanceof defpackage.irf
            zt0 r3 = r5.a
            r4 = 0
            if (r2 != 0) goto L68
            boolean r2 = r1 instanceof defpackage.jrf
            if (r2 == 0) goto L22
            goto L68
        L22:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.j
            if (r1 == r2) goto L5b
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.k
            if (r1 != r2) goto L2b
            goto L5b
        L2b:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.g
            if (r1 == r2) goto L12
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.f
            if (r1 != r2) goto L34
            goto L12
        L34:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bu0.i
            if (r1 == r5) goto L5a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bu0.d
            if (r1 != r5) goto L3d
            goto L5a
        L3d:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bu0.l
            if (r1 != r5) goto L42
            return
        L42:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "unexpected state: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5a:
            return
        L5b:
            r5.e(r6, r4)
            if (r0 == 0) goto L67
            m56 r5 = r3.b
            if (r5 == 0) goto L67
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r5, r7, r8)
        L67:
            return
        L68:
            if (r0 == 0) goto L6d
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.j
            goto L6f
        L6d:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.bu0.k
        L6f:
            boolean r1 = r5.a(r1, r6, r2)
            if (r1 == 0) goto L12
            r5.e(r6, r4)
            r1 = r0 ^ 1
            r5.d(r6, r1)
            if (r0 == 0) goto L86
            m56 r5 = r3.b
            if (r5 == 0) goto L86
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r5, r7, r8)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j42.onCancellation(int, java.lang.Throwable, lx3):void");
    }
}
