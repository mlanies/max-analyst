package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class vbg {
    public static final long E;
    public static final String[] F;
    public static final long G;
    public final ax A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final a4c a;
    public final ypc b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public m2a f;
    public t54 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final cue u;
    public final cue v;
    public final cue w;
    public final cue x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1L) / 10;
        F = new String[]{"OMX.google.", "OMX.SEC.", "c2.android"};
        G = timeUnit.toMillis(3L);
    }

    public vbg(a4c a4cVar, vte vteVar, ypc ypcVar) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1L;
        this.i = 0L;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new cue();
        this.v = new cue();
        this.w = new cue();
        this.x = new cue();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = a4cVar;
        this.b = ypcVar;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new ax(vteVar);
    }

    public final void a() {
        if (this.C) {
            return;
        }
        this.C = true;
        HandlerThread handlerThread = this.d;
        Handler handler = this.e;
        ule uleVar = new ule(21, this);
        handler.removeCallbacksAndMessages(null);
        handler.post(uleVar);
        handlerThread.quitSafely();
    }

    public final void b() {
        m2a m2aVar = this.f;
        if (m2aVar != null) {
            try {
                ((ByteArrayOutputStream) m2aVar.e).close();
            } catch (IOException unused) {
            }
        }
        this.f = null;
    }
}
