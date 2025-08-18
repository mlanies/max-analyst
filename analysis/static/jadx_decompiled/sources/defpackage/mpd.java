package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mpd implements f70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;
    public ey1 g;
    public Executor h;

    public mpd(n90 n90Var) {
        this.c = n90Var.a();
        this.d = n90Var.b;
    }

    @Override // defpackage.f70
    public final void a(ey1 ey1Var, q6d q6dVar) {
        c54.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.g = ey1Var;
        this.h = q6dVar;
    }

    public final void b() {
        c54.p("AudioStream has been released.", !this.b.get());
    }

    @Override // defpackage.f70
    public final q90 read(ByteBuffer byteBuffer) throws InterruptedException {
        b();
        c54.p("AudioStream has not been started.", this.a.get());
        long jRemaining = byteBuffer.remaining();
        int i = this.c;
        long jV = ote.V(i, jRemaining);
        long j = i;
        c54.j("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * jV);
        if (i2 <= 0) {
            return new q90(0, this.f);
        }
        long jK = this.f + ote.k(this.d, jV);
        long jNanoTime = jK - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException unused) {
            }
        }
        c54.p(null, i2 <= byteBuffer.remaining());
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(iPosition + i2).position(iPosition);
        q90 q90Var = new q90(i2, this.f);
        this.f = jK;
        return q90Var;
    }

    @Override // defpackage.f70
    public final void release() {
        this.b.getAndSet(true);
    }

    @Override // defpackage.f70
    public final void start() {
        b();
        if (this.a.getAndSet(true)) {
            return;
        }
        this.f = System.nanoTime();
        ey1 ey1Var = this.g;
        Executor executor = this.h;
        if (ey1Var == null || executor == null) {
            return;
        }
        executor.execute(new u3c(17, ey1Var));
    }

    @Override // defpackage.f70
    public final void stop() {
        b();
        this.a.set(false);
    }
}
