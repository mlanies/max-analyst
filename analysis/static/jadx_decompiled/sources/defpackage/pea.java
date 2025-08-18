package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class pea extends ViewGroup implements kre {
    public final BitSet a;
    public final BitSet b;
    public final int c;
    public final int o;
    public final TextView s0;
    public final TextView t0;
    public final ImageView u0;

    public pea(Context context) {
        super(context, null);
        BitSet bitSet = new BitSet(4);
        this.a = bitSet;
        BitSet bitSet2 = new BitSet(3);
        this.b = bitSet2;
        this.c = 1;
        this.o = 2;
        TextView textView = new TextView(context);
        textView.setText(z7.B(textView.getContext(), yoc.v0));
        i4f.o.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().j);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        i4f.m.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().e);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        np8.n(textView2);
        this.t0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.v));
        imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).getIcon().j));
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        float f = 12;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        int iG3 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        int iG4 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG4, iG2, iG4);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iG2 + iG3 + iG, (iG4 * 2) + iG3));
        this.u0 = imageView;
        addView(textView);
        addView(textView2);
        addView(imageView);
        float f2 = 5;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, true);
        bitSet2.set(2, false);
        bitSet2.set(1, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        TextView textView = this.s0;
        c54.L(paddingStart, getPaddingTop(), textView.getMeasuredWidth() + paddingStart, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        if (this.b.get(this.c)) {
            int iC = rh4.c(2, fk4.d().getDisplayMetrics().density, textView.getBottom());
            TextView textView2 = this.t0;
            c54.L(paddingStart, iC, textView2.getMeasuredWidth() + paddingStart, textView2.getMeasuredHeight() + iC, textView2, this);
        }
        int measuredWidth = getMeasuredWidth();
        ImageView imageView = this.u0;
        int measuredWidth2 = measuredWidth - imageView.getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
        c54.L(measuredWidth2, measuredHeight, measuredWidth, imageView.getMeasuredHeight() + measuredHeight, imageView, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.s0;
        BitSet bitSet = this.b;
        textView.setVisibility(bitSet.get(0) ? 0 : 8);
        TextView textView2 = this.t0;
        int i3 = this.c;
        textView2.setVisibility(bitSet.get(i3) ? 0 : 8);
        ImageView imageView = this.u0;
        int i4 = this.o;
        imageView.setVisibility(bitSet.get(i4) ? 0 : 8);
        int size = View.MeasureSpec.getSize(i);
        int iG = tu0.G(52 * fk4.d().getDisplayMetrics().density);
        int iQ = rh4.q(12, fk4.d().getDisplayMetrics().density, rh4.q(16, fk4.d().getDisplayMetrics().density, (size - getPaddingStart()) - getPaddingEnd()));
        if (bitSet.get(i4)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (bitSet.get(0)) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), 0);
        }
        if (bitSet.get(i3)) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(iQ, Integer.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.a;
        bitSet2.set(0, bitSet2.size(), false);
        setMeasuredDimension(size, iG);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.s0.setTextColor(fkaVar.getText().j);
        this.t0.setTextColor(fkaVar.getText().e);
        this.u0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().j));
        BitSet bitSet = this.a;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.u0, 300L, onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        BitSet bitSet = this.a;
        int i = this.o;
        bitSet.set(i, true);
        this.b.set(i, z);
        requestLayout();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
        BitSet bitSet = this.a;
        int i = this.c;
        bitSet.set(i, true);
        this.b.set(i, charSequence.length() > 0);
        requestLayout();
    }
}
