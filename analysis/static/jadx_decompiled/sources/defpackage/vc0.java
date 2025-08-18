package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes2.dex */
public final class vc0 extends nj0 {
    public final ai9 c = new ai9(1);
    public final Paint d;
    public final Matrix e;

    public vc0() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        this.e = new Matrix();
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final o43 a(Bitmap bitmap, s2b s2bVar) {
        int width = bitmap.getWidth() / 2;
        ai9 ai9Var = this.c;
        Object objC = ai9Var.c(width);
        Object obj = objC;
        if (objC == null) {
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f, width, Path.Direction.CW);
            path.setFillType(Path.FillType.INVERSE_WINDING);
            int iA = ai9Var.a(width);
            ai9Var.b[iA] = width;
            ai9Var.c[iA] = path;
            obj = path;
        }
        Path path2 = (Path) obj;
        o43 o43VarC = s2bVar.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas((Bitmap) o43VarC.e0());
            canvas.drawBitmap(bitmap, this.e, null);
            canvas.drawPath(path2, this.d);
            o43 o43VarN = o43VarC.n();
            v3c.i(o43VarC, null);
            return o43VarN;
        } finally {
        }
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        return new tpd("AvatarAsCirclePostProcessor");
    }
}
