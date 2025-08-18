package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.hm9;
import defpackage.mv6;
import defpackage.od2;
import defpackage.pm4;

@pm4
/* loaded from: classes.dex */
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        int i = mv6.a;
        hm9.M("imagepipeline");
    }

    @pm4
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        od2.j(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        od2.j(Boolean.valueOf(bitmap.isMutable()));
        od2.j(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        od2.j(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @pm4
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
