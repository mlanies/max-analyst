package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rv1 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                ihe iheVar = (ihe) this.b;
                iheVar.k(cameraCaptureSession);
                iheVar.a((jhe) iheVar);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                break;
            case 1:
                ihe iheVar = (ihe) this.b;
                iheVar.k(cameraCaptureSession);
                iheVar.b((jhe) iheVar);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                ihe iheVar = (ihe) this.b;
                iheVar.k(cameraCaptureSession);
                iheVar.c(iheVar);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        lq1 lq1Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((ihe) this.b).k(cameraCaptureSession);
                    ihe iheVar = (ihe) this.b;
                    iheVar.d(iheVar);
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe iheVar2 = (ihe) this.b;
                        lq1Var = iheVar2.h;
                        iheVar2.h = null;
                    }
                    lq1Var.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe iheVar3 = (ihe) this.b;
                        lq1 lq1Var2 = iheVar3.h;
                        iheVar3.h = null;
                        lq1Var2.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        lq1 lq1Var;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((ihe) this.b).k(cameraCaptureSession);
                    ihe iheVar = (ihe) this.b;
                    iheVar.e((jhe) iheVar);
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe iheVar2 = (ihe) this.b;
                        lq1Var = iheVar2.h;
                        iheVar2.h = null;
                    }
                    lq1Var.b(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe iheVar3 = (ihe) this.b;
                        lq1 lq1Var2 = iheVar3.h;
                        iheVar3.h = null;
                        lq1Var2.b(null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((mag) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                ihe iheVar = (ihe) this.b;
                iheVar.k(cameraCaptureSession);
                iheVar.f((jhe) iheVar);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                ihe iheVar = (ihe) this.b;
                iheVar.k(cameraCaptureSession);
                iheVar.h((jhe) iheVar, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public rv1(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof sv1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
