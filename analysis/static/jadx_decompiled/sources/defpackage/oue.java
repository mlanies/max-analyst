package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class oue {
    public static final nue d = new nue();
    public boolean a;
    public long b;
    public long c;

    public oue a() {
        this.a = false;
        return this;
    }

    public oue b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public oue d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public oue g(long j, TimeUnit timeUnit) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ey8.h(j, "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }
}
