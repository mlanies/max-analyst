package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes2.dex */
public final class y2b extends LayerDrawable implements kre {
    public final Context a;
    public final int b;
    public final int c;

    public y2b(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int iAddLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = iAddLayer;
        int iAddLayer2 = addLayer(new RippleDrawable(ColorStateList.valueOf(-16777216), kt3.b(context, woc.L0), null));
        this.c = iAddLayer2;
        float f = 44;
        setLayerSize(iAddLayer, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer, 17);
        float f2 = 24;
        setLayerSize(iAddLayer2, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        setLayerGravity(iAddLayer2, 17);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void a(int i) {
        Context context = this.a;
        setDrawable(this.c, new RippleDrawable(ColorStateList.valueOf(-16777216), kt3.b(context, i), null));
        onThemeChanged(qp4.u0.b(context).i());
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot(rect.centerX(), rect.centerY());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        pq9 pq9Var = qp4.u0;
        Context context = this.a;
        pq9Var.b(context).i().a().s().b.getClass();
        paint.setColor(1543503872);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(pq9Var.b(context).i().d().a.a.c));
        Drawable drawable = rippleDrawable.getDrawable(0);
        pq9Var.b(context).i().getIcon();
        aq4.g(drawable, -1);
    }
}
