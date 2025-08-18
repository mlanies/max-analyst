package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class zs8 extends ViewGroup {
    public boolean a;
    public final int b;
    public final int c;
    public final int o;
    public final int s0;
    public final int t0;
    public View u0;
    public View v0;
    public final je7 w0;
    public long x0;
    public final RectF y0;
    public m56 z0;

    public zs8(Context context) {
        super(context);
        this.b = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        float f = 6;
        this.c = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.o = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(38 * fk4.d().getDisplayMetrics().density);
        this.t0 = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        this.w0 = o19.a.getAccessor().d(os0.class);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.y0 = new RectF();
    }

    private final os0 getBubbleUiOptions() {
        return (os0) this.w0.getValue();
    }

    public final int a(int i, ys8 ys8Var) {
        if (this.a) {
            i -= this.s0;
        }
        return i - (ys8Var.getMarginEnd() + (getPaddingEnd() + (getPaddingStart() + ys8Var.getMarginStart())));
    }

    public final long getAvatarId() {
        return this.x0;
    }

    public final View getContentView$message_list_release() {
        return this.u0;
    }

    public final int getContentViewTopMargin() {
        View view = this.u0;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final int getMaxAvailableWidth$message_list_release() {
        View view = this.v0;
        View view2 = this.u0;
        if (view != null && view.getVisibility() == 0) {
            return a(getMeasuredWidth(), (ys8) view.getLayoutParams());
        }
        if (view2 == null) {
            return getMeasuredWidth();
        }
        return a(getMeasuredWidth(), (ys8) view2.getLayoutParams());
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final m56 getOnAvatarClickListener$message_list_release() {
        return this.z0;
    }

    public final View getOutsideBubbleView$message_list_release() {
        return this.v0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        View view = this.u0;
        if (view != null) {
            int paddingStart = getPaddingStart();
            ys8 ys8Var = (ys8) view.getLayoutParams();
            if (ys8Var.a) {
                if (this.a) {
                    paddingStart += this.b + this.o;
                }
                marginEnd = ys8Var.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                marginEnd = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i5 = ((ViewGroup.MarginLayoutParams) ys8Var).topMargin;
            ote.E(view, marginEnd, i5, 0, 12);
            View view2 = this.v0;
            if (view2 == null || view2.getVisibility() != 0) {
                return;
            }
            ote.E(view2, marginEnd, view.getMeasuredHeight() + i5 + this.t0, 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        if (this.a) {
            int i4 = this.b;
            i3 = this.c;
            iMax = i4 + i3;
        } else {
            i3 = 0;
            iMax = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        View view = this.u0;
        if (view != null) {
            View view2 = this.v0;
            int i5 = (view2 == null || view2.getVisibility() != 0) ? Integer.MIN_VALUE : 1073741824;
            ys8 ys8Var = (ys8) view.getLayoutParams();
            int iA = a(defaultSize, ys8Var);
            int iIntValue = ((Number) ((w6a) getBubbleUiOptions()).d.getValue()).intValue();
            if (iIntValue <= iA) {
                iA = iIntValue;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(iA, i5), i2);
            iMax = Math.max(iMax + i3, view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ys8Var).topMargin + ((ViewGroup.MarginLayoutParams) ys8Var).bottomMargin);
            if (view2 != null && view2.getVisibility() == 0) {
                ys8 ys8Var2 = (ys8) view2.getLayoutParams();
                int iA2 = a(defaultSize, ys8Var2);
                int iIntValue2 = ((Number) ((w6a) getBubbleUiOptions()).d.getValue()).intValue();
                if (iIntValue2 <= iA2) {
                    iA2 = iIntValue2;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(iA2, 1073741824), i2);
                iMax = view2.getMeasuredHeight() + this.t0 + ((ViewGroup.MarginLayoutParams) ys8Var2).topMargin + ((ViewGroup.MarginLayoutParams) ys8Var2).bottomMargin + iMax;
            }
        }
        setMeasuredDimension(defaultSize, iMax);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m56 m56Var;
        RectF rectF = this.y0;
        if (rectF.isEmpty() || this.x0 <= 0 || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (m56Var = this.z0) != null) {
            m56Var.invoke(Long.valueOf(this.x0));
        }
        return true;
    }

    public final void setAvatarId(long j) {
        this.x0 = j;
    }

    public final void setListener(xs8 xs8Var) {
    }

    public final void setOffsetBubbleByAvatar(boolean z) {
        this.a = z;
    }

    public final void setOnAvatarClickListener$message_list_release(m56 m56Var) {
        this.z0 = m56Var;
    }
}
