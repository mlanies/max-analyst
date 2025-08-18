package defpackage;

import android.graphics.SurfaceTexture;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class ca5 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;

    public /* synthetic */ ca5(fa5 fa5Var, int i) {
        this.a = i;
        this.b = fa5Var;
    }

    @Override // defpackage.xff
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E0 = false;
                break;
            case 1:
                fa5 fa5Var = this.b;
                fa5Var.B0 = null;
                if (!fa5Var.A0 || !fa5Var.u0.isEmpty()) {
                    fa5Var.B();
                    break;
                } else {
                    fa5Var.A0 = false;
                    gd6 gd6Var = fa5Var.X;
                    gd6Var.getClass();
                    ((qi0) gd6Var).b();
                    d54.a();
                    ScheduledFuture scheduledFuture = fa5Var.D0;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    fa5Var.D0 = null;
                    break;
                }
                break;
            case 2:
                fa5 fa5Var2 = this.b;
                ConcurrentLinkedQueue concurrentLinkedQueue = fa5Var2.u0;
                int size = concurrentLinkedQueue.size();
                int i = fa5Var2.z0;
                Locale locale = Locale.US;
                StringBuilder sbN = rh4.n(size, "Forcing EOS after missing ", " frames for ");
                sbN.append(fa5.H0);
                sbN.append(" ms, with available frame count: ");
                sbN.append(i);
                z04.c0(sbN.toString());
                fa5Var2.A0 = false;
                fa5Var2.B0 = null;
                fa5Var2.E0 = true;
                while (true) {
                    int i2 = fa5Var2.z0;
                    if (i2 <= 0) {
                        concurrentLinkedQueue.clear();
                        fa5Var2.z();
                        break;
                    } else {
                        fa5Var2.z0 = i2 - 1;
                        fa5Var2.s0.updateTexImage();
                        fa5Var2.u0.remove();
                    }
                }
            case 3:
                fa5 fa5Var3 = this.b;
                if (!fa5Var3.u0.isEmpty() || fa5Var3.B0 != null) {
                    fa5Var3.A0 = true;
                    ScheduledFuture scheduledFuture2 = fa5Var3.D0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    fa5Var3.D0 = null;
                    fa5Var3.D0 = fa5Var3.v0.schedule(new dd4(19, fa5Var3), fa5.H0, TimeUnit.MILLISECONDS);
                    break;
                } else {
                    gd6 gd6Var2 = fa5Var3.X;
                    gd6Var2.getClass();
                    ((qi0) gd6Var2).b();
                    d54.a();
                    ScheduledFuture scheduledFuture3 = fa5Var3.D0;
                    if (scheduledFuture3 != null) {
                        scheduledFuture3.cancel(false);
                    }
                    fa5Var3.D0 = null;
                    break;
                }
                break;
            case 4:
                fa5 fa5Var4 = this.b;
                fa5Var4.getClass();
                d54.a();
                if (!fa5Var4.E0) {
                    if (fa5Var4.A0) {
                        ScheduledFuture scheduledFuture4 = fa5Var4.D0;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(false);
                        }
                        fa5Var4.D0 = null;
                        fa5Var4.D0 = fa5Var4.v0.schedule(new dd4(19, fa5Var4), fa5.H0, TimeUnit.MILLISECONDS);
                    }
                    fa5Var4.z0++;
                    fa5Var4.B();
                    break;
                } else {
                    SurfaceTexture surfaceTexture = fa5Var4.s0;
                    surfaceTexture.updateTexImage();
                    z04.c0("Dropping frame received on SurfaceTexture after forcing EOS: " + (surfaceTexture.getTimestamp() / 1000));
                    break;
                }
            default:
                fa5 fa5Var5 = this.b;
                fa5Var5.y0++;
                fa5Var5.B();
                break;
        }
    }
}
