package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public final class w84 extends ei0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int t0 = 0;
    public volatile Bitmap X;
    public final pqb Y;
    public final int Z;
    public o43 o;
    public final int s0;

    public w84(Bitmap bitmap, pic picVar, pqb pqbVar, int i, int i2) {
        bitmap.getClass();
        this.X = bitmap;
        Bitmap bitmap2 = this.X;
        picVar.getClass();
        this.o = o43.p0(bitmap2, picVar, o43.Y);
        this.Y = pqbVar;
        this.Z = i;
        this.s0 = i2;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized o43 cloneUnderlyingBitmapReference() {
        return o43.o(this.o);
    }

    @Override // defpackage.l43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o43 o43Var;
        synchronized (this) {
            o43Var = this.o;
            this.o = null;
            this.X = null;
        }
        if (o43Var != null) {
            o43Var.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized o43 convertToBitmapReference() {
        o43 o43Var;
        od2.o(this.o, "Cannot convert a closed static bitmap");
        synchronized (this) {
            o43Var = this.o;
            this.o = null;
            this.X = null;
        }
        return o43Var;
        return o43Var;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        ta5.m("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", w84.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getExifOrientation() {
        return this.s0;
    }

    @Override // defpackage.l43, defpackage.ru6
    public final int getHeight() {
        int i;
        if (this.Z % 180 != 0 || (i = this.s0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // defpackage.ei0, defpackage.l43
    public final pqb getQualityInfo() {
        return this.Y;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getRotationAngle() {
        return this.Z;
    }

    @Override // defpackage.l43
    public final int getSizeInBytes() {
        return qo0.d(this.X);
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final Bitmap getUnderlyingBitmap() {
        return this.X;
    }

    @Override // defpackage.l43, defpackage.ru6
    public final int getWidth() {
        int i;
        if (this.Z % 180 != 0 || (i = this.s0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // defpackage.l43
    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public w84(o43 o43Var, pqb pqbVar, int i, int i2) {
        o43 o43VarN = o43Var.n();
        o43VarN.getClass();
        this.o = o43VarN;
        this.X = (Bitmap) o43VarN.e0();
        this.Y = pqbVar;
        this.Z = i;
        this.s0 = i2;
    }
}
