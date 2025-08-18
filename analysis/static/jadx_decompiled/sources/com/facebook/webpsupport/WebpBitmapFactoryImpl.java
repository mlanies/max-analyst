package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import defpackage.j1e;
import defpackage.pm4;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@pm4
/* loaded from: classes.dex */
public class WebpBitmapFactoryImpl {
    @pm4
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        throw null;
    }

    @pm4
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @pm4
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f = i > 1 ? 1.0f / i : 1.0f;
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : i3 / i2;
    }

    @pm4
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        j1e.n();
        return originalDecodeByteArray(bArr, i, i2, options);
    }

    @pm4
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) throws IOException {
        Bitmap bitmapHookDecodeStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmapHookDecodeStream = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return bitmapHookDecodeStream;
    }

    @pm4
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        j1e.n();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek == -1) {
            Bitmap bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return bitmapHookDecodeStream;
        }
        InputStream fileInputStream = new FileInputStream(fileDescriptor);
        if (!fileInputStream.markSupported()) {
            fileInputStream = new BufferedInputStream(fileInputStream, 20);
        }
        try {
            fileInputStream.mark(20);
            if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                bArr = new byte[20];
            }
            try {
                fileInputStream.read(bArr, 0, 20);
                fileInputStream.reset();
            } catch (IOException unused) {
            }
            nativeSeek(fileDescriptor, jNativeSeek, true);
            Bitmap bitmapOriginalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            try {
                return bitmapOriginalDecodeFileDescriptor;
            } catch (Throwable unused2) {
                return bitmapOriginalDecodeFileDescriptor;
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (Throwable unused3) {
            }
        }
    }

    @pm4
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) throws Resources.NotFoundException, IOException {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmapHookDecodeResourceStream = null;
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmapHookDecodeResourceStream = hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmapHookDecodeResourceStream != null || options == null || options.inBitmap == null) {
            return bitmapHookDecodeResourceStream;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @pm4
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @pm4
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        j1e.n();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return originalDecodeStream(inputStream, rect, options);
    }

    @pm4
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @pm4
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @pm4
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @pm4
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @pm4
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @pm4
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @pm4
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @pm4
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @pm4
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @pm4
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @pm4
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @pm4
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @SuppressLint({"NewApi"})
    @pm4
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @pm4
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @pm4
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @pm4
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @pm4
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @pm4
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @pm4
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @pm4
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @pm4
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @pm4
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @pm4
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
