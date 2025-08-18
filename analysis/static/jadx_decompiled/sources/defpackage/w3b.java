package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class w3b extends ViewGroup {
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView o;
    public final t4b s0;
    public final uff t0;
    public n26 u0;
    public boolean v0;
    public v3b w0;

    public w3b(Context context) {
        super(context);
        float f = 12;
        this.a = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = 4;
        this.b = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        TextView textView = new TextView(context);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        kqe kqeVar = i4f.G;
        kqeVar.b(textView, du4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().e);
        kqeVar.b(textView2, du4.b);
        this.o = textView2;
        t4b t4bVar = new t4b(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ote.b0(pq9Var.p(t4bVar).c.getIcon().f, 0.8f));
        gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 100.0f);
        t4bVar.setThumb(gradientDrawable);
        float f3 = 2;
        t4bVar.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), t4bVar.getPaddingTop(), tu0.G(fk4.d().getDisplayMetrics().density * f3), t4bVar.getPaddingBottom());
        t4bVar.setProgressBackgroundTintList(ColorStateList.valueOf(pq9Var.p(t4bVar).c.getIcon().j));
        t4bVar.setProgressTintList(ColorStateList.valueOf(pq9Var.p(t4bVar).c.b().a.f));
        t4bVar.setSecondaryProgressTintList(ColorStateList.valueOf(pq9Var.p(t4bVar).c.getIcon().i));
        this.s0 = t4bVar;
        uff uffVar = new uff(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        uffVar.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        uffVar.a = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        float f4 = 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        uffVar.addView(progressBar, layoutParams);
        uffVar.c = progressBar;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(pq9Var.p(textView3).c.getText().e);
        i4f.w.b(textView3, du4.b);
        textView3.setGravity(17);
        float f5 = 6;
        textView3.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f5 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        uffVar.addView(textView3, layoutParams2);
        uffVar.b = textView3;
        uffVar.setElevation(fk4.d().getDisplayMetrics().density * 4.0f);
        float f6 = fk4.d().getDisplayMetrics().density * 14.0f;
        View view = new View(uffVar.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(tu0.G(1 * fk4.d().getDisplayMetrics().density), pq9Var.p(view).c.i().c);
        gradientDrawable2.setCornerRadius(f6);
        view.setBackground(gradientDrawable2);
        uffVar.addView(view, new FrameLayout.LayoutParams(-1, -1));
        uffVar.setOutlineProvider(new ix3(f6));
        this.t0 = uffVar;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textView);
        addView(textView2);
        addView(t4bVar);
        addView(uffVar);
        t4bVar.setOnSeekBarChangeListener(new og8(this, 1));
    }

    public final void a(zi2 zi2Var) {
        Bitmap bitmap;
        uff uffVar = this.t0;
        boolean z = zi2Var.c;
        boolean z2 = zi2Var.b;
        n26 n26Var = zi2Var.a;
        if ((n26Var == null && !z2) || !z) {
            uffVar.setVisibility(8);
            this.v0 = z;
            return;
        }
        this.u0 = n26Var;
        this.v0 = true;
        uffVar.c.setVisibility(z2 ? 0 : 8);
        n26 n26Var2 = this.u0;
        if (n26Var2 != null && (bitmap = n26Var2.a) != null && !bitmap.isRecycled()) {
            n26 n26Var3 = this.u0;
            uffVar.a.setImageBitmap(n26Var3 != null ? n26Var3.a : null);
        }
        uffVar.setVisibility(0);
    }

    public final v3b getListener() {
        return this.w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uff uffVar = this.t0;
        int visibility = uffVar.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            ote.E(uffVar, i6, i5 - uffVar.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        ote.E(textView, i6, i5, 0, 12);
        TextView textView2 = this.o;
        ote.E(textView2, (getMeasuredWidth() - i6) - textView2.getMeasuredWidth(), i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight();
        ote.E(this.s0, i6, measuredHeight + i5 + i5, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        TextView textView = this.c;
        textView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        t4b t4bVar = this.s0;
        t4bVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = t4bVar.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        n26 n26Var = this.u0;
        int i3 = n26Var != null ? n26Var.b : 0;
        int i4 = n26Var != null ? n26Var.c : 0;
        if (i3 != 0 && i4 != 0) {
            uff uffVar = this.t0;
            if (uffVar.getVisibility() == 0) {
                uffVar.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(v3b v3bVar) {
        this.w0 = v3bVar;
    }
}
