package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.CancellationSignal;
import android.view.Surface;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;

/* loaded from: classes.dex */
public final class ey3 extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey3(Object obj, int i, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        switch (this.a) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((x77) this.c).cancel(null);
                return e5f.a;
            case 1:
                fpd fpdVar = (fpd) obj;
                sl1 sl1Var = (sl1) this.b;
                boolean zA = sl1Var.b.a.a();
                zad zadVar = (zad) this.c;
                kg1 kg1Var = sl1Var.b;
                if (zA || tpa.f(kg1Var.k, zadVar)) {
                    eqa eqaVar = fpdVar.a;
                    kg1Var.g(zadVar, eqaVar.a);
                    for (dg1 dg1Var : eqaVar.b) {
                        sl1Var.e.n.onStateChanged(dg1Var.b, dg1Var);
                    }
                }
                return e5f.a;
            case 2:
                ((uf0) this.b).d.b((a4c) this.c, "P2PNetworkStatusReporter", (String) obj);
                return e5f.a;
            default:
                me1 me1Var = (me1) obj;
                ne1 ne1Var = (ne1) this.b;
                me1Var.e(ne1Var.a);
                Surface surface = (Surface) this.c;
                EGLSurface eGLSurfaceEglCreateWindowSurface = null;
                if (surface.isValid() && (eGLDisplay = me1Var.e) != null && (eGLConfig = me1Var.f) != null) {
                    eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurfaceEglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                    me1Var.b(eGLSurfaceEglCreateWindowSurface);
                    GLES20.glPixelStorei(3317, 1);
                    me1Var.a.log(me1Var.j, zr6.h(me1.l.incrementAndGet(), "Surface created, total count is "));
                }
                ne1Var.a = eGLSurfaceEglCreateWindowSurface;
                return e5f.a;
        }
    }
}
