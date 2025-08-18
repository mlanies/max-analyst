package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fk6 {
    public static final Rect b = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final cd6 a;

    public fk6(cd6 cd6Var) {
        this.a = cd6Var;
    }

    public final void a(View view, Rect rect, Float f, Integer num) {
        Path path = new Path();
        Path path2 = new Path();
        Rect rect2 = new Rect();
        RectF rectF = new RectF();
        Rect rect3 = new Rect();
        RectF rectF2 = new RectF();
        jec jecVar = new jec();
        if (rect == null) {
            return;
        }
        view.setBackground(new dk6(jecVar, path2, qp4.u0.j(view).b().e));
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        float[] fArr3 = new float[8];
        if (f != null) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = f.floatValue();
                if (i < 4) {
                    fArr2[i] = f.floatValue();
                } else {
                    fArr3[i] = f.floatValue();
                }
            }
        }
        ((ArrayList) this.a.c).add(new ek6(jecVar, path2, path, rect2, rect, num, rect3, rectF, f, fArr, rectF2, view));
    }
}
