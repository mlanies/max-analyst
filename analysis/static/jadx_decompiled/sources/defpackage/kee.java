package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kee implements Closeable {
    public final float[] X;
    public tj3 Y;
    public Executor Z;
    public final Surface b;
    public final int c;
    public final Size o;
    public final oq1 u0;
    public lq1 v0;
    public final Object a = new Object();
    public boolean s0 = false;
    public boolean t0 = false;

    public kee(Surface surface, int i, Size size, yb0 yb0Var, yb0 yb0Var2) {
        float[] fArr = new float[16];
        this.X = fArr;
        this.b = surface;
        this.c = i;
        this.o = size;
        a(fArr, new float[16], yb0Var);
        a(new float[16], new float[16], yb0Var2);
        this.u0 = f8.g(new bqc(24, this));
    }

    public static void a(float[] fArr, float[] fArr2, yb0 yb0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (yb0Var == null) {
            return;
        }
        a14.G(fArr);
        int i = yb0Var.d;
        a14.F(fArr, i);
        boolean z = yb0Var.e;
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = e1f.g(yb0Var.a, i);
        float f = 0;
        android.graphics.Matrix matrixA = e1f.a(new RectF(f, f, r6.getWidth(), r6.getHeight()), new RectF(f, f, sizeG.getWidth(), sizeG.getHeight()), i, z);
        RectF rectF = new RectF(yb0Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        a14.G(fArr2);
        ax1 ax1Var = yb0Var.c;
        if (ax1Var != null) {
            c54.p("Camera has no transform.", ax1Var.n());
            a14.F(fArr2, ax1Var.p().b());
            if (ax1Var.d()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.t0) {
                    this.t0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v0.b(null);
    }

    public final Surface d(zh6 zh6Var, tj3 tj3Var) {
        boolean z;
        synchronized (this.a) {
            this.Z = zh6Var;
            this.Y = tj3Var;
            z = this.s0;
        }
        if (z) {
            m();
        }
        return this.b;
    }

    public final void m() {
        Executor executor;
        tj3 tj3Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.Z == null || (tj3Var = this.Y) == null) {
                    this.s0 = true;
                } else if (!this.t0) {
                    atomicReference.set(tj3Var);
                    executor = this.Z;
                    this.s0 = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new flc(this, 22, atomicReference));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void n(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.X, 0);
    }
}
