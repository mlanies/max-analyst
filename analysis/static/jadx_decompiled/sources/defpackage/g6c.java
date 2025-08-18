package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* loaded from: classes2.dex */
public final class g6c implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ h6c b;
    public final /* synthetic */ RLottieImageView c;

    public g6c(h6c h6cVar, RLottieImageView rLottieImageView) {
        this.b = h6cVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.OnAllFramesRenderedListener
    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        h6c h6cVar = this.b;
        hm9.n(h6cVar.a, "Reaction effect. OnAllFramesRendered, called:" + this.a);
        if (this.a) {
            return;
        }
        h6cVar.post(new v05(this, h6cVar, this.c, 23));
    }
}
