package defpackage;

import java.io.IOException;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* loaded from: classes2.dex */
public final class dw7 extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, ew7 {
    public bw7 A0;
    public String x0;
    public boolean y0;
    public cw7 z0;

    @Override // defpackage.ew7
    public final void c() throws InterruptedException, IOException {
        RLottieImageViewUtils.release(this);
        this.x0 = null;
    }

    public final boolean f(int i, int i2, String str) throws InterruptedException, IOException {
        if (str == null || str.length() == 0) {
            c();
            return true;
        }
        String str2 = this.x0;
        if (str2 != null && tpa.f(str2, str)) {
            return false;
        }
        this.y0 = true;
        this.x0 = str;
        RLottieDrawable rLottieDrawableCreate = RLottieFactory.create(new RLottieFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(new RLottieFactory.Way.Url.Builder().setUrl(str).setSize(i, i2).setNetworkFetchEnabled(true).build()).build());
        rLottieDrawableCreate.addDrawableLoadListener(this);
        rLottieDrawableCreate.addOnNextFrameRenderedListener(this);
        RLottieImageViewUtils.setLottieDrawable(this, rLottieDrawableCreate);
        return true;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        if (this.A0 != null) {
            hm9.p(iw7.class.getName(), "lottie set animation failed: ", th);
        }
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        hm9.m(dw7.class.getName(), "onLoaded %s", rLottieDrawable);
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.y0) {
            cw7 cw7Var = this.z0;
            if (cw7Var != null) {
                cw7Var.d();
            }
            this.y0 = false;
        }
    }

    public final void setFailureListener(bw7 bw7Var) {
        this.A0 = bw7Var;
    }

    public final void setOnFirstFrameListener(cw7 cw7Var) {
        this.z0 = cw7Var;
        this.y0 = true;
    }
}
