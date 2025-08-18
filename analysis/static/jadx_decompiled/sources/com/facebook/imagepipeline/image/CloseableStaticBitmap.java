package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import defpackage.l43;
import defpackage.o43;
import defpackage.pic;
import defpackage.pqb;
import defpackage.ru6;
import defpackage.w84;
import java.util.Map;

/* loaded from: classes.dex */
public interface CloseableStaticBitmap extends l43 {
    static CloseableStaticBitmap of(Bitmap bitmap, pic picVar, pqb pqbVar, int i) {
        return of(bitmap, picVar, pqbVar, i, 0);
    }

    o43 cloneUnderlyingBitmapReference();

    @Override // defpackage.l43, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    o43 convertToBitmapReference();

    int getExifOrientation();

    @Override // defpackage.ru6, com.facebook.fresco.middleware.HasExtraData
    /* synthetic */ Map getExtras();

    @Override // defpackage.l43, defpackage.ru6
    /* synthetic */ int getHeight();

    @Override // defpackage.l43
    /* synthetic */ ru6 getImageInfo();

    @Override // defpackage.l43
    /* synthetic */ pqb getQualityInfo();

    int getRotationAngle();

    @Override // defpackage.l43
    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    @Override // defpackage.l43, defpackage.ru6
    /* synthetic */ int getWidth();

    @Override // defpackage.l43
    /* synthetic */ boolean isClosed();

    @Override // defpackage.l43
    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(o43 o43Var, pqb pqbVar, int i) {
        return of(o43Var, pqbVar, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, pic picVar, pqb pqbVar, int i, int i2) {
        int i3 = w84.t0;
        return new w84(bitmap, picVar, pqbVar, i, i2);
    }

    static CloseableStaticBitmap of(o43 o43Var, pqb pqbVar, int i, int i2) {
        int i3 = w84.t0;
        return new w84(o43Var, pqbVar, i, i2);
    }
}
