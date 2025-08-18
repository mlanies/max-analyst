package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ndf extends iv1 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ lq1 c;
    public final /* synthetic */ bad d;

    public ndf(AtomicBoolean atomicBoolean, lq1 lq1Var, bad badVar) {
        this.b = atomicBoolean;
        this.c = lq1Var;
        this.d = badVar;
    }

    @Override // defpackage.iv1
    public final void b(int i, pv1 pv1Var) {
        Object obj;
        if (this.a) {
            this.a = false;
            pv1Var.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = pv1Var.c().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        lq1 lq1Var = this.c;
        if (iIntValue == lq1Var.hashCode() && lq1Var.b(null) && !atomicBoolean.getAndSet(true)) {
            ju0.D().execute(new fre(this, 5, this.d));
        }
    }
}
