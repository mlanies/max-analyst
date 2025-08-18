package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class v5e extends ViewGroup implements kre {
    public final TextView a;
    public final TextView b;
    public final OneMeButton c;
    public final int o;

    public v5e(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(tga.e);
        i4f.k.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().e);
        this.a = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(tga.d);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().i);
        this.b = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(tga.c);
        oneMeButton.setSize(c7a.a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setVisibility(4);
        this.c = oneMeButton;
        this.o = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        addView(textView);
        addView(textView2);
        addView(oneMeButton);
    }

    public final OneMeButton getHeaderButton() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.a;
        c54.L(paddingStart, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        TextView textView2 = this.b;
        c54.L(paddingStart, textView.getBottom(), textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + textView.getBottom(), textView2, this);
        int bottom = textView2.getBottom() / 2;
        OneMeButton oneMeButton = this.c;
        int measuredHeight = bottom - (oneMeButton.getMeasuredHeight() / 2);
        c54.L(getMeasuredWidth() - (oneMeButton.getMeasuredWidth() + getPaddingEnd()), measuredHeight, getMeasuredWidth() - getPaddingEnd(), oneMeButton.getMeasuredHeight() + measuredHeight, this.c, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        OneMeButton oneMeButton = this.c;
        oneMeButton.measure(iMakeMeasureSpec, i2);
        int measuredWidth = size - (oneMeButton.getMeasuredWidth() + this.o);
        TextView textView = this.a;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        TextView textView2 = this.b;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
        setMeasuredDimension(size, textView2.getMeasuredHeight() + textView.getMeasuredHeight());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        TextView textView = this.a;
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(this).getText().e);
        this.b.setTextColor(pq9Var.j(this).getText().i);
        this.c.onThemeChanged(fkaVar);
    }
}
