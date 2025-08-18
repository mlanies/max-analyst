package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class f6c implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ h6c b;
    public final /* synthetic */ RLottieImageView c;

    public f6c(h6c h6cVar, RLottieImageView rLottieImageView) {
        this.b = h6cVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) throws InterruptedException {
        hm9.n(this.b.a, "Reaction effect. OnLoaded, called:" + this.a);
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.playAnimation();
    }
}
