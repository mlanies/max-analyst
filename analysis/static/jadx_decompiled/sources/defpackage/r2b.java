package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r2b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        a = iArr;
        try {
            iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
