package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class hy extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;
    public final Object a = new Object();
    public final uy d = new uy(3, (byte) 0);
    public final uy e = new uy(3, (byte) 0);
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public hy(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a(MediaCodec mediaCodec) {
        synchronized (this.a) {
            this.k++;
            Handler handler = this.c;
            int i = maf.a;
            handler.post(new c(this, 5, mediaCodec));
        }
    }

    public final void b() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        uy uyVar = this.d;
        uyVar.b = 0;
        uyVar.c = -1;
        uyVar.o = 0;
        uy uyVar2 = this.e;
        uyVar2.b = 0;
        uyVar2.c = -1;
        uyVar2.o = 0;
        this.f.clear();
        arrayDeque.clear();
        this.j = null;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.d(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.d(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.d(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.e.d(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
