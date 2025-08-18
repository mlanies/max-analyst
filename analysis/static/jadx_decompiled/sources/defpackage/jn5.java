package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public final class jn5 extends FrameLayout {
    public int a;
    public int b;
    public float c;
    public float o;
    public final WindowManager.LayoutParams s0;
    public final SimpleDraweeView t0;
    public in5 u0;
    public ValueAnimator v0;

    public jn5(Context context) {
        super(context);
        this.s0 = new WindowManager.LayoutParams(-1, -1, 0, 0, 2038, 16779016, -3);
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.s0.layoutInDisplayCutoutMode = 1;
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.t0 = simpleDraweeView;
        addView(simpleDraweeView, new FrameLayout.LayoutParams(0, 0));
    }

    public final void a(final int i, final int i2, final int i3, final int i4) {
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.v0.setInterpolator(((y8a) vl.b()).c().a.n());
        this.v0.setStartDelay(0);
        this.v0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hn5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                jn5 jn5Var = this.a;
                jn5Var.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i5 = jn5Var.a + ((int) ((i3 - r1) * fFloatValue));
                int i6 = jn5Var.b + ((int) ((i4 - r2) * fFloatValue));
                float f = jn5Var.c;
                int iF = (int) z7b.f(i, f, fFloatValue, f);
                float f2 = jn5Var.o;
                int iF2 = (int) z7b.f(i2, f2, fFloatValue, f2);
                jn5Var.t0.setLayoutParams(new FrameLayout.LayoutParams(i5, i6));
                jn5Var.t0.setTranslationX(iF);
                jn5Var.t0.setTranslationY(iF2);
                jn5Var.invalidate();
            }
        });
        this.v0.addListener(new h6(5, this));
        this.v0.start();
    }

    public final void b(Uri uri, int i, int i2, int i3, int i4) {
        e2b e2bVar = s36.a.get();
        e2bVar.e = wv6.a(uri);
        e2bVar.l = this.t0.getController();
        this.t0.setController(e2bVar.a());
        float f = i;
        this.c = f;
        float f2 = i2;
        this.o = f2;
        this.a = i3;
        this.b = i4;
        this.t0.setLayoutParams(new FrameLayout.LayoutParams(this.a, this.b));
        this.t0.setTranslationX(f);
        this.t0.setTranslationY(f2);
        invalidate();
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.s0;
    }

    public void setListener(in5 in5Var) {
        this.u0 = in5Var;
    }
}
