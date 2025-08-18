package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d15 implements n05 {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public Future C;
    public int D;
    public final String a;
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final k05 f;
    public final u2 g;
    public final q6d h;
    public final bm7 i;
    public final lq1 j;
    public final bue p;
    public final Object b = new Object();
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final pq9 q = new pq9();
    public o05 r = o05.r;
    public Executor s = ju0.k();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public b15 y = null;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;

    public d15(Executor executor, q05 q05Var) throws InvalidConfigException, IOException {
        executor.getClass();
        q05Var.getClass();
        LruCache lruCache = w43.a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(q05Var.a());
            this.e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.h = new q6d(executor);
            MediaFormat mediaFormatB = q05Var.b();
            this.d = mediaFormatB;
            bue bueVarC = q05Var.c();
            this.p = bueVarC;
            if (q05Var instanceof m90) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new z05(this);
                h40 h40Var = new h40(codecInfo, q05Var.a());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) h40Var.b).getAudioCapabilities());
                this.g = h40Var;
            } else {
                if (!(q05Var instanceof ic0)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new c15(this);
                eff effVar = new eff(codecInfo, q05Var.a());
                if (mediaFormatB.containsKey("bitrate")) {
                    int integer = mediaFormatB.getInteger("bitrate");
                    int iIntValue = ((Integer) effVar.c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatB.setInteger("bitrate", iIntValue);
                    }
                }
                this.g = effVar;
            }
            Objects.toString(bueVarC);
            Objects.toString(mediaFormatB);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = kq0.w(f8.g(new dt0(atomicReference, 4)));
                lq1 lq1Var = (lq1) atomicReference.get();
                lq1Var.getClass();
                this.j = lq1Var;
                i(1);
            } catch (MediaCodec.CodecException e) {
                throw new InvalidConfigException(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new InvalidConfigException(e2);
        }
    }

    public final bm7 a() {
        switch (au1.s(this.D)) {
            case 0:
                return new dw6(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                oq1 oq1VarG = f8.g(new dt0(atomicReference, 3));
                lq1 lq1Var = (lq1) atomicReference.get();
                lq1Var.getClass();
                this.l.offer(lq1Var);
                lq1Var.a(new kl4(this, 9, lq1Var), this.h);
                c();
                return oq1VarG;
            case 7:
                return new dw6(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new dw6(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(rh4.r(this.D)));
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (au1.s(this.D)) {
            case 0:
                d(i, str, th);
                h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new t05(this, i, str, th, 0));
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            lq1 lq1Var = (lq1) arrayDeque.poll();
            Objects.requireNonNull(lq1Var);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                f17 f17Var = new f17(this.e, num.intValue());
                if (lq1Var.b(f17Var)) {
                    this.m.add(f17Var);
                    kq0.w(f17Var.d).d(new kl4(this, 7, f17Var), this.h);
                } else {
                    f17Var.a();
                }
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void d(int i, String str, Throwable th) {
        o05 o05Var;
        Executor executor;
        synchronized (this.b) {
            o05Var = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new f5(o05Var, i, str, th));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new s05(this, pq9.u(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        k05 k05Var = this.f;
        if (k05Var instanceof c15) {
            c15 c15Var = (c15) k05Var;
            synchronized (c15Var.a) {
                surface = c15Var.b;
                c15Var.b = null;
                hashSet = new HashSet(c15Var.c);
                c15Var.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b(null);
    }

    public final void g() {
        this.e.setParameters(zr6.g(0, "request-sync"));
    }

    public final void h() {
        l05 l05Var;
        Executor executor;
        this.t = E;
        this.u = 0L;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((lq1) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        Future future = this.C;
        if (future != null) {
            future.cancel(false);
            this.C = null;
        }
        b15 b15Var = this.y;
        if (b15Var != null) {
            b15Var.j = true;
        }
        b15 b15Var2 = new b15(this);
        this.y = b15Var2;
        this.e.setCallback(b15Var2);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        k05 k05Var = this.f;
        if (k05Var instanceof c15) {
            c15 c15Var = (c15) k05Var;
            c15Var.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) xi4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (c15Var.a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (c15Var.b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            c15Var.b = surfaceCreateInputSurface;
                        }
                        c15Var.Y.e.setInputSurface(c15Var.b);
                    } else {
                        Surface surface = c15Var.b;
                        if (surface != null) {
                            c15Var.c.add(surface);
                        }
                        surfaceCreateInputSurface = c15Var.Y.e.createInputSurface();
                        c15Var.b = surfaceCreateInputSurface;
                    }
                    l05Var = c15Var.o;
                    executor = c15Var.X;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || l05Var == null || executor == null) {
                return;
            }
            try {
                ((q6d) executor).execute(new kl4((tef) l05Var, 17, surfaceCreateInputSurface));
            } catch (RejectedExecutionException unused) {
                String str = c15Var.Y.a;
            }
        }
    }

    public final void i(int i) {
        if (this.D == i) {
            return;
        }
        this.D = i;
    }

    public final void j() {
        k05 k05Var = this.f;
        if (k05Var instanceof z05) {
            ((z05) k05Var).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(kq0.w(((f17) it.next()).d));
            }
            kq0.J(arrayList).d(new r05(this, 0), this.h);
            return;
        }
        if (k05Var instanceof c15) {
            try {
                if (xi4.a.e(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    b15 b15Var = this.y;
                    q6d q6dVar = this.h;
                    Future future = this.C;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.C = ju0.D().schedule(new kl4(q6dVar, 8, b15Var), 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new s05(this, pq9.u(), 1));
    }

    public final void l(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(kq0.w(((e05) it.next()).X));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(kq0.w(((f17) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        kq0.J(arrayList).d(new f5(this, arrayList, runnable, 29), this.h);
    }
}
