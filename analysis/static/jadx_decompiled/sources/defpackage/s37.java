package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class s37 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final float o;
    public final long c = System.currentTimeMillis();
    public final long b = 200;

    public s37(t37 t37Var, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(t37Var);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
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
        float fI = pag.i(fMin, this.X, f);
        if (fMin >= f) {
            t37Var.setImageToWrapCropBounds(true);
        } else {
            t37Var.j(this.o + fI, this.Y, this.Z);
            t37Var.post(this);
        }
    }
}
