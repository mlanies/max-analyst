package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* loaded from: classes2.dex */
public final class h6c extends FrameLayout {
    public final String a;
    public int b;

    public h6c(Context context) {
        super(context, null, 0);
        this.a = h6c.class.getName();
        this.b = 3;
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static float c(int i, Rect rect) {
        return ((tu0.G(20 * fk4.d().getDisplayMetrics().density) / 2) + rh4.c(10, fk4.d().getDisplayMetrics().density, rect.left)) - (i / 2.0f);
    }

    private final c6d getLotties() {
        return l6d.Z(new at(7, this), n71.Z);
    }

    public final void a(long j, RLottieDrawable rLottieDrawable, Rect rect) {
        pk5 pk5Var = new pk5(l6d.Z(getLotties(), new jh2(j, 5)));
        while (pk5Var.hasNext()) {
            RLottieImageView rLottieImageView = (RLottieImageView) pk5Var.next();
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
        int childCount = getChildCount();
        int i = this.b;
        String str = this.a;
        if (childCount >= i) {
            hm9.m0(str, "Reaction effect. Reached max count of lotties effects", new Object[0]);
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        RLottieImageView rLottieImageView2 = new RLottieImageView(getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView2, rLottieDrawable);
        rLottieImageView2.playAnimation();
        tpa.J(wxb.tag_reaction_effects_view, rLottieImageView2, Long.valueOf(j));
        setLayoutDirection(0);
        rLottieImageView2.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView2.setX(c(intrinsicWidth, rect));
        rLottieImageView2.setY(rect.centerY() - (intrinsicHeight / 2.0f));
        addView(rLottieImageView2);
        f6c f6cVar = new f6c(this, rLottieImageView2);
        rLottieDrawable.addDrawableLoadListener(f6cVar);
        g6c g6cVar = new g6c(this, rLottieImageView2);
        rLottieDrawable.addOnAllFramesRenderedListener(g6cVar);
        if (rLottieImageView2.isAttachedToWindow()) {
            rLottieImageView2.addOnAttachStateChangeListener(new e6c(rLottieImageView2, this, rLottieDrawable, f6cVar, g6cVar));
            return;
        }
        hm9.n(str, "onDetach");
        rLottieDrawable.removeDrawableLoadListener(f6cVar);
        rLottieDrawable.removeOnAllFramesRenderedListener(g6cVar);
    }

    public final void b() {
        for (RLottieImageView rLottieImageView : getLotties()) {
            rLottieImageView.stopAnimation();
            removeView(rLottieImageView);
        }
    }

    public final void d(long j, Rect rect) {
        Object next;
        Iterator it = getLotties().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (tpa.f(tpa.v((RLottieImageView) next, wxb.tag_reaction_effects_view), Long.valueOf(j))) {
                    break;
                }
            }
        }
        RLottieImageView rLottieImageView = (RLottieImageView) next;
        if (rLottieImageView == null) {
            return;
        }
        if (!rLottieImageView.isPlaying()) {
            hm9.n(this.a, "Reaction effect. Skip move");
            return;
        }
        rLottieImageView.setX(c(rLottieImageView.getDrawable().getIntrinsicWidth(), rect));
        rLottieImageView.setY(rect.centerY() - (r4.getIntrinsicHeight() / 2.0f));
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
    }

    public final void setScrollOffset(int i) {
        float f = i;
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}
