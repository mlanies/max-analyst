package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class je3 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final Serializable c;

    public je3(String str, boolean z) {
        this.a = 1;
        this.c = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder sbL = au1.l(this.b ? "WM.task-" : "androidx.work-");
                sbL.append(((AtomicInteger) this.c).incrementAndGet());
                return new Thread(runnable, sbL.toString());
            default:
                Thread thread = new Thread(runnable, (String) this.c);
                thread.setDaemon(this.b);
                return thread;
        }
    }

    public je3(boolean z) {
        this.a = 0;
        this.b = z;
        this.c = new AtomicInteger(0);
    }
}
