package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;

/* loaded from: classes2.dex */
public final class xkd extends ViewGroup implements k34, x5d, qpe, nk6, l7c, jw8, aoa, u5d, ck7 {
    public i33 A0;
    public final dy8 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final j34 G0;
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final s5d o;
    public final m56 s0;
    public is0 t0;
    public final Paint u0;
    public final Rect v0;
    public boolean w0;
    public final je7 x0;
    public final je7 y0;
    public final y5d z0;

    public xkd(final Context context, om8 om8Var) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        boa boaVar = new boa();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = boaVar;
        this.o = s5dVar;
        this.s0 = om8Var;
        pq9 pq9Var = qp4.u0;
        this.t0 = pq9Var.j(this).a().d(true);
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.u0 = paint;
        this.v0 = new Rect();
        final int i = 0;
        this.x0 = tu0.r(3, new k56(this) { // from class: vkd
            public final /* synthetic */ xkd b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i2 = i;
                xkd xkdVar = this.b;
                switch (i2) {
                    case 0:
                        return xkd.b(xkdVar);
                    default:
                        return xkd.i(xkdVar);
                }
            }
        });
        final int i2 = 1;
        this.y0 = tu0.r(3, new k56(this) { // from class: vkd
            public final /* synthetic */ xkd b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                int i22 = i2;
                xkd xkdVar = this.b;
                switch (i22) {
                    case 0:
                        return xkd.b(xkdVar);
                    default:
                        return xkd.i(xkdVar);
                }
            }
        });
        this.z0 = new y5d(this);
        dy8 dy8Var = new dy8(context);
        dy8Var.setId(mda.N);
        dy8Var.setLinkLongClickListener(new bqc(11, this));
        dy8Var.setOnLongClickListener(new zl0(9, this));
        final int i3 = 0;
        dy8Var.setSingleClickAction(new Runnable(this) { // from class: wkd
            public final /* synthetic */ xkd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        final int i4 = 1;
        dy8Var.setTryToSingleClickAction(new Runnable(this) { // from class: wkd
            public final /* synthetic */ xkd b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        this.B0 = dy8Var;
        this.C0 = tu0.r(3, new k56() { // from class: ukd
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var, new ViewGroup.LayoutParams(-2, -2));
                        return bu6Var;
                    case 1:
                        return xkd.a(context, this);
                    case 2:
                        return xkd.h(context, this);
                    default:
                        return xkd.d(context, this);
                }
            }
        });
        final int i5 = 2;
        this.D0 = tu0.r(3, new k56() { // from class: ukd
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var, new ViewGroup.LayoutParams(-2, -2));
                        return bu6Var;
                    case 1:
                        return xkd.a(context, this);
                    case 2:
                        return xkd.h(context, this);
                    default:
                        return xkd.d(context, this);
                }
            }
        });
        final int i6 = 3;
        this.E0 = tu0.r(3, new k56() { // from class: ukd
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var, new ViewGroup.LayoutParams(-2, -2));
                        return bu6Var;
                    case 1:
                        return xkd.a(context, this);
                    case 2:
                        return xkd.h(context, this);
                    default:
                        return xkd.d(context, this);
                }
            }
        });
        final int i7 = 0;
        this.F0 = tu0.r(3, new k56() { // from class: ukd
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        bu6 bu6Var = new bu6(context);
                        this.addView(bu6Var, new ViewGroup.LayoutParams(-2, -2));
                        return bu6Var;
                    case 1:
                        return xkd.a(context, this);
                    case 2:
                        return xkd.h(context, this);
                    default:
                        return xkd.d(context, this);
                }
            }
        });
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(false);
        this.G0 = j34Var;
        r6cVar.b = this;
        dw8Var.b = this;
        s5dVar.b = this;
        addView(dy8Var, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = pq9Var.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, xkd xkdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        kqe kqeVar = i4f.a;
        os2.k.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkdVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkdVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static RippleDrawable b(xkd xkdVar) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = xkdVar.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return new RippleDrawable(ColorStateList.valueOf(internalBubbleBackgroundContentColor), null, new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }

    public static AppCompatTextView d(Context context, xkd xkdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        kqe kqeVar = i4f.a;
        os2.f.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkdVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(5);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkdVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    private final int getAdditionalTextColor() {
        return this.t0.d.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.y0.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.t0.c.b;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.t0.a.m;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        qp4.u0.j(this).d().a.a.getClass();
        return -1907998;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.x0.getValue();
    }

    private final int getTitleColor() {
        return this.t0.d.e;
    }

    public static AppCompatTextView h(Context context, xkd xkdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        kqe kqeVar = i4f.a;
        os2.i.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(xkdVar.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(3);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        xkdVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static ShapeDrawable i(xkd xkdVar) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(xkdVar.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.b.c(is0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.v0;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    @Override // defpackage.nk6
    public final void e(List list, a66 a66Var) {
        dy8 dy8Var = this.B0;
        CharSequence text = dy8Var.getText();
        if (text == null) {
            return;
        }
        if (list == null || list.isEmpty() || a66Var == null) {
            dy8.f(dy8Var);
        } else {
            dy8Var.g((List) a66Var.invoke(text.toString(), list));
        }
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        this.G0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public i33 getOnLinkLongClickListener() {
        return this.A0;
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.a.k(is0Var, z);
    }

    @Override // defpackage.jw8
    public final void l() {
        this.b.l();
    }

    public final void n(is0 is0Var) {
        this.t0 = is0Var;
        je7 je7Var = this.D0;
        if (je7Var.a()) {
            ((AppCompatTextView) je7Var.getValue()).setTextColor(getTitleColor());
        }
        je7 je7Var2 = this.C0;
        if (je7Var2.a()) {
            ((AppCompatTextView) je7Var2.getValue()).setTextColor(getAdditionalTextColor());
        }
        je7 je7Var3 = this.E0;
        if (je7Var3.a()) {
            ((AppCompatTextView) je7Var3.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.u0.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        setDateTextColor(is0Var.d.m);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.v0;
        if (rect.isEmpty()) {
            return;
        }
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        canvas.drawRoundRect(new RectF(rect), f, f, this.u0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int measuredHeight;
        float f = 10;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        float f2 = 8;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int iG3 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        y5d y5dVar = this.z0;
        if (br7.H(y5dVar.b)) {
            y5dVar.c(iG, iG3);
            iK = rh4.c(4, fk4.d().getDisplayMetrics().density, y5dVar.a() + iG3);
        } else {
            iK = iG;
        }
        s5d s5dVar = this.o;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - iG) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + iG3);
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.T(iG, iK);
            iK += dw8Var.K();
        }
        dy8 dy8Var = this.B0;
        ote.E(dy8Var, iG, iK, 0, 12);
        int iG4 = tu0.G(6 * fk4.d().getDisplayMetrics().density) + dy8Var.getMeasuredHeight() + iK + iG2;
        int i5 = iG + iG2;
        je7 je7Var = this.C0;
        if (br7.H(je7Var)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je7Var.getValue();
            ote.E(appCompatTextView, i5, iG4, 0, 12);
            measuredHeight = appCompatTextView.getMeasuredHeight() + iG4;
        } else {
            measuredHeight = iG4;
        }
        je7 je7Var2 = this.D0;
        if (br7.H(je7Var2)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) je7Var2.getValue();
            ote.E(appCompatTextView2, i5, measuredHeight, 0, 12);
            measuredHeight += appCompatTextView2.getMeasuredHeight();
        }
        je7 je7Var3 = this.E0;
        if (br7.H(je7Var3)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) je7Var3.getValue();
            ote.E(appCompatTextView3, i5, measuredHeight, 0, 12);
            measuredHeight += appCompatTextView3.getMeasuredHeight();
        }
        je7 je7Var4 = this.F0;
        if (br7.H(je7Var4)) {
            bu6 bu6Var = (bu6) je7Var4.getValue();
            boolean z2 = this.w0;
            if (z2) {
                iG4 = measuredHeight + iG2;
            }
            ote.E(bu6Var, z2 ? iG : ((getMeasuredWidth() - iG) - iG2) - bu6Var.getMeasuredWidth(), iG4, 0, 12);
            float f3 = this.w0 ? 0.0f : fk4.d().getDisplayMetrics().density * 4.0f;
            float f4 = this.w0 ? fk4.d().getDisplayMetrics().density * 12.0f : 4.0f * fk4.d().getDisplayMetrics().density;
            ((la6) bu6Var.getHierarchy()).n(wnc.a(f3, f3, f4, f4));
            bu6Var.getMeasuredHeight();
        }
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.q(2, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, getMeasuredHeight())) - r6cVar.K());
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34Var = this.G0;
        ote.E(j34Var, (measuredWidth - j34Var.getMeasuredWidth()) - iG, rh4.q(4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34Var.getMeasuredHeight()), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int i3;
        int iA;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : wg0.m(10, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        float f = 10;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        dy8 dy8Var = this.B0;
        dy8Var.h();
        int i4 = iG * 2;
        int iMax = Math.max(dy8Var.getMeasuredWidth() + i4, size);
        int i5 = iMax - i4;
        float f2 = 8;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        s5d s5dVar = this.o;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.z0;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, s5dVar.L());
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, y5dVar.b() + i4 + s5dVar.h0());
            iK = rh4.c(4, fk4.d().getDisplayMetrics().density, y5dVar.a() + tu0.G(fk4.d().getDisplayMetrics().density * f2));
        } else {
            iK = iG;
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + dw8Var.L());
            iK += dw8Var.K();
        }
        int iD = wg0.d(6, fk4.d().getDisplayMetrics().density, dy8Var.getMeasuredHeight(), iK);
        int i6 = iG2 * 2;
        int i7 = i5 - i6;
        je7 je7Var = this.F0;
        boolean z = false;
        boolean z2 = true;
        if (br7.H(je7Var)) {
            bu6 bu6Var = (bu6) je7Var.getValue();
            boolean z3 = bu6Var.getImageAttach().c * 2 >= i5;
            this.w0 = z3;
            if (z3) {
                bu6Var.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(tu0.G(128 * fk4.d().getDisplayMetrics().density), 1073741824));
            } else {
                int iG3 = tu0.G(32 * fk4.d().getDisplayMetrics().density);
                bu6Var.measure(View.MeasureSpec.makeMeasureSpec(iG3, 1073741824), View.MeasureSpec.makeMeasureSpec(iG3, 1073741824));
                i7 -= iG3 + iG2;
            }
            z = true;
        }
        je7 je7Var2 = this.C0;
        if (br7.H(je7Var2)) {
            i3 = Integer.MIN_VALUE;
            ((AppCompatTextView) je7Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i2);
            z = true;
        } else {
            i3 = Integer.MIN_VALUE;
        }
        je7 je7Var3 = this.D0;
        if (br7.H(je7Var3)) {
            ((AppCompatTextView) je7Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i7, i3), i2);
            z = true;
        }
        je7 je7Var4 = this.E0;
        if (br7.H(je7Var4)) {
            ((AppCompatTextView) je7Var4.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i7, i3), i2);
        } else {
            z2 = z;
        }
        if (z2) {
            int iA2 = br7.A(je7Var4) + br7.A(je7Var3) + br7.A(je7Var2) + i6;
            if (this.w0) {
                iA = br7.A(je7Var) + iA2;
            } else {
                int iA3 = br7.A(je7Var) + i6;
                if (iA2 < iA3) {
                    iA2 = iA3;
                }
                iA = iA2;
            }
            int i8 = iA + iD;
            this.v0.set(iG, iD, iMax - iG, i8);
            iD = i8;
        }
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iD = wg0.d(f, fk4.d().getDisplayMetrics().density, r6cVar.K(), iD);
            iMax = Math.max(iMax, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + r6cVar.L());
        }
        j34 j34Var = this.G0;
        j34Var.measure(i, i2);
        setMeasuredDimension(iMax, iD + (br7.H((je7) r6cVar.c) ? tu0.G(f * fk4.d().getDisplayMetrics().density) : rh4.c(f2, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredHeight() + tu0.G(2 * fk4.d().getDisplayMetrics().density))));
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.u5d
    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    @Override // defpackage.u5d
    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.a.setChipObserver(w5cVar);
    }

    @Override // defpackage.k34
    public void setDateBackgroundColor(int i) {
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.G0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.G0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.aoa
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    @Override // defpackage.jw8
    public void setForwardClickListener(m56 m56Var) {
        this.b.X = m56Var;
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    @Override // defpackage.jw8
    public void setLink(cw8 cw8Var) {
        this.b.setLink(cw8Var);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.a.X = m56Var;
    }

    @Override // defpackage.ck7
    public void setOnLinkLongClickListener(i33 i33Var) {
        this.A0 = i33Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.b.o = a66Var;
    }

    @Override // defpackage.x5d
    public void setSenderName(Layout layout) {
        this.z0.e(layout);
    }

    @Override // defpackage.x5d
    public void setSenderNameColor(int i) {
        this.z0.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    @Override // defpackage.qpe
    public void setTextMessageColors(is0 is0Var) {
        this.B0.setTextColors(is0Var);
    }

    @Override // defpackage.qpe
    public void setTextMessageLayout(by8 by8Var) {
        this.B0.setLayout(by8Var);
    }

    @Override // defpackage.qpe
    public void setTextMessageLinkClickListener(hk7 hk7Var) {
        this.B0.setLinkListener(hk7Var);
    }
}
