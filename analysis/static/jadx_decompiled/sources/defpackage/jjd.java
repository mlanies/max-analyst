package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class jjd extends ojd {
    public final ljd c;

    public jjd(ljd ljdVar) {
        this.c = ljdVar;
    }

    @Override // defpackage.ojd
    public final void a(Matrix matrix, ejd ejdVar, int i, Canvas canvas) {
        ljd ljdVar = this.c;
        float f = ljdVar.f;
        float f2 = ljdVar.g;
        RectF rectF = new RectF(ljdVar.b, ljdVar.c, ljdVar.d, ljdVar.e);
        ejdVar.getClass();
        boolean z = f2 < 0.0f;
        Path path = ejdVar.g;
        int[] iArr = ejd.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ejdVar.f;
            iArr[2] = ejdVar.e;
            iArr[3] = ejdVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = ejdVar.d;
            iArr[2] = ejdVar.e;
            iArr[3] = ejdVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = ejd.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = ejdVar.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, ejdVar.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
