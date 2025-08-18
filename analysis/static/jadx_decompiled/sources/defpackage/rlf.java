package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class rlf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bdb b;

    public /* synthetic */ rlf(bdb bdbVar, int i) {
        this.a = i;
        this.b = bdbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AtomicInteger) this.b.c).decrementAndGet();
                break;
            default:
                ((AtomicInteger) this.b.c).incrementAndGet();
                break;
        }
    }
}
