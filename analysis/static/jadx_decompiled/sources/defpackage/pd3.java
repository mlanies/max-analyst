package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class pd3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ pd3(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, (String) this.b);
                thread.setPriority(10);
                return thread;
            case 1:
                return new Thread(runnable, (String) this.b);
            case 2:
                return new Thread(runnable, (String) this.b);
            case 3:
                return new Thread(runnable, (String) this.b);
            default:
                return new Thread(runnable, "tracer-io-" + ((AtomicInteger) this.b).getAndIncrement());
        }
    }
}
