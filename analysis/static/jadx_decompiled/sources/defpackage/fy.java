package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fy {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public cy c;
    public final AtomicReference d;
    public final ae3 e;
    public boolean f;

    public fy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ae3 ae3Var = new ae3(0, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = ae3Var;
        this.d = new AtomicReference();
    }

    public static dy b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new dy();
                }
                return (dy) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                cy cyVar = this.c;
                cyVar.getClass();
                cyVar.removeCallbacksAndMessages(null);
                ae3 ae3Var = this.e;
                synchronized (ae3Var) {
                    ae3Var.b = false;
                }
                cy cyVar2 = this.c;
                cyVar2.getClass();
                cyVar2.obtainMessage(2).sendToTarget();
                ae3Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }
}
