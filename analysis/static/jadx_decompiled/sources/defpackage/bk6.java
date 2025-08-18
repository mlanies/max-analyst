package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class bk6 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setName("CameraX-camerax_high_priority");
        return thread;
    }
}
