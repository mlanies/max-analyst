package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lsf extends LinearLayout {
    public static final /* synthetic */ bc7[] y0;
    public final je7 a;
    public final je7 b;
    public AnimatorSet c;
    public isf o;
    public final w4d s0;
    public final je7 t0;
    public final View u0;
    public final r70 v0;
    public final ImageView w0;
    public final TextView x0;

    static {
        oi9 oi9Var = new oi9(lsf.class, "prepareDataAndOnPauseWaveJob", "getPrepareDataAndOnPauseWaveJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        y0 = new bc7[]{oi9Var};
    }

    public lsf(Context context) {
        super(context);
        final int i = 0;
        k56 k56Var = new k56(this) { // from class: gsf
            public final /* synthetic */ lsf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.K1);
                    default:
                        return kt3.b(this.b.getContext(), woc.I0);
                }
            }
        };
        int i2 = 3;
        this.a = tu0.r(3, k56Var);
        final int i3 = 1;
        this.b = tu0.r(3, new k56(this) { // from class: gsf
            public final /* synthetic */ lsf b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return kt3.b(this.b.getContext(), woc.K1);
                    default:
                        return kt3.b(this.b.getContext(), woc.I0);
                }
            }
        });
        this.s0 = mqd.D();
        this.t0 = f9g.a.getAccessor().d(kke.class);
        View view = new View(context);
        view.setId(lga.j);
        float f = 8;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        Continuation continuation = null;
        v3c.y(new xr3(i2, continuation, 2), view);
        this.u0 = view;
        r70 r70Var = new r70(context);
        r70Var.setId(lga.t);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(tu0.G(0 * fk4.d().getDisplayMetrics().density), tu0.G(24 * fk4.d().getDisplayMetrics().density));
        layoutParams2.setMarginStart(tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams2.setMarginEnd(tu0.G(2 * fk4.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        r70Var.setLayoutParams(layoutParams2);
        r70Var.setListener(new wva(r70Var, 16, this));
        this.v0 = r70Var;
        ImageView imageView = new ImageView(context);
        imageView.setId(lga.n);
        float f2 = 28;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        imageView.setImageDrawable(getPlayIcon());
        imageView.setVisibility(8);
        v3c.y(new r1b(this, continuation, 21), imageView);
        tu0.K(imageView, 300L, new elb(16, this));
        this.w0 = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        frameLayout.addView(view);
        frameLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(lga.k);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        float f3 = 4;
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        textView.setLayoutParams(layoutParams3);
        i4f.l.b(textView, du4.b);
        v3c.y(new hsf(this, (Continuation) null), textView);
        this.x0 = textView;
        setId(lga.s);
        float f4 = 36;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        layoutParams4.setMargins(iG, iG, iG, iG);
        layoutParams4.gravity = 49;
        setLayoutParams(layoutParams4);
        setMinimumHeight(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        int iG2 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
        setPadding(iG2, iG2, iG2, iG2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
        setBackground(gradientDrawable);
        v3c.y(new hsf(i2, continuation), this);
        addView(frameLayout);
        addView(textView);
        addView(r70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kke getDispatchers() {
        return (kke) this.t0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getPauseSmallIcon() {
        return (Drawable) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getPlayIcon() {
        return (Drawable) this.a.getValue();
    }

    private final x77 getPrepareDataAndOnPauseWaveJob() {
        return (x77) this.s0.T0(this, y0[0]);
    }

    private final GradientDrawable getWaveContainerBackground() {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final void setPrepareDataAndOnPauseWaveJob(x77 x77Var) {
        this.s0.o1(this, y0[0], x77Var);
    }

    public final void d(Long l, zl7 zl7Var) {
        String strD;
        ImageView imageView = this.w0;
        if (zl7Var.b) {
            imageView.setImageDrawable(getPauseSmallIcon());
        } else {
            imageView.setImageDrawable(getPlayIcon());
        }
        r70 r70Var = this.v0;
        Float f = zl7Var.a;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (!r70Var.D0) {
                r70Var.t0 = (long) (fFloatValue * r70Var.C0);
                r70Var.v0 = true;
                r70Var.postInvalidate();
            }
        } else if (!r70Var.D0) {
            r70Var.t0 = (long) (0.0f * r70Var.C0);
            r70Var.v0 = false;
            r70Var.postInvalidate();
        }
        if (r70Var.D0) {
            return;
        }
        if (f == null || l == null) {
            strD = null;
        } else {
            strD = tfg.d((long) (f.floatValue() * l.longValue()));
        }
        if (f == null && l != null) {
            strD = tfg.d(l.longValue());
        }
        this.x0.setText(strD);
    }

    public final void e() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(ngg.d(this.u0, View.ALPHA, 1.0f, 0.0f, 1000L, 1000L, 2, -1));
        AnimatorSet animatorSet2 = this.c;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new mf(11, this));
        }
        AnimatorSet animatorSet3 = this.c;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r6 = this;
            isf r0 = r6.o
            r1 = 0
            if (r0 == 0) goto L1e
            y8 r0 = (defpackage.y8) r0
            bc7[] r2 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            java.lang.Object r0 = r0.a
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r0 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r0
            cbc r0 = r0.I0()
            w7c r0 = r0.y0
            if (r0 == 0) goto L1e
            j0e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = (byte[]) r0
            goto L1f
        L1e:
            r0 = r1
        L1f:
            rg7 r2 = defpackage.lnf.b(r6)
            kke r3 = r6.getDispatchers()
            w9a r3 = (defpackage.w9a) r3
            nx3 r3 = r3.a()
            vx3 r4 = defpackage.vx3.b
            ksf r5 = new ksf
            r5.<init>(r6, r1, r0)
            vxd r0 = defpackage.j47.S(r2, r3, r4, r5)
            r6.setPrepareDataAndOnPauseWaveJob(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsf.f():void");
    }

    public final View getHandFreeDotView() {
        return this.u0;
    }

    public final List<ValueAnimator> getPauseAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.u0;
        arrayList.addAll(ngg.F(view, 1.0f, 0.5f, 150L, 0L));
        Property property = View.ALPHA;
        arrayList.add(ngg.e(view, property, 1.0f, 0.0f, 150L, 0L, 112));
        ImageView imageView = this.w0;
        arrayList.addAll(ngg.F(imageView, 0.5f, 1.0f, 150L, 50L));
        arrayList.add(ngg.e(imageView, property, 0.5f, 1.0f, 150L, 50L, 96));
        pq9 pq9Var = qp4.u0;
        xoe text = pq9Var.j(this).getText();
        pq9Var.j(this).getText();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(text.e, -1);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new esf(this, 2));
        arrayList.add(valueAnimatorOfArgb);
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(f8.G(pq9Var.j(this).b().a.m, 0.08f), pq9Var.j(this).getIcon().k);
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new fsf(getWaveContainerBackground(), 1));
        arrayList.add(valueAnimatorOfArgb2);
        jec jecVar = new jec();
        int iG = f8.G(pq9Var.j(this).getIcon().k, 0.5f);
        pq9Var.j(this).getIcon();
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(iG, f8.G(-1, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new yl(jecVar, 5, this));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final List<ValueAnimator> getResumeAnimations() {
        ArrayList arrayList = new ArrayList();
        View view = this.u0;
        arrayList.addAll(ngg.F(view, 0.5f, 1.0f, 150L, 50L));
        Property property = View.ALPHA;
        arrayList.add(ngg.e(view, property, 0.5f, 1.0f, 150L, 50L, 96));
        ImageView imageView = this.w0;
        arrayList.addAll(ngg.F(imageView, 1.0f, 0.5f, 150L, 0L));
        arrayList.add(ngg.e(imageView, property, 1.0f, 0.0f, 150L, 0L, 112));
        pq9 pq9Var = qp4.u0;
        pq9Var.j(this).getText();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, pq9Var.j(this).getText().e);
        valueAnimatorOfArgb.setDuration(150L);
        valueAnimatorOfArgb.setStartDelay(50L);
        valueAnimatorOfArgb.addUpdateListener(new esf(this, 0));
        arrayList.add(valueAnimatorOfArgb);
        bs6 icon = pq9Var.j(this).getIcon();
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(icon.k, f8.G(pq9Var.j(this).b().a.m, 0.08f));
        valueAnimatorOfArgb2.setDuration(150L);
        valueAnimatorOfArgb2.setStartDelay(50L);
        valueAnimatorOfArgb2.addUpdateListener(new fsf(getWaveContainerBackground(), 0));
        arrayList.add(valueAnimatorOfArgb2);
        pq9Var.j(this).getIcon();
        ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(f8.G(-1, 0.5f), f8.G(pq9Var.j(this).getIcon().k, 0.5f));
        valueAnimatorOfArgb3.setDuration(150L);
        valueAnimatorOfArgb3.setStartDelay(50L);
        valueAnimatorOfArgb3.addUpdateListener(new esf(this, 1));
        arrayList.add(valueAnimatorOfArgb3);
        return arrayList;
    }

    public final r70 getWaveView() {
        return this.v0;
    }

    public final void setBackgroundColor(boolean z) {
        pq9 pq9Var = qp4.u0;
        int iG = z ? pq9Var.j(this).getIcon().k : f8.G(pq9Var.j(this).b().a.m, 0.08f);
        GradientDrawable waveContainerBackground = getWaveContainerBackground();
        if (waveContainerBackground != null) {
            waveContainerBackground.setColor(iG);
        }
    }

    public final void setCallback(isf isfVar) {
        this.o = isfVar;
    }

    public final void setDotDrawable(Drawable drawable) {
        this.u0.setBackground(drawable);
    }

    public final void setDurationColor(boolean z) {
        pq9 pq9Var = qp4.u0;
        TextView textView = this.x0;
        if (!z) {
            textView.setTextColor(pq9Var.j(this).getText().e);
        } else {
            pq9Var.j(this).getText();
            textView.setTextColor(-1);
        }
    }

    public final void setDurationText(String str) {
        this.x0.setText(str);
    }

    public final void setVisiblePlayPauseButton(boolean z) {
        this.w0.setVisibility(z ? 0 : 8);
    }
}
