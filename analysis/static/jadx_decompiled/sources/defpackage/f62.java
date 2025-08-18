package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class f62 extends View implements kre {
    public final je7 a;
    public final je7 b;

    public f62(Context context) {
        super(context, null);
        final int i = 0;
        je7 je7VarR = tu0.r(3, new k56(this) { // from class: d62
            public final /* synthetic */ f62 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.k56
            public final Object invoke() {
                f62 f62Var = this.b;
                pq9 pq9Var = qp4.u0;
                switch (i) {
                    case 0:
                        Integer numValueOf = Integer.valueOf(pq9Var.j(f62Var).i().b.b);
                        Integer numValueOf2 = Integer.valueOf(tu0.G(1 * fk4.d().getDisplayMetrics().density));
                        float f = fk4.d().getDisplayMetrics().density * 12.0f;
                        return hm9.c0(null, numValueOf, numValueOf2, new float[]{f, f, f, f, f, f, f, f});
                    default:
                        fka fkaVarJ = pq9Var.j(f62Var);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint = shapeDrawable.getPaint();
                        fkaVarJ.b();
                        paint.setColor(-1728053248);
                        InsetDrawable insetDrawable = new InsetDrawable(kt3.b(f62Var.getContext(), woc.m), tu0.G(4 * fk4.d().getDisplayMetrics().density));
                        ngg.G(insetDrawable, -1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, insetDrawable, f62Var.a.getValue()});
                        layerDrawable.setLayerGravity(0, 17);
                        layerDrawable.setLayerGravity(1, 17);
                        layerDrawable.setLayerGravity(2, 17);
                        int iG = tu0.G(28 * fk4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iG, iG);
                        layerDrawable.setLayerSize(1, iG, iG);
                        float f2 = 64;
                        layerDrawable.setLayerSize(2, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        return layerDrawable;
                }
            }
        });
        this.a = je7VarR;
        final int i2 = 1;
        this.b = tu0.r(3, new k56(this) { // from class: d62
            public final /* synthetic */ f62 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.k56
            public final Object invoke() {
                f62 f62Var = this.b;
                pq9 pq9Var = qp4.u0;
                switch (i2) {
                    case 0:
                        Integer numValueOf = Integer.valueOf(pq9Var.j(f62Var).i().b.b);
                        Integer numValueOf2 = Integer.valueOf(tu0.G(1 * fk4.d().getDisplayMetrics().density));
                        float f = fk4.d().getDisplayMetrics().density * 12.0f;
                        return hm9.c0(null, numValueOf, numValueOf2, new float[]{f, f, f, f, f, f, f, f});
                    default:
                        fka fkaVarJ = pq9Var.j(f62Var);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint = shapeDrawable.getPaint();
                        fkaVarJ.b();
                        paint.setColor(-1728053248);
                        InsetDrawable insetDrawable = new InsetDrawable(kt3.b(f62Var.getContext(), woc.m), tu0.G(4 * fk4.d().getDisplayMetrics().density));
                        ngg.G(insetDrawable, -1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, insetDrawable, f62Var.a.getValue()});
                        layerDrawable.setLayerGravity(0, 17);
                        layerDrawable.setLayerGravity(1, 17);
                        layerDrawable.setLayerGravity(2, 17);
                        int iG = tu0.G(28 * fk4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iG, iG);
                        layerDrawable.setLayerSize(1, iG, iG);
                        float f2 = 64;
                        layerDrawable.setLayerSize(2, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                        return layerDrawable;
                }
            }
        });
        float f = 64;
        setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        setClipToOutline(true);
        setOutlineProvider(new e62(this, 0));
        setForeground((Drawable) je7VarR.getValue());
    }

    private final LayerDrawable getSelectedIndicatorIcon() {
        return (LayerDrawable) this.b.getValue();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        je7 je7Var = this.a;
        if (je7Var.a()) {
            ((GradientDrawable) je7Var.getValue()).setStroke(tu0.G(1 * fk4.d().getDisplayMetrics().density), fkaVar.i().b.b);
        }
        Paint paint = ((ShapeDrawable) getSelectedIndicatorIcon().getDrawable(0)).getPaint();
        fkaVar.b();
        paint.setColor(-1728053248);
        ngg.G(getSelectedIndicatorIcon().getDrawable(1), -1);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setForeground(z ? getSelectedIndicatorIcon() : (Drawable) this.a.getValue());
        super.setSelected(z);
    }
}
