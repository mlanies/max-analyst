package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class rs0 extends mj0 implements go0 {
    public rs0(qq9 qq9Var, n5b n5bVar, rq9 rq9Var) {
        super(qq9Var, n5bVar, rq9Var);
        this.u0 = false;
        qq9Var.getClass();
        rq9Var.getClass();
    }

    @Override // defpackage.mj0
    public final Object a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // defpackage.mj0
    public final void c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // defpackage.mj0
    public final int f(int i) {
        return i;
    }

    @Override // defpackage.mj0
    public final int g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // defpackage.mj0
    public final int h(int i) {
        return i;
    }

    @Override // defpackage.mj0
    public final Object i(ps0 ps0Var) {
        Bitmap bitmap = (Bitmap) super.i(ps0Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // defpackage.mj0
    public final boolean k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
