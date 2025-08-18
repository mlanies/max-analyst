package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.IOException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class ky4 extends hqd {
    public final ShapeDrawable F0;
    public final OneMeDraweeView G0;
    public final gic H0;
    public final int I0;
    public d02 J0;

    public ky4(Context context, ShapeDrawable shapeDrawable, jy2 jy2Var) {
        float f = 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        frameLayout.setPadding(iG, iG, iG, iG);
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        ((la6) oneMeDraweeView.getHierarchy()).h(ssc.m);
        frameLayout.addView(oneMeDraweeView);
        super(frameLayout);
        this.F0 = shapeDrawable;
        View childAt = frameLayout.getChildAt(0);
        this.G0 = childAt instanceof OneMeDraweeView ? (OneMeDraweeView) childAt : null;
        this.H0 = nu0.L(new hy4(context, 1));
        this.I0 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        v3c.y(new xh0(this, context, null, 10), frameLayout);
        tu0.K(frameLayout, 300L, new tb(this, jy2Var, 29));
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) throws InterruptedException, IOException {
        d02 d02Var = (d02) ol7Var;
        this.J0 = d02Var;
        String str = d02Var.X;
        gic gicVar = this.H0;
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (str != null) {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                wv6 wv6VarB = wv6.b(str);
                int i = OneMeDraweeView.B0;
                oneMeDraweeView.o(wv6VarB, null);
            }
            String str2 = d02Var.Y;
            if (str2 != null) {
                dw7 dw7Var = (dw7) gicVar.getValue();
                br7.b((ViewGroup) this.a, dw7Var, -1);
                dw7Var.setVisibility(0);
                int i2 = this.I0;
                boolean zF = dw7Var.f(i2, i2, str2);
                if (oneMeDraweeView != null) {
                    oneMeDraweeView.setVisibility(zF ? 0 : 8);
                }
                dw7Var.setOnFirstFrameListener(new q64(11, this));
            } else if (gicVar.a()) {
                dw7 dw7Var2 = (dw7) gicVar.getValue();
                dw7Var2.c();
                dw7Var2.setVisibility(8);
            }
        } else {
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setVisibility(0);
            }
            if (oneMeDraweeView != null) {
                oneMeDraweeView.setImageResource(d02Var.s0);
            }
            if (gicVar.a()) {
                dw7 dw7Var3 = (dw7) gicVar.getValue();
                dw7Var3.c();
                dw7Var3.setVisibility(8);
            }
        }
        E(d02Var.c);
    }

    public final void E(boolean z) {
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.F0 : null);
        OneMeDraweeView oneMeDraweeView = this.G0;
        if (oneMeDraweeView != null) {
            pq9 pq9Var = qp4.u0;
            oneMeDraweeView.setImageTintList(ColorStateList.valueOf(z ? pq9Var.j(view).getIcon().f : pq9Var.j(view).getIcon().j));
        }
    }
}
