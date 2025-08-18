package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class cm9 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public cm9(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = new AtomicInteger(1);
                break;
            default:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.c).newThread(new tqc(runnable, 3));
                threadNewThread.setName(this.b);
                return threadNewThread;
            default:
                return new Thread(new do9(this, 17, runnable), this.b + "-" + ((AtomicInteger) this.c).getAndIncrement());
        }
    }
}
