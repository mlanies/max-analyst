package ru.ok.tamtam.markdown.ui.preview;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.fk4;
import defpackage.ktb;
import defpackage.mr0;
import defpackage.nse;
import defpackage.qg;
import defpackage.sz7;
import defpackage.tg;
import defpackage.tu0;
import defpackage.tz7;
import defpackage.vu5;
import defpackage.vz7;
import defpackage.y53;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/tamtam/markdown/ui/preview/MarkdownMenuView;", "Landroid/widget/LinearLayout;", "Lnse;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Le5f;", "setEnabled", "(Z)V", "Lvz7;", "listener", "setListener", "(Lvz7;)V", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MarkdownMenuView extends LinearLayout implements nse {
    public static final /* synthetic */ int u0 = 0;
    public final ArrayList a;
    public final RectF b;
    public int c;
    public final Paint o;
    public AnimatorSet s0;
    public final float t0;

    public MarkdownMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(25);
        this.o = paint;
        setOrientation(1);
        setWillNotDraw(false);
        sz7.c.getClass();
        LinkedHashSet linkedHashSet = sz7.o;
        ArrayList arrayList = new ArrayList(z53.S(linkedHashSet, 10));
        int i = 0;
        for (Object obj : linkedHashSet) {
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            sz7 sz7Var = (sz7) obj;
            tz7 tz7Var = new tz7(context);
            tz7Var.setTag(sz7Var);
            tz7Var.setTitle(sz7Var.b);
            tu0.K(tz7Var, 300L, new vu5(this, 12, sz7Var));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getContext().getResources().getDimensionPixelSize(ktb.markdown_button_size));
            layoutParams.gravity = 8388613;
            layoutParams.bottomMargin = i == sz7.values().length - 1 ? 0 : tu0.G(4 * fk4.d().getDisplayMetrics().density);
            addView(tz7Var, layoutParams);
            tz7Var.a(i == this.c, false);
            arrayList.add(tz7Var);
            i = i2;
        }
        this.a = arrayList;
        c();
        this.t0 = fk4.d().getDisplayMetrics().density * 100.0f;
    }

    public final void a(int i, boolean z) {
        AnimatorSet animatorSet;
        final int i2 = 3;
        final int i3 = 0;
        final int i4 = 2;
        final int i5 = 1;
        tz7 tz7Var = (tz7) this.a.get(i);
        boolean zIsInEditMode = isInEditMode();
        RectF rectF = this.b;
        if (zIsInEditMode || !z || (!mr0.w(this).p())) {
            rectF.left = tz7Var.getLeft();
            rectF.top = tz7Var.getTop();
            rectF.right = tz7Var.getRight();
            rectF.bottom = tz7Var.getBottom();
            invalidate();
            return;
        }
        tg tgVarW = mr0.w(this);
        AnimatorSet animatorSet2 = this.s0;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.s0) != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(rectF.top, tz7Var.getTop());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz7
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarkdownMenuView markdownMenuView = this.b;
                switch (i3) {
                    case 0:
                        int i6 = MarkdownMenuView.u0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.u0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.u0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.u0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(rectF.left, tz7Var.getLeft());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz7
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarkdownMenuView markdownMenuView = this.b;
                switch (i5) {
                    case 0:
                        int i6 = MarkdownMenuView.u0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.u0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.u0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.u0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(rectF.right, tz7Var.getRight());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz7
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarkdownMenuView markdownMenuView = this.b;
                switch (i4) {
                    case 0:
                        int i6 = MarkdownMenuView.u0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.u0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.u0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.u0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(rectF.bottom, tz7Var.getBottom());
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: uz7
            public final /* synthetic */ MarkdownMenuView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MarkdownMenuView markdownMenuView = this.b;
                switch (i2) {
                    case 0:
                        int i6 = MarkdownMenuView.u0;
                        markdownMenuView.b.top = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 1:
                        int i7 = MarkdownMenuView.u0;
                        markdownMenuView.b.left = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    case 2:
                        int i8 = MarkdownMenuView.u0;
                        markdownMenuView.b.right = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        break;
                    default:
                        int i9 = MarkdownMenuView.u0;
                        markdownMenuView.b.bottom = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        markdownMenuView.postInvalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.s0 = animatorSet3;
        animatorSet3.setDuration(tgVarW.a.b());
        animatorSet3.setInterpolator(tgVarW.a.k());
        animatorSet3.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        animatorSet3.addListener(new qg(i, 1, this));
        animatorSet3.start();
    }

    @Override // defpackage.nse
    public final void c() {
        if (isInEditMode()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tz7) it.next()).c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.s0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        Paint paint = this.o;
        float f5 = this.t0;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b.isEmpty()) {
            a(0, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            return;
        }
        removeAllViews();
    }

    public final void setListener(vz7 listener) {
    }
}
