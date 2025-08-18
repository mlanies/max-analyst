package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class rvd implements GLSurfaceView.Renderer, cna {
    public final float[] X;
    public final float[] Y;
    public float Z;
    public final xsc a;
    public final float[] o;
    public float s0;
    public final /* synthetic */ svd v0;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] t0 = new float[16];
    public final float[] u0 = new float[16];

    public rvd(svd svdVar, xsc xscVar) {
        this.v0 = svdVar;
        float[] fArr = new float[16];
        this.o = fArr;
        float[] fArr2 = new float[16];
        this.X = fArr2;
        float[] fArr3 = new float[16];
        this.Y = fArr3;
        this.a = xscVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.s0 = 3.1415927f;
    }

    @Override // defpackage.cna
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.o;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.s0 = f2;
        Matrix.setRotateM(this.X, 0, -this.Z, (float) Math.cos(f2), (float) Math.sin(this.s0), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objD;
        Object objD2;
        Object objD3;
        synchronized (this) {
            Matrix.multiplyMM(this.u0, 0, this.o, 0, this.Y, 0);
            Matrix.multiplyMM(this.t0, 0, this.X, 0, this.u0, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.t0, 0);
        xsc xscVar = this.a;
        float[] fArr = this.c;
        xscVar.getClass();
        GLES20.glClear(16384);
        wmd.h();
        if (xscVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = xscVar.u0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            wmd.h();
            if (xscVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(xscVar.Z, 0);
            }
            long timestamp = xscVar.u0.getTimestamp();
            due dueVar = xscVar.X;
            synchronized (dueVar) {
                objD = dueVar.d(timestamp, false);
            }
            Long l = (Long) objD;
            if (l != null) {
                w36 w36Var = xscVar.o;
                float[] fArr2 = xscVar.Z;
                long jLongValue = l.longValue();
                due dueVar2 = (due) w36Var.o;
                synchronized (dueVar2) {
                    objD3 = dueVar2.d(jLongValue, true);
                }
                float[] fArr3 = (float[]) objD3;
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    float[] fArr4 = (float[]) w36Var.c;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!w36Var.a) {
                        w36.h((float[]) w36Var.b, (float[]) w36Var.c);
                        w36Var.a = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) w36Var.b, 0, (float[]) w36Var.c, 0);
                }
            }
            due dueVar3 = xscVar.Y;
            synchronized (dueVar3) {
                objD2 = dueVar3.d(timestamp, true);
            }
            cob cobVar = (cob) objD2;
            if (cobVar != null) {
                dob dobVar = xscVar.c;
                dobVar.getClass();
                if (dob.b(cobVar)) {
                    dobVar.a = cobVar.c;
                    ty tyVar = cobVar.a.a[0];
                    ty tyVar2 = new ty();
                    float[] fArr5 = (float[]) tyVar.c;
                    tyVar2.a = fArr5.length / 3;
                    tyVar2.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr5.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr5).flip();
                    float[] fArr6 = (float[]) tyVar.o;
                    tyVar2.o = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    int i = tyVar.b;
                    if (i == 1) {
                        tyVar2.b = 5;
                    } else if (i != 2) {
                        tyVar2.b = 4;
                    } else {
                        tyVar2.b = 6;
                    }
                    dobVar.g = tyVar2;
                    if (!cobVar.d) {
                        ty tyVar3 = cobVar.b.a[0];
                        float[] fArr7 = (float[]) tyVar3.c;
                        int length2 = fArr7.length;
                        float[] fArr8 = (float[]) tyVar3.o;
                    }
                }
            }
        }
        Matrix.multiplyMM(xscVar.s0, 0, fArr, 0, xscVar.Z, 0);
        dob dobVar2 = xscVar.c;
        int i2 = xscVar.t0;
        float[] fArr9 = xscVar.s0;
        ty tyVar4 = (ty) dobVar2.g;
        if (tyVar4 == null) {
            return;
        }
        int i3 = dobVar2.a;
        GLES20.glUniformMatrix3fv(dobVar2.c, 1, false, i3 == 1 ? dob.j : i3 == 2 ? dob.k : dob.i, 0);
        GLES20.glUniformMatrix4fv(dobVar2.b, 1, false, fArr9, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(dobVar2.f, 0);
        wmd.h();
        GLES20.glVertexAttribPointer(dobVar2.d, 3, 5126, false, 12, (Buffer) tyVar4.c);
        wmd.h();
        GLES20.glVertexAttribPointer(dobVar2.e, 2, 5126, false, 8, (Buffer) tyVar4.o);
        wmd.h();
        GLES20.glDrawArrays(tyVar4.b, 0, tyVar4.a);
        wmd.h();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        svd svdVar = this.v0;
        svdVar.s0.post(new flc(svdVar, 21, this.a.a()));
    }
}
