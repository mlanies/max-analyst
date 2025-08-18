package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* loaded from: classes.dex */
public final class bt5 extends hqd {
    public static final ShapeDrawable F0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = fk4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        F0 = shapeDrawable;
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
    }
}
