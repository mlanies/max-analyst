package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        int iDecrementAndGet = this.refCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            Logging.d("RefCountDelegate", "release() called on an object with refcount < 1");
        }
        if (iDecrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            Logging.d("RefCountDelegate", "retain() called on an object with refcount < 1");
        }
    }

    public boolean safeRetain() {
        int i = this.refCount.get();
        while (i != 0) {
            if (this.refCount.weakCompareAndSet(i, i + 1)) {
                return true;
            }
            i = this.refCount.get();
        }
        return false;
    }
}
