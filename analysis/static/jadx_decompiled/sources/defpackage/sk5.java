package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class sk5 extends ScheduledThreadPoolExecutor {
    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void finalize() {
        shutdown();
    }
}
