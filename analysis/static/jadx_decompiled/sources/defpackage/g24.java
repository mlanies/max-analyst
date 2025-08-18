package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class g24 extends Thread {
    public ij Y;
    public int Z;
    public final kad a;
    public e24 c;
    public final ReentrantLock s0;
    public final Condition t0;
    public final ReentrantLock u0;
    public volatile boolean v0;
    public final int b = 30;
    public final ConcurrentLinkedQueue o = new ConcurrentLinkedQueue();
    public final AtomicInteger X = new AtomicInteger(0);

    public g24(e24 e24Var, kad kadVar) {
        this.a = kadVar;
        this.c = e24Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.s0 = reentrantLock;
        this.t0 = reentrantLock.newCondition();
        this.u0 = new ReentrantLock();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte[] bArr;
        float[] fArr;
        ReentrantLock reentrantLock;
        loop0: while (true) {
            boolean z = true;
            if (!(!this.v0)) {
                break;
            }
            this.u0.lock();
            try {
                e24 e24Var = this.c;
                boolean z2 = e24Var == null;
                long jBufferedAmount = e24Var != null ? e24Var.a.bufferedAmount() : 0L;
                if (z2) {
                    break;
                }
                while ((!this.v0) && (jBufferedAmount >= 8000000 || (this.Y == null && this.o.isEmpty()))) {
                    try {
                        reentrantLock = this.s0;
                        reentrantLock.lock();
                    } catch (Throwable unused) {
                    }
                    try {
                        this.t0.await(50L, TimeUnit.MILLISECONDS);
                        reentrantLock.unlock();
                        ReentrantLock reentrantLock2 = this.u0;
                        reentrantLock2.lock();
                        try {
                            e24 e24Var2 = this.c;
                            z2 = e24Var2 == null;
                            jBufferedAmount = e24Var2 != null ? e24Var2.a.bufferedAmount() : 0L;
                            reentrantLock2.unlock();
                            if (z2) {
                                break loop0;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (!(!this.v0)) {
                    break;
                }
                if (this.Y == null) {
                    ij ijVar = (ij) this.o.poll();
                    this.Y = ijVar;
                    if (ijVar == null) {
                        continue;
                    } else {
                        this.X.decrementAndGet();
                    }
                }
                ij ijVar2 = this.Y;
                if (ijVar2 != null) {
                    int i3 = this.Z;
                    this.Z = i3 + 1;
                    int i4 = ijVar2.b;
                    tu0 tu0Var = ijVar2.c;
                    if (ijVar2.a == 1) {
                        boolean z3 = tu0Var instanceof ai;
                        if (tu0Var instanceof yh) {
                            fArr = null;
                            ((yh) tu0Var).getClass();
                        } else {
                            if (!z3) {
                                if (!(tu0Var instanceof zh)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                            }
                            fArr = new float[0];
                        }
                        bArr = new byte[(fArr.length * 4) + 10];
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        byte b = z3 ? (byte) 1 : (byte) 0;
                        byteBufferWrap.put((byte) 1);
                        byteBufferWrap.putShort((short) i3);
                        byteBufferWrap.putInt(i4);
                        byteBufferWrap.putShort((short) 0);
                        byteBufferWrap.put(b);
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float f : fArr) {
                            byteBufferWrap.putFloat(f);
                        }
                    } else {
                        boolean z4 = tu0Var instanceof yh;
                        if (z4) {
                            ((yh) tu0Var).getClass();
                            throw null;
                        }
                        if (tu0Var instanceof zh) {
                            i = 3;
                        } else {
                            if (!(tu0Var instanceof ai)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = 0;
                        }
                        byte[] bArr2 = new byte[i + 12];
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
                        if (z4) {
                            i2 = 0;
                        } else if (tu0Var instanceof zh) {
                            i2 = 2;
                        } else {
                            if (!(tu0Var instanceof ai)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = 1;
                        }
                        byteBufferWrap2.put((byte) 2);
                        byteBufferWrap2.putShort((short) i3);
                        byteBufferWrap2.putInt(i4);
                        byteBufferWrap2.putInt(0);
                        byteBufferWrap2.put((byte) i2);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        if (z4) {
                            ((yh) tu0Var).getClass();
                            throw null;
                        }
                        if (tu0Var instanceof zh) {
                            zh zhVar = (zh) tu0Var;
                            byte bRed = (byte) Color.red(zhVar.n);
                            byte bGreen = (byte) Color.green(zhVar.n);
                            byte bBlue = (byte) Color.blue(zhVar.n);
                            byteBufferWrap2.put(bRed);
                            byteBufferWrap2.put(bGreen);
                            byteBufferWrap2.put(bBlue);
                        } else {
                            tpa.f(tu0Var, ai.n);
                        }
                        bArr = bArr2;
                    }
                    this.u0.lock();
                    try {
                        if (this.c != null) {
                            z = false;
                        }
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        e24 e24Var3 = this.c;
                        if (e24Var3 != null) {
                            e24Var3.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.Y = null;
                        if (z) {
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    continue;
                }
            } finally {
            }
        }
        this.Y = null;
        this.o.clear();
    }
}
