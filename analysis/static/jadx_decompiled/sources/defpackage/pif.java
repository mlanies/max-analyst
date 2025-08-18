package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pif extends HandlerThread {
    public final /* synthetic */ sif X;
    public final Size a;
    public final eu4 b;
    public final long c;
    public final AtomicReference o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pif(sif sifVar, Size size, eu4 eu4Var) {
        super("videomsg-gl-thread");
        this.X = sifVar;
        this.a = size;
        this.b = eu4Var;
        this.c = SystemClock.elapsedRealtime();
        this.o = new AtomicReference();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        String str = this.X.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.i(SystemClock.elapsedRealtime() - this.c, "onLooperPrepared, GL thread startup took=", " ms"), null);
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        hm9.G(this.X.a, "run, previewSize=" + this.a + ", dynamicRange=" + this.b, null);
        if (this.X.b.get()) {
            hm9.m0(this.X.a, "run, video message processor was requested to exit during startup GL thread, skip GL initialization!", new Object[0]);
        } else {
            try {
                sif.d(this.X, this.a, this.b);
            } catch (Exception e) {
                hm9.p(this.X.a, "GL initialization failed", e);
                this.o.set(e);
            }
        }
        super.run();
        String str = this.X.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Z, str, "run, GL thread finished", null);
        }
    }
}
