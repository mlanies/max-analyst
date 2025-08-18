package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class tp0 extends nj0 {
    public static final /* synthetic */ int f = 0;
    public final cu6 c;
    public final int d;
    public final int e;

    public tp0(cu6 cu6Var, int i, int i2) {
        this.c = cu6Var;
        this.d = i;
        this.e = i2;
    }

    public static void e(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        return new tpd("radius=" + this.d + ",sampling=" + this.e);
    }

    @Override // defpackage.nj0
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3;
        Bitmap bitmapA;
        int i = this.e;
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth() / i, bitmap2.getHeight() / i, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f2 = 1.0f / i;
                canvas.scale(f2, f2);
                Paint paint = new Paint();
                paint.setFlags(2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                bitmapA = this.c.a(bitmapCreateBitmap, this.d);
            } catch (Throwable th) {
                th = th;
                bitmap3 = null;
                bitmapCreateScaledBitmap = bitmapCreateBitmap;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap3 = null;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmap.getWidth(), bitmap.getHeight(), true);
            bitmapA.recycle();
            super.d(bitmap, bitmapCreateScaledBitmap);
            e(bitmapA);
            e(bitmapCreateScaledBitmap);
        } catch (Throwable th3) {
            th = th3;
            bitmap3 = bitmapCreateScaledBitmap;
            bitmapCreateScaledBitmap = bitmapA;
            try {
                hm9.p("tp0", "process: failed to process blur", th);
                throw th;
            } catch (Throwable th4) {
                e(bitmapCreateScaledBitmap);
                e(bitmap3);
                throw th4;
            }
        }
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final String getName() {
        return tp0.class.getSimpleName();
    }
}
