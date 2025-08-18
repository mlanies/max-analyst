package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class qt6 implements pv6 {
    public ImageWriter X;
    public Matrix Z;
    public volatile int a;
    public volatile boolean c;
    public hqc o;
    public ByteBuffer s0;
    public ByteBuffer t0;
    public ByteBuffer u0;
    public ByteBuffer v0;
    public final Object w0;
    public boolean x0;
    public volatile int b = 1;
    public Rect Y = new Rect();

    public qt6() {
        new Rect();
        this.Z = new Matrix();
        new Matrix();
        this.w0 = new Object();
        this.x0 = true;
    }

    public abstract ov6 a(qv6 qv6Var);

    public final bm7 b(ov6 ov6Var) {
        int i = this.c ? this.a : 0;
        synchronized (this.w0) {
            try {
                if (this.c && i != 0) {
                    g(ov6Var, i);
                }
                if (this.c) {
                    d(ov6Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new dw6(1, new OperationCanceledException("No analyzer or executor currently set.".toString()));
    }

    public abstract void c();

    public final void d(ov6 ov6Var) {
        if (this.b != 1) {
            if (this.b == 2 && this.s0 == null) {
                this.s0 = ByteBuffer.allocateDirect(ov6Var.getHeight() * ov6Var.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.t0 == null) {
            this.t0 = ByteBuffer.allocateDirect(ov6Var.getHeight() * ov6Var.getWidth());
        }
        this.t0.position(0);
        if (this.u0 == null) {
            this.u0 = ByteBuffer.allocateDirect((ov6Var.getHeight() * ov6Var.getWidth()) / 4);
        }
        this.u0.position(0);
        if (this.v0 == null) {
            this.v0 = ByteBuffer.allocateDirect((ov6Var.getHeight() * ov6Var.getWidth()) / 4);
        }
        this.v0.position(0);
    }

    public abstract void e(ov6 ov6Var);

    @Override // defpackage.pv6
    public final void f(qv6 qv6Var) {
        try {
            ov6 ov6VarA = a(qv6Var);
            if (ov6VarA != null) {
                e(ov6VarA);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void g(ov6 ov6Var, int i) {
        hqc hqcVar = this.o;
        if (hqcVar == null) {
            return;
        }
        hqcVar.a();
        int width = ov6Var.getWidth();
        int height = ov6Var.getHeight();
        int iJ = this.o.j();
        int iM = this.o.m();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.o = new hqc(s36.k(i2, width, iJ, iM));
        if (this.b == 1) {
            ImageWriter imageWriter = this.X;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.X = ImageWriter.newInstance(this.o.getSurface(), this.o.m());
        }
    }
}
