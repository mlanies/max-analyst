package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class h4e extends hqd {
    public final ShapeDrawable F0;
    public Drawable G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public e02 L0;

    public h4e(Context context, ShapeDrawable shapeDrawable, jy2 jy2Var) {
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        oneMeDraweeView.setPadding(iG, iG, iG, iG);
        oneMeDraweeView.setLayoutParams(layoutParams);
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.m);
        super(oneMeDraweeView);
        this.F0 = shapeDrawable;
        this.H0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        this.I0 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        this.J0 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.K0 = tu0.G(14 * fk4.d().getDisplayMetrics().density);
        v3c.y(new r1b(this, context, (Continuation) null), oneMeDraweeView);
        tu0.K(oneMeDraweeView, 300L, new v7d(this, 10, jy2Var));
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        e02 e02Var = (e02) ol7Var;
        this.L0 = e02Var;
        w3e w3eVar = e02Var.b;
        String str = w3eVar.c;
        View view = this.a;
        if (str == null || str.length() == 0) {
            Integer num = e02Var.o;
            if (num != null) {
                ((OneMeDraweeView) view).setImageResource(num.intValue());
            }
        } else {
            ((OneMeDraweeView) view).setImageURI(str);
        }
        F(w3eVar.Z);
        E(w3eVar.Y);
    }

    public final void E(int i) {
        View view = this.a;
        if (i != 5) {
            ((la6) ((OneMeDraweeView) view).getHierarchy()).k(null);
            return;
        }
        if (this.G0 == null) {
            this.G0 = G();
        }
        ((la6) ((OneMeDraweeView) view).getHierarchy()).k(this.G0);
    }

    public final void F(boolean z) {
        View view = this.a;
        if (z) {
            ((OneMeDraweeView) view).setBackground(this.F0);
        } else {
            ((OneMeDraweeView) view).setBackground(null);
        }
        e02 e02Var = this.L0;
        if ((e02Var != null ? e02Var.o : null) == null) {
            ((OneMeDraweeView) view).setImageTintList(null);
            return;
        }
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) view;
        pq9 pq9Var = qp4.u0;
        oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? pq9Var.j(view).getIcon().f : pq9Var.j(view).getIcon().j));
    }

    public final LayerDrawable G() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9 pq9Var = qp4.u0;
        View view = this.a;
        ngg.G(shapeDrawable, pq9Var.j(view).b().a.g);
        Drawable drawableB = kt3.b(((OneMeDraweeView) view).getContext(), ica.a);
        ngg.G(drawableB, pq9Var.j(view).getIcon().i);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
        int i = this.I0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = this.H0;
        layerDrawable.setLayerSize(1, i2, i2);
        int i3 = this.K0;
        layerDrawable.setLayerInset(0, i3, i3, 0, 0);
        int i4 = this.J0;
        layerDrawable.setLayerInset(1, i4, i4, 0, 0);
        return layerDrawable;
    }
}
