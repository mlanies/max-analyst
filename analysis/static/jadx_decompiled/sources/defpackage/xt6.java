package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xt6 implements xt {
    public final boolean a;
    public final lv4 b;
    public final ao0 c;
    public final wt d;
    public final ScheduledExecutorService e;
    public wqc f;
    public int g;
    public volatile int h;

    public xt6(lv4 lv4Var, wt wtVar, v24 v24Var, boolean z) {
        this.a = z;
        fm9.k(lv4Var.e != -9223372036854775807L);
        fm9.k(lv4Var.f != -2147483647);
        this.b = lv4Var;
        this.d = wtVar;
        this.c = v24Var;
        this.e = Executors.newSingleThreadScheduledExecutor();
        this.g = 0;
    }

    @Override // defpackage.xt
    public final int a(fm5 fm5Var) {
        if (this.g == 2) {
            fm5Var.b = this.h;
        }
        return this.g;
    }

    public final void b(final Bitmap bitmap, final qy5 qy5Var) {
        try {
            wqc wqcVar = this.f;
            if (wqcVar == null) {
                this.f = this.d.c(qy5Var);
                final int i = 0;
                this.e.schedule(new Runnable(this) { // from class: wt6
                    public final /* synthetic */ xt6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.b.b(bitmap, qy5Var);
                                break;
                            default:
                                this.b.b(bitmap, qy5Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            int iG = wqcVar.g(bitmap, new li3(r3.f, 0L, this.b.e));
            if (iG == 1) {
                this.h = 100;
                this.f.e();
            } else if (iG == 2) {
                final int i2 = 1;
                this.e.schedule(new Runnable(this) { // from class: wt6
                    public final /* synthetic */ xt6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.b(bitmap, qy5Var);
                                break;
                            default:
                                this.b.b(bitmap, qy5Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (iG != 3) {
                    throw new IllegalStateException();
                }
                this.h = 100;
            }
        } catch (ExportException e) {
            this.d.d(e);
        } catch (RuntimeException e2) {
            this.d.d(ExportException.a(e2, 1000));
        }
    }

    @Override // defpackage.xt
    public final cx6 e() {
        return kfc.s0;
    }

    @Override // defpackage.xt
    public final void release() {
        this.g = 0;
        this.e.shutdownNow();
    }

    @Override // defpackage.xt
    public final void start() {
        this.g = 2;
        lv4 lv4Var = this.b;
        long j = lv4Var.e;
        wt wtVar = this.d;
        wtVar.f(j);
        wtVar.b(1);
        ib8 ib8Var = lv4Var.a.b;
        ib8Var.getClass();
        fm9.b(this.c.u(ib8Var.a), new qqd(15, this), this.e);
    }
}
