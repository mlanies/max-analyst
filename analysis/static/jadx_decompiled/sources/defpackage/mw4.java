package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class mw4 extends hqd implements hx4 {
    public static final /* synthetic */ int H0 = 0;
    public qx4 F0;
    public final gi G0;

    public mw4(Context context, bkg bkgVar) {
        ImageView imageView = new ImageView(context);
        super(imageView);
        this.G0 = new gi(1, this);
        int iG = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(iG, iG));
        rh4.p(2, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setOnClickListener(new tb(this, 28, bkgVar));
        v3c.y(new br(this, (Continuation) null, 6), imageView);
        imageView.addOnAttachStateChangeListener(new ck(4, this));
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        if (ol7Var instanceof qx4) {
            qx4 qx4Var = (qx4) ol7Var;
            this.F0 = qx4Var;
            if (qx4Var.Y == 0) {
                E(true);
            }
            View view = this.a;
            ((ImageView) view).setImageDrawable(qx4Var.X);
            Drawable drawable = ((ImageView) view).getDrawable();
            zj zjVar = drawable instanceof zj ? (zj) drawable : null;
            if (zjVar != null) {
                Drawable drawableB = zjVar.b();
                RLottieDrawable rLottieDrawable = zjVar.x0;
                if (drawableB == rLottieDrawable && rLottieDrawable != null) {
                    rLottieDrawable.addParentView(this.G0);
                }
                zjVar.start();
            }
        }
    }

    public final void E(boolean z) {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        zj zjVar = drawable instanceof zj ? (zj) drawable : null;
        if (zjVar != null) {
            RLottieDrawable rLottieDrawable = zjVar.x0;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(this.G0);
            }
            RLottieDrawable rLottieDrawable2 = zjVar.x0;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews() || z) {
                zjVar.stop();
            }
        }
    }

    @Override // defpackage.hx4
    public final void d() {
        Drawable drawable;
        qx4 qx4Var = this.F0;
        if (qx4Var == null || (drawable = qx4Var.X) == null) {
            return;
        }
        ((ImageView) this.a).invalidateDrawable(drawable);
    }
}
