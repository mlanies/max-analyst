package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import defpackage.c54;
import defpackage.h06;
import defpackage.hqc;
import defpackage.ov6;
import defpackage.qv6;
import defpackage.ut6;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static ov6 a(hqc hqcVar, byte[] bArr) {
        c54.k(hqcVar.j() == 256);
        bArr.getClass();
        Surface surface = hqcVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return hqcVar.g();
    }

    public static Bitmap b(ov6 ov6Var) {
        if (ov6Var.k0() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = ov6Var.getWidth();
        int height = ov6Var.getHeight();
        int iA = ov6Var.v()[0].A();
        int iA2 = ov6Var.v()[1].A();
        int iA3 = ov6Var.v()[2].A();
        int iW = ov6Var.v()[0].w();
        int iW2 = ov6Var.v()[1].w();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ov6Var.getWidth(), ov6Var.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(ov6Var.v()[0].t(), iA, ov6Var.v()[1].t(), iA2, ov6Var.v()[2].t(), iA3, iW, iW2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static ut6 c(final ov6 ov6Var, qv6 qv6Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!(ov6Var.k0() == 35 && ov6Var.v().length == 3)) {
            return null;
        }
        System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            return null;
        }
        Surface surface = qv6Var.getSurface();
        int width = ov6Var.getWidth();
        int height = ov6Var.getHeight();
        int iA = ov6Var.v()[0].A();
        int iA2 = ov6Var.v()[1].A();
        int iA3 = ov6Var.v()[2].A();
        int iW = ov6Var.v()[0].w();
        int iW2 = ov6Var.v()[1].w();
        if (nativeConvertAndroid420ToABGR(ov6Var.v()[0].t(), iA, ov6Var.v()[1].t(), iA2, ov6Var.v()[2].t(), iA3, iW, iW2, surface, byteBuffer, width, height, z ? iW : 0, z ? iW2 : 0, z ? iW2 : 0, i) != 0) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            a++;
        }
        final ov6 ov6VarG = qv6Var.g();
        if (ov6VarG == null) {
            return null;
        }
        ut6 ut6Var = new ut6(ov6VarG);
        ut6Var.a(new h06() { // from class: nv6
            @Override // defpackage.h06
            public final void a(ov6 ov6Var2) throws Exception {
                ov6 ov6Var3;
                int i2 = ImageProcessingUtil.a;
                if (ov6VarG == null || (ov6Var3 = ov6Var) == null) {
                    return;
                }
                ov6Var3.close();
            }
        });
        return ut6Var;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
