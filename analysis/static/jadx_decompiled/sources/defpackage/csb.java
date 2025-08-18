package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class csb extends ViewGroup implements kre {
    public final TextView a;
    public final h2a b;
    public final bsb c;
    public final je7 o;
    public final Paint s0;
    public final je7 t0;
    public final je7 u0;
    public final int v0;
    public final int w0;

    public csb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        i4f.t.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().g);
        textView.setSingleLine();
        textView.setFallbackLineSpacing(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        h2a h2aVar = new h2a(context);
        i4f.m.b(h2aVar, du4.b);
        h2aVar.setTextColor(pq9Var.j(h2aVar).getText().h);
        h2aVar.setSingleLine();
        h2aVar.setFallbackLineSpacing(false);
        h2aVar.setEllipsize(truncateAt);
        h2aVar.setFocusable(0);
        np8.n(h2aVar);
        h2aVar.setVisibility(8);
        this.b = h2aVar;
        bsb bsbVar = new bsb(context);
        bsbVar.setVisibility(8);
        this.c = bsbVar;
        this.o = tu0.r(3, new xda(context, 16));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(pq9Var.j(this).i().h);
        this.s0 = paint;
        this.t0 = tu0.r(3, new xda(context, 17));
        this.u0 = tu0.r(3, new xda(context, 18));
        this.v0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        float f = 4;
        this.w0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView);
        addView(h2aVar);
        addView(bsbVar);
        onThemeChanged(pq9Var.j(this));
    }

    private final void setCounter(int i) {
        je7 je7Var = this.o;
        caa caaVar = (caa) je7Var.getValue();
        caaVar.setVisibility(0);
        caaVar.g(i, false);
        br7.b(this, (View) je7Var.getValue(), null);
        requestLayout();
        invalidate();
    }

    public final void a(String str, String str2, Integer num, boolean z) {
        wnc wncVar;
        bsb bsbVar = this.c;
        bsbVar.getClass();
        bsbVar.setVisibility(str != null || ((str2 != null && !w9e.C0(str2)) || num != null) ? 0 : 8);
        OneMeDraweeView oneMeDraweeView = bsbVar.b;
        Object obj = null;
        wv6 wv6VarB = str2 != null ? wv6.b(str2) : null;
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.o(wv6VarB, null);
        la6 la6Var = (la6) oneMeDraweeView.getHierarchy();
        if (z) {
            wncVar = new wnc();
            wncVar.b = true;
        } else {
            wncVar = null;
        }
        la6Var.n(wncVar);
        je7 je7Var = bsbVar.o;
        if (str2 != null && !w9e.C0(str2)) {
            oneMeDraweeView.setVisibility(0);
            if (je7Var.a()) {
                ((View) je7Var.getValue()).setVisibility(8);
            }
            ((la6) oneMeDraweeView.getHierarchy()).i(null, 1);
            bsbVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (str == null) {
            if (num != null) {
                oneMeDraweeView.setVisibility(0);
                if (je7Var.a()) {
                    ((View) je7Var.getValue()).setVisibility(8);
                }
                la6 la6Var2 = (la6) oneMeDraweeView.getHierarchy();
                Context context = bsbVar.getContext();
                int iIntValue = num.intValue();
                pq9 pq9Var = qp4.u0;
                la6Var2.i(ngg.u(iIntValue, pq9Var.j(bsbVar).getIcon().i, context), 1);
                int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                bsbVar.setPadding(iG, iG, iG, iG);
                bsbVar.setBackgroundColor(pq9Var.j(bsbVar).b().a.g);
                return;
            }
            return;
        }
        oneMeDraweeView.setVisibility(8);
        ((View) je7Var.getValue()).setVisibility(0);
        bsbVar.setPadding(0, 0, 0, 0);
        String strV0 = w9e.V0(str);
        Iterator it = sf5.c.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            Object next = u1Var.next();
            if (eae.k0(((sf5) next).name(), strV0, true)) {
                obj = next;
                break;
            }
        }
        uf5 uf5VarW = (sf5) obj;
        if (uf5VarW == null) {
            tf5 tf5Var = tf5.c;
            uf5VarW = ema.w(strV0);
        }
        ((ph5) bsbVar.c.getValue()).a(uf5VarW);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float strokeWidth;
        float f;
        float measuredWidth;
        float strokeWidth2;
        float f2;
        boolean zK = c54.K(this);
        je7 je7Var = this.t0;
        Paint paint = this.s0;
        if (zK) {
            if (br7.H(je7Var)) {
                f2 = 2;
                measuredWidth = rh4.q(f2, fk4.d().getDisplayMetrics().density, (getMeasuredWidth() - getPaddingEnd()) - br7.B(je7Var));
                strokeWidth2 = paint.getStrokeWidth();
            } else {
                measuredWidth = getMeasuredWidth() - getPaddingEnd();
                strokeWidth2 = paint.getStrokeWidth();
                f2 = 2;
            }
            f = measuredWidth - (strokeWidth2 / f2);
        } else {
            if (br7.H(je7Var)) {
                int iB = br7.B(je7Var) + getPaddingStart();
                strokeWidth = (paint.getStrokeWidth() / 2) + rh4.c(r0, fk4.d().getDisplayMetrics().density, iB);
            } else {
                strokeWidth = (paint.getStrokeWidth() / 2) + getPaddingStart();
            }
            f = strokeWidth;
        }
        canvas.drawLine(f, getPaddingTop(), f, getMeasuredHeight() - getPaddingBottom(), paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        je7 je7Var = this.o;
        if (je7Var.a() && view == je7Var.getValue() && this.c.getVisibility() != 0) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final TextView getTitleView() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        je7 je7Var = this.t0;
        if (br7.H(je7Var)) {
            ImageView imageView = (ImageView) je7Var.getValue();
            ote.D(imageView, paddingStart, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + paddingStart, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            paddingStart = wg0.d(2, fk4.d().getDisplayMetrics().density, imageView.getMeasuredWidth(), paddingStart);
        }
        int iG = tu0.G(this.s0.getStrokeWidth());
        int i5 = this.v0;
        int measuredWidth = iG + i5 + paddingStart;
        bsb bsbVar = this.c;
        if (bsbVar.getVisibility() == 0) {
            ote.D(bsbVar, measuredWidth, (getMeasuredHeight() / 2) - (bsbVar.getMeasuredHeight() / 2), bsbVar.getMeasuredWidth() + measuredWidth, (bsbVar.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            measuredWidth += bsbVar.getMeasuredWidth() + i5;
            je7 je7Var2 = this.o;
            if (je7Var2.a()) {
                caa caaVar = (caa) je7Var2.getValue();
                float f = 2;
                ote.D(caaVar, rh4.q(f, fk4.d().getDisplayMetrics().density, bsbVar.getLeft()), rh4.c(f, fk4.d().getDisplayMetrics().density, bsbVar.getBottom()) - caaVar.getMeasuredHeight(), caaVar.getMeasuredWidth() + rh4.q(f, fk4.d().getDisplayMetrics().density, bsbVar.getLeft()), rh4.c(f, fk4.d().getDisplayMetrics().density, bsbVar.getBottom()));
            }
        }
        h2a h2aVar = this.b;
        int visibility = h2aVar.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            float f2 = 4;
            ote.E(textView, measuredWidth, rh4.c(f2, fk4.d().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int iQ = rh4.q(f2, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            ote.D(h2aVar, measuredWidth, iQ - h2aVar.getMeasuredHeight(), h2aVar.getMeasuredWidth() + measuredWidth, iQ);
        } else {
            ote.D(textView, measuredWidth, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + measuredWidth, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        je7 je7Var3 = this.u0;
        if (br7.H(je7Var3)) {
            ImageView imageView2 = (ImageView) je7Var3.getValue();
            int iQ2 = rh4.q(36, fk4.d().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            ote.D(imageView2, iQ2, (getMeasuredHeight() / 2) - (imageView2.getMeasuredHeight() / 2), imageView2.getMeasuredWidth() + iQ2, (imageView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Paint paint = this.s0;
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int iG = tu0.G(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.v0;
        int paddingEnd = getPaddingEnd() + iG + i3;
        je7 je7Var = this.t0;
        if (br7.H(je7Var)) {
            int iG2 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
            ((ImageView) je7Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG2, 1073741824), View.MeasureSpec.makeMeasureSpec(iG2, 1073741824));
            paddingEnd = wg0.d(2, fk4.d().getDisplayMetrics().density, ((ImageView) je7Var.getValue()).getMeasuredWidth(), paddingEnd);
        }
        bsb bsbVar = this.c;
        if (bsbVar.getVisibility() == 0) {
            int iG3 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
            bsbVar.measure(View.MeasureSpec.makeMeasureSpec(iG3, 1073741824), View.MeasureSpec.makeMeasureSpec(iG3, 1073741824));
            paddingEnd += bsbVar.getMeasuredWidth() + i3;
            je7 je7Var2 = this.o;
            if (je7Var2.a()) {
                ((caa) je7Var2.getValue()).measure(0, 0);
            }
        }
        je7 je7Var3 = this.u0;
        if (br7.H(je7Var3)) {
            int iG4 = tu0.G(36 * fk4.d().getDisplayMetrics().density);
            ((ImageView) je7Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG4, 1073741824), View.MeasureSpec.makeMeasureSpec(iG4, 1073741824));
            paddingEnd = wg0.d(6, fk4.d().getDisplayMetrics().density, ((ImageView) je7Var3.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int i4 = size - paddingEnd;
        if (i4 < 0) {
            i4 = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec, 0);
        int measuredHeight = textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        int i5 = this.w0;
        int measuredHeight2 = (i5 * 2) + measuredHeight;
        h2a h2aVar = this.b;
        if (h2aVar.getVisibility() == 0) {
            h2aVar.measure(iMakeMeasureSpec, 0);
            measuredHeight2 += h2aVar.getMeasuredHeight() + i5;
        }
        if (bsbVar.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + (tu0.G(2 * fk4.d().getDisplayMetrics().density) * 2) + bsbVar.getMeasuredHeight());
        } else {
            setMeasuredDimension(size, measuredHeight2);
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setTextColor(fkaVar.getText().g);
        this.b.setTextColor(fkaVar.getText().h);
        this.s0.setColor(fkaVar.i().h);
        je7 je7Var = this.o;
        if (je7Var.a()) {
            ((caa) je7Var.getValue()).f(fkaVar);
        }
        je7 je7Var2 = this.t0;
        if (je7Var2.a()) {
            ((ImageView) je7Var2.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().k));
        }
        je7 je7Var3 = this.u0;
        if (je7Var3.a()) {
            ((ImageView) je7Var3.getValue()).setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().i));
        }
        bsb bsbVar = this.c;
        je7 je7Var4 = bsbVar.c;
        if (je7Var4.a()) {
            ((ph5) je7Var4.getValue()).onThemeChanged(fkaVar);
        }
        OneMeDraweeView oneMeDraweeView = bsbVar.b;
        if (((la6) oneMeDraweeView.getHierarchy()).e.a(1) != null) {
            oneMeDraweeView.setBackgroundColor(fkaVar.b().a.g);
        }
        je7 je7Var5 = bsbVar.s0;
        if (!je7Var5.a() || ((LayerDrawable) je7Var5.getValue()).getNumberOfLayers() <= 1) {
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) je7Var5.getValue();
        ne0 ne0VarB = fkaVar.b();
        Drawable drawable = layerDrawable.getDrawable(0);
        ngg.G(drawable, ne0VarB.e);
        layerDrawable.setDrawable(0, drawable);
        LayerDrawable layerDrawable2 = (LayerDrawable) je7Var5.getValue();
        bs6 icon = fkaVar.getIcon();
        Drawable drawable2 = layerDrawable2.getDrawable(1);
        ngg.G(drawable2, icon.b);
        layerDrawable2.setDrawable(1, drawable2);
    }

    public final void setAttachDescription(ez ezVar) {
        setBody(ezVar != null ? ezVar.a : null);
        String str = ezVar != null ? ezVar.b : null;
        String str2 = ezVar != null ? ezVar.c : null;
        Integer num = ezVar != null ? ezVar.d : null;
        boolean z = false;
        if (ezVar != null && ezVar.f) {
            z = true;
        }
        a(str, str2, num, z);
        setCounter(ezVar != null ? ezVar.e : null);
    }

    public final void setBody(CharSequence charSequence) {
        h2a h2aVar = this.b;
        if (charSequence == null || w9e.C0(charSequence)) {
            h2aVar.setVisibility(8);
            return;
        }
        h2aVar.setVisibility(0);
        h2aVar.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z) {
        this.c.setDrawOverlay(z);
    }

    public final void setEndIconClickListener(View.OnClickListener onClickListener) {
        je7 je7Var = this.u0;
        if (je7Var.a()) {
            tu0.K((ImageView) je7Var.getValue(), 300L, onClickListener);
        }
    }

    public final void setEndIconDrawable(Drawable drawable) {
        je7 je7Var = this.u0;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7Var.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            br7.b(this, (View) je7Var.getValue(), -1);
        } else if (je7Var.a()) {
            ImageView imageView2 = (ImageView) je7Var.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.c, 300L, onClickListener);
    }

    public final void setStartIconClickListener(View.OnClickListener onClickListener) {
        je7 je7Var = this.t0;
        if (je7Var.a()) {
            tu0.K((ImageView) je7Var.getValue(), 300L, onClickListener);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        je7 je7Var = this.t0;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7Var.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            br7.b(this, (View) je7Var.getValue(), -1);
        } else if (je7Var.a()) {
            ImageView imageView2 = (ImageView) je7Var.getValue();
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setCounter(Integer num) {
        if (num == null) {
            je7 je7Var = this.o;
            if (je7Var.a()) {
                ((caa) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
