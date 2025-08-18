package ru.ok.tamtam.stickers.lottie;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.bqc;
import defpackage.hm9;
import defpackage.la6;
import defpackage.m2e;
import defpackage.qc7;
import defpackage.rc7;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import ru.ok.messages.stickers.widgets.StickerView;

@Deprecated
/* loaded from: classes2.dex */
public class KeyboardLottieAnimationView extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener {
    public boolean x0;
    public rc7 y0;
    public qc7 z0;

    public KeyboardLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        qc7 qc7Var = this.z0;
        if (qc7Var != null) {
            ((m2e) qc7Var).getClass();
            int i = StickerView.x0;
            hm9.p("ru.ok.messages.stickers.widgets.StickerView", "lottie set animation failed: ", th);
        }
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        hm9.m("ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView", "onLoaded %s", rLottieDrawable);
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.x0) {
            rc7 rc7Var = this.y0;
            if (rc7Var != null) {
                int i2 = StickerView.x0;
                StickerView stickerView = (StickerView) ((bqc) rc7Var).b;
                stickerView.removeCallbacks(stickerView.w0);
                SimpleDraweeView simpleDraweeView = stickerView.o;
                if (((la6) simpleDraweeView.getHierarchy()).e.a(1) != null) {
                    ((la6) simpleDraweeView.getHierarchy()).i(null, 1);
                }
                simpleDraweeView.setController(null);
            }
            this.x0 = false;
        }
    }

    public void setFailureListener(qc7 qc7Var) {
        this.z0 = qc7Var;
    }

    public void setOnFirstFrameListener(rc7 rc7Var) {
        this.y0 = rc7Var;
        this.x0 = true;
    }
}
