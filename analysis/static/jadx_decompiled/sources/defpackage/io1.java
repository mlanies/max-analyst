package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final /* synthetic */ class io1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ no1 b;

    public /* synthetic */ io1(no1 no1Var, int i) {
        this.a = i;
        this.b = no1Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                k56 k56Var = this.b.g1;
                if (k56Var != null) {
                    return (ugf) k56Var.invoke();
                }
                return null;
            case 1:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(qp4.u0.p(this.b).c.b().k);
                return shapeDrawable;
            case 2:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(qp4.u0.p(this.b).c.b().e);
                return shapeDrawable2;
            default:
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{qp4.u0.p(this.b).c.b().e, 0, 0});
        }
    }
}
