package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* loaded from: classes2.dex */
public final class z26 implements uoc {
    public volatile boolean a;
    public volatile e24 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final cue f;
    public volatile yag g;
    public volatile boolean h;

    public z26() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new cue();
    }

    public static void b(yag yagVar) {
        if (yagVar != null) {
            synchronized (yagVar.a) {
                yagVar.a.notify();
            }
        }
    }

    @Override // defpackage.uoc
    public final void a(e24 e24Var, byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.get();
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        if (b == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                yag yagVar = this.g;
                if (yagVar != null) {
                    yagVar.o = true;
                    if (z) {
                        synchronized (yagVar.b) {
                            yagVar.c = null;
                        }
                    }
                }
                b(yagVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(e24 e24Var) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = e24Var;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        yag yagVar = new yag(this, this.b);
        this.g = yagVar;
        yagVar.start();
    }
}
