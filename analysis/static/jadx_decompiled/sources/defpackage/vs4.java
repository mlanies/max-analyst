package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vs4 implements lee, SurfaceTexture.OnFrameAvailableListener {
    public int X;
    public boolean Y;
    public final AtomicBoolean Z;
    public final ts4 a;
    public final HandlerThread b;
    public final zh6 c;
    public final Handler o;
    public final LinkedHashMap s0;
    public SurfaceTexture t0;
    public SurfaceTexture u0;

    public vs4(eu4 eu4Var, ge7 ge7Var, ge7 ge7Var2) {
        Map mapEmptyMap = Collections.emptyMap();
        this.X = 0;
        this.Y = false;
        this.Z = new AtomicBoolean(false);
        this.s0 = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new zh6(handler);
        this.a = new ts4(ge7Var, ge7Var2);
        try {
            try {
                f8.g(new u00(this, eu4Var, mapEmptyMap, 8)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // defpackage.lee
    public final void a(see seeVar) {
        if (this.Z.get()) {
            seeVar.d();
        } else {
            e(new kl4(this, 3, seeVar), new ae4(seeVar, 0));
        }
    }

    @Override // defpackage.lee
    public final void c(kee keeVar) {
        if (this.Z.get()) {
            keeVar.close();
            return;
        }
        kl4 kl4Var = new kl4(this, 4, keeVar);
        Objects.requireNonNull(keeVar);
        e(kl4Var, new dd4(1, keeVar));
    }

    public final void d() {
        if (this.Y && this.X == 0) {
            LinkedHashMap linkedHashMap = this.s0;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((kee) it.next()).close();
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new f5(this, runnable2, runnable, 24));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.Z.get() || (surfaceTexture2 = this.t0) == null || this.u0 == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.u0.updateTexImage();
        for (Map.Entry entry : this.s0.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            kee keeVar = (kee) entry.getKey();
            if (keeVar.c == 34) {
                try {
                    this.a.w(surfaceTexture.getTimestamp(), surface, keeVar, this.t0, this.u0);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    @Override // defpackage.lee
    public final void release() {
        if (this.Z.getAndSet(true)) {
            return;
        }
        e(new dd4(8, this), new kc(5));
    }
}
