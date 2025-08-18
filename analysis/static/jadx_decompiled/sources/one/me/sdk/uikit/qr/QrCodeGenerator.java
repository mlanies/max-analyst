package one.me.sdk.uikit.qr;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import defpackage.hm9;
import defpackage.jqb;
import defpackage.oq9;
import defpackage.tu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0083 ¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/qr/QrCodeGenerator;", "", "", "content", "logo", "", "size", "", "coordinates", "nativeGenerateQR", "(Ljava/lang/String;Ljava/lang/String;I[I)[I", "svg", "width", "height", "nativeRenderSvg", "(Ljava/lang/String;II)[I", "qr_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class QrCodeGenerator {
    public static final oq9 a = jqb.a;
    public static final boolean b;

    static {
        boolean z;
        try {
            System.loadLibrary("qrcode");
            z = true;
        } catch (Throwable th) {
            a.getClass();
            hm9.p("QrCodeGenerator", "Failed to load native library qrcode", th);
            z = false;
        }
        b = z;
    }

    public static Bitmap a(String str, int i, int i2, Bitmap bitmap) {
        int iSqrt;
        int iF;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap2 = null;
        int[] iArr = new int[4];
        int[] iArrNativeGenerateQR = nativeGenerateQR(str, bitmap != null ? "" : null, i, iArr);
        if (iArrNativeGenerateQR != null) {
            try {
                iSqrt = (int) Math.sqrt(iArrNativeGenerateQR.length);
                iF = tu0.F(iSqrt * 0.87d);
                bitmapCreateBitmap = Bitmap.createBitmap(iSqrt, iSqrt, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmapCreateBitmap.setPixels(iArrNativeGenerateQR, 0, iSqrt, 0, 0, iSqrt, iSqrt);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iF, iF, false);
            } catch (Throwable th2) {
                th = th2;
                bitmap2 = bitmapCreateBitmap;
                hm9.p(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                return bitmap2;
            }
        } else {
            bitmapCreateScaledBitmap = null;
            iSqrt = i;
            iF = iSqrt;
        }
        try {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iSqrt, iSqrt, bitmapCreateScaledBitmap.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            Path path = new Path();
            float f = i2;
            path.addRoundRect(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), f, f, Path.Direction.CW);
            float f2 = (iSqrt - iF) / 2.0f;
            canvas.clipPath(path);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmapCreateScaledBitmap, f2, f2, (Paint) null);
            if (bitmap != null) {
                Paint paint = new Paint(2);
                paint.setAntiAlias(true);
                Rect rect = new Rect();
                int i3 = iArr[0];
                rect.left = i3;
                int i4 = iArr[1];
                rect.top = i4;
                rect.bottom = i4 + iArr[2];
                rect.right = i3 + iArr[3];
                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            }
            bitmapCreateScaledBitmap.recycle();
            return bitmapCreateBitmap2;
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmapCreateScaledBitmap;
            hm9.p(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
            return bitmap2;
        }
    }

    private static final native int[] nativeGenerateQR(String content, String logo, int size, int[] coordinates);

    public static final native int[] nativeRenderSvg(String svg, int width, int height);
}
