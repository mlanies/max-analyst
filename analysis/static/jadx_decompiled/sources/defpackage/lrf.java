package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final class lrf {
    public final Context a;
    public final khe b;
    public final khe c;

    public lrf(Context context) {
        this.a = context;
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: krf
            public final /* synthetic */ lrf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                lrf lrfVar = this.b;
                switch (i) {
                    case 0:
                        int i2 = x7a.u;
                        Context context2 = lrfVar.a;
                        Drawable drawableB = kt3.b(context2, i2);
                        drawableB.setTintList(ColorStateList.valueOf(pq9Var.o(context2).c.getIcon().e));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
                        float f = 8;
                        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        int i3 = x7a.k0;
                        Context context3 = lrfVar.a;
                        Drawable drawableB2 = kt3.b(context3, i3);
                        drawableB2.setTintList(ColorStateList.valueOf(pq9Var.o(context3).c.getIcon().c));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableB2});
                        float f2 = 8;
                        layerDrawable2.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
        final int i2 = 1;
        this.c = new khe(new k56(this) { // from class: krf
            public final /* synthetic */ lrf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                pq9 pq9Var = qp4.u0;
                lrf lrfVar = this.b;
                switch (i2) {
                    case 0:
                        int i22 = x7a.u;
                        Context context2 = lrfVar.a;
                        Drawable drawableB = kt3.b(context2, i22);
                        drawableB.setTintList(ColorStateList.valueOf(pq9Var.o(context2).c.getIcon().e));
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
                        float f = 8;
                        layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                        return layerDrawable;
                    default:
                        int i3 = x7a.k0;
                        Context context3 = lrfVar.a;
                        Drawable drawableB2 = kt3.b(context3, i3);
                        drawableB2.setTintList(ColorStateList.valueOf(pq9Var.o(context3).c.getIcon().c));
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setAlpha(40);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableB2});
                        float f2 = 8;
                        layerDrawable2.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        return layerDrawable2;
                }
            }
        });
    }
}
