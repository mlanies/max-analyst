package defpackage;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class r37 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 500;
    public final long c = System.currentTimeMillis();
    public final float o;
    public final float s0;
    public final float t0;
    public final boolean u0;

    public r37(t37 t37Var, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = new WeakReference(t37Var);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
        this.s0 = f5;
        this.t0 = f6;
        this.u0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t37 t37Var = (t37) this.a.get();
        if (t37Var == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        long j = this.b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float f2 = (fMin / f) - 1.0f;
        float f3 = (f2 * f2 * f2) + 1.0f;
        float f4 = (this.Y * f3) + 0.0f;
        float f5 = (f3 * this.Z) + 0.0f;
        float fI = pag.i(fMin, this.t0, f);
        if (fMin < f) {
            float[] fArr = t37Var.s0;
            t37Var.g(f4 - (fArr[0] - this.o), f5 - (fArr[1] - this.X));
            if (!this.u0) {
                float f6 = this.s0 + fI;
                RectF rectF = t37Var.C0;
                t37Var.j(f6, rectF.centerX(), rectF.centerY());
            }
            if (t37Var.i(t37Var.o)) {
                return;
            }
            t37Var.post(this);
        }
    }
}
