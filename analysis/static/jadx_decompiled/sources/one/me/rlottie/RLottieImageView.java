package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.he;
import defpackage.zr6;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class RLottieImageView extends AppCompatImageView {
    public boolean cached;
    public HashMap o;
    public RLottieDrawable s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;

    public RLottieImageView(Context context) {
        this(context, null);
    }

    public void a() throws InterruptedException {
        playAnimation();
    }

    public void clearAnimationDrawable() throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.s0 = null;
        setImageDrawable(null);
    }

    public void clearLayerColors() {
        this.o.clear();
    }

    public void d() {
        stopAnimation();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.s0;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.s0;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() throws InterruptedException {
        super.onAttachedToWindow();
        this.u0 = true;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.v0) {
                this.s0.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u0 = false;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable == null) {
            return;
        }
        this.v0 = true;
        if (!this.u0 || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.start();
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) throws InterruptedException {
        setAnimation(i, i2, i3, null);
    }

    public void setAutoRepeat(boolean z) {
        this.t0 = z;
        this.w0 = true;
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable == null || !z) {
            return;
        }
        rLottieDrawable.setAutoRepeat(1);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) throws InterruptedException {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.s0 = rLottieDrawable;
            if (this.w0) {
                if (this.t0) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.s0.setMasterParent(this);
            if (this.t0) {
                this.s0.setAutoRepeat(1);
            }
            if (this.o != null) {
                this.s0.beginApplyLayerColors();
                for (Map.Entry entry : this.o.entrySet()) {
                    this.s0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.s0.commitApplyLayerColors();
            }
            this.s0.setAllowDecodeSingleFrame(true);
            this.v0 = this.s0.b1;
        } else {
            this.v0 = false;
        }
        super.setImageDrawable(this.s0);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.s0 = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        this.o.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() throws InterruptedException {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.s0;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.s0.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.s0;
        if (rLottieDrawable == null) {
            return;
        }
        this.v0 = false;
        if (!this.u0 || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.stop();
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = false;
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) throws InterruptedException {
        setAnimation(new RLottieDrawable(i, zr6.h(i, ""), he.a(i2), he.a(i3), false, iArr));
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) throws InterruptedException {
        if (this.s0 == rLottieDrawable) {
            return;
        }
        this.s0 = rLottieDrawable;
        rLottieDrawable.setMasterParent(this);
        if (this.t0) {
            this.s0.setAutoRepeat(1);
        }
        if (this.o != null) {
            this.s0.beginApplyLayerColors();
            for (Map.Entry entry : this.o.entrySet()) {
                this.s0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.s0.commitApplyLayerColors();
        }
        this.s0.setAllowDecodeSingleFrame(true);
        setImageDrawable(this.s0);
    }
}
