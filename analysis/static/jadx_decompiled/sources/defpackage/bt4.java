package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bt4 extends HandlerThread implements Handler.Callback {
    public Object X;
    public Surface Y;
    public final /* synthetic */ int a;
    public Handler b;
    public Error c;
    public RuntimeException o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt4(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) throws GlUtil$GlException {
        EGLConfig eGLConfig;
        int i2;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.a) {
            case 0:
                ((mu4) this.X).getClass();
                mu4 mu4Var = (mu4) this.X;
                mu4Var.getClass();
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == null) {
                    throw new EGLSurfaceTexture$GlException("eglGetDisplay failed");
                }
                int[] iArr3 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                    throw new EGLSurfaceTexture$GlException("eglInitialize failed");
                }
                mu4Var.o = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, mu4.s0, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (!zEglChooseConfig || iArr4[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                    int i3 = maf.a;
                    throw new EGLSurfaceTexture$GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLDisplay eGLDisplay = mu4Var.o;
                if (i == 0) {
                    i2 = 1;
                    iArr = new int[]{12440, 2, 12344};
                } else {
                    i2 = 1;
                    iArr = new int[]{12440, 2, 12992, 1, 12344};
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                if (eGLContextEglCreateContext == null) {
                    throw new EGLSurfaceTexture$GlException("eglCreateContext failed");
                }
                mu4Var.X = eGLContextEglCreateContext;
                EGLDisplay eGLDisplay2 = mu4Var.o;
                if (i == i2) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    if (i == 2) {
                        iArr2 = new int[7];
                        iArr2[0] = 12375;
                        iArr2[i2] = i2;
                        iArr2[2] = 12374;
                        iArr2[3] = i2;
                        iArr2[4] = 12992;
                        iArr2[5] = i2;
                        iArr2[6] = 12344;
                    } else {
                        iArr2 = new int[5];
                        iArr2[0] = 12375;
                        iArr2[i2] = i2;
                        iArr2[2] = 12374;
                        iArr2[3] = i2;
                        iArr2[4] = 12344;
                    }
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                    if (eGLSurfaceEglCreatePbufferSurface == null) {
                        throw new EGLSurfaceTexture$GlException("eglCreatePbufferSurface failed");
                    }
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                }
                if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eGLContextEglCreateContext)) {
                    throw new EGLSurfaceTexture$GlException("eglMakeCurrent failed");
                }
                mu4Var.Y = eGLSurface;
                int[] iArr5 = mu4Var.c;
                GLES20.glGenTextures(i2, iArr5, 0);
                wmd.h();
                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
                mu4Var.Z = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(mu4Var);
                SurfaceTexture surfaceTexture2 = ((mu4) this.X).Z;
                surfaceTexture2.getClass();
                this.Y = new ct4(this, surfaceTexture2, i != 0 ? i2 : 0);
                return;
            default:
                ((mu4) this.X).getClass();
                mu4 mu4Var2 = (mu4) this.X;
                mu4Var2.getClass();
                EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                mr0.g("eglGetDisplay failed", eGLDisplayEglGetDisplay2 != null);
                int[] iArr6 = new int[2];
                mr0.g("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay2, iArr6, 0, iArr6, 1));
                mu4Var2.o = eGLDisplayEglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr7 = new int[1];
                boolean zEglChooseConfig2 = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, mu4.t0, 0, eGLConfigArr2, 0, 1, iArr7, 0);
                boolean z = zEglChooseConfig2 && iArr7[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(zEglChooseConfig2), Integer.valueOf(iArr7[0]), eGLConfigArr2[0]};
                int i4 = oaf.a;
                mr0.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(mu4Var2.o, eGLConfig2, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                mr0.g("eglCreateContext failed", eGLContextEglCreateContext2 != null);
                mu4Var2.X = eGLContextEglCreateContext2;
                EGLDisplay eGLDisplay3 = mu4Var2.o;
                if (i == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay3, eGLConfig2, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    mr0.g("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface2 != null);
                    eGLSurface2 = eGLSurfaceEglCreatePbufferSurface2;
                }
                mr0.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface2, eGLSurface2, eGLContextEglCreateContext2));
                mu4Var2.Y = eGLSurface2;
                int[] iArr8 = mu4Var2.c;
                GLES20.glGenTextures(1, iArr8, 0);
                mr0.f();
                SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr8[0]);
                mu4Var2.Z = surfaceTexture3;
                surfaceTexture3.setOnFrameAvailableListener(mu4Var2);
                SurfaceTexture surfaceTexture4 = ((mu4) this.X).Z;
                surfaceTexture4.getClass();
                this.Y = new o2b(this, surfaceTexture4, i != 0);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        switch (this.a) {
            case 0:
                ((mu4) this.X).getClass();
                mu4 mu4Var = (mu4) this.X;
                mu4Var.b.removeCallbacks(mu4Var);
                try {
                    SurfaceTexture surfaceTexture = mu4Var.Z;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, mu4Var.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = mu4Var.o;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = mu4Var.o;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = mu4Var.Y;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(mu4Var.o, mu4Var.Y);
                    }
                    EGLContext eGLContext = mu4Var.X;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(mu4Var.o, eGLContext);
                    }
                    if (maf.a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = mu4Var.o;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(mu4Var.o);
                    }
                    mu4Var.o = null;
                    mu4Var.X = null;
                    mu4Var.Y = null;
                    mu4Var.Z = null;
                }
            default:
                ((mu4) this.X).getClass();
                mu4 mu4Var2 = (mu4) this.X;
                mu4Var2.b.removeCallbacks(mu4Var2);
                try {
                    SurfaceTexture surfaceTexture2 = mu4Var2.Z;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, mu4Var2.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = mu4Var2.o;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = mu4Var2.o;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = mu4Var2.Y;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(mu4Var2.o, mu4Var2.Y);
                    }
                    EGLContext eGLContext2 = mu4Var2.X;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(mu4Var2.o, eGLContext2);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay6 = mu4Var2.o;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(mu4Var2.o);
                    }
                    mu4Var2.o = null;
                    mu4Var2.X = null;
                    mu4Var2.Y = null;
                    mu4Var2.Z = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                try {
                    if (i == 1) {
                        try {
                            a(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e) {
                            fm9.c("Failed to initialize dummy surface", e);
                            this.c = e;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e2) {
                            fm9.c("Failed to initialize dummy surface", e2);
                            this.o = e2;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            default:
                int i2 = message.what;
                try {
                    if (i2 == 1) {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (GlUtil$GlException e3) {
                                z04.v("Failed to initialize placeholder surface", e3);
                                this.o = new IllegalStateException(e3);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e4) {
                            z04.v("Failed to initialize placeholder surface", e4);
                            this.c = e4;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e5) {
                            z04.v("Failed to initialize placeholder surface", e5);
                            this.o = e5;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i2 == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
        }
    }
}
