package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
public final class ere {
    public final FloatBuffer a;
    public final float[] c;
    public int i;
    public int k;
    public int l;
    public int m;
    public int n;
    public final float s;
    public final boolean w;
    public final float[] b = new float[16];
    public final float[] d = new float[16];
    public final float[] e = new float[16];
    public final float[] f = new float[16];
    public final float[] g = new float[16];
    public float[] h = new float[16];
    public int j = -12345;
    public final int o = 0;
    public final int p = 0;
    public final int q = 0;
    public final float r = 1.0f;
    public final float t = 0.0f;
    public final float u = 0.0f;
    public final boolean v = false;

    public ere(float f, boolean z) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.s = f;
        this.w = z;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public static int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final void b(SurfaceTexture surfaceTexture, int i) {
        a("onDrawFrame start");
        int i2 = this.p;
        int i3 = this.o;
        boolean z = this.v;
        if (z) {
            GLES20.glViewport(0, 0, i3, i2);
        }
        float[] fArr = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
        if (this.w) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.i);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i, this.j);
        FloatBuffer floatBuffer = this.a;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.m, 3, 5126, false, 20, (Buffer) this.a);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.m);
        a("glEnableVertexAttribArray maPositionHandle");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(this.n, 2, 5126, false, 20, (Buffer) this.a);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.n);
        a("glEnableVertexAttribArray maTextureHandle");
        float[] fArr2 = this.b;
        Matrix.setIdentityM(fArr2, 0);
        float f = this.r;
        int i4 = this.q;
        float f2 = this.s;
        if (z) {
            float[] fArr3 = this.d;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = this.f;
            Matrix.setIdentityM(fArr4, 0);
            Matrix.setIdentityM(this.e, 0);
            float[] fArr5 = this.g;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM(this.h, 0);
            float f3 = i3 / i2;
            Matrix.orthoM(this.b, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
            Matrix.translateM(fArr5, 0, this.t, this.u, 0.0f);
            float[] fArr6 = (float[]) fArr3.clone();
            this.h = fArr6;
            Matrix.multiplyMM(this.d, 0, fArr6, 0, this.g, 0);
            Matrix.setRotateM(this.e, 0, i4, 0.0f, 0.0f, -1.0f);
            float[] fArr7 = (float[]) fArr3.clone();
            this.h = fArr7;
            Matrix.multiplyMM(this.d, 0, fArr7, 0, this.e, 0);
            Matrix.scaleM(fArr4, 0, f, f2, 1.0f);
            float[] fArr8 = (float[]) fArr3.clone();
            this.h = fArr8;
            Matrix.multiplyMM(this.d, 0, fArr8, 0, this.f, 0);
            float[] fArr9 = (float[]) fArr2.clone();
            this.h = fArr9;
            Matrix.multiplyMM(this.b, 0, fArr9, 0, this.d, 0);
        } else {
            if (i4 != 0) {
                Matrix.setRotateM(this.b, 0, i4, 0.0f, 0.0f, -1.0f);
            }
            if (f != 1.0f || f2 != 1.0f) {
                Matrix.scaleM(fArr2, 0, f, f2, 1.0f);
            }
        }
        GLES20.glUniformMatrix4fv(this.k, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.l, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }
}
