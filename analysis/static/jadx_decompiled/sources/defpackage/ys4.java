package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ys4 implements go0 {
    @Override // defpackage.pic
    public final void e(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.l5b
    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }
}
