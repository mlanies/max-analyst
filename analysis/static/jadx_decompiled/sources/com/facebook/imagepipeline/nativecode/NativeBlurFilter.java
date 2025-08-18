package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.hm9;
import defpackage.pm4;

@pm4
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        hm9.M("native-filters");
    }

    @pm4
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
