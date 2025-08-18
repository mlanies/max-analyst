package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class tk5 extends ThreadPoolExecutor {
    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void finalize() {
        shutdown();
    }
}
