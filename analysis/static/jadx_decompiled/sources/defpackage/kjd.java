package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class kjd extends ojd {
    public final mjd c;
    public final float d;
    public final float e;

    public kjd(mjd mjdVar, float f, float f2) {
        this.c = mjdVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ojd
    public final void a(Matrix matrix, ejd ejdVar, int i, Canvas canvas) {
        mjd mjdVar = this.c;
        float f = mjdVar.c;
        float f2 = this.e;
        float f3 = mjdVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ejdVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = ejd.i;
        iArr[0] = ejdVar.f;
        iArr[1] = ejdVar.e;
        iArr[2] = ejdVar.d;
        Paint paint = ejdVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ejd.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        mjd mjdVar = this.c;
        return (float) Math.toDegrees(Math.atan((mjdVar.c - this.e) / (mjdVar.b - this.d)));
    }
}
