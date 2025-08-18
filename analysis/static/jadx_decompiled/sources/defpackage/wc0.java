package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes2.dex */
public final class wc0 extends nj0 {
    @Override // defpackage.nj0, defpackage.q6b
    public final o43 a(Bitmap bitmap, s2b s2bVar) {
        o43 o43VarC = s2bVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = (Bitmap) o43VarC.e0();
        bo0 bo0Var = qjd.a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, qjd.b, null);
        int iMin = Math.min(width, height) / 2;
        Path pathB = qjd.b(iMin, 4.0d);
        Matrix matrix = new Matrix();
        float f = iMin;
        matrix.postTranslate((width / 2.0f) - f, (height / 2.0f) - f);
        pathB.transform(matrix);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        pathB.setFillType(Path.FillType.INVERSE_WINDING);
        canvas.drawPath(pathB, paint);
        return o43VarC;
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        return new tpd("AvatarAsSquirclePostProcessor");
    }
}
