package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class e70 {
    public final q6d a;
    public final qt0 d;
    public final mpd e;
    public final long f;
    public boolean i;
    public Executor j;
    public l7b k;
    public z05 l;
    public h7b m;
    public d70 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public final int v;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public int g = 1;
    public lt0 h = lt0.b;
    public long u = 0;

    public e70(n90 n90Var, q6d q6dVar, Context context) throws AudioSourceAccessException {
        q6d q6dVar2 = new q6d(q6dVar);
        this.a = q6dVar2;
        this.f = TimeUnit.MILLISECONDS.toNanos(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        try {
            qt0 qt0Var = new qt0(new h70(n90Var, context), n90Var);
            this.d = qt0Var;
            qt0Var.a(new ey1(4, this), q6dVar2);
            this.e = new mpd(n90Var);
            this.v = n90Var.d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    public final void a() {
        Executor executor = this.j;
        l7b l7bVar = this.k;
        if (executor == null || l7bVar == null) {
            return;
        }
        boolean z = this.r || this.o || this.q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new u60(l7bVar, z, 2));
    }

    public final void b(z05 z05Var) {
        z05 z05Var2 = this.l;
        lt0 lt0Var = null;
        if (z05Var2 != null) {
            d70 d70Var = this.n;
            Objects.requireNonNull(d70Var);
            z05Var2.l(d70Var);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = lt0.b;
            d();
        }
        if (z05Var != null) {
            this.l = z05Var;
            this.n = new d70(this, z05Var);
            this.m = new h7b(this, 5, z05Var);
            try {
                bm7 bm7VarJ = z05Var.j();
                if (((oq1) bm7VarJ).b.isDone()) {
                    lt0Var = (lt0) ((oq1) bm7VarJ).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (lt0Var != null) {
                this.h = lt0Var;
                d();
            }
            this.l.f(this.a, this.n);
        }
    }

    public final void c() {
        z05 z05Var = this.l;
        Objects.requireNonNull(z05Var);
        oq1 oq1VarG = f8.g(new w05(z05Var, 1));
        h7b h7bVar = this.m;
        Objects.requireNonNull(h7bVar);
        kq0.a(oq1VarG, h7bVar, this.a);
    }

    public final void d() {
        int i = this.g;
        qt0 qt0Var = this.d;
        if (i != 2) {
            if (this.i) {
                this.i = false;
                qt0Var.stop();
                return;
            }
            return;
        }
        boolean z = this.h == lt0.a;
        boolean z2 = !z;
        Executor executor = this.j;
        l7b l7bVar = this.k;
        if (executor != null && l7bVar != null && this.c.getAndSet(z2) != z2) {
            executor.execute(new b(l7bVar, z2));
        }
        if (!z) {
            if (this.i) {
                this.i = false;
                qt0Var.stop();
                return;
            }
            return;
        }
        if (this.i) {
            return;
        }
        try {
            qt0Var.start();
            this.o = false;
        } catch (AudioStream$AudioStreamException unused) {
            this.o = true;
            this.e.start();
            this.p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}
