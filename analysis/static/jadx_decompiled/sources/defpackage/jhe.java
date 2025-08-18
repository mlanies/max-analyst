package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class jhe extends ihe {
    public final ScheduledExecutorService n;
    public final Object o;
    public List p;
    public nl7 q;
    public final x50 r;
    public final fd7 s;
    public final vg8 t;
    public final ae3 u;
    public final AtomicBoolean v;

    public jhe(bj6 bj6Var, bj6 bj6Var2, q40 q40Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(q40Var, executor, scheduledExecutorService, handler);
        this.o = new Object();
        this.v = new AtomicBoolean(false);
        x50 x50Var = new x50();
        x50Var.a = bj6Var2.d(TextureViewIsClosedQuirk.class);
        x50Var.b = bj6Var.d(PreviewOrientationIncorrectQuirk.class);
        x50Var.c = bj6Var.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = x50Var;
        this.t = new vg8(bj6Var.d(CaptureSessionStuckQuirk.class) || bj6Var.d(IncorrectCaptureStateQuirk.class));
        this.s = new fd7(bj6Var2, 15);
        this.u = new ae3(bj6Var2, 4);
        this.n = scheduledExecutorService;
    }

    @Override // defpackage.ihe, defpackage.ghe
    public final void c(ihe iheVar) {
        oq1 oq1Var;
        synchronized (this.o) {
            this.r.b(this.p);
        }
        synchronized (this.a) {
            try {
                if (this.k) {
                    oq1Var = null;
                } else {
                    this.k = true;
                    c54.o(this.g, "Need to call openCaptureSession before using this API.");
                    oq1Var = this.g;
                }
            } finally {
            }
        }
        synchronized (this.a) {
            try {
                List list = this.j;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xf4) it.next()).b();
                    }
                    this.j = null;
                }
            } finally {
            }
        }
        this.t.d();
        if (oq1Var != null) {
            oq1Var.b.d(new hhe(this, iheVar, 1), ju0.k());
        }
    }

    @Override // defpackage.ghe
    public final void e(jhe jheVar) {
        ArrayList arrayList;
        ihe iheVar;
        ihe iheVar2;
        ihe iheVar3;
        fd7 fd7Var = this.s;
        q40 q40Var = this.b;
        synchronized (q40Var.b) {
            arrayList = new ArrayList((LinkedHashSet) q40Var.X);
        }
        ArrayList arrayListE = this.b.e();
        if (((CaptureSessionOnClosedNotCalledQuirk) fd7Var.a) != null) {
            LinkedHashSet<ihe> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (iheVar3 = (ihe) it.next()) != jheVar) {
                linkedHashSet.add(iheVar3);
            }
            for (ihe iheVar4 : linkedHashSet) {
                iheVar4.getClass();
                iheVar4.d(iheVar4);
            }
        }
        Objects.requireNonNull(this.e);
        q40 q40Var2 = this.b;
        synchronized (q40Var2.b) {
            ((LinkedHashSet) q40Var2.c).add(this);
            ((LinkedHashSet) q40Var2.X).remove(this);
        }
        Iterator it2 = q40Var2.h().iterator();
        while (it2.hasNext() && (iheVar2 = (ihe) it2.next()) != this) {
            jhe jheVar2 = (jhe) iheVar2;
            synchronized (jheVar2.a) {
                try {
                    List list = jheVar2.j;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((xf4) it3.next()).b();
                        }
                        jheVar2.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            jheVar2.t.d();
        }
        this.e.e(jheVar);
        if (((CaptureSessionOnClosedNotCalledQuirk) fd7Var.a) != null) {
            LinkedHashSet<ihe> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayListE.iterator();
            while (it4.hasNext() && (iheVar = (ihe) it4.next()) != jheVar) {
                linkedHashSet2.add(iheVar);
            }
            for (ihe iheVar5 : linkedHashSet2) {
                iheVar5.getClass();
                iheVar5.c(iheVar5);
            }
        }
    }

    @Override // defpackage.ihe
    public final int i(ArrayList arrayList, qt1 qt1Var) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.t.a(qt1Var);
        c54.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ph4) this.f.a).a).captureBurstRequests(arrayList, this.c, captureCallbackA);
    }

    @Override // defpackage.ihe
    public final void j() throws CameraAccessException {
        if (this.v.compareAndSet(false, true)) {
            if (this.u.b) {
                try {
                    c54.o(this.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ph4) this.f.a).a).abortCaptures();
                } catch (Exception e) {
                    e.toString();
                }
            }
            this.t.c().d(new u3c(26, this), this.c);
        }
    }

    @Override // defpackage.ihe
    public final bm7 m(CameraDevice cameraDevice, had hadVar, List list) {
        bm7 bm7VarW;
        synchronized (this.o) {
            try {
                ArrayList arrayListE = this.b.e();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    jhe jheVar = (jhe) ((ihe) it.next());
                    arrayList.add(f8.g(new x72(jheVar.t.c(), jheVar.n, 1500L, 7)));
                }
                nl7 nl7VarJ = kq0.J(arrayList);
                this.q = nl7VarJ;
                b76 b76VarA = b76.a(nl7VarJ);
                of4 of4Var = new of4(this, cameraDevice, hadVar, list);
                Executor executor = this.c;
                b76VarA.getClass();
                bm7VarW = kq0.w(kq0.K(b76VarA, of4Var, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
        return bm7VarW;
    }

    @Override // defpackage.ihe
    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackA = this.t.a(captureCallback);
        c54.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ph4) this.f.a).a).setSingleRepeatingRequest(captureRequest, this.c, captureCallbackA);
    }

    @Override // defpackage.ihe
    public final bm7 o(ArrayList arrayList) {
        bm7 bm7VarO;
        synchronized (this.o) {
            this.p = arrayList;
            bm7VarO = super.o(arrayList);
        }
        return bm7VarO;
    }

    @Override // defpackage.ihe
    public final boolean p() {
        boolean z;
        synchronized (this.o) {
            try {
                if (l()) {
                    this.r.b(this.p);
                } else {
                    nl7 nl7Var = this.q;
                    if (nl7Var != null) {
                        nl7Var.cancel(true);
                    }
                }
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.l) {
                                b76 b76Var = this.i;
                                b76Var = b76Var != null ? b76Var : null;
                                this.l = true;
                            }
                            z = !l();
                        } finally {
                        }
                    }
                } finally {
                    if (b76Var != null) {
                        b76Var.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
