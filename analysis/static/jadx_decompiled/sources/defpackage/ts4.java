package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ts4 extends zm4 {
    public int o = -1;
    public int p = -1;
    public final ge7 q;
    public final ge7 r;

    public ts4(ge7 ge7Var, ge7 ge7Var2) {
        this.q = ge7Var;
        this.r = ge7Var2;
    }

    @Override // defpackage.zm4
    public final na0 n(eu4 eu4Var, Map map) {
        na0 na0VarN = super.n(eu4Var, map);
        this.o = o76.g();
        this.p = o76.g();
        return na0VarN;
    }

    @Override // defpackage.zm4
    public final void q() {
        super.q();
        this.o = -1;
        this.p = -1;
    }

    public final void w(long j, Surface surface, kee keeVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        db0 db0VarL = l(surface);
        if (db0VarL == o76.j) {
            db0VarL = h(surface);
            if (db0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, db0VarL);
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = db0VarL.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        db0 db0Var = db0VarL;
        x(db0Var, keeVar, surfaceTexture, this.q, this.o);
        x(db0Var, keeVar, surfaceTexture2, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        s(surface, false);
    }

    public final void x(db0 db0Var, kee keeVar, SurfaceTexture surfaceTexture, ge7 ge7Var, int i) {
        v(i);
        int i2 = db0Var.b;
        int i3 = db0Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        keeVar.n(fArr2, fArr);
        m76 m76Var = (m76) this.m;
        m76Var.getClass();
        if (m76Var instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76Var).f, 1, false, fArr2, 0);
            o76.b("glUniformMatrix4fv");
        }
        int i4 = (int) (i2 * ge7Var.d);
        float f = ge7Var.e;
        Size size = new Size(i4, (int) (i3 * f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, ge7Var.b / ge7Var.d, ge7Var.c / f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(m76Var.b, 1, false, fArr5, 0);
        o76.b("glUniformMatrix4fv");
        GLES20.glUniform1f(m76Var.c, ge7Var.a);
        o76.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
