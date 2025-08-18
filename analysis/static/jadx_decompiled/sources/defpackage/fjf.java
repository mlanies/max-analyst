package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;
import one.me.sdk.gl.effects.objects.OesToImage2dRenderer;
import one.me.sdk.gl.effects.objects.TrivialFragmentShader;

/* loaded from: classes2.dex */
public final class fjf extends zm4 {
    public final Size o;
    public final String p;
    public b2e q;
    public OesToImage2dRenderer r;
    public TrivialFragmentShader s;
    public final float[] t;
    public long u;
    public int v;
    public m56 w;

    public fjf(Size size, eu4 eu4Var) {
        this.o = size;
        String name = fjf.class.getName();
        this.p = name;
        this.t = new float[16];
        this.v = -1;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init, previewSize=" + size + ", dynamicRange=" + eu4Var, null);
        }
        n(eu4Var, Collections.emptyMap());
    }

    @Override // defpackage.zm4
    public final void q() {
        hm9.m0(this.p, "release", new Object[0]);
        TrivialFragmentShader trivialFragmentShader = this.s;
        if (trivialFragmentShader != null) {
            trivialFragmentShader.release();
        }
        this.s = null;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer != null) {
            oesToImage2dRenderer.release();
        }
        this.r = null;
        b2e b2eVar = this.q;
        if (b2eVar != null) {
            hm9.m0(b2eVar.d, "release", new Object[0]);
            b2eVar.e.release();
            b2eVar.f.release();
        }
        this.q = null;
        this.w = null;
        super.q();
    }

    public final void w(SurfaceTexture surfaceTexture, Surface surface, float[] fArr, boolean z) throws IOException {
        FrameBuffer frameBuffer;
        TrivialFragmentShader trivialFragmentShader;
        m56 m56Var;
        db0 db0VarL = l(surface);
        if (db0VarL.equals(o76.j)) {
            db0VarL = h(surface);
            if (db0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, db0VarL);
            }
        }
        db0 db0Var = db0VarL;
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        int i = this.b;
        long timestamp = surfaceTexture.getTimestamp();
        b2e b2eVar = this.q;
        if (b2eVar == null) {
            b2eVar = new b2e(this.o);
            this.q = b2eVar;
        }
        b2e b2eVar2 = b2eVar;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer == null) {
            oesToImage2dRenderer = new OesToImage2dRenderer();
            this.r = oesToImage2dRenderer;
        }
        TrivialFragmentShader trivialFragmentShader2 = this.s;
        if (trivialFragmentShader2 == null) {
            trivialFragmentShader2 = new TrivialFragmentShader(0, false);
            this.s = trivialFragmentShader2;
        }
        TrivialFragmentShader trivialFragmentShader3 = trivialFragmentShader2;
        long j = this.u;
        FrameBuffer frameBuffer2 = b2eVar2.f;
        float[] fArr2 = this.t;
        if (timestamp == j && i == this.v && Arrays.equals(fArr, fArr2)) {
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
        } else {
            frameBuffer2.bind();
            GLES20.glViewport(0, 0, b2eVar2.b, b2eVar2.c);
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
            OesToImage2dRenderer.render$default(oesToImage2dRenderer, i, fArr, null, 4, null);
            frameBuffer.unbind();
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.u = timestamp;
            this.v = i;
        }
        int textureId = frameBuffer.getTextureId();
        Size size = b2eVar2.a;
        int width = size.getWidth();
        int height = size.getHeight();
        VideoMessageStencilHolder videoMessageStencilHolder = b2eVar2.e;
        int i2 = db0Var.b;
        int i3 = db0Var.c;
        videoMessageStencilHolder.render(textureId, width, height, i2, i3, !z, false);
        boolean zF = tpa.f((Surface) this.k, surface);
        EGLSurface eGLSurface = db0Var.a;
        if (!zF) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glViewport(0, 0, i2, i3);
        TrivialFragmentShader trivialFragmentShader4 = trivialFragmentShader;
        trivialFragmentShader4.setTextureId(frameBuffer.getTextureId());
        trivialFragmentShader4.render();
        if (this.w != null) {
            int textureId2 = frameBuffer.getTextureId();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
            GLES20.glViewport(0, 0, i2, i3);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.scaleM(fArr3, 0, 1.0f, -1.0f, 1.0f);
            FrameBuffer frameBuffer3 = new FrameBuffer(i2, i3);
            TrivialFragmentShader trivialFragmentShader5 = new TrivialFragmentShader(0, false);
            trivialFragmentShader5.setTextureId(textureId2);
            trivialFragmentShader5.setMVPMat(fArr3);
            frameBuffer3.bind();
            trivialFragmentShader5.render();
            GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
            frameBuffer3.unbind();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, i2 * 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null && (m56Var = this.w) != null) {
                    m56Var.invoke(byteArray);
                }
                this.w = null;
            } finally {
                bitmapCreateBitmap.recycle();
                byteArrayOutputStream.close();
                frameBuffer3.release();
                trivialFragmentShader5.release();
            }
        }
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, timestamp);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        int iEglGetError = EGL14.eglGetError();
        nd7.e(16);
        hm9.p(this.p, wg0.i("failed to swap buffers, error=0x", pag.N(16, iEglGetError & 4294967295L)), null);
        s(surface, false);
    }
}
