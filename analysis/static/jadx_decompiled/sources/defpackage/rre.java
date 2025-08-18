package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rre extends Drawable {
    public final qre a;
    public final je7 b = tu0.r(3, new rzd(9, this));

    public rre(qre qreVar) {
        this.a = qreVar;
    }

    public final rre a(float f) {
        kge kgeVarA;
        kge kgeVar;
        qre qreVar = this.a;
        pre preVar = qreVar.a;
        pre preVar2 = null;
        if (preVar == null || (kgeVar = preVar.a) == null) {
            kgeVarA = null;
        } else {
            kgeVarA = kgeVar.mutate();
            kgeVarA.a.f = f;
        }
        if (kgeVarA != null) {
            preVar.getClass();
            preVar2 = new pre(kgeVarA);
        }
        nre nreVar = qreVar.b;
        List list = qreVar.c;
        List list2 = qreVar.d;
        Integer num = qreVar.e;
        qreVar.getClass();
        return new rre(new qre(preVar2, nreVar, list, list2, num));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        cbf cbfVar = (cbf) this.b.getValue();
        qre qreVar = cbfVar.a;
        Integer num = qreVar.e;
        if (num != null) {
            canvas.drawColor(num.intValue());
        }
        if (qreVar.b != null) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (Paint) cbfVar.b.getValue());
        }
        if (qreVar.d != null) {
            cbf.a(canvas, cbfVar.e, cbfVar.f, (Paint) cbfVar.c.getValue());
        }
        pre preVar = qreVar.a;
        if (preVar != null) {
            preVar.a.draw(canvas);
        }
        if (preVar != null) {
            ArrayList arrayList = cbfVar.g;
            if (arrayList.isEmpty()) {
                return;
            }
            int iSaveLayer = canvas.saveLayer(null, null);
            cbf.a(canvas, arrayList, cbfVar.h, (Paint) cbfVar.d.getValue());
            kge kgeVar = preVar.a;
            Xfermode xfermode = kgeVar.a.g.getXfermode();
            int alpha = kgeVar.getAlpha();
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
            pte pteVar = kgeVar.a;
            pteVar.g.setXfermode(porterDuffXfermode);
            kgeVar.setAlpha(255);
            kgeVar.draw(canvas);
            pteVar.g.setXfermode(xfermode);
            kgeVar.setAlpha(alpha);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return a(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        cbf cbfVar = (cbf) this.b.getValue();
        cbfVar.getClass();
        int iWidth = rect.width();
        int iHeight = rect.height();
        qre qreVar = cbfVar.a;
        nre nreVar = qreVar.b;
        if (nreVar != null) {
            RectF rectF = new RectF(0.0f, 0.0f, iWidth, iHeight);
            float[] fArr = new float[2];
            float f = nreVar.b;
            cbf.c(iWidth, iHeight, f, fArr);
            rectF.left = fArr[0];
            rectF.top = fArr[1];
            cbf.c(iWidth, iHeight, (f + 180.0f) % 360, fArr);
            rectF.right = fArr[0];
            rectF.bottom = fArr[1];
            ((Paint) cbfVar.b.getValue()).setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, nreVar.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        List list = qreVar.c;
        if (list != null) {
            cbf.b(list, cbfVar.e, cbfVar.f, iWidth, iHeight);
        }
        List list2 = qreVar.d;
        if (list2 != null) {
            cbf.b(list2, cbfVar.g, cbfVar.h, iWidth, iHeight);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
