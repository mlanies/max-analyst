package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class xf4 {
    public static final Size k = new Size(0, 0);
    public static final AtomicInteger l = new AtomicInteger(0);
    public static final AtomicInteger m = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public lq1 d;
    public final oq1 e;
    public lq1 f;
    public final oq1 g;
    public final Size h;
    public final int i;
    public Class j;

    public xf4(Size size, int i) {
        this.h = size;
        this.i = i;
        final int i2 = 0;
        oq1 oq1VarG = f8.g(new mq1(this) { // from class: vf4
            public final /* synthetic */ xf4 b;

            {
                this.b = this;
            }

            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                int i3 = i2;
                xf4 xf4Var = this.b;
                switch (i3) {
                    case 0:
                        synchronized (xf4Var.a) {
                            xf4Var.d = lq1Var;
                        }
                        return "DeferrableSurface-termination(" + xf4Var + ")";
                    default:
                        synchronized (xf4Var.a) {
                            xf4Var.f = lq1Var;
                        }
                        return "DeferrableSurface-close(" + xf4Var + ")";
                }
            }
        });
        this.e = oq1VarG;
        final int i3 = 1;
        this.g = f8.g(new mq1(this) { // from class: vf4
            public final /* synthetic */ xf4 b;

            {
                this.b = this;
            }

            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                int i32 = i3;
                xf4 xf4Var = this.b;
                switch (i32) {
                    case 0:
                        synchronized (xf4Var.a) {
                            xf4Var.d = lq1Var;
                        }
                        return "DeferrableSurface-termination(" + xf4Var + ")";
                    default:
                        synchronized (xf4Var.a) {
                            xf4Var.f = lq1Var;
                        }
                        return "DeferrableSurface-close(" + xf4Var + ")";
                }
            }
        });
        if (mqd.u(3, "DeferrableSurface")) {
            m.incrementAndGet();
            l.get();
            toString();
            oq1VarG.b.d(new wf4(this, Log.getStackTraceString(new Exception())), ju0.k());
        }
    }

    public void a() {
        lq1 lq1Var;
        synchronized (this.a) {
            try {
                if (this.c) {
                    lq1Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        lq1Var = this.d;
                        this.d = null;
                    } else {
                        lq1Var = null;
                    }
                    if (mqd.u(3, "DeferrableSurface")) {
                        toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lq1Var != null) {
            lq1Var.b(null);
        }
    }

    public final void b() {
        lq1 lq1Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    lq1Var = this.d;
                    this.d = null;
                } else {
                    lq1Var = null;
                }
                if (mqd.u(3, "DeferrableSurface")) {
                    toString();
                    if (this.b == 0) {
                        m.get();
                        l.decrementAndGet();
                        toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lq1Var != null) {
            lq1Var.b(null);
        }
    }

    public final bm7 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new dw6(1, new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                }
                return e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                }
                this.b = i + 1;
                if (mqd.u(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        m.get();
                        l.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract bm7 e();
}
