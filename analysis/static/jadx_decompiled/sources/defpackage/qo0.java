package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class qo0 {
    public static final khe a = new khe(new m(21));

    public static final h7b a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        khe kheVar = a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((v5b) kheVar.getValue()).f();
        if (byteBufferAllocate == null) {
            yu0 yu0Var = f54.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new h7b(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((v5b) kheVar.getValue()).e(byteBufferAllocate);
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : po0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(zr6.h(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(zr6.h(i2, "height must be > 0, height is: ").toString());
        }
        int iB = b(config);
        int i3 = i * i2 * iB;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbJ = wg0.j("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
        sbJ.append(i2);
        sbJ.append(", pixelSize: ");
        sbJ.append(iB);
        throw new IllegalStateException(sbJ.toString().toString());
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
