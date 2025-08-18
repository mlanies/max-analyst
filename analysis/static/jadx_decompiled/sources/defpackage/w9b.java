package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w9b {
    public final Executor a;
    public ib0 b;
    public c32 c;
    public fd7 d;
    public kj6 e;
    public nd2 f;
    public o84 g;
    public sp3 h;
    public huc i;
    public final bj6 j;
    public final boolean k;

    public w9b(Executor executor) {
        bj6 bj6Var = wi4.a;
        if (wi4.a.e(LowMemoryQuirk.class) != null) {
            this.a = new q6d(executor);
        } else {
            this.a = executor;
        }
        this.j = bj6Var;
        this.k = bj6Var.d(IncorrectJpegMetadataQuirk.class);
    }

    public final eb0 a(eb0 eb0Var, int i) throws ImageCaptureException, IOException {
        c54.p(null, f46.V(eb0Var.c));
        this.f.getClass();
        byte[] bArr = (byte[]) eb0Var.a;
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(eb0Var.e, options);
            p55 p55Var = eb0Var.b;
            Objects.requireNonNull(p55Var);
            Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
            RectF rectF = e1f.a;
            Matrix matrix = new Matrix(eb0Var.g);
            matrix.postTranslate(-r3.left, -r3.top);
            Size size = new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
            pv1 pv1Var = eb0Var.h;
            if (pv1Var == null) {
                throw new NullPointerException("Null cameraCaptureResult");
            }
            this.e.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Objects.requireNonNull(p55Var);
            return new eb0(byteArray, p55Var, (Build.VERSION.SDK_INT < 34 || !on0.d(bitmapDecodeRegion)) ? 256 : 4101, size, rect, eb0Var.f, matrix, pv1Var);
        } catch (IOException e) {
            throw new ImageCaptureException("Failed to decode JPEG.", e);
        }
    }

    public final ov6 b(jb0 jb0Var) {
        x9b x9bVar = jb0Var.a;
        eb0 eb0Var = (eb0) this.c.mo131apply(jb0Var);
        if ((eb0Var.c == 35 || this.k) && this.b.d == 256) {
            eb0 eb0Var2 = (eb0) this.d.z(new qa0(eb0Var, x9bVar.d));
            this.h.getClass();
            Size size = eb0Var2.d;
            hqc hqcVar = new hqc(s36.k(size.getWidth(), size.getHeight(), 256, 2));
            ov6 ov6VarA = ImageProcessingUtil.a(hqcVar, (byte[]) eb0Var2.a);
            hqcVar.a();
            Objects.requireNonNull(ov6VarA);
            p55 p55Var = eb0Var2.b;
            Objects.requireNonNull(p55Var);
            i06 i06Var = (i06) ov6VarA;
            Size size2 = new Size(i06Var.getWidth(), i06Var.getHeight());
            i06Var.k0();
            eb0Var = new eb0(ov6VarA, p55Var, i06Var.k0(), size2, eb0Var2.e, eb0Var2.f, eb0Var2.g, eb0Var2.h);
        }
        this.g.getClass();
        ov6 ov6Var = (ov6) eb0Var.a;
        ecd ecdVar = new ecd(ov6Var, eb0Var.d, new ra0(ov6Var.getImageInfo().c(), ov6Var.getImageInfo().getTimestamp(), eb0Var.f, eb0Var.g));
        ecdVar.d(eb0Var.e);
        return ecdVar;
    }
}
