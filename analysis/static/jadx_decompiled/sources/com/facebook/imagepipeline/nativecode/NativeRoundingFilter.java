package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.hm9;
import defpackage.pm4;

@pm4
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        hm9.M("native-filters");
    }

    @pm4
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @pm4
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @pm4
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @pm4
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @pm4
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @pm4
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
