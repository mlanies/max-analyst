package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class z3g extends ImageView implements AnimatedFileDrawable.OnNextFrameRenderedListener, ew7 {
    public String a;
    public boolean b;
    public y3g c;
    public boolean o;
    public AnimatedFileDrawable s0;
    public final gi t0;

    public z3g(Context context) {
        super(context, null);
        this.t0 = new gi(4, this);
    }

    @Override // defpackage.ew7
    public final void a() {
        AnimatedFileDrawable animatedFileDrawable;
        this.o = true;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.s0) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // defpackage.ew7
    public final void c() throws InterruptedException {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.s0 != null) {
            this.o = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.s0) != null) {
                animatedFileDrawable.stop();
            }
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.recycle();
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.s0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.stop();
        }
        this.s0 = null;
        setImageDrawable(null);
        this.a = null;
    }

    @Override // defpackage.ew7
    public final void d() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.s0 == null) {
            return;
        }
        this.o = false;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.s0) == null) {
            return;
        }
        animatedFileDrawable.stop();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        AnimatedFileDrawable animatedFileDrawable;
        super.onAttachedToWindow();
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.setCallback(this);
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.s0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.addParent(this.t0);
        }
        if (!this.o || (animatedFileDrawable = this.s0) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedFileDrawable animatedFileDrawable = this.s0;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.stop();
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.s0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.removeParent(this.t0);
        }
    }

    @Override // one.me.sdk.media.ffmpeg.AnimatedFileDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable) {
        if (this.b) {
            y3g y3gVar = this.c;
            if (y3gVar != null) {
                a4g a4gVar = (a4g) ((gte) y3gVar).b;
                ((OneMeDraweeView) a4gVar.a.b).setVisibility(8);
                if (a4gVar.c) {
                    a4gVar.o = true;
                }
            }
            this.b = false;
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.s0 = animatedFileDrawable;
            AnimatedFileDrawable animatedFileDrawable2 = drawable instanceof AnimatedFileDrawable ? animatedFileDrawable : null;
            gi giVar = this.t0;
            if (animatedFileDrawable2 != null) {
                animatedFileDrawable2.removeParent(giVar);
            }
            animatedFileDrawable.addParent(giVar);
            this.o = true;
        } else {
            this.o = false;
        }
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.s0 = null;
    }

    public final void setOnFirstFrameListener(y3g y3gVar) {
        this.c = y3gVar;
        this.b = true;
    }
}
