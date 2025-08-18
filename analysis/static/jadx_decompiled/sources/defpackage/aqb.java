package defpackage;

/* loaded from: classes2.dex */
public final class aqb {
    public volatile boolean a = false;
    public final Object b = new Object();

    public final void a() {
        synchronized (this.b) {
            this.a = true;
            this.b.notify();
        }
    }

    public final void b(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = j + jCurrentTimeMillis;
        if (j2 < jCurrentTimeMillis) {
            synchronized (this.b) {
                while (!this.a) {
                    try {
                        this.b.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.a = false;
            }
            return;
        }
        synchronized (this.b) {
            while (!this.a && jCurrentTimeMillis < j2) {
                try {
                    this.b.wait(j2 - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.a = false;
        }
    }
}
