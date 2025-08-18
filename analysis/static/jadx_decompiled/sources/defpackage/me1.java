package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* loaded from: classes2.dex */
public final class me1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final a4c a;
    public final m56 b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final jbg k;

    public me1(a4c a4cVar, EGLContext eGLContext, int[] iArr, om8 om8Var, String str) {
        this.a = a4cVar;
        this.b = om8Var;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        String str2 = str == null ? "CallOpenGL" : str;
        this.j = str2;
        handlerThread.start();
        jbg jbgVar = new jbg(handlerThread.getLooper(), a4cVar, str2.concat("_timings"), new om8(1, this, me1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 24));
        this.k = jbgVar;
        a4cVar.log(str2, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                a4cVar.log(str2, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            jbgVar.postAtFrontOfQueue(new f5(this, iArr, eGLContext, 9));
            a4cVar.log(str2, "OpenGL context initialization task submitted");
        }
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(iEglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContext$CallOpenGLContextException("Wrong surface in makeCurrent()");
        }
        EGLContext eGLContext = this.d;
        if (eGLContext == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        if (tpa.f(EGL14.eglGetCurrentContext(), this.d) && tpa.f(this.g, eGLSurface)) {
            return;
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
        }
        this.g = eGLSurface;
    }

    public final boolean c(m56 m56Var) {
        try {
            return this.k.post(new le1(m56Var, this, 0));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final boolean d(m56 m56Var) {
        try {
            return this.k.postAtFrontOfQueue(new le1(m56Var, this, 1));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final void e(EGLSurface eGLSurface) {
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        this.a.log(this.j, "Surface destroyed, total count is " + l.decrementAndGet());
    }
}
