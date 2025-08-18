package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rz1 extends ghe {
    public final /* synthetic */ int a;
    public final Object b;

    public rz1(sz1 sz1Var) {
        this.a = 0;
        this.b = sz1Var;
    }

    private final void i(ihe iheVar) {
    }

    @Override // defpackage.ghe
    public void a(jhe jheVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((ph4) jheVar.q().a).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).a(jheVar);
                }
                break;
        }
    }

    @Override // defpackage.ghe
    public void b(jhe jheVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((ph4) jheVar.q().a).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).b(jheVar);
                }
                break;
        }
    }

    @Override // defpackage.ghe
    public void c(ihe iheVar) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((ph4) iheVar.q().a).a);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).c(iheVar);
                }
                break;
        }
    }

    @Override // defpackage.ghe
    public final void d(ihe iheVar) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        switch (au1.s(((sz1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((sz1) this.b).d();
                                break;
                        }
                        int i = ((sz1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((ph4) iheVar.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).d(iheVar);
                }
                return;
        }
    }

    @Override // defpackage.ghe
    public final void e(jhe jheVar) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        switch (au1.s(((sz1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                            case 3:
                                sz1 sz1Var = (sz1) this.b;
                                sz1Var.i = 5;
                                sz1Var.e = jheVar;
                                sz1Var.k(sz1Var.f);
                                sz1 sz1Var2 = (sz1) this.b;
                                sz1Var2.o.c().d(new cu1(8, sz1Var2), ju0.k());
                                break;
                            case 5:
                                ((sz1) this.b).e = jheVar;
                                break;
                            case 6:
                                jheVar.j();
                                break;
                        }
                        int i = ((sz1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((ph4) jheVar.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).e(jheVar);
                }
                return;
        }
    }

    @Override // defpackage.ghe
    public final void f(jhe jheVar) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        if (au1.s(((sz1) this.b).i) == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                        }
                        int i = ((sz1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((ph4) jheVar.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).f(jheVar);
                }
                return;
        }
    }

    @Override // defpackage.ghe
    public final void g(ihe iheVar) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        sz1 sz1Var = (sz1) this.b;
                        if (sz1Var.i == 1) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                        }
                        sz1Var.d();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).g(iheVar);
                }
                return;
        }
    }

    @Override // defpackage.ghe
    public void h(jhe jheVar, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((ph4) jheVar.q().a).a, surface);
                break;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).h(jheVar, surface);
                }
                break;
        }
    }

    public rz1(int i, List list) {
        Object rv1Var;
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                break;
            default:
                if (list.isEmpty()) {
                    rv1Var = new sv1();
                } else if (list.size() == 1) {
                    rv1Var = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    rv1Var = new rv1(list);
                }
                this.b = rv1Var;
                break;
        }
    }
}
