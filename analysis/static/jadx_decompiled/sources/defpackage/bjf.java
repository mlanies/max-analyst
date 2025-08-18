package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Size;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bjf extends ffe implements a66 {
    public final /* synthetic */ Size X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjf(Size size, Continuation continuation) {
        super(2, continuation);
        this.X = size;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bjf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bjf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int width = this.X.getWidth();
        Path pathI = m6d.i("M328 164c0 90.446-73.554 164-164 164S0 254.446 0 164S73.554 0 164 0s164 73.554 164 164Z");
        RectF rectF = new RectF();
        pathI.computeBounds(rectF, true);
        float f = width;
        float fMax = f / Math.max(rectF.width(), rectF.height());
        Matrix matrix = new Matrix();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.postScale(fMax, fMax);
        float f2 = 2;
        matrix.postTranslate((f - (rectF.width() * fMax)) / f2, (f - (rectF.height() * fMax)) / f2);
        pathI.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setFlags(7);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        pathI.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawPath(pathI, paint);
        return bitmapCreateBitmap;
    }
}
