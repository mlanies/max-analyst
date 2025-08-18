package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ce4 implements lee, SurfaceTexture.OnFrameAvailableListener {
    public final AtomicBoolean X;
    public final float[] Y;
    public final float[] Z;
    public final zm4 a;
    public final HandlerThread b;
    public final zh6 c;
    public final Handler o;
    public final LinkedHashMap s0;
    public int t0;
    public boolean u0;
    public final ArrayList v0;

    public ce4(eu4 eu4Var) {
        Map mapEmptyMap = Collections.emptyMap();
        this.X = new AtomicBoolean(false);
        this.Y = new float[16];
        this.Z = new float[16];
        this.s0 = new LinkedHashMap();
        this.t0 = 0;
        this.u0 = false;
        this.v0 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new zh6(handler);
        this.a = new zm4();
        try {
            try {
                f8.g(new u00(this, eu4Var, mapEmptyMap, 5)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // defpackage.lee
    public final void a(see seeVar) {
        if (this.X.get()) {
            seeVar.d();
        } else {
            e(new wt1(this, 25, seeVar), new ae4(seeVar, 0));
        }
    }

    @Override // defpackage.lee
    public final bm7 b(int i, int i2) {
        return kq0.w(f8.g(new a74(i, i2, this)));
    }

    @Override // defpackage.lee
    public final void c(kee keeVar) {
        if (this.X.get()) {
            keeVar.close();
            return;
        }
        wt1 wt1Var = new wt1(this, 24, keeVar);
        Objects.requireNonNull(keeVar);
        e(wt1Var, new dd4(1, keeVar));
    }

    public final void d() {
        if (this.u0 && this.t0 == 0) {
            LinkedHashMap linkedHashMap = this.s0;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((kee) it.next()).close();
            }
            Iterator it2 = this.v0.iterator();
            while (it2.hasNext()) {
                ((ca0) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new f5(this, runnable2, runnable, 19));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.v0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ca0) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        a14.F(fArr2, i);
        a14.G(fArr2);
        Size sizeG = e1f.g(size, i);
        zm4 zm4Var = this.a;
        zm4Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        c54.j("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        c54.j("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = o76.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        o76.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        o76.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        o76.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        o76.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        o76.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        o76.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(36197, zm4Var.b);
        o76.b("glBindTexture");
        zm4Var.k = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        m76 m76Var = (m76) zm4Var.m;
        m76Var.getClass();
        if (m76Var instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76Var).f, 1, false, fArr2, 0);
            o76.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        o76.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        o76.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        o76.b("glDeleteFramebuffers");
        int i4 = zm4Var.b;
        GLES20.glActiveTexture(33984);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        o76.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(a3f a3fVar) throws IOException {
        ArrayList arrayList = this.v0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (a3fVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    ca0 ca0Var = (ca0) it.next();
                    int i3 = ca0Var.b;
                    if (i != i3 || bitmapG == null) {
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g((Size) a3fVar.b, (float[]) a3fVar.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = ca0Var.a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) a3fVar.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.f(byteArray, surface);
                    ca0Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.X.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.Y;
        surfaceTexture.getTransformMatrix(fArr);
        a3f a3fVar = null;
        for (Map.Entry entry : this.s0.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            kee keeVar = (kee) entry.getKey();
            float[] fArr2 = this.Z;
            keeVar.n(fArr2, fArr);
            int i = keeVar.c;
            if (i == 34) {
                try {
                    this.a.t(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException unused) {
                }
            } else {
                c54.p("Unsupported format: " + i, i == 256);
                c54.p("Only one JPEG output is supported.", a3fVar == null);
                a3fVar = new a3f(surface, keeVar.o, (float[]) fArr2.clone());
            }
        }
        try {
            h(a3fVar);
        } catch (RuntimeException e) {
            f(e);
        }
    }

    @Override // defpackage.lee
    public final void release() {
        if (this.X.getAndSet(true)) {
            return;
        }
        e(new dd4(2, this), new kc(5));
    }
}
