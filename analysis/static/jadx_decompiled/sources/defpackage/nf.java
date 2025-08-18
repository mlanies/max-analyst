package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class nf extends FrameLayout {
    public OneMeButton a;
    public OneMeButton b;
    public boolean c;
    public ValueAnimator o;
    public kwd s0;

    public static final void a(nf nfVar, OneMeButton oneMeButton) {
        nfVar.getClass();
        kwd kwdVar = new kwd(oneMeButton.findViewById(xoc.k), (ju0) kwd.q, 0.0f);
        lwd lwdVar = new lwd(0.0f);
        lwdVar.b(200.0f);
        lwdVar.a(0.5f);
        kwdVar.m = lwdVar;
        kwdVar.a = 500.0f;
        kf kfVar = new kf(nfVar, oneMeButton);
        ArrayList arrayList = kwdVar.k;
        if (!arrayList.contains(kfVar)) {
            arrayList.add(kfVar);
        }
        kwdVar.g();
        nfVar.s0 = kwdVar;
    }

    private final void setupViewsPosition(boolean z) {
        if (z) {
            OneMeButton oneMeButton = this.a;
            if (oneMeButton != null) {
                oneMeButton.setTranslationY(0.0f);
            }
            OneMeButton oneMeButton2 = this.b;
            if (oneMeButton2 != null) {
                oneMeButton2.setTranslationY(getMeasuredHeight());
                return;
            }
            return;
        }
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setTranslationY(-getMeasuredHeight());
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setTranslationY(0.0f);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.o = null;
        kwd kwdVar = this.s0;
        if (kwdVar != null) {
            kwdVar.b();
        }
        this.s0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        OneMeButton oneMeButton = this.b;
        int measuredHeight = oneMeButton != null ? oneMeButton.getMeasuredHeight() : 0;
        OneMeButton oneMeButton2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, oneMeButton2 != null ? oneMeButton2.getMeasuredHeight() : 0));
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setVisibility(0);
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(k56 k56Var) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            tu0.K(oneMeButton, 300L, new m6(1, k56Var));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            oneMeButton.setProgressEnabled(z);
            oneMeButton.setClickable(!z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OneMeButton oneMeButton;
        kwd kwdVar;
        int i = 0;
        if (isEnabled() == z) {
            return;
        }
        if (z && this.c) {
            OneMeButton oneMeButton2 = this.a;
            if (oneMeButton2 != null && (oneMeButton = this.b) != null) {
                ValueAnimator valueAnimator = this.o;
                if ((valueAnimator != null && valueAnimator.isRunning()) || ((kwdVar = this.s0) != null && kwdVar.f)) {
                    b();
                }
                float height = getHeight();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, height);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new jf(oneMeButton, oneMeButton2, height, 0));
                valueAnimatorOfFloat.addListener(new mf(0, oneMeButton2));
                valueAnimatorOfFloat.addListener(new lf(this, i, oneMeButton2));
                valueAnimatorOfFloat.start();
                this.o = valueAnimatorOfFloat;
            }
        } else {
            b();
            setupViewsPosition(z);
        }
        super.setEnabled(z);
    }

    public final void setupActiveButton(m56 m56Var) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        m56Var.invoke(oneMeButton);
        oneMeButton.setOutlineProvider(null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ? 0 : 8);
        this.a = oneMeButton;
        addView(oneMeButton);
    }

    public final void setupDisabledButton(m56 m56Var) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        m56Var.invoke(oneMeButton);
        setOutlineProvider(oneMeButton.getOutlineProvider());
        oneMeButton.setOutlineProvider(null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ^ true ? 0 : 8);
        this.b = oneMeButton;
        addView(oneMeButton);
    }
}
