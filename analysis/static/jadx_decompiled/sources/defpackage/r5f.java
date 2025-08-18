package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class r5f extends ndc implements kre {
    public FrameLayout Y;
    public final m29 a;
    public final RecyclerView b;
    public long c;
    public final gaa o = new gaa(17);
    public final Rect X = new Rect();
    public du4 Z = du4.b;

    public r5f(m29 m29Var, EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = m29Var;
        this.b = endlessRecyclerView2;
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        super.f(rect, view, recyclerView, zdcVar);
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        gaa gaaVar = this.o;
        if (iR >= 0) {
            m29 m29Var = this.a;
            if (iR < m29Var.o.f.size()) {
                long j = this.c;
                if (j != 0) {
                    int iK = m29Var.K(j);
                    MessageModel messageModelL = m29Var.L(iK);
                    Long lValueOf = messageModelL != null ? Long.valueOf(messageModelL.c) : null;
                    if (iK == iR && (lValueOf == null || lValueOf.longValue() != j)) {
                        rect.top = i().getMeasuredHeight() + rect.top;
                    }
                }
                gaaVar.E(rect, view, recyclerView);
                return;
            }
        }
        gaaVar.E(rect, view, recyclerView);
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iK;
        MessageModel messageModelL;
        if (recyclerView.getChildCount() <= 0) {
            return;
        }
        m29 m29Var = this.a;
        if (m29Var.j() <= 0) {
            return;
        }
        long j = this.c;
        if (j == 0 || (iK = m29Var.K(j)) == -1) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int iR = RecyclerView.R(childAt);
            if (iR == iK && (messageModelL = m29Var.L(iR)) != null) {
                if (messageModelL.c != this.c) {
                    View viewI = i();
                    gaa gaaVar = this.o;
                    Rect rect = this.X;
                    gaaVar.x(rect, childAt, iR);
                    int i3 = rect.top;
                    ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i4 = ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) / 2) + i3;
                    canvas.save();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewI.getLayoutParams();
                    int i5 = marginLayoutParams2.leftMargin;
                    c54.L(i5, marginLayoutParams2.topMargin, (viewI.getMeasuredWidth() + i5) - marginLayoutParams2.rightMargin, (viewI.getMeasuredHeight() + marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, viewI, this.b);
                    canvas.translate(0.0f, i4);
                    viewI.draw(canvas);
                    canvas.restore();
                }
            }
            i = i2;
        }
    }

    public final View i() {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            return frameLayout;
        }
        RecyclerView recyclerView = this.b;
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return new Space(recyclerView.getContext());
        }
        FrameLayout frameLayout2 = new FrameLayout(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 8;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.topMargin = iG;
        layoutParams.bottomMargin = iG;
        frameLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        pq9 pq9Var = qp4.u0;
        gradientDrawable.setColors(pq9Var.j(frameLayout2).a().s().b.w);
        frameLayout2.setBackground(gradientDrawable);
        TextView textView = new TextView(recyclerView.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        int iG2 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        layoutParams2.topMargin = iG2;
        layoutParams2.bottomMargin = iG2;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(pq9Var.j(textView).a().s().g.b);
        textView.setText(textView.getContext().getString(oda.o0));
        os2.f.b(textView, this.Z);
        frameLayout2.addView(textView);
        frameLayout2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, frameLayout2.getLayoutParams().height));
        this.Y = frameLayout2;
        return frameLayout2;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        FrameLayout frameLayout = this.Y;
        if (frameLayout != null) {
            Drawable background = frameLayout.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColors(fkaVar.a().s().b.w);
            }
            ((TextView) frameLayout.getChildAt(0)).setTextColor(fkaVar.a().s().g.b);
        }
    }
}
