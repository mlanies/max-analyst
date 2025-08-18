package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class p5g extends ViewGroup implements kre {
    public final bu6 a;
    public final TextView b;
    public final TextView c;
    public final c17 o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final int v0;
    public final int w0;
    public final float x0;
    public tc9 y0;

    public p5g(Context context) {
        super(context, null);
        bu6 bu6Var = new bu6(context);
        bu6Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.a = bu6Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(1);
        textView.setVisibility(0);
        this.b = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView2.setGravity(1);
        if (bk7.a == null) {
            bk7.a = new bk7();
        }
        textView2.setMovementMethod(bk7.a);
        i4f.f.b(textView2, du4.b);
        this.c = textView2;
        c17 c17Var = new c17(context);
        c17Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.o = c17Var;
        this.s0 = tu0.G(272 * fk4.d().getDisplayMetrics().density);
        int iG = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        this.t0 = iG;
        float f = 16;
        this.u0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.v0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.w0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        this.x0 = fk4.d().getDisplayMetrics().density * 14.0f;
        setPadding(getPaddingLeft(), iG, getPaddingRight(), iG);
        addView(bu6Var);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        tc9 tc9Var = this.y0;
        if (tc9Var == null) {
            return;
        }
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() / 2;
        List list = tc9Var.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            s5g s5gVar = (s5g) list.get(i5);
            if (s5gVar instanceof t5g) {
                c17 c17Var = this.o;
                int measuredWidth2 = measuredWidth - (c17Var.getMeasuredWidth() / 2);
                paddingTop += this.v0;
                ote.E(c17Var, measuredWidth2, paddingTop, 0, 12);
            } else {
                boolean z2 = s5gVar instanceof u5g;
                int i6 = this.w0;
                if (z2) {
                    bu6 bu6Var = this.a;
                    int measuredWidth3 = measuredWidth - (bu6Var.getMeasuredWidth() / 2);
                    if (i5 != 0) {
                        paddingTop += i6;
                    }
                    ote.E(bu6Var, measuredWidth3, paddingTop, 0, 12);
                    measuredHeight = bu6Var.getMeasuredHeight() + this.u0;
                } else {
                    if (!(s5gVar instanceof v5g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((v5g) s5gVar).c) {
                        TextView textView = this.c;
                        paddingTop += i6;
                        ote.E(textView, measuredWidth - (textView.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView.getMeasuredHeight();
                    } else {
                        TextView textView2 = this.b;
                        ote.E(textView2, measuredWidth - (textView2.getMeasuredWidth() / 2), paddingTop, 0, 12);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                paddingTop = measuredHeight + paddingTop;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredHeight2;
        tc9 tc9Var = this.y0;
        if (tc9Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        List list = tc9Var.b;
        int size = list.size();
        int i3 = 0;
        while (true) {
            int i4 = this.s0;
            if (i3 >= size) {
                setMeasuredDimension(i4, paddingBottom);
                return;
            }
            s5g s5gVar = (s5g) list.get(i3);
            boolean z = s5gVar instanceof t5g;
            int i5 = this.w0;
            if (z) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (this.v0 * 2), 1073741824);
                c17 c17Var = this.o;
                c17Var.measure(iMakeMeasureSpec, i2);
                measuredHeight2 = c17Var.getMeasuredHeight();
            } else {
                boolean z2 = s5gVar instanceof u5g;
                int i6 = this.t0;
                if (z2) {
                    u5g u5gVar = (u5g) s5gVar;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4 - (i6 * 2), tu0.G(u5gVar.a.getWidth() * fk4.d().getDisplayMetrics().density)), 1073741824);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(tu0.G(u5gVar.a.getHeight() * fk4.d().getDisplayMetrics().density), 1073741824);
                    bu6 bu6Var = this.a;
                    bu6Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    if (i3 != 0) {
                        paddingBottom += i5;
                    }
                    measuredHeight = bu6Var.getMeasuredHeight() + this.u0;
                } else {
                    if (!(s5gVar instanceof v5g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((v5g) s5gVar).c) {
                        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i4 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView = this.c;
                        textView.measure(iMakeMeasureSpec4, i2);
                        measuredHeight2 = textView.getMeasuredHeight();
                    } else {
                        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i4 - (i6 * 2), Integer.MIN_VALUE);
                        TextView textView2 = this.b;
                        textView2.measure(iMakeMeasureSpec5, i2);
                        measuredHeight = textView2.getMeasuredHeight();
                    }
                }
                paddingBottom = measuredHeight + paddingBottom;
                i3++;
            }
            measuredHeight = measuredHeight2 + i5;
            paddingBottom = measuredHeight + paddingBottom;
            i3++;
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        bu6 bu6Var = this.a;
        if (bu6Var.getColorFilter() != null) {
            bu6Var.setColorFilter(fkaVar.a().s().c.b);
        }
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setTextColor(fkaVar.getText().g);
    }

    public final void setKeyboardListener(b17 b17Var) {
        this.o.setClickListener(b17Var);
    }
}
