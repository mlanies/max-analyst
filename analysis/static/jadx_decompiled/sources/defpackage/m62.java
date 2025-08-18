package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class m62 extends ViewGroup implements kre {
    public final View A0;
    public final View B0;
    public final View C0;
    public final BitSet D0;
    public final BitSet E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public boolean O0;
    public final cu1 P0;
    public long Q0;
    public final e4f R0;
    public final s5a a;
    public final TextView b;
    public final iw4 c;
    public final iw4 o;
    public final TextView s0;
    public final uv9 t0;
    public Drawable u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public m62(final Context context) {
        super(context, null, 0, 0);
        s5a s5aVar = new s5a(context);
        s5aVar.setFocusable(0);
        this.a = s5aVar;
        TextView textView = new TextView(context);
        i4f.I.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().e);
        textView.setSingleLine();
        textView.setFallbackLineSpacing(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.b = textView;
        iw4 iw4Var = new iw4(context);
        kqe kqeVar = i4f.K;
        kqeVar.b(iw4Var, du4.b);
        iw4Var.setTextColor(pq9Var.j(iw4Var).getText().g);
        iw4Var.setMaxLines(2);
        iw4Var.setFallbackLineSpacing(false);
        iw4Var.setEllipsize(truncateAt);
        iw4Var.setFocusable(0);
        np8.n(iw4Var);
        this.c = iw4Var;
        iw4 iw4Var2 = new iw4(context);
        kqeVar.b(iw4Var2, du4.b);
        iw4Var2.setTextColor(pq9Var.j(iw4Var2).getText().g);
        iw4Var2.setFallbackLineSpacing(false);
        iw4Var2.setMaxLines(2);
        iw4Var2.setEllipsize(truncateAt);
        iw4Var2.setFocusable(0);
        this.o = iw4Var2;
        TextView textView2 = new TextView(context);
        i4f.J.b(textView2, du4.b);
        textView2.setFallbackLineSpacing(false);
        textView2.setTextColor(pq9Var.j(textView2).getText().i);
        textView2.setFocusable(0);
        this.s0 = textView2;
        uv9 uv9Var = new uv9(context);
        uv9Var.setFocusable(0);
        this.t0 = uv9Var;
        final int i = 0;
        this.v0 = tu0.r(3, new k56() { // from class: j62
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qe qeVar = new qe(context);
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = (EnhancedAnimatedVectorDrawable) qeVar.getDrawable();
                        m62 m62Var = this;
                        enhancedAnimatedVectorDrawable.setCallback(m62Var);
                        qeVar.a(qp4.u0.j(m62Var).getIcon().h);
                        return qeVar;
                    default:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, woc.H);
                        c54.Z(enhancedVectorDrawable, "error", qp4.u0.j(this).d().b.a.c);
                        return enhancedVectorDrawable;
                }
            }
        });
        final int i2 = 0;
        this.w0 = tu0.r(3, new k56(this) { // from class: k62
            public final /* synthetic */ m62 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i3 = woc.k;
                        m62 m62Var = this.b;
                        Drawable drawableB = kt3.b(m62Var.getContext(), i3);
                        ngg.G(drawableB, qp4.u0.j(m62Var).getIcon().k);
                        return drawableB;
                    case 1:
                        int i4 = woc.i;
                        m62 m62Var2 = this.b;
                        Drawable drawableB2 = kt3.b(m62Var2.getContext(), i4);
                        ngg.G(drawableB2, qp4.u0.j(m62Var2).getIcon().k);
                        return drawableB2;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this.b).d().a.a.h), null, new ColorDrawable(-1));
                }
            }
        });
        final int i3 = 1;
        this.x0 = tu0.r(3, new k56(this) { // from class: k62
            public final /* synthetic */ m62 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i32 = woc.k;
                        m62 m62Var = this.b;
                        Drawable drawableB = kt3.b(m62Var.getContext(), i32);
                        ngg.G(drawableB, qp4.u0.j(m62Var).getIcon().k);
                        return drawableB;
                    case 1:
                        int i4 = woc.i;
                        m62 m62Var2 = this.b;
                        Drawable drawableB2 = kt3.b(m62Var2.getContext(), i4);
                        ngg.G(drawableB2, qp4.u0.j(m62Var2).getIcon().k);
                        return drawableB2;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this.b).d().a.a.h), null, new ColorDrawable(-1));
                }
            }
        });
        this.y0 = tu0.r(3, new k56() { // from class: j62
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qe qeVar = new qe(context);
                        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = (EnhancedAnimatedVectorDrawable) qeVar.getDrawable();
                        m62 m62Var = this;
                        enhancedAnimatedVectorDrawable.setCallback(m62Var);
                        qeVar.a(qp4.u0.j(m62Var).getIcon().h);
                        return qeVar;
                    default:
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, woc.H);
                        c54.Z(enhancedVectorDrawable, "error", qp4.u0.j(this).d().b.a.c);
                        return enhancedVectorDrawable;
                }
            }
        });
        final int i4 = 2;
        this.z0 = tu0.r(3, new k56(this) { // from class: k62
            public final /* synthetic */ m62 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int i32 = woc.k;
                        m62 m62Var = this.b;
                        Drawable drawableB = kt3.b(m62Var.getContext(), i32);
                        ngg.G(drawableB, qp4.u0.j(m62Var).getIcon().k);
                        return drawableB;
                    case 1:
                        int i42 = woc.i;
                        m62 m62Var2 = this.b;
                        Drawable drawableB2 = kt3.b(m62Var2.getContext(), i42);
                        ngg.G(drawableB2, qp4.u0.j(m62Var2).getIcon().k);
                        return drawableB2;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this.b).d().a.a.h), null, new ColorDrawable(-1));
                }
            }
        });
        View view = new View(context);
        Drawable drawableB = kt3.b(view.getContext(), woc.D1);
        ngg.G(drawableB, pq9Var.j(view).getIcon().h);
        view.setBackground(drawableB);
        view.setFocusable(0);
        this.A0 = view;
        View view2 = new View(context);
        Drawable drawableB2 = kt3.b(view2.getContext(), woc.t1);
        ngg.G(drawableB2, pq9Var.j(view2).getIcon().h);
        view2.setBackground(drawableB2);
        view2.setFocusable(0);
        this.B0 = view2;
        View view3 = new View(context);
        view3.setBackground(new ColorDrawable(-16711936));
        view3.setFocusable(0);
        this.C0 = view3;
        BitSet bitSet = new BitSet(8);
        this.D0 = bitSet;
        BitSet bitSet2 = new BitSet(8);
        this.E0 = bitSet2;
        this.F0 = 1;
        this.G0 = 2;
        this.H0 = 3;
        this.I0 = 4;
        this.J0 = 5;
        this.K0 = 6;
        this.L0 = 7;
        this.M0 = 8;
        this.N0 = 9;
        this.P0 = new cu1(11, this);
        e4f e4fVar = new e4f(pq9Var.b(context).i(), new we1(7));
        int iG = tu0.G(20 * fk4.d().getDisplayMetrics().density);
        e4fVar.setBounds(0, 0, iG, iG);
        e4fVar.setCallback(this);
        this.R0 = e4fVar;
        setBackground(getRippleDrawable());
        addView(s5aVar);
        addView(textView, -1, -2);
        addView(iw4Var, -1, -2);
        addView(iw4Var2, -1, -2);
        addView(textView2);
        addView(view2);
        addView(uv9Var);
        addView(view);
        addView(view3);
        float f = 6;
        float f2 = 10;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, bitSet2.size(), false);
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.z0.getValue();
    }

    public final boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        iw4 iw4Var = this.c;
        return iw4Var.getPaint().measureText(str) > ((float) iw4Var.getMeasuredWidth());
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        TextView textView = this.b;
        return textView.getPaint().measureText(str) > ((float) textView.getMeasuredWidth());
    }

    public final void c(Uri uri, CharSequence charSequence, Long l) {
        String string = uri != null ? uri.toString() : null;
        Long lValueOf = Long.valueOf(l.longValue());
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(this.a, string, lValueOf, charSequence);
        this.D0.set(0, true);
        requestLayout();
        this.E0.set(0, true);
    }

    public final void d(BitSet bitSet, boolean z) {
        bitSet.set(this.I0, z);
    }

    public final void e(int i, boolean z) {
        uv9 uv9Var = this.t0;
        tv9 tv9Var = uv9Var.o;
        int i2 = tv9Var.a;
        tv9 tv9VarA = tv9.a(tv9Var, i, false, false, false, 14);
        uv9Var.o = tv9VarA;
        if (i2 != i) {
            BitSet bitSet = uv9Var.s0;
            int i3 = uv9Var.u0;
            boolean z2 = z && bitSet.get(i3);
            caa caaVar = uv9Var.x0;
            caaVar.g(tv9VarA.a, z2);
            caaVar.setAppearance(tv9VarA.d ? x9a.c : x9a.a);
            bitSet.set(i3, tv9VarA.e);
            uv9Var.requestLayout();
        }
        BitSet bitSet2 = this.E0;
        int i4 = this.I0;
        bitSet2.set(i4, bitSet2.get(i4) || i > 0);
        d(this.D0, true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
        if (this.o.getVisibility() == 0) {
            this.R0.start();
        }
        Drawable drawable = this.u0;
        if (drawable != null) {
            je7 je7Var = this.v0;
            je7 je7Var2 = je7Var.a() ? je7Var : null;
            if (drawable == (je7Var2 != null ? (qe) je7Var2.getValue() : null)) {
                ((qe) je7Var.getValue()).start();
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.D0;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R0.stop();
        je7 je7Var = this.v0;
        je7 je7Var2 = je7Var.a() ? je7Var : null;
        if ((je7Var2 != null ? (qe) je7Var2.getValue() : null) == null || !((qe) je7Var.getValue()).isRunning()) {
            return;
        }
        ((qe) je7Var.getValue()).stop();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        super.onDraw(canvas);
        iw4 iw4Var = this.o;
        if (iw4Var.getVisibility() != 0) {
            Drawable drawable = this.u0;
            if (drawable == null || drawable == null) {
                return;
            }
            TextView textView = this.s0;
            float x = (textView.getX() - tu0.G(16 * fk4.d().getDisplayMetrics().density)) - tu0.G(2 * fk4.d().getDisplayMetrics().density);
            float y = textView.getY();
            iSave = canvas.save();
            canvas.translate(x, y);
            try {
                drawable.draw(canvas);
                return;
            } finally {
            }
        }
        Rect bottomLineRect = iw4Var.getBottomLineRect();
        if (bottomLineRect.isEmpty()) {
            return;
        }
        bottomLineRect.offset(iw4Var.getLeft(), iw4Var.getTop());
        float f = bottomLineRect.right;
        e4f e4fVar = this.R0;
        float f2 = bottomLineRect.top;
        iSave = canvas.save();
        canvas.translate(f - e4fVar.getBounds().width(), f2);
        try {
            e4fVar.draw(canvas);
            canvas.restoreToCount(iSave);
            e4fVar.start();
        } finally {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int iQ;
        int iC;
        s5a s5aVar = this.a;
        int measuredHeight = (int) ((((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) / 2.0f) + getPaddingTop()) - (s5aVar.getMeasuredWidth() / 2.0f));
        BitSet bitSet = this.E0;
        int iC2 = 0;
        if (bitSet.get(0)) {
            c54.L(getPaddingStart(), measuredHeight, getPaddingStart() + s5aVar.getMeasuredWidth(), s5aVar.getMeasuredHeight() + measuredHeight, this.a, this);
        }
        float f = 12;
        int iC3 = rh4.c(f, fk4.d().getDisplayMetrics().density, s5aVar.getMeasuredWidth() + getPaddingStart());
        boolean z2 = bitSet.get(this.F0);
        TextView textView = this.b;
        if (z2) {
            c54.L(iC3, getPaddingTop(), textView.getMeasuredWidth() + iC3, textView.getMeasuredHeight() + getPaddingTop(), textView, this);
        }
        View view = this.B0;
        int measuredHeight2 = (int) (((textView.getMeasuredHeight() / 2.0f) + textView.getTop()) - (view.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.L0)) {
            if (z2) {
                iC = rh4.c(4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth());
            } else {
                iC = 0;
            }
            int i5 = iC + iC3;
            if (z2) {
                iC2 = rh4.c(4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth());
            }
            c54.L(i5, measuredHeight2, view.getMeasuredWidth() + iC3 + iC2, view.getMeasuredHeight() + measuredHeight2, view, this);
        }
        int iC4 = rh4.c(f, fk4.d().getDisplayMetrics().density, s5aVar.getMeasuredWidth() + getPaddingStart());
        int iC5 = rh4.c(2, fk4.d().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.G0)) {
            iw4 iw4Var = this.c;
            c54.L(iC4, iC5, iw4Var.getMeasuredWidth() + iC4, this.c.getMeasuredHeight() + iC5, iw4Var, this);
        }
        if (bitSet.get(this.N0)) {
            iw4 iw4Var2 = this.o;
            c54.L(iC4, iC5, iw4Var2.getMeasuredWidth() + iC4, this.o.getMeasuredHeight() + iC5, iw4Var2, this);
        }
        int measuredWidth2 = getMeasuredWidth() - getPaddingEnd();
        View view2 = this.A0;
        int measuredHeight3 = (int) (((textView.getMeasuredHeight() / 2.0f) + textView.getTop()) - (view2.getMeasuredHeight() / 2.0f));
        int i6 = this.K0;
        if (bitSet.get(i6)) {
            c54.L(measuredWidth2 - view2.getMeasuredWidth(), measuredHeight3, measuredWidth2, view2.getMeasuredHeight() + measuredHeight3, view2, this);
        }
        if (bitSet.get(i6)) {
            measuredWidth = rh4.q(4, fk4.d().getDisplayMetrics().density, measuredWidth2 - view2.getMeasuredWidth());
        } else {
            measuredWidth = getMeasuredWidth() - getPaddingEnd();
        }
        int i7 = measuredWidth;
        TextView textView2 = this.s0;
        int measuredHeight4 = (int) (((textView.getMeasuredHeight() / 2.0f) + textView.getTop()) - (textView2.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.H0)) {
            c54.L(i7 - textView2.getMeasuredWidth(), measuredHeight4, i7, textView2.getMeasuredHeight() + measuredHeight4, textView2, this);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        int i8 = this.I0;
        boolean z3 = bitSet.get(i8);
        uv9 uv9Var = this.t0;
        if (z3) {
            int iQ2 = rh4.q(1, fk4.d().getDisplayMetrics().density, iC5);
            uv9 uv9Var2 = this.t0;
            c54.L(measuredWidth3 - uv9Var2.getMeasuredWidth(), iQ2, measuredWidth3, uv9Var.getMeasuredHeight() + iQ2, uv9Var2, this);
        }
        if (bitSet.get(i8)) {
            iQ = rh4.q(4, fk4.d().getDisplayMetrics().density, measuredWidth3 - uv9Var.getMeasuredWidth());
        } else {
            iQ = measuredWidth3;
        }
        if (bitSet.get(this.M0)) {
            View view3 = this.C0;
            c54.L(iQ - view3.getMeasuredWidth(), iC5, iQ, view3.getMeasuredHeight() + iC5, view3, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0430  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.onMeasure(int, int):void");
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Drawable drawable;
        Drawable drawable2;
        qe qeVar;
        Drawable drawable3;
        this.a.onThemeChanged(fkaVar);
        TextView textView = this.b;
        textView.setTextColor(fkaVar.getText().e);
        xoe text = fkaVar.getText();
        iw4 iw4Var = this.c;
        iw4Var.setTextColor(text.g);
        TextView textView2 = this.s0;
        textView2.setTextColor(fkaVar.getText().i);
        this.t0.onThemeChanged(fkaVar);
        ngg.G(this.A0.getBackground(), fkaVar.getIcon().h);
        ngg.G(this.B0.getBackground(), fkaVar.getIcon().h);
        je7 je7Var = this.w0;
        je7 je7Var2 = je7Var.a() ? je7Var : null;
        if (je7Var2 != null && (drawable3 = (Drawable) je7Var2.getValue()) != null) {
            ngg.G(drawable3, fkaVar.getIcon().k);
        }
        je7 je7Var3 = this.v0;
        if (!je7Var3.a()) {
            je7Var3 = null;
        }
        pq9 pq9Var = qp4.u0;
        if (je7Var3 != null && (qeVar = (qe) je7Var3.getValue()) != null) {
            qeVar.a(pq9Var.j(this).getIcon().h);
        }
        if (!je7Var.a()) {
            je7Var = null;
        }
        if (je7Var != null && (drawable2 = (Drawable) je7Var.getValue()) != null) {
            ngg.G(drawable2, fkaVar.getIcon().k);
        }
        je7 je7Var4 = this.x0;
        if (!je7Var4.a()) {
            je7Var4 = null;
        }
        if (je7Var4 != null && (drawable = (Drawable) je7Var4.getValue()) != null) {
            ngg.G(drawable, fkaVar.getIcon().k);
        }
        je7 je7Var5 = this.y0;
        if (!je7Var5.a()) {
            je7Var5 = null;
        }
        Drawable drawable4 = je7Var5 != null ? (Drawable) je7Var5.getValue() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable4 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable4 : null;
        if (enhancedVectorDrawable != null) {
            c54.Z(enhancedVectorDrawable, "error", fkaVar.b().a.e);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(fkaVar.d().a.a.h));
        CharSequence text2 = textView.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), kre.class) : null;
        if (spans == null) {
            spans = new kre[0];
        }
        for (Object obj : spans) {
            kre kreVar = (kre) obj;
            kreVar.onThemeChanged(fkaVar);
            qqe.b(textView, kreVar);
        }
        CharSequence text3 = iw4Var.getText();
        Spanned spanned2 = text3 instanceof Spanned ? (Spanned) text3 : null;
        Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, iw4Var.getText().length(), kre.class) : null;
        if (spans2 == null) {
            spans2 = new kre[0];
        }
        for (Object obj2 : spans2) {
            kre kreVar2 = (kre) obj2;
            kreVar2.onThemeChanged(fkaVar);
            qqe.b(iw4Var, kreVar2);
        }
        CharSequence text4 = textView2.getText();
        Spanned spanned3 = text4 instanceof Spanned ? (Spanned) text4 : null;
        Object[] spans3 = spanned3 != null ? spanned3.getSpans(0, textView2.getText().length(), kre.class) : null;
        if (spans3 == null) {
            spans3 = new kre[0];
        }
        for (Object obj3 : spans3) {
            kre kreVar3 = (kre) obj3;
            kreVar3.onThemeChanged(fkaVar);
            qqe.b(textView2, kreVar3);
        }
        this.R0.onThemeChanged(fkaVar);
        fka fkaVarJ = pq9Var.j(this);
        iw4 iw4Var2 = this.o;
        CharSequence text5 = iw4Var2.getText();
        Spanned spanned4 = text5 instanceof Spanned ? (Spanned) text5 : null;
        Object[] spans4 = spanned4 != null ? spanned4.getSpans(0, iw4Var2.getText().length(), kre.class) : null;
        if (spans4 == null) {
            spans4 = new kre[0];
        }
        for (Object obj4 : spans4) {
            kre kreVar4 = (kre) obj4;
            kreVar4.onThemeChanged(fkaVarJ);
            qqe.b(iw4Var2, kreVar4);
        }
        invalidate();
    }

    public final void setAvatarClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.a, 300L, onClickListener);
    }

    public final void setCall(CharSequence charSequence) {
        BitSet bitSet = this.E0;
        boolean z = charSequence == null || w9e.C0(charSequence);
        int i = this.M0;
        bitSet.set(i, !z);
        this.D0.set(i, true);
        requestLayout();
    }

    public final void setCallBadge(boolean z) {
        this.a.setCallBadgeVisibility(z);
        this.D0.set(0, true);
        requestLayout();
    }

    public final void setMention(boolean z) {
        this.t0.c(z);
        BitSet bitSet = this.E0;
        d(bitSet, bitSet.get(this.I0) || z);
        d(this.D0, true);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMuted(boolean r13) {
        /*
            r12 = this;
            java.util.BitSet r0 = r12.E0
            int r1 = r12.L0
            r0.set(r1, r13)
            java.util.BitSet r2 = r12.D0
            boolean r3 = r2.get(r1)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L25
            android.view.View r3 = r12.B0
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L1b
            r3 = r5
            goto L1c
        L1b:
            r3 = r4
        L1c:
            boolean r6 = r0.get(r1)
            if (r3 == r6) goto L23
            goto L25
        L23:
            r3 = r4
            goto L26
        L25:
            r3 = r5
        L26:
            r2.set(r1, r3)
            uv9 r1 = r12.t0
            tv9 r6 = r1.o
            boolean r3 = r6.d
            r7 = 0
            r11 = 7
            r8 = 0
            r9 = 0
            r10 = r13
            tv9 r6 = defpackage.tv9.a(r6, r7, r8, r9, r10, r11)
            r1.o = r6
            if (r3 == r13) goto L45
            pq9 r3 = defpackage.qp4.u0
            fka r3 = r3.j(r1)
            r1.b(r13, r3)
        L45:
            int r1 = r12.I0
            boolean r3 = r0.get(r1)
            if (r3 != 0) goto L4f
            if (r13 == 0) goto L50
        L4f:
            r4 = r5
        L50:
            r0.set(r1, r4)
            r2.set(r1, r5)
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.setMuted(boolean):void");
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
        this.D0.set(0, true);
        requestLayout();
    }

    public final void setPinned(boolean z) {
        this.E0.set(this.K0, z);
        requestLayout();
    }

    public final void setReaction(boolean z) {
        this.t0.d(z);
        BitSet bitSet = this.E0;
        d(bitSet, bitSet.get(this.I0) || z);
        d(this.D0, true);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.graphics.drawable.Drawable, java.lang.Object] */
    public final void setStatus(l62 l62Var) {
        Animatable animatable;
        int iOrdinal = l62Var.ordinal();
        if (iOrdinal == 0) {
            animatable = 0;
        } else if (iOrdinal == 1) {
            animatable = (Drawable) this.v0.getValue();
        } else if (iOrdinal == 2) {
            animatable = (Drawable) this.w0.getValue();
        } else if (iOrdinal == 3) {
            animatable = (Drawable) this.x0.getValue();
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            animatable = (Drawable) this.y0.getValue();
        }
        Animatable animatable2 = animatable instanceof Animatable ? animatable : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        boolean z = !tpa.f(this.u0, animatable);
        if (animatable != 0) {
            float f = 16;
            animatable.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        }
        BitSet bitSet = this.D0;
        boolean z2 = !tpa.f(this.u0, animatable);
        int i = this.J0;
        bitSet.set(i, z2);
        this.u0 = animatable;
        this.E0.set(i, animatable != 0);
        invalidate();
        if (z) {
            requestLayout();
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        iw4 iw4Var = this.c;
        CharSequence text = iw4Var.getText();
        BitSet bitSet = this.D0;
        int i = this.G0;
        boolean z = true;
        if (text != charSequence) {
            iw4Var.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, (charSequence == null || w9e.C0(charSequence) || bitSet2.get(this.N0)) ? false : true);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (iw4Var.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka fkaVarJ = qp4.u0.j(this);
        CharSequence text2 = iw4Var.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, iw4Var.getText().length(), kre.class) : null;
        if (spans == null) {
            spans = new kre[0];
        }
        for (Object obj : spans) {
            kre kreVar = (kre) obj;
            kreVar.onThemeChanged(fkaVarJ);
            qqe.b(iw4Var, kreVar);
        }
        requestLayout();
    }

    public final void setTime(CharSequence charSequence) {
        TextView textView = this.s0;
        CharSequence text = textView.getText();
        BitSet bitSet = this.D0;
        int i = this.H0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, (charSequence == null || w9e.C0(charSequence)) ? false : true);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.b;
        CharSequence text = textView.getText();
        BitSet bitSet = this.D0;
        int i = this.F0;
        boolean z = true;
        if (text != charSequence) {
            textView.setText(charSequence);
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, (charSequence == null || w9e.C0(charSequence)) ? false : true);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka fkaVarJ = qp4.u0.j(this);
        CharSequence text2 = textView.getText();
        Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), kre.class) : null;
        if (spans == null) {
            spans = new kre[0];
        }
        for (Object obj : spans) {
            kre kreVar = (kre) obj;
            kreVar.onThemeChanged(fkaVarJ);
            qqe.b(textView, kreVar);
        }
        requestLayout();
    }

    public final void setTyping(CharSequence charSequence) {
        iw4 iw4Var = this.o;
        CharSequence text = iw4Var.getText();
        BitSet bitSet = this.D0;
        int i = this.N0;
        boolean z = true;
        if (text != charSequence) {
            iw4Var.setText(charSequence);
            this.R0.start();
            bitSet.set(i, true);
        }
        BitSet bitSet2 = this.E0;
        bitSet2.set(i, (charSequence == null || w9e.C0(charSequence)) ? false : true);
        iw4 iw4Var2 = this.c;
        CharSequence text2 = iw4Var2.getText();
        bitSet2.set(this.G0, (text2 == null || w9e.C0(text2) || bitSet2.get(i)) ? false : true);
        if (!bitSet.get(i)) {
            if (bitSet2.get(i) == (iw4Var2.getVisibility() == 0)) {
                z = false;
            }
        }
        bitSet.set(i, z);
        fka fkaVarJ = qp4.u0.j(this);
        CharSequence text3 = iw4Var.getText();
        Spanned spanned = text3 instanceof Spanned ? (Spanned) text3 : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, iw4Var.getText().length(), kre.class) : null;
        if (spans == null) {
            spans = new kre[0];
        }
        for (Object obj : spans) {
            kre kreVar = (kre) obj;
            kreVar.onThemeChanged(fkaVarJ);
            qqe.b(iw4Var, kreVar);
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.b
            float r1 = defpackage.qqe.e(r0)
            int r1 = defpackage.i24.I(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            ecf r3 = defpackage.qqe.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L37
            ecf r5 = defpackage.qqe.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L37
            ecf r5 = new ecf
            android.content.Context r4 = r4.getContext()
            we1 r2 = new we1
            r3 = 8
            r2.<init>(r3)
            r5.<init>(r4, r1, r2)
            goto L38
        L37:
            r5 = 0
        L38:
            defpackage.qqe.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m62.setVerified(boolean):void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        qe qeVar;
        if (!super.verifyDrawable(drawable) && drawable != this.R0) {
            je7 je7Var = this.v0;
            Drawable drawable2 = null;
            if (!je7Var.a()) {
                je7Var = null;
            }
            if (je7Var != null && (qeVar = (qe) je7Var.getValue()) != null) {
                drawable2 = qeVar.getDrawable();
            }
            if (drawable != drawable2) {
                return false;
            }
        }
        return true;
    }
}
