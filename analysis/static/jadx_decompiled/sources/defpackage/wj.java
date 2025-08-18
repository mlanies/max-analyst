package defpackage;

import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class wj implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ zj a;
    public final /* synthetic */ String b;

    public wj(zj zjVar, String str) {
        this.a = zjVar;
        this.b = str;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        zj zjVar = this.a;
        hm9.p(zjVar.s0, "Animoji lottie download. Fail", th);
        String str = this.b;
        if (str == null || str.length() == 0) {
            zjVar.e(uj.a);
        } else {
            zjVar.c(str);
        }
        RLottieDrawable rLottieDrawable = zjVar.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        zjVar.x0 = null;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) throws InterruptedException {
        String str = this.a.s0;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Animoji lottie download. Success, url:" + rLottieDrawable.getCurrentUrl() + ", class: " + rLottieDrawable, null);
        }
        rLottieDrawable.setCallback(this.a.t0);
        zj zjVar = this.a;
        zjVar.x0 = rLottieDrawable;
        zjVar.e(uj.c);
        if (!rLottieDrawable.isRunning() && j1e.z(this.a.y0)) {
            rLottieDrawable.start();
        }
        if (rLottieDrawable.getBounds().isEmpty() && !this.a.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(this.a.getBounds());
        }
        rLottieDrawable.invalidateInternal();
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
