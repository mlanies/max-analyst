package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g07 extends ViewGroup implements v3b {
    public final je7 A0;
    public final kld B0;
    public final v7c C0;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int s0;
    public final int t0;
    public final TextView u0;
    public final TextView v0;
    public final je7 w0;
    public final je7 x0;
    public final ImageView y0;
    public final je7 z0;

    public g07(final Context context) {
        super(context);
        this.a = tu0.G(9 * fk4.d().getDisplayMetrics().density);
        this.b = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        this.c = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        this.o = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        float f = 8;
        this.s0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.t0 = tu0.G(1 * fk4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setId(k8a.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        i4f.q.b(textView, du4.b);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(k8a.b);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams2);
        i4f.G.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().e);
        this.v0 = textView2;
        final int i = 0;
        this.w0 = tu0.r(3, new k56() { // from class: e07
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        w3b w3bVar = new w3b(context);
                        w3bVar.setListener(this);
                        return w3bVar;
                    default:
                        ImageView imageView = new ImageView(context);
                        int i2 = woc.b2;
                        pq9 pq9Var2 = qp4.u0;
                        bs6 icon = pq9Var2.p(imageView).c.getIcon();
                        Drawable drawableB = kt3.b(imageView.getContext(), i2);
                        ngg.G(drawableB, icon.f);
                        imageView.setImageDrawable(drawableB);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var2.p(imageView).c.d().a.a.h), null, null));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG, iG, iG, iG);
                        tu0.K(imageView, 300L, new f07(this, 1));
                        return imageView;
                }
            }
        });
        final int i2 = 1;
        this.x0 = tu0.r(3, new k56() { // from class: e07
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        w3b w3bVar = new w3b(context);
                        w3bVar.setListener(this);
                        return w3bVar;
                    default:
                        ImageView imageView = new ImageView(context);
                        int i22 = woc.b2;
                        pq9 pq9Var2 = qp4.u0;
                        bs6 icon = pq9Var2.p(imageView).c.getIcon();
                        Drawable drawableB = kt3.b(imageView.getContext(), i22);
                        ngg.G(drawableB, icon.f);
                        imageView.setImageDrawable(drawableB);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var2.p(imageView).c.d().a.a.h), null, null));
                        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                        imageView.setPadding(iG, iG, iG, iG);
                        tu0.K(imageView, 300L, new f07(this, 1));
                        return imageView;
                }
            }
        });
        ImageView imageView = new ImageView(context);
        int i3 = yfa.h;
        bs6 icon = pq9Var.p(imageView).c.getIcon();
        Drawable drawableB = kt3.b(imageView.getContext(), i3);
        ngg.G(drawableB, icon.f);
        imageView.setImageDrawable(drawableB);
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.p(imageView).c.d().a.a.h), null, null));
        int iG = tu0.G(f * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG, iG, iG);
        tu0.K(imageView, 300L, new f07(this, 0));
        this.y0 = imageView;
        this.z0 = tu0.r(3, new hy4(context, 9));
        this.A0 = tu0.r(3, new hy4(context, 10));
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.B0 = kldVarB;
        this.C0 = new v7c(kldVarB);
        addView(textView);
        addView(textView2);
        addView(imageView);
    }

    public final void a(aj2 aj2Var) {
        je7 je7Var = this.w0;
        br7.b(this, (View) je7Var.getValue(), -1);
        ((View) je7Var.getValue()).setVisibility(0);
        je7 je7Var2 = this.x0;
        br7.b(this, (View) je7Var2.getValue(), -1);
        ((View) je7Var2.getValue()).setVisibility(0);
        ((w3b) je7Var.getValue()).a(aj2Var.d);
    }

    public final void b(boolean z) {
        Drawable drawableB;
        je7 je7Var = this.x0;
        if (je7Var.a()) {
            ImageView imageView = (ImageView) je7Var.getValue();
            pq9 pq9Var = qp4.u0;
            if (z) {
                int i = woc.a2;
                bs6 icon = pq9Var.p(imageView).c.getIcon();
                drawableB = kt3.b(imageView.getContext(), i);
                ngg.G(drawableB, icon.f);
            } else {
                int i2 = woc.b2;
                bs6 icon2 = pq9Var.p(imageView).c.getIcon();
                drawableB = kt3.b(imageView.getContext(), i2);
                ngg.G(drawableB, icon2.f);
            }
            imageView.setImageDrawable(drawableB);
        }
    }

    public final void c(long j, long j2, long j3) {
        w3b w3bVar = (w3b) this.w0.getValue();
        w3bVar.o.setText(tfg.c(j3));
        w3bVar.c.setText(tfg.c(j));
        t4b t4bVar = w3bVar.s0;
        t4bVar.setMax((int) j3);
        t4bVar.setSecondaryProgress((int) j2);
        t4bVar.setProgress((int) j);
    }

    public final gld getEvents() {
        return this.C0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        je7 je7Var = this.z0;
        boolean zH = br7.H(je7Var);
        int i5 = this.s0;
        if (zH) {
            ote.E((View) je7Var.getValue(), 0, paddingTop, 0, 12);
            int measuredHeight = ((TextView) je7Var.getValue()).getMeasuredHeight() + i5 + paddingTop;
            je7 je7Var2 = this.A0;
            ote.E((View) je7Var2.getValue(), 0, ((TextView) je7Var.getValue()).getBottom() + i5, 0, 12);
            paddingTop = ((View) je7Var2.getValue()).getMeasuredHeight() + measuredHeight;
        }
        je7 je7Var3 = this.w0;
        if (br7.H(je7Var3) && ((w3b) je7Var3.getValue()).getParent() != null) {
            if (!br7.H(je7Var)) {
                i5 = 0;
            }
            int i6 = paddingTop + i5;
            ote.E((View) je7Var3.getValue(), 0, i6, 0, 12);
            paddingTop = i6 + ((w3b) je7Var3.getValue()).getMeasuredHeight();
        }
        int measuredWidth = getMeasuredWidth() / 2;
        TextView textView = this.u0;
        int measuredWidth2 = measuredWidth - (textView.getMeasuredWidth() / 2);
        int i7 = paddingTop + this.a;
        ote.E(textView, measuredWidth2, i7, 0, 12);
        int measuredWidth3 = getMeasuredWidth() / 2;
        TextView textView2 = this.v0;
        ote.E(textView2, measuredWidth3 - (textView2.getMeasuredWidth() / 2), textView.getMeasuredHeight() + this.b + i7, 0, 12);
        je7 je7Var4 = this.x0;
        boolean zH2 = br7.H(je7Var4);
        ImageView imageView = this.y0;
        int i8 = this.c;
        if (zH2) {
            ote.E((View) je7Var4.getValue(), i8, ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            ote.E(imageView, (getMeasuredWidth() - i8) - imageView.getMeasuredWidth(), ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        je7 je7Var = this.z0;
        boolean zH = br7.H(je7Var);
        int i3 = this.s0;
        if (zH) {
            ((TextView) je7Var.getValue()).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            je7 je7Var2 = this.A0;
            ((View) je7Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.t0, 1073741824));
            measuredHeight = ((View) je7Var2.getValue()).getMeasuredHeight() + ((TextView) je7Var.getValue()).getMeasuredHeight() + i3;
        } else {
            measuredHeight = 0;
        }
        je7 je7Var3 = this.w0;
        if (br7.H(je7Var3) && ((w3b) je7Var3.getValue()).getParent() != null) {
            ((w3b) je7Var3.getValue()).measure(i, i2);
            int measuredHeight2 = ((w3b) je7Var3.getValue()).getMeasuredHeight();
            if (!br7.H(je7Var)) {
                i3 = 0;
            }
            measuredHeight += measuredHeight2 + i3;
        }
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        je7 je7Var4 = this.x0;
        boolean zH2 = br7.H(je7Var4);
        int i4 = this.c;
        if (zH2) {
            ((ImageView) je7Var4.getValue()).measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            measuredWidth = size - (((ImageView) je7Var4.getValue()).getMeasuredWidth() + i4);
        } else {
            measuredWidth = size;
        }
        ImageView imageView = this.y0;
        if (imageView.getVisibility() == 0) {
            imageView.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
            measuredWidth -= imageView.getMeasuredWidth() + i4;
        }
        TextView textView = this.u0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), iMakeMeasureSpec2);
        int measuredHeight3 = textView.getMeasuredHeight() + this.a + measuredHeight;
        TextView textView2 = this.v0;
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + measuredHeight3);
    }
}
