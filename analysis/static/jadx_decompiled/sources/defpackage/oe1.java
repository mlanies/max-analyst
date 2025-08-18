package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* loaded from: classes2.dex */
public final class oe1 {
    public final a4c a;
    public final EglBase.Context b;
    public final re c;
    public final String d;
    public final me1 e;
    public final Matrix f;
    public final VideoFrameDrawer g;
    public final GlRectDrawer h;
    public final ArrayList i;

    public oe1(a4c a4cVar, EglBase.Context context, int[] iArr, String str) {
        this.a = a4cVar;
        this.b = context;
        this.d = wg0.i("CallOpenGL_renderer_", str);
        me1 me1Var = new me1(a4cVar, ((EglBase14.Context) context).getRawContext(), iArr, new om8(1, this, oe1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0, 29), str);
        this.e = me1Var;
        this.f = new Matrix();
        this.g = new VideoFrameDrawer();
        this.h = new GlRectDrawer();
        this.i = new ArrayList();
        re reVar = new re(7, this);
        try {
            me1Var.k.postDelayed(reVar, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } catch (IllegalStateException e) {
            me1Var.a.reportException(me1Var.j, "OpenGL tread died, is it fine?", e);
        }
        this.c = reVar;
    }

    public final void a() {
        me1 me1Var = this.e;
        me1Var.a.log(me1Var.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (me1Var.h) {
            if (me1Var.i) {
                me1Var.i = false;
                me1Var.k.postAtFrontOfQueue(new c(me1Var, 15, countDownLatch));
                me1Var.a.log(me1Var.j, "Release action submitted");
            } else {
                me1Var.a.log(me1Var.j, "Already released, ignore");
                countDownLatch.countDown();
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void b(me1 me1Var, cp1 cp1Var, VideoFrame videoFrame, sh1 sh1Var) {
        EGLSurface eGLSurface = cp1Var.a;
        if (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        me1Var.b(eGLSurface);
        me1.a("makeCurrent()");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        Matrix matrix = this.f;
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(sh1Var.c ? -1.0f : 1.0f, 1.0f);
        matrix.preScale(sh1Var.a, sh1Var.b);
        matrix.preTranslate(-0.5f, -0.5f);
        RendererCommon.GlDrawer glDrawer = cp1Var.k;
        if (glDrawer == null) {
            glDrawer = this.h;
        }
        RendererCommon.GlDrawer glDrawer2 = glDrawer;
        EGLDisplay eGLDisplay = me1Var.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        int i = iArr[0];
        EGLDisplay eGLDisplay2 = me1Var.e;
        if (eGLDisplay2 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr2 = new int[1];
        EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
        this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i, iArr2[0]);
        me1.a("drawFrame()");
        long jNanoTime2 = System.nanoTime();
        EGLDisplay eGLDisplay3 = me1Var.e;
        if (eGLDisplay3 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
        me1.a("swapBuffers()");
        long jNanoTime3 = System.nanoTime();
        dp1 dp1Var = cp1Var.l;
        dp1Var.h += jNanoTime3 - jNanoTime;
        dp1Var.i += jNanoTime3 - jNanoTime2;
        me1.a("swapBuffers()");
    }
}
