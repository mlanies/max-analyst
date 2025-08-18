package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class ihe extends ghe {
    public final q40 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public ghe e;
    public fd7 f;
    public oq1 g;
    public lq1 h;
    public b76 i;
    public final Object a = new Object();
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public ihe(q40 q40Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = q40Var;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.ghe
    public final void a(jhe jheVar) {
        Objects.requireNonNull(this.e);
        this.e.a(jheVar);
    }

    @Override // defpackage.ghe
    public final void b(jhe jheVar) {
        Objects.requireNonNull(this.e);
        this.e.b(jheVar);
    }

    @Override // defpackage.ghe
    public abstract void c(ihe iheVar);

    @Override // defpackage.ghe
    public final void d(ihe iheVar) {
        ihe iheVar2;
        Objects.requireNonNull(this.e);
        jhe jheVar = (jhe) this;
        synchronized (jheVar.a) {
            try {
                List list = jheVar.j;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((xf4) it.next()).b();
                    }
                    jheVar.j = null;
                }
            } finally {
            }
        }
        jheVar.t.d();
        q40 q40Var = this.b;
        Iterator it2 = q40Var.h().iterator();
        while (it2.hasNext() && (iheVar2 = (ihe) it2.next()) != this) {
            jhe jheVar2 = (jhe) iheVar2;
            synchronized (jheVar2.a) {
                try {
                    List list2 = jheVar2.j;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((xf4) it3.next()).b();
                        }
                        jheVar2.j = null;
                    }
                } finally {
                }
            }
            jheVar2.t.d();
        }
        synchronized (q40Var.b) {
            ((LinkedHashSet) q40Var.X).remove(this);
        }
        this.e.d(iheVar);
    }

    @Override // defpackage.ghe
    public final void f(jhe jheVar) {
        Objects.requireNonNull(this.e);
        this.e.f(jheVar);
    }

    @Override // defpackage.ghe
    public final void g(ihe iheVar) {
        oq1 oq1Var;
        synchronized (this.a) {
            try {
                if (this.m) {
                    oq1Var = null;
                } else {
                    this.m = true;
                    c54.o(this.g, "Need to call openCaptureSession before using this API.");
                    oq1Var = this.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oq1Var != null) {
            oq1Var.b.d(new hhe(this, iheVar, 0), ju0.k());
        }
    }

    @Override // defpackage.ghe
    public final void h(jhe jheVar, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(jheVar, surface);
    }

    public abstract int i(ArrayList arrayList, qt1 qt1Var);

    public abstract void j();

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            fd7 fd7Var = new fd7();
            ph4 ph4Var = new ph4();
            cameraCaptureSession.getClass();
            ph4Var.a = cameraCaptureSession;
            ph4Var.b = null;
            fd7Var.a = ph4Var;
            this.f = fd7Var;
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.g != null;
        }
        return z;
    }

    public abstract bm7 m(CameraDevice cameraDevice, had hadVar, List list);

    public abstract int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    public bm7 o(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return new dw6(1, new CancellationException("Opener is disabled"));
                }
                b76 b76VarA = b76.a(f46.b0(arrayList, this.c, this.d));
                ypc ypcVar = new ypc(this, 8, arrayList);
                Executor executor = this.c;
                b76VarA.getClass();
                k12 k12VarK = kq0.K(b76VarA, ypcVar, executor);
                this.i = k12VarK;
                return kq0.w(k12VarK);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean p();

    public final fd7 q() {
        this.f.getClass();
        return this.f;
    }
}
