package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class oo9 extends OneMeDraweeView implements kre {
    public boolean C0;
    public final je7 D0;

    public oo9(Context context) {
        super(context);
        this.C0 = true;
        this.D0 = tu0.r(3, new zj7(13, this));
        setClipToOutline(true);
        ma6 ma6Var = new ma6(getResources());
        ma6Var.d = getShimmerDrawable();
        wnc wncVar = new wnc();
        wncVar.b = true;
        ma6Var.p = wncVar;
        setHierarchy(ma6Var.a());
    }

    private final no9 getShimmerDrawable() {
        return (no9) this.D0.getValue();
    }

    public static yld q(fka fkaVar) {
        bkg bkgVar = new bkg(25);
        yld yldVar = (yld) bkgVar.b;
        yldVar.k = false;
        yldVar.i = 0.0f;
        bkgVar.v(fkaVar.b().l);
        yldVar.d = fkaVar.b().k;
        bkgVar.u();
        bkgVar.x(tu0.G(64 * fk4.d().getDisplayMetrics().density));
        return bkgVar.m();
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClickable(!this.C0);
        if (this.C0) {
            return;
        }
        getShimmerDrawable().c();
    }

    @Override // defpackage.uq4, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C0) {
            return;
        }
        getShimmerDrawable().d();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        getShimmerDrawable().b(q(fkaVar));
    }

    @Override // one.me.sdk.uikit.common.views.OneMeDraweeView
    public final void p(ru6 ru6Var, Animatable animatable) {
        this.C0 = false;
        getShimmerDrawable().d();
        setClickable(!this.C0);
    }
}
