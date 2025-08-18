package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class qt0 implements f70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final q6d d;
    public final Object e;
    public pt0 f;
    public final f70 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public qt0(h70 h70Var, n90 n90Var) {
        k40 k40Var;
        if (k40.c != null) {
            k40Var = k40.c;
        } else {
            synchronized (k40.class) {
                try {
                    if (k40.c == null) {
                        k40.c = new k40(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            k40Var = k40.c;
        }
        this.d = new q6d(k40Var);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = h70Var;
        int iA = n90Var.a();
        this.h = iA;
        int i = n90Var.b;
        this.i = i;
        c54.j("mBytesPerFrame must be greater than 0.", ((long) iA) > 0);
        c54.j("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.j = 500;
        this.l = iA * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    @Override // defpackage.f70
    public final void a(ey1 ey1Var, q6d q6dVar) {
        c54.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.d.execute(new f5(this, ey1Var, q6dVar, 4));
    }

    public final void b() {
        c54.p("AudioStream has been released.", !this.b.get());
    }

    public final void c() {
        if (this.k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.l);
            pt0 pt0Var = new pt0(byteBufferAllocateDirect, this.g.read(byteBufferAllocateDirect), this.h, this.i);
            int i = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(pt0Var);
                    while (this.c.size() > i) {
                        this.c.poll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.get()) {
                this.d.execute(new ot0(this, 2));
            }
        }
    }

    @Override // defpackage.f70
    public final q90 read(ByteBuffer byteBuffer) throws InterruptedException {
        boolean z;
        b();
        c54.p("AudioStream has not been started.", this.a.get());
        this.d.execute(new l40(byteBuffer.remaining(), 2, this));
        q90 q90Var = new q90(0, 0L);
        do {
            synchronized (this.e) {
                try {
                    pt0 pt0Var = this.f;
                    this.f = null;
                    if (pt0Var == null) {
                        pt0Var = (pt0) this.c.poll();
                    }
                    if (pt0Var != null) {
                        q90Var = pt0Var.a(byteBuffer);
                        if (pt0Var.c.remaining() > 0) {
                            this.f = pt0Var;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = q90Var.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            }
        } while (z);
        return q90Var;
    }

    @Override // defpackage.f70
    public final void release() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.d.execute(new ot0(this, 3));
    }

    @Override // defpackage.f70
    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new ot0(this, 1), null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException(e);
        }
    }

    @Override // defpackage.f70
    public final void stop() {
        b();
        if (this.a.getAndSet(false)) {
            this.d.execute(new ot0(this, 0));
        }
    }
}
