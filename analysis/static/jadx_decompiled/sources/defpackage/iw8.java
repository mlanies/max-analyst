package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class iw8 extends ViewGroup implements mr2 {
    public static final /* synthetic */ bc7[] J0 = {new oi9(iw8.class, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;"), rh4.g(nec.a, iw8.class, "isFloating", "isFloating()Z")};
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final Path D0;
    public final RectF E0;
    public final Paint F0;
    public final Paint G0;
    public final TextPaint H0;
    public final gi I0;
    public final hw8 a;
    public final hw8 b;
    public is0 c;
    public Layout o;
    public Layout s0;
    public Layout t0;
    public Layout u0;
    public final je7 v0;
    public Layout w0;
    public Layout x0;
    public int y0;
    public Layout z0;

    public iw8(Context context) {
        super(context);
        this.a = new hw8(this, 0);
        this.b = new hw8(this, 1);
        this.v0 = tu0.r(3, new hy4(context, 15));
        this.A0 = tu0.r(3, new j78(9));
        this.B0 = tu0.r(3, new j78(10));
        this.C0 = tu0.r(3, new hy4(context, 16));
        this.D0 = new Path();
        this.E0 = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.F0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        this.G0 = paint2;
        TextPaint textPaint = new TextPaint();
        os2.c.a(textPaint, context.getResources().getDisplayMetrics(), du4.b);
        this.H0 = textPaint;
        this.I0 = new gi(2, this);
    }

    public static final void f(iw8 iw8Var, Canvas canvas, float f) {
        boolean zH = iw8Var.h();
        Paint paint = iw8Var.G0;
        float strokeWidth = zH ? 0.0f : paint.getStrokeWidth();
        boolean zH2 = iw8Var.h();
        float measuredHeight = iw8Var.getMeasuredHeight();
        if (!zH2) {
            measuredHeight -= paint.getStrokeWidth();
        }
        canvas.drawLine(f, strokeWidth, f, measuredHeight, paint);
    }

    private final s5a getAvatarView() {
        return (s5a) this.v0.getValue();
    }

    private final ix3 getDefaultImageOutlineProvider() {
        return (ix3) this.A0.getValue();
    }

    private final fw8 getDrawMode() {
        bc7 bc7Var = J0[0];
        return (fw8) this.a.b;
    }

    private final OneMeDraweeView getImageView() {
        return (OneMeDraweeView) this.C0.getValue();
    }

    private final ix3 getRoundImageOutlineProvider() {
        return (ix3) this.B0.getValue();
    }

    private final void setDrawMode(fw8 fw8Var) {
        this.a.o1(this, J0[0], fw8Var);
    }

    private final void setFloating(boolean z) {
        this.b.o1(this, J0[1], Boolean.valueOf(z));
    }

    @Override // defpackage.mr2
    public final void a(is0 is0Var) {
        this.c = is0Var;
        n();
        Paint paint = this.G0;
        boolean zH = h();
        ks0 ks0Var = is0Var.c;
        paint.setColor(zH ? ks0Var.d : ks0Var.c);
        this.F0.setColor(qp4.u0.j(this).a().s().b.g);
        invalidate();
    }

    public final int b() {
        if (h()) {
            return tu0.G(12 * fk4.d().getDisplayMetrics().density);
        }
        if (getDrawMode() == fw8.Y) {
            return 0;
        }
        return tu0.G(8 * fk4.d().getDisplayMetrics().density);
    }

    public final int c() {
        if (h()) {
            return tu0.G(4 * fk4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    public final void d(Canvas canvas, float f) {
        if (this.y0 > 1) {
            float f2 = 11;
            float fG = f + tu0.G(fk4.d().getDisplayMetrics().density * f2);
            float bottom = getImageView().getBottom() - tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            TextPaint textPaint = this.H0;
            pq9 pq9Var = qp4.u0;
            textPaint.setColor(pq9Var.j(this).b().e);
            canvas.drawCircle(fG, bottom, tu0.G(9 * fk4.d().getDisplayMetrics().density), textPaint);
            textPaint.setColor(pq9Var.j(this).a().s().g.a);
            float f3 = 2;
            canvas.drawText(String.valueOf(this.y0), fG - (textPaint.measureText(String.valueOf(this.y0)) / f3), bottom - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0251  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r9) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw8.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void g(xv8 xv8Var) {
        ay7.b(this, getImageView(), -1);
        OneMeDraweeView imageView = getImageView();
        String str = xv8Var.a;
        imageView.setVisibility((str == null || str.length() == 0) ^ true ? 0 : 8);
        OneMeDraweeView imageView2 = getImageView();
        String str2 = xv8Var.a;
        wv6 wv6VarB = str2 != null ? wv6.b(str2) : null;
        Uri uri = xv8Var.d;
        imageView2.o(wv6VarB, uri != null ? wv6.a(uri) : null);
        getImageView().setOutlineProvider(xv8Var.e ? getRoundImageOutlineProvider() : getDefaultImageOutlineProvider());
        this.y0 = xv8Var.b;
        this.z0 = xv8Var.c;
    }

    public final boolean h() {
        bc7 bc7Var = J0[1];
        return ((Boolean) this.b.b).booleanValue();
    }

    public final void i(Layout layout, wv8 wv8Var) {
        setDrawMode(fw8.b);
        this.o = layout;
        this.t0 = wv8Var.a;
        this.u0 = wv8Var.b;
        ay7.b(this, getAvatarView(), -1);
        getAvatarView().setVisibility(0);
        s5a.i(getAvatarView(), wv8Var.e, Long.valueOf(wv8Var.c), wv8Var.d);
    }

    public final void j(Layout layout, xv8 xv8Var, vv8 vv8Var) {
        setDrawMode(fw8.X);
        this.o = layout;
        g(xv8Var);
        this.w0 = vv8Var.b();
        this.x0 = vv8Var.a();
    }

    public final void k(Layout layout, xv8 xv8Var) {
        setDrawMode(fw8.c);
        this.o = layout;
        g(xv8Var);
    }

    public final void l(Layout layout, Layout layout2, vv8 vv8Var) {
        setDrawMode(fw8.o);
        this.o = layout;
        this.s0 = layout2;
        this.w0 = vv8Var.b();
        this.x0 = vv8Var.a();
    }

    public final void m(Layout layout, Layout layout2) {
        setDrawMode(fw8.a);
        this.o = layout;
        this.s0 = layout2;
        od2.W(this, layout2, this.I0);
    }

    public final void n() {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextPaint paint7;
        is0 is0Var = this.c;
        if (is0Var == null) {
            return;
        }
        Layout layout = this.o;
        pq9 pq9Var = qp4.u0;
        ls0 ls0Var = is0Var.d;
        if (layout != null && (paint7 = layout.getPaint()) != null) {
            paint7.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.l);
        }
        Layout layout2 = this.s0;
        if (layout2 != null && (paint6 = layout2.getPaint()) != null) {
            paint6.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.k);
        }
        Layout layout3 = this.s0;
        if (layout3 != null) {
            CharSequence text = layout3.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, layout3.getText().length(), Object.class);
                if (spans != null) {
                    for (Object obj : spans) {
                        mr2 mr2Var = obj instanceof mr2 ? (mr2) obj : null;
                        if (mr2Var != null) {
                            mr2Var.a(is0Var);
                        }
                    }
                }
            }
        }
        Layout layout4 = this.u0;
        if (layout4 != null && (paint5 = layout4.getPaint()) != null) {
            paint5.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.k);
        }
        Layout layout5 = this.t0;
        if (layout5 != null && (paint4 = layout5.getPaint()) != null) {
            paint4.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.k);
        }
        Layout layout6 = this.w0;
        if (layout6 != null && (paint3 = layout6.getPaint()) != null) {
            paint3.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.g);
        }
        Layout layout7 = this.x0;
        if (layout7 != null && (paint2 = layout7.getPaint()) != null) {
            paint2.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.l);
        }
        Layout layout8 = this.z0;
        if (layout8 == null || (paint = layout8.getPaint()) == null) {
            return;
        }
        paint.setColor(h() ? pq9Var.j(this).a().s().g.a : ls0Var.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.s0;
        if (layout != null) {
            od2.W(this, layout, this.I0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.s0;
        if (layout != null) {
            od2.Y(layout, this.I0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB = b();
        int iP = nu0.p(this.o) + c();
        int iOrdinal = getDrawMode().ordinal();
        if (iOrdinal == 1) {
            ote.E(getAvatarView(), iB, rh4.c(2, fk4.d().getDisplayMetrics().density, iP), 0, 12);
        } else if (iOrdinal == 2) {
            ote.E(getImageView(), iB, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            ote.E(getImageView(), iB, nu0.p(this.w0) + iP, 0, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw8.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.E0;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.D0;
        path.reset();
        path.addRoundRect(rectF, fk4.d().getDisplayMetrics().density * 8.0f, fk4.d().getDisplayMetrics().density * 8.0f, Path.Direction.CW);
    }

    public final void setIsFloating(boolean z) {
        setFloating(z);
    }

    public final void setSingleForward(vv8 vv8Var) {
        setDrawMode(fw8.Y);
        this.w0 = vv8Var.b();
        this.x0 = vv8Var.a();
    }
}
