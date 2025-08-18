package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class md3 implements yv6 {
    public static final md3 c = new md3(true, (int) (1 == true ? 1 : 0));
    public final boolean a;
    public final int b;

    public /* synthetic */ md3(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.yv6
    public String a() {
        return "SimpleImageTranscoder";
    }

    @Override // defpackage.yv6
    public fm5 b(g05 g05Var, rq8 rq8Var, anc ancVar, jic jicVar, ColorSpace colorSpace) throws Throwable {
        Bitmap bitmapCreateBitmap;
        fm5 fm5Var;
        Integer num = 85;
        anc ancVar2 = ancVar == null ? anc.b : ancVar;
        int iG = !this.a ? 1 : mqd.g(ancVar2, jicVar, g05Var, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iG;
        if (colorSpace != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        try {
            Matrix matrix = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(g05Var.n(), null, options);
            if (bitmapDecodeStream == null) {
                if (ta5.a.i(6)) {
                    ta5.a.e("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                }
                return new fm5(2, 7);
            }
            wz wzVar = r97.a;
            g05Var.o0();
            if (r97.a.contains(Integer.valueOf(g05Var.X))) {
                int iA = r97.a(ancVar2, g05Var);
                Matrix matrix2 = new Matrix();
                if (iA == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (iA == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int iB = r97.b(ancVar2, g05Var);
                if (iB != 0) {
                    matrix = new Matrix();
                    matrix.setRotate(iB);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix3, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    fm5Var = new fm5(2, 7);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return fm5Var;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), rq8Var);
                    fm5Var = new fm5(iG > 1 ? 0 : 1, 7);
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    fm5Var = new fm5(2, 7);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return fm5Var;
                }
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                return fm5Var;
            } catch (Throwable th2) {
                th = th2;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e3) {
            ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new fm5(2, 7);
        }
    }

    @Override // defpackage.yv6
    public boolean c(ou6 ou6Var) {
        return ou6Var == qb4.k || ou6Var == qb4.a;
    }

    @Override // defpackage.yv6
    public boolean d(g05 g05Var, anc ancVar, jic jicVar) {
        if (ancVar == null) {
            ancVar = anc.b;
        }
        return this.a && mqd.g(ancVar, jicVar, g05Var, this.b) > 1;
    }

    public md3(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
