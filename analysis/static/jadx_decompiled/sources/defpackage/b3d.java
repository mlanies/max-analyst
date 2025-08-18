package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class b3d {
    public static final k2d a = new k2d(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(k2d k2dVar) {
        if (k2dVar.f != null || k2dVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (k2dVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        k2d k2dVar2 = (k2d) atomicReference.get();
        if (k2dVar2 == a) {
            return;
        }
        int i = k2dVar2 != null ? k2dVar2.c : 0;
        if (i >= 65536) {
            return;
        }
        k2dVar.f = k2dVar2;
        k2dVar.b = 0;
        k2dVar.c = i + 8192;
        while (!atomicReference.compareAndSet(k2dVar2, k2dVar)) {
            if (atomicReference.get() != k2dVar2) {
                k2dVar.f = null;
                return;
            }
        }
    }

    public static final k2d b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        k2d k2dVar = a;
        k2d k2dVar2 = (k2d) atomicReference.getAndSet(k2dVar);
        if (k2dVar2 == k2dVar) {
            return new k2d();
        }
        if (k2dVar2 == null) {
            atomicReference.set(null);
            return new k2d();
        }
        atomicReference.set(k2dVar2.f);
        k2dVar2.f = null;
        k2dVar2.c = 0;
        return k2dVar2;
    }
}
